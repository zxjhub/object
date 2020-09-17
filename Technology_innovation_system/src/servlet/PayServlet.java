package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Pay2;
import common.Pay3;

import dao.PayDao;
@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	PayDao  dao = new PayDao();		
	protected void service(HttpServletRequest req, HttpServletResponse resp)throws  ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if ("add".equals(method)) {
			add(req, resp);
		}else if ("add1".equals(method)) {
			add1(req, resp);
		}else if ("list".equals(method)) {
			list(req, resp);
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
		String gjcz= req.getParameter("gjcz");
		String sjcz = req.getParameter("sjcz");
		String sjcz1 = req.getParameter("sjcz1");
		String xjcz = req.getParameter("xjcz");
		String xj1 = req.getParameter("xj1");
		String rygz= req.getParameter("rygz");
		String bgfy= req.getParameter("bgfy");
		String ss = req.getParameter("ss");
		String yqsb = req.getParameter("yqsb");
		String zzyfxm = req.getParameter("zzyfxm");
		String hzyfxm= req.getParameter("hzyfxm");
		String qt= req.getParameter("qt");
		String xj2 = req.getParameter("xj2");
		Pay2 Pay2 = new Pay2(gjcz,sjcz,sjcz1,xjcz,xj1,rygz,bgfy,ss,yqsb, zzyfxm, hzyfxm, qt,xj2);			
		//添加后消息显示
		if(dao.add(Pay2)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("pay5-2.jsp").forward(req,resp);
		} 
	}
	private void add1(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException  {
		req.setCharacterEncoding("utf-8");
		String rygz= req.getParameter("rygz");
		String bgfy= req.getParameter("bgfy");
		String ss = req.getParameter("ss");
		String yqsb = req.getParameter("yqsb");
		String kyxmjf = req.getParameter("kyxmjf");
		String qt= req.getParameter("qt");
		String xj3 = req.getParameter("xj3");
		String lhyf = req.getParameter("lhyf");
		String jszr = req.getParameter("jszr");
		String jszxfw= req.getParameter("jszxfw");
		String xj4 = req.getParameter("xj4");
		Pay3 Pay3 = new Pay3(rygz,bgfy,ss,yqsb,kyxmjf,qt,xj3,lhyf,jszr,jszxfw,xj4);			
		//添加后消息显示
		if(dao.add1(Pay3)) {
			req.setAttribute("message", "填报成功");
			req.getRequestDispatcher("pay5-3.jsp").forward(req,resp);
		} 
	}
 
	private void list(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		req.setCharacterEncoding("utf-8");
		List<Pay3> P = dao.list1();
		req.setAttribute("list",P);
		req.getRequestDispatcher("pay.jsp").forward(req,resp);
	}
}
