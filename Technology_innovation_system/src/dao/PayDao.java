package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import common.Pay2;
import common.Pay3;
import common.Pay4;
import helper.Helper;

public class PayDao {
	/**
	 * Ìí¼Ó
	 * @param course
	 * @return
	 */
	public boolean add(Pay2 Pay2) {
		String sql = "insert into Pay2(gjcz,sjcz,sjcz1,xjcz,xj1,rygz,bgfy,ss,yqsb,zzyfxm,hzyfxm,qt,xj2) values('" + Pay2.getGjcz() + "','" + Pay2.getSjcz()+ "','" + Pay2.getSjcz1()+ "','"+Pay2.getXjcz() + "','"+Pay2.getXj1()+"','" + Pay2.getRygz()+ "','" + Pay2.getBgfy()+ "','"+Pay2.getSs() + "','"+Pay2.getYqsb() + "','"+Pay2.getZzyfxm()+"','" + Pay2.getHzyfxm()+ "','" + Pay2.getQt()+ "','"+Pay2.getXj2() + "')";
		Connection conn = Helper.getConn();
		Statement state = null;
		boolean f = false;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Helper.close(state, conn);
		}
		
		if (a > 0) {
			f = true;
		}
		return f;
	}
	public boolean add1(Pay3 Pay3) {
		String sql = "insert into Pay3(rygz,bgfy,ss,yqsb,kyxmjf,qt,xj3,lhyf,jszr,jszxfw,xj4) values('" + Pay3.getRygz() + "','" + Pay3.getBgfy()+ "','" + Pay3.getSs()+ "','"+Pay3.getYqsb() + "','"+Pay3.getKyxmjf()+"','" + Pay3.getQt()+ "','"+Pay3.getXj3()+"','" + Pay3.getLhyf()+ "','" + Pay3.getJszr()+ "','" + Pay3.getJszxfw()+ "','"+Pay3.getXj4() + "')";
		Connection conn = Helper.getConn();
		Statement state = null;
		boolean f = false;
		int a = 0;
		
		try {
			state = conn.createStatement();
			a = state.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Helper.close(state, conn);
		}
		
		if (a > 0) {
			f = true;
		}
		return f;
	}
	public List<Pay2> list() {
		String sql = "select xj1,xj2 from Pay2,Pay3";
		List<Pay2> list = new ArrayList<>();
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				Pay2 P2=new Pay2();
				P2.setXj1(rs.getString("xj1"));
				P2.setXj2(rs.getString("xj2"));
				list.add(P2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		
		return list;
	}
	public List<Pay3> list1() {
		String sql = "select xj3,xj4 from Pay3";
		List<Pay3> list = new ArrayList<>();
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				Pay3 P3=new Pay3();
				P3.setXj3(rs.getString("xj3"));
				P3.setXj4(rs.getString("xj4"));
				list.add(P3);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		
		return list;
	}
	
	public List<Pay3> list2(){
		List<Pay2> list = new ArrayList<Pay2>();
		List<Pay3> list1=new ArrayList<Pay3>();
		
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs= null;
		String sql="select m.*,s.* from pay2 m,pay3 s";
		try {
		state=conn.createStatement();
		rs=state.executeQuery(sql);
		while(rs.next()){
		Pay2 s = new Pay2();
		Pay3 c= new Pay3();
		s=new Pay2();
		s.setXj1(rs.getString("xj1"));
		s.setXj2(rs.getString("xj2"));
		c.setXj3(rs.getString("xj3"));
		c.setXj4(rs.getString("xj4"));		
		list.add(s);
		list1.add(c);
		List<String> list2 = Arrays.asList("s","c");
		list1.add((Pay3) list2);
		}
		rs.close();
		state.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		return list1;
		}
	
}
