package servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.System1;
import common.System2;
import common.System3;
import common.System4;
import common.System5;
import dao.SystemDao;
@WebServlet("/SystemServlet")
public class SystemServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	SystemDao  dao = new SystemDao();		
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if ("add1".equals(method)) {
			add1(req, resp);
		}else if("add2".equals(method)) {
			add2(req, resp);
		}else if("add3".equals(method)) {
			add3(req, resp);
		}
		else if("add4".equals(method)) {
			add4(req, resp);
		}
		else if("add5".equals(method)) {
			add5(req, resp);
		}
	}

	/**
	 * 添加
	 * @param req
	 * @param resp
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void add1(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String yjfx= req.getParameter("yjfx");
		String yjnr = req.getParameter("yjnr");
		System1 S1 = new System1(yjfx,yjnr);			
		//添加后消息显示
		if(dao.add1(S1)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("system2-1.jsp").forward(req,resp);
		} 
	}
	
	private void add2(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String jgmc= req.getParameter("jgmc");
		System2 S2 = new System2(jgmc);			
		//添加后消息显示
		if(dao.add2(S2)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("system2-2.jsp").forward(req,resp);
		} 
	}
	private void add3(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String jgmc= req.getParameter("jgmc");
		String zzdj= req.getParameter("zzdj");
		String pdbm= req.getParameter("pdbm");
		System3 S3 = new System3(jgmc,zzdj,pdbm);			
		//添加后消息显示
		if(dao.add3(S3)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("system2-3.jsp").forward(req,resp);
		} 
	}
	private void add4(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String scxmc= req.getParameter("scxmc");
		String szdw= req.getParameter("szdw");
		System4 S4 = new System4(scxmc,szdw);			
		//添加后消息显示
		if(dao.add4(S4)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("system2-4.jsp").forward(req,resp);
		} 
	}
	private void add5(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String fwxm= req.getParameter("fwxm");
		String fwnr= req.getParameter("fwnr");
		System5 S5 = new System5(fwxm,fwnr);			
		//添加后消息显示
		if(dao.add5(S5)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("system2-5.jsp").forward(req,resp);
		} 
	}
}
