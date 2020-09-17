package dao;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import common.Search;
import helper.Helper;


public class SearchDao {
	public List<Search> search(String search,String content) {
		
		String sql ="select * from ptmessage join Fm on ptmessage.username=Fm.username where "+ search +"='" + content +"'";
		List<Search> list = new ArrayList<>();
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				
				String ptmc = rs.getString("ptmc");
				String dcnd= rs.getString("pzrq");
				String tbr = rs.getString("tbr");
				String tb_time = rs.getString("tb_time");
				Search bean = new Search(ptmc,dcnd,tbr,tb_time);
				list.add(bean);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		
		return list;
	}
	
	
	public List<Search> search1(String name) throws Exception {
		String sql ="SELECT * from ptmessage join Fm on ptmessage.username=Fm.username";
		Connection conn = Helper.getConn();
		List<Search> list1 = new ArrayList<>();
		PreparedStatement pstmt = null;
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Document doc1=null;

		// 为表字段建立索引
		//Directory dir = new SimpleFSDirectory(new File(indexDir));
		Directory directory = FSDirectory.open(new File("D:\\lelucene\\index").toPath());
		// 分词
		Analyzer luceneAnalyzer = new StandardAnalyzer();
		IndexWriterConfig iwc = new IndexWriterConfig(luceneAnalyzer);
		iwc.setOpenMode(OpenMode.CREATE);
		IndexWriter indexWriter = new IndexWriter(directory, iwc);

			while (rs.next()) {
			//System.out.println("username***" + rs.getString(2));
			Document doc = new Document();
			doc.add(new TextField("ptmc", rs.getString(2), Field.Store.YES));
			doc.add(new TextField("pzrq", rs.getString(6), Field.Store.YES));
			doc.add(new TextField("tbr", rs.getString(11), Field.Store.YES));
			doc.add(new TextField("tb_time", rs.getString(16), Field.Store.YES));
			doc.add(new TextField("szbm", rs.getString(12), Field.Store.YES));
			doc.add(new TextField("ptlx", rs.getString(5), Field.Store.YES));
			indexWriter.addDocument(doc);
			}
	
		//System.out.println("numDocs" +  indexWriter.numRamDocs());
		indexWriter.close();
		Directory directory1 = FSDirectory.open(new File("D:\\lelucene\\index").toPath());

		//IndexReader reader = IndexReader.open(directory);
		IndexReader indexReader = DirectoryReader.open(directory1);
		IndexSearcher searcher = new IndexSearcher(indexReader);

		String[] fields = { "ptmc","pzrq","tbr","tb_time","szbm","ptlx"};//索引的Field字段数组  
		MultiFieldQueryParser parser = new MultiFieldQueryParser(fields, new StandardAnalyzer());
		Query query = parser.parse(name);

		TopDocs tds = searcher.search(query,10);
		//System.out.println("查询总记录数：" + tds.totalHits);
		ScoreDoc[] sds = tds.scoreDocs;
		for (ScoreDoc sd : sds) {
		//System.out.println(sd.score);
		int docName = sd.doc;
		 doc1 = searcher.doc(docName);
		String ptmc = doc1.get("ptmc");
		String pzrq = doc1.get("pzrq");
		String tbr = doc1.get("tbr");
		String tb_time = doc1.get("tb_time");
		String szbm = doc1.get("szbm");
		String ptlx = doc1.get("ptlx");
		//System.out.println(ptmc+"---"+pzrq+"---"+tbr+"---"+tb_time+"---"+szbm);
		Search bean = new Search(ptmc,pzrq,tbr,tb_time,szbm,ptlx);
		list1.add(bean);
		
		
	}
		
		return list1;

}

}
