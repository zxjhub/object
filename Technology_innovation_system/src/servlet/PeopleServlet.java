package servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.People2;
import common.People3;
import common.People4;
import dao.PeopleDao;
@WebServlet("/PeopleServlet")

public class PeopleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PeopleDao dao = new PeopleDao();		
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if ("add2".equals(method)) {
			add2(req, resp);
		}else if("add3".equals(method)) {
			add3(req, resp);
		}else if("add4".equals(method)) {
			add4(req, resp);
		}
	}

	/**
	 * 添加
	 * @param req
	 * @param resp
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void add2(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String xm= req.getParameter("xm");
		String xb= req.getParameter("xb");
		String csny = req.getParameter("csny");
		String xl = req.getParameter("xl");
		String xw = req.getParameter("xw");
		String byyx= req.getParameter("byyx");
		String sxzy= req.getParameter("xszy");
		String zc = req.getParameter("zc");
		String rccc= req.getParameter("rccc");
		String gdld = req.getParameter("gdld");
		String gzxz= req.getParameter("gzxz");
		String ryzt= req.getParameter("ryzt");
		String szdw= req.getParameter("szdw");
		People2 P2 = new People2(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc,gdld, gzxz,ryzt,szdw);			
		//添加后消息显示
		if(dao.add2(P2)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("people3-2.jsp").forward(req,resp);
		} 
	}
	private void add3(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String xm= req.getParameter("xm");
		String xb= req.getParameter("xb");
		String csny = req.getParameter("csny");
		String xl = req.getParameter("xl");
		String xw = req.getParameter("xw");
		String byyx= req.getParameter("byyx");
		String sxzy= req.getParameter("xszy");
		String zc = req.getParameter("zc");
		String rccc= req.getParameter("rccc");
		People3 P3 = new People3(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc);			
		//添加后消息显示
		if(dao.add3(P3)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("people3-3.jsp").forward(req,resp);
		} 
	}
	private void add4(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String xm= req.getParameter("xm");
		String xb= req.getParameter("xb");
		String csny = req.getParameter("csny");
		String xl = req.getParameter("xl");
		String xw = req.getParameter("xw");
		String byyx= req.getParameter("byyx");
		String sxzy= req.getParameter("xszy");
		String zc = req.getParameter("zc");
		String rccc= req.getParameter("rccc");
		String gdld = req.getParameter("gdld");
		String gzxz= req.getParameter("gzxz");
		People4 P4 = new People4(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc,gdld, gzxz);			
		//添加后消息显示
		if(dao.add4(P4)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("people3-4.jsp").forward(req,resp);
		} 
	}
}
