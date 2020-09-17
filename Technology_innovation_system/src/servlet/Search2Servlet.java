package servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Search;
import common.Search2;
import dao.Search2Dao;




@WebServlet("/Search2Servlet")
public class Search2Servlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;

	Search2Dao  dao = new Search2Dao();
	
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
			String city= req.getParameter("data");
			List<Search2> list=dao.search(city);
			
			if(list==null) {
				req.setAttribute("message", "该信息不存在");
				req.getRequestDispatcher("search2.jsp").forward(req,resp);
			}else {
				req.setAttribute("a", list);	
				req.getRequestDispatcher("search2result.jsp").forward(req,resp);
			}
			
			}
		private void search1(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
			req.setCharacterEncoding("utf-8");
			String content= req.getParameter("content");
			String name= req.getParameter("name");
			String content1= req.getParameter("content1");
			String name1= req.getParameter("name1");
			String content2= req.getParameter("content2");
			String name2= req.getParameter("name2");
			
			
			List<Search2> list1=dao.search1(content,name,content1,name1,content2,name2);
			
			if(list1==null) {
				req.setAttribute("message", "该公司不存在");
				req.getRequestDispatcher("search2.jsp").forward(req,resp);
			}else {
				req.setAttribute("list1", list1);	
				req.getRequestDispatcher("search2.jsp").forward(req,resp);
			}
			
			}
		
		
}
