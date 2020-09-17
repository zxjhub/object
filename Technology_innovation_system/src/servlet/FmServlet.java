package servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Fm;
import dao.FmDao;
@WebServlet("/FmServlet")
public class FmServlet  extends HttpServlet {
		
		private static final long serialVersionUID = 1L;
		FmDao  dao = new FmDao();		
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
			String username=req.getParameter("username");
			String glbm = req.getParameter("glbm");
			String tbr = req.getParameter("tbr");
			String szbm = req.getParameter("szbm");
			String lxdh = req.getParameter("lxdh");
			String sjhm= req.getParameter("sjhm");
			String e_mail= req.getParameter("e_mail");
			String tb_time = req.getParameter("tb_time");
			Fm Fm = new Fm(glbm,tbr,szbm,lxdh,sjhm,e_mail,tb_time,username);			
			//添加后消息显示
			if(dao.add(Fm)) {
				req.setAttribute("message", "填报成功");
				req.getRequestDispatcher("fengmian.jsp").forward(req,resp);
			} 
		}
		
		
}



