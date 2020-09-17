package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Ptmessage;
import dao.PtmessageDao;
@WebServlet("/PtmessageServlet")
public class PtmessageServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	PtmessageDao  dao = new PtmessageDao();		
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if ("add".equals(method)) {
			add(req, resp);
		}
	}
	/**
	 * 添加
	 * @param req
	 * @param resp
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String ptmc= req.getParameter("ptmc");
		String ytdw = req.getParameter("ytdw");
		String ptjb= req.getParameter("ptjb");
		String ptlx= req.getParameter("ptlx");
		String pzrq = req.getParameter("pzrq");
		String pzwh= req.getParameter("pzwh");
		String username= req.getParameter("username");
		Ptmessage Pt = new Ptmessage(ptmc,ytdw,ptjb,ptlx,pzrq,pzwh,username);			
		//添加后消息显示
		if(dao.add(Pt)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("ptmessage.jsp").forward(req,resp);
		} 
	}

}
