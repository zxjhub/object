package com.enterprise.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.enterprise.entity.entity;;
public class dao {
	public List<entity> view(String CORP_NAME){
            List<entity> list =new ArrayList<entity>();
	        try {
	            // 加载数据库驱动，注册到驱动管理器
	            Class.forName("com.mysql.jdbc.Driver");
	            // 数据库连接字符串
	            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
	            // 数据库用户名
	            String username = "root";
	            // 数据库密码
	            String password = "893225523";
	            // 创建Connection连接
	            Connection conn = DriverManager.getConnection(url, username,
	                    password);
	            // 添加图书信息的SQL语句
	            String sql = "select * from t_corp";
	            // 获取Statement
	            Statement statement = conn.createStatement();
	  
	            ResultSet resultSet = statement.executeQuery(sql);
	  
	            while (resultSet.next()) {
                    entity book = new entity();
                    if(resultSet.getString("CORP_NAME").equals(CORP_NAME))
                    {
	                book.setCORP_NAME(resultSet.getString("CORP_NAME"));
	                book.setTEL(resultSet.getString("TEL"));
	                book.setWEB_URL(resultSet.getString("WEB_URL"));
	                book.setEMAIL(resultSet.getString("EMAIL"));
	                book.setADDR(resultSet.getString("ADDR"));
	                book.setREG_CAPI(resultSet.getString("REG_CAPI"));
	                book.setSTART_DATE(resultSet.getString("START_DATE"));
	                book.setCORP_STATUS(resultSet.getString("CORP_STATUS"));
	                book.setREG_NO(resultSet.getString("REG_NO"));
	                book.setTAXPAY_NUM(resultSet.getString("TAXPAY_NUM"));
	                book.setUNI_SCID(resultSet.getString("UNI_SCID"));
	                book.setORG_INST_CODE(resultSet.getString("ORG_INST_CODE"));
	                book.setECON_KIND(resultSet.getString("ECON_KIND"));
	                book.setSTAFF_SIZE(resultSet.getString("STAFF_SIZE"));
	                book.setFARE_TERM_START(resultSet.getString("FARE_TERM_START"));
	                book.setFARE_TERM_END(resultSet.getString("FARE_TERM_END"));
	                book.setBELONG_ORG(resultSet.getString("BELONG_ORG"));
	                book.setCHECK_DATE(resultSet.getString("CHECK_DATE"));
	                book.setENGLISH_NAME(resultSet.getString("ENGLISH_NAME"));
	                book.setFORMER_NAME(resultSet.getString("FORMER_NAME"));
	                book.setBELONG_DIST_ORG(resultSet.getString("BELONG_DIST_ORG"));
	                book.setBELONG_TRADE(resultSet.getString("BELONG_TRADE"));
	                book.setFARE_SCOPE(resultSet.getString("FARE_SCOPE"));
	                list.add(book);
                    }
	            }
	            resultSet.close();
	            statement.close();
	            conn.close();
	}catch (Exception e) {
	    e.printStackTrace();
	}
	        return list;
	    }
	public String id(String corp_name)
	{
		  String name="";
		 try {
	            // 加载数据库驱动，注册到驱动管理器
	            Class.forName("com.mysql.jdbc.Driver");
	            // 数据库连接字符串
	            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
	            // 数据库用户名
	            String username = "root";
	            // 数据库密码
	            String password = "893225523";
	            // 创建Connection连接
	            Connection conn = DriverManager.getConnection(url, username,
	                    password);
	            // 添加图书信息的SQL语句
	            String sql = "select * from t_corp";
	            // 获取Statement
	            Statement statement = conn.createStatement();
	  
	            ResultSet resultSet = statement.executeQuery(sql);
	            while (resultSet.next()) {
                 entity book = new entity();
                 if(resultSet.getString("CORP_NAME").equals(corp_name))
                 {
	               name=resultSet.getString("ID");
                 }
	            }
	            resultSet.close();
	            statement.close();
	            conn.close();
	}catch (Exception e) {
	    e.printStackTrace();
	}
		return name;
	}
	//返回投资人name
	public List<entity> tzr_name(String id)
	{
		   List<entity> list =new ArrayList<entity>();
	        try {
	            // 加载数据库驱动，注册到驱动管理器
	            Class.forName("com.mysql.jdbc.Driver");
	            // 数据库连接字符串
	            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
	            // 数据库用户名
	            String username = "root";
	            // 数据库密码
	            String password = "893225523";
	            // 创建Connection连接
	            Connection conn = DriverManager.getConnection(url, username,
	                    password);
	            // 添加图书信息的SQL语句
	            String sql = "select * from t_m_corp_corp_stock";
	            // 获取Statement
	            Statement statement = conn.createStatement();
	  
	            ResultSet resultSet = statement.executeQuery(sql);
	  
	            while (resultSet.next()) {
                   entity book = new entity();
                   if(resultSet.getString("ID").equals(id))
                   {
	                book.setSTOCK_NAME(STOCK_NAME(resultSet.getString("SUB_ID")));
	                book.setSTOCK_CAPI(STOCK_CAPI(resultSet.getString("SUB_ID")));
	                list.add(book);
                   }
	            }
	            resultSet.close();
	            statement.close();
	            conn.close();
	}catch (Exception e) {
	    e.printStackTrace();
	}
	        return list;
}
	/////////返回STOCK_NAME
	public String STOCK_NAME(String SUB_ID)
	{
		  String name="";
		 try {
	            // 加载数据库驱动，注册到驱动管理器
	            Class.forName("com.mysql.jdbc.Driver");
	            // 数据库连接字符串
	            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
	            // 数据库用户名
	            String username = "root";
	            // 数据库密码
	            String password = "893225523";
	            // 创建Connection连接
	            Connection conn = DriverManager.getConnection(url, username,
	                    password);
	            // 添加图书信息的SQL语句
	            String sql = "select * from t_corp_stock";
	            // 获取Statement
	            Statement statement = conn.createStatement();
	  
	            ResultSet resultSet = statement.executeQuery(sql);
	            while (resultSet.next()) {
                 entity book = new entity();
                 if(resultSet.getString("ID").equals(SUB_ID))
                 {
	               name=resultSet.getString("STOCK_NAME");
                 }
	            }
	            resultSet.close();
	            statement.close();
	            conn.close();
	}catch (Exception e) {
	    e.printStackTrace();
	}
		return name;
	}
	
/////////返回投资金额
public int STOCK_CAPI(String SUB_ID)
{
	  int CAPI=0;
	 try {
            // 加载数据库驱动，注册到驱动管理器
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
            // 数据库用户名
            String username = "root";
            // 数据库密码
            String password = "893225523";
            // 创建Connection连接
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            // 添加图书信息的SQL语句
            String sql = "select * from t_corp_stock";
            // 获取Statement
            Statement statement = conn.createStatement();
  
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
             entity book = new entity();
             if(resultSet.getString("ID").equals(SUB_ID))
             {
               CAPI=resultSet.getInt("STOCK_CAPI");
             }
            }
            resultSet.close();
            statement.close();
            conn.close();
}catch (Exception e) {
    e.printStackTrace();
}
	return CAPI;
}
//////////第三阶段  查询公司对外投资
public int dwtz(String CORP_NAME)
{
	int id=0;
	   List<entity> list =new ArrayList<entity>();
        try {
            // 加载数据库驱动，注册到驱动管理器
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
            // 数据库用户名
            String username = "root";
            // 数据库密码
            String password = "893225523";
            // 创建Connection连接
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            // 添加图书信息的SQL语句
            String sql = "select * from t_corp_stock";
            // 获取Statement
            Statement statement = conn.createStatement();
  
            ResultSet resultSet = statement.executeQuery(sql);
  
            while (resultSet.next()) {
               entity book = new entity();
               if(resultSet.getString("STOCK_NAME").equals(CORP_NAME))
               {
               id=resultSet.getInt("ID");
               }
            }
            resultSet.close();
            statement.close();
            conn.close();
}catch (Exception e) {
    e.printStackTrace();
}
        return id;
}
////返回对外投资的公司
public List<entity> dwtzgs(int ID)
{
	   List<entity> list =new ArrayList<entity>();
        try {
            // 加载数据库驱动，注册到驱动管理器
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
            // 数据库用户名
            String username = "root";
            // 数据库密码
            String password = "893225523";
            // 创建Connection连接
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            // 添加图书信息的SQL语句
            String sql = "select * from t_m_corp_corp_stock";
            // 获取Statement
            Statement statement = conn.createStatement();
  
            ResultSet resultSet = statement.executeQuery(sql);
  
            while (resultSet.next()) {
               entity book = new entity();
               if(resultSet.getInt("SUB_ID")==ID)
               {
            	   book.setCORP_NAME(tzgsmc(resultSet.getInt("ID")));
	                list.add(book);
               }
            }
            resultSet.close();
            statement.close();
            conn.close();
}catch (Exception e) {
    e.printStackTrace();
}
        return list;
}
////返回被投资公司的名称
public String tzgsmc(int ID)
{
	String corp_name="";
	   List<entity> list =new ArrayList<entity>();
        try {
            // 加载数据库驱动，注册到驱动管理器
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
            // 数据库用户名
            String username = "root";
            // 数据库密码
            String password = "893225523";
            // 创建Connection连接
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            // 添加图书信息的SQL语句
            String sql = "select * from t_corp";
            // 获取Statement
            Statement statement = conn.createStatement();
  
            ResultSet resultSet = statement.executeQuery(sql);
  
            while (resultSet.next()) {
               entity book = new entity();
               if(resultSet.getInt("ID")==(ID))
               {
               corp_name=resultSet.getString("CORP_NAME");
               }
            }
            resultSet.close();
            statement.close();
            conn.close();
}catch (Exception e) {
    e.printStackTrace();
}
        return corp_name;
}
/////第四阶段  返回公司ID
public int gsid4(String CORP_NAME)
{
	int ID=0;
	 try {
           // 加载数据库驱动，注册到驱动管理器
           Class.forName("com.mysql.jdbc.Driver");
           // 数据库连接字符串
           String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
           // 数据库用户名
           String username = "root";
           // 数据库密码
           String password = "893225523";
           // 创建Connection连接
           Connection conn = DriverManager.getConnection(url, username,
                   password);
           // 添加图书信息的SQL语句
           String sql = "select * from t_corp";
           // 获取Statement
           Statement statement = conn.createStatement();
 
           ResultSet resultSet = statement.executeQuery(sql);
           while (resultSet.next()) {
            entity book = new entity();
            if(resultSet.getString("CORP_NAME").equals(CORP_NAME))
            {
             ID=resultSet.getInt("ID");
            }
           }
           resultSet.close();
           statement.close();
           conn.close();
}catch (Exception e) {
   e.printStackTrace();
}
	return ID;
}
////返回根据ID高管姓名
public String ggidxm(int id)
{
	String PERSON_NAME="";
	 try {
           // 加载数据库驱动，注册到驱动管理器
           Class.forName("com.mysql.jdbc.Driver");
           // 数据库连接字符串
           String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
           // 数据库用户名
           String username = "root";
           // 数据库密码
           String password = "893225523";
           // 创建Connection连接
           Connection conn = DriverManager.getConnection(url, username,
                   password);
           // 添加图书信息的SQL语句
           String sql = "select * from t_corp_pertains";
           // 获取Statement
           Statement statement = conn.createStatement();
 
           ResultSet resultSet = statement.executeQuery(sql);
           while (resultSet.next()) {
            entity book = new entity();
            if(resultSet.getInt("ID")==id)
            {
             PERSON_NAME=resultSet.getString("PERSON_NAME");
            }
           }
           resultSet.close();
           statement.close();
           conn.close();
}catch (Exception e) {
   e.printStackTrace();
}
	return PERSON_NAME;
}
////根据公司ID高管姓名
public List<entity> ggxm(int ID)
{
	   List<entity> list =new ArrayList<entity>();
        try {
            // 加载数据库驱动，注册到驱动管理器
            Class.forName("com.mysql.jdbc.Driver");
            // 数据库连接字符串
            String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
            // 数据库用户名
            String username = "root";
            // 数据库密码
            String password = "893225523";
            // 创建Connection连接
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            // 添加图书信息的SQL语句
            String sql = "select * from t_m_corp_corp_pertains";
            // 获取Statement
            Statement statement = conn.createStatement();
  
            ResultSet resultSet = statement.executeQuery(sql);
  
            while (resultSet.next()) {
               entity book = new entity();
               if(resultSet.getInt("ID")==ID)
               {
            	   book.setPERSON_NAME(ggidxm(resultSet.getInt("SUB_ID")));
	                list.add(book);
               }
            }
            resultSet.close();
            statement.close();
            conn.close();
}catch (Exception e) {
    e.printStackTrace();
}
        return list;
}
//返回法定代表人
public List<entity> fddbr(int id)
{
	 List<entity> list =new ArrayList<entity>();
	 try {
           // 加载数据库驱动，注册到驱动管理器
           Class.forName("com.mysql.jdbc.Driver");
           // 数据库连接字符串
           String url = "jdbc:mysql://localhost:3306/qiyetupu?useUnicode=true&characterEncoding=utf-8";
           // 数据库用户名
           String username = "root";
           // 数据库密码
           String password = "893225523";
           // 创建Connection连接
           Connection conn = DriverManager.getConnection(url, username,
                   password);
           // 添加图书信息的SQL语句
           String sql = "select * from t_corp";
           // 获取Statement
           Statement statement = conn.createStatement();
 
           ResultSet resultSet = statement.executeQuery(sql);
           while (resultSet.next()) {
            entity book = new entity();
            if(resultSet.getInt("ID")==id)
            {
            	book.setOPER_MAN_NAME(resultSet.getString("OPER_MAN_NAME"));
            	list.add(book);
            }
           }
           resultSet.close();
           statement.close();
           conn.close();
}catch (Exception e) {
   e.printStackTrace();
}
	return list;
}
}
