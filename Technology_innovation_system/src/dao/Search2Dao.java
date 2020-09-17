package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.Search;
import common.Search2;
import helper.Helper;

public class Search2Dao {
	
public List<Search2> search(String city) {
		
		String sql ="select * from basemessage where szxs like'%"+city+"%'";
	
		List<Search2> list = new ArrayList<>();
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		Search2 bean=null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
		
			while (rs.next()) {				
				String ptmc = rs.getString("ptmc");
				String ptjb= rs.getString("ptjb");
				String jsly= rs.getString("jsly");
				String pzrq = rs.getString("pzny");
				String szxs= rs.getString("szxs");
				String jjjgj = rs.getString("jjjgj");
				bean = new Search2(ptmc,ptjb,jsly,pzrq,szxs,jjjgj);
				list.add(bean);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		
		return list;
	}

   public List<Search2> search1(String content,String name,String content1,String name1,String content2,String name2) {
	   String sql = "select * from basemessage join Fm on basemessage.username=Fm.username where 1=1 ";
	   if(name!=null) {
		   sql+=" and "+content+" like '%" + name + "%'";
	   }
    if(name1!=null) {
    	sql+=" and "+content1+" like '%" + name1 + "%'"; 
	   }
    if(name2!=null) {
    	sql+=" and "+content2+" like '%" + name2 + "%'";
    }
	  
	 List<Search2> list1 = new ArrayList<>();
	Connection conn = Helper.getConn();
	Statement state = null;
	ResultSet rs = null;
	Search2 bean=null;
	try {
		state = conn.createStatement();
		rs = state.executeQuery(sql);
	
		while (rs.next()) {				
			String ptmc = rs.getString("ptmc");
			String pzrq = rs.getString("pzny");
			String szxs= rs.getString("szxs");
			String tbr = rs.getString("tbr");
			String tb_time = rs.getString("tb_time");
			
			bean = new Search2(ptmc,pzrq,szxs,tbr,tb_time);
			list1.add(bean);	
		}
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		Helper.close(rs, state, conn);
	}
	
	return list1;
}
   
}
