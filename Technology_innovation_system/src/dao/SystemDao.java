package dao;

import java.sql.Connection;
import java.sql.Statement;

import common.System1;
import common.System2;
import common.System3;
import common.System4;
import common.System5;
import helper.Helper;

public class SystemDao {
	public boolean add1(System1 S1) {
		String sql = "insert into system2_1(yjfx,yjnr) values('" + S1.getYjfx() + "','" + S1.getYjnr()+ "')";
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
	public boolean add2(System2 S2) {
		String sql = "insert into system2_2(jgmc) values('" + S2.getJgmc() + "')";
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
	public boolean add3(System3 S3) {
		String sql = "insert into system2_3(jgmc,zzdj,pdbm) values('" + S3.getJgmc() + "','" + S3.getZzdj() + "','" + S3.getPdbm() + "')";
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
	public boolean add4(System4 S4) {
		String sql = "insert into system2_4(scxmc,szdw) values('" + S4.getScxmc() + "','" + S4.getSzdw() + "')";
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
	public boolean add5(System5 S5) {
		String sql = "insert into system2_5(fwxm,fwnr) values('" + S5.getFwxm() + "','" + S5.getFwnr() + "')";
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

}
