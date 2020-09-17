package servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.BaseMessage;
import dao.BasemessageDao;
@WebServlet("/BasemessageServlet")
public class BasemessageServlet  extends HttpServlet {
		
		private static final long serialVersionUID = 1L;
		BasemessageDao  dao = new BasemessageDao();		
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
			String pzny= req.getParameter("pzny");
			String jsly = req.getParameter("jsly");
			String ptjb = req.getParameter("ptjb");
			String szxs = req.getParameter("szxs");
			String zzxt1= req.getParameter("zzxt1");
			String zzxt2= req.getParameter("zzxt2");
			String zzxt3= req.getParameter("zzxt3");
			String jjjgj= req.getParameter("jjjgj");
			String jjhy1 = req.getParameter("jjhy1");
			String jjhy2 = req.getParameter("jjhy2");
			String jjhy3 = req.getParameter("jjhy3");
			String zyxk1 = req.getParameter("zyxk1");
			String zyxk2= req.getParameter("zyxk2");
			String zyxk3= req.getParameter("zyxk3");;
			String frdbxm= req.getParameter("frdbxm");
			String bgdh = req.getParameter("bgdh");
			String dwlx= req.getParameter("dwlx");
			String gjdw = req.getParameter("gjdw");
			String wzmc= req.getParameter("wzmc");
			String wz= req.getParameter("wz");
			String txdz= req.getParameter("txdz");
			String yb= req.getParameter("yb");
			String zrxm= req.getParameter("zrxm");
			String zrxb= req.getParameter("zrxb");
			String zrcsny= req.getParameter("zrcsny");
			String zrzc= req.getParameter("zrzc");
			String zrsxzy = req.getParameter("zrsxzy");
			String zrxl= req.getParameter("zrxl");
			String zrxw = req.getParameter("zrxw");
			String zrbgdh= req.getParameter("zrbgdh");
			String zrsj= req.getParameter("zrsj");
			String zrdz= req.getParameter("zrdz");
			String username= req.getParameter("username");
			BaseMessage BM = new BaseMessage(ptmc,pzny, jsly, ptjb, szxs,zzxt1,zzxt2,zzxt3,jjjgj, jjhy1,jjhy2,jjhy3,zyxk1,zyxk2,zyxk3, frdbxm,bgdh, dwlx, gjdw, wzmc,wz,txdz,yb, zrxm,zrxb,zrcsny, zrzc ,zrsxzy,zrxl,zrxw,zrbgdh, zrsj,zrdz,username);			
			//添加后消息显示
			if(dao.add(BM)) {
				req.setAttribute("message", "填报成功");
				req.getRequestDispatcher("base-information.jsp").forward(req,resp);
			} 
		}
		
		
}



