package dao;

import java.sql.Connection;
import java.sql.Statement;

import common.People2;
import common.People3;
import common.People4;
import helper.Helper;

public class PeopleDao {
	/**
	 * Ìí¼Ó
	 * @param course
	 * @return                                                                                                                                                                                                                                                                                                              
	 */
	public boolean add2(People2 P2) {
		String sql = "insert into people3_2(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc,gdld, gzxz,ryzt,szdw) values('" + P2.getXm() + "','" + P2.getXb()+ "','" + P2.getCsny()+ "','"+P2.getXl() + "','"+P2.getXw()+"','" + P2.getByyx()+ "','" + P2.getSxzy()+ "','"+P2.getZc() + "','"+P2.getRccc() + "','"+P2.getGdld() + "','"+P2.getGzxz() + "','"+P2.getRyzt() + "','"+P2.getSzdw() + "')";
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
	public boolean add3(People3 P3) {
		String sql = "insert into people3_3(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc) values('" + P3.getXm() + "','" + P3.getXb()+ "','" + P3.getCsny()+ "','"+P3.getXl() + "','"+P3.getXw()+"','" + P3.getByyx()+ "','" + P3.getSxzy()+ "','"+P3.getZc() + "','"+P3.getRccc() + "')";
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
	public boolean add4(People4 P4) {
		String sql = "insert into people3_4(xm,xb,csny,xl,xw,byyx,sxzy, zc,rccc,gdld, gzxz) values('" + P4.getXm() + "','" + P4.getXb()+ "','" + P4.getCsny()+ "','"+P4.getXl() + "','"+P4.getXw()+"','" + P4.getByyx()+ "','" + P4.getSxzy()+ "','"+P4.getZc() + "','"+P4.getRccc() + "','"+P4.getGdld() + "','"+P4.getGzxz() + "')";
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
