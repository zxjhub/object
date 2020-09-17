package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryparser.classic.ParseException;

import common.Search;
import dao.SearchDao;



@WebServlet("/SearchServlet")
public class SearchServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;

	SearchDao  dao = new SearchDao();
	
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if("search".equals(method)) {
			search(req, resp);
		}else if("search1".equals(method)) {
			search1(req, resp);
		}
	}
		
		private void search(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
			req.setCharacterEncoding("utf-8");
			String search= req.getParameter("search");
			String content = req.getParameter("content");
			List<Search> Find = dao.search(search,content);
			if(Find!=null) {			
				req.setAttribute("Find", Find);			
			    req.getRequestDispatcher("search.jsp").forward(req,resp);
			}
		}
		private void search1(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
			req.setCharacterEncoding("utf-8");
			String name= req.getParameter("content");
			List<Search> qwjs = new ArrayList<>();
			try {
				 qwjs = dao.search1(name);
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			if(qwjs!=null) {			
				req.setAttribute("list", qwjs);			
			    req.getRequestDispatcher("search1.jsp").forward(req,resp);
			}else {
				req.setAttribute("message", "该信息不存在");
				req.getRequestDispatcher("search1.jsp").forward(req,resp);
			}
			

		}

}

