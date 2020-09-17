package com.enterprise.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.google.gson.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.enterprise.dao.dao;
import com.enterprise.entity.entity;
import com.enterprise.entity.entity2;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	dao dao1=new dao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		if("view".equals(method))
		{
			view(request, response);
		}else if("view2".equals(method))
		{
			view2(request, response);
		}else if("view3".equals(method))
		{
			view3(request, response);
		}else if("view4".equals(method))
		{
			view4(request, response);
		}else if("view5".equals(method))
		{
			view5(request, response);
		}else if("find".equals(method))
		{
			find(request, response);
		}else if("find2".equals(method))
		{
			find2(request, response);
		}else if("find3".equals(method))
		{
			find3(request, response);
		}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private void view(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		String CORP_NAME=request.getParameter("corp_name");
		HttpSession session=request.getSession();
       	session.setAttribute("userInfo", CORP_NAME);
		request.setAttribute("list",dao1.view(CORP_NAME));
	request.getRequestDispatcher("corp_list.jsp").forward(request, response);
    }
    private void view2(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		String CORP_NAME=request.getParameter("corp_name");
//		HttpSession session=request.getSession();
//       	session.setAttribute("userInfo", CORP_NAME);
		//request.setAttribute("list",dao1.tzr_name(dao1.id(CORP_NAME)));
		request.getRequestDispatcher("stock_list.jsp").forward(request, response);
    }
    private void find(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session=request.getSession();
		String CORP_NAME=(String) session.getAttribute("userInfo");
		//System.out.println(CORP_NAME);
		Gson gson2 = new Gson();
		String json=null;//初始化json
		List<entity2> list2=new ArrayList<entity2>();
		List<entity> list=dao1.tzr_name(dao1.id(CORP_NAME));
		String xm="";
		int money=0;
		for(int i = 0;i<list.size();i++)
		{
			xm=list.get(i).getSTOCK_NAME();
			money=list.get(i).getSTOCK_CAPI();//提取关键值
			//System.out.println("xmxmxmxm"+xm);
			//System.out.println("xmxmxmxm"+money);
			list2.add(new entity2(xm,money));
		}
		 json = gson2.toJson(list2);//为json赋值
			//System.out.println("返回的xmxm"+json);
			// 将json字符串数据返回给前端
						response.setContentType("text/html; charset=utf-8");
						response.getWriter().write(json);
    }
    private void view3(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		String CORP_NAME=request.getParameter("corp_name");
		HttpSession session=request.getSession();
       	session.setAttribute("userInfo", CORP_NAME);
		//request.setAttribute("list",dao1.tzr_name(dao1.id(CORP_NAME)));
		request.getRequestDispatcher("stock_list2.jsp").forward(request, response);
    }
    private void find2(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session=request.getSession();
		String CORP_NAME=(String) session.getAttribute("userInfo");
		//System.out.println(dao1.dwtzgs(dao1.dwtz(CORP_NAME)));
		List<entity> list=dao1.tzr_name(dao1.id(CORP_NAME));
		List<entity> list2=dao1.dwtzgs(dao1.dwtz(CORP_NAME));
		//System.out.println(list2.get(0).getCORP_NAME());
		//System.out.println(list2.get(1).getCORP_NAME());
		//System.out.println(dao1.tzgsmc(118274));
		JSONArray array = new JSONArray();

		JSONArray array2 = new JSONArray();
		JSONArray array3 = new JSONArray();
		JSONObject object1 = new JSONObject();
		JSONObject object2 = new JSONObject();
		JSONObject s = new JSONObject();
		JSONArray htags3 = new JSONArray();
		for (int i = 0; i < list2.size(); i++) {
			JSONObject json = new JSONObject();
			json.put("name", list2.get(i).getCORP_NAME());
			array.add(json);
		}
		for (int i = 0; i < list.size(); i++) {
			JSONObject json2 = new JSONObject();
			json2.put("name", list.get(i).getSTOCK_NAME());
			array2.add(json2);
		}
		
		// System.out.println(array);
		object1.put("name", "对外投资");
		object1.put("children", array);
		object2.put("name", "股东");
		object2.put("children", array2);
		array3.add(object2);
		array3.add(object1);
		//System.out.println(array3);
		s.put("name", session.getAttribute("userInfo"));
		s.put("children", array3);
		htags3.add(s);
		//System.out.println(htags3.toJSONString());
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		response.getWriter().write(htags3.toJSONString());

    }
    private void view4(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		String CORP_NAME=request.getParameter("corp_name");
		HttpSession session=request.getSession();
       	session.setAttribute("userInfo", CORP_NAME);
		//request.setAttribute("list",dao1.tzr_name(dao1.id(CORP_NAME)));
		request.getRequestDispatcher("stock_list3.jsp").forward(request, response);
    }
    private void find3(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
  		request.setCharacterEncoding("utf-8");
  		
  		HttpSession session=request.getSession();
  		String CORP_NAME=(String) session.getAttribute("userInfo");
  		//System.out.println(dao1.dwtzgs(dao1.dwtz(CORP_NAME)));
  		List<entity> list=dao1.tzr_name(dao1.id(CORP_NAME));
  		List<entity> list2=dao1.dwtzgs(dao1.dwtz(CORP_NAME));
  		List<entity> list3=dao1.ggxm(dao1.gsid4(CORP_NAME));
  		List<entity> list4=dao1.fddbr(dao1.gsid4(CORP_NAME));
  		//System.out.println(list2.get(0).getCORP_NAME());
  		//System.out.println(list2.get(1).getCORP_NAME());
  		//System.out.println(dao1.tzgsmc(118274));
  		JSONArray array = new JSONArray();

  		JSONArray array2 = new JSONArray();
  		JSONArray array3 = new JSONArray();
  		JSONArray array4 = new JSONArray();
  		JSONArray array5 = new JSONArray();
  		JSONObject object1 = new JSONObject();
  		JSONObject object2 = new JSONObject();
  		JSONObject object3 = new JSONObject();
  		JSONObject object4 = new JSONObject();
  		JSONObject s = new JSONObject();
  		JSONArray htags3 = new JSONArray();
  		for (int i = 0; i < list2.size(); i++) {
  			JSONObject json = new JSONObject();
  			json.put("name", list2.get(i).getCORP_NAME());
  			array.add(json);
  		}
  		for (int i = 0; i < list.size(); i++) {
  			JSONObject json2 = new JSONObject();
  			json2.put("name", list.get(i).getSTOCK_NAME());
  			array2.add(json2);
  		}
  		for (int i = 0; i < list3.size(); i++) {
  			JSONObject json3 = new JSONObject();
  			json3.put("name", list3.get(i).getPERSON_NAME());
  			array4.add(json3);
  		}
  		for (int i = 0; i < list4.size(); i++) {
  			JSONObject json4 = new JSONObject();
  			json4.put("name", list4.get(i).getOPER_MAN_NAME());
  			array5.add(json4);
  		}
  		
  		// System.out.println(array);
  		object1.put("name", "对外投资");
  		object1.put("children", array);
  		object2.put("name", "股东");
  		object2.put("children", array2);
  		object3.put("name", "高管");
  		object3.put("children", array4);
  		object4.put("name", "法定代表人");
  		object4.put("children", array5);
  		array3.add(object2);
  		array3.add(object1);
  		array3.add(object3);
  		array3.add(object4);
  		//System.out.println(array3);
  		s.put("name", session.getAttribute("userInfo"));
  		s.put("children", array3);
  		htags3.add(s);
  		response.setContentType("application/json");
  		response.setCharacterEncoding("utf-8");
  		response.getWriter().write(htags3.toJSONString());

      }
    private void view5(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		String CORP_NAME=request.getParameter("corp_name");
		HttpSession session=request.getSession();
       	session.setAttribute("userInfo", CORP_NAME);
		//request.setAttribute("list",dao1.tzr_name(dao1.id(CORP_NAME)));
		request.getRequestDispatcher("stock_list4.jsp").forward(request, response);
    }
}
