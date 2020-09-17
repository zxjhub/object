package dao;

import java.sql.Connection;
import java.sql.Statement;

import common.Ptmessage;
import helper.Helper;

public class PtmessageDao {
	
	public boolean add(Ptmessage Pt) {
		String sql = "insert into ptmessage(ptmc,ytdw,ptjb,ptlx,pzrq,pzwh,username) values('" + Pt.getPtmc() + "','" + Pt.getYtdw()+ "','" + Pt.getPtjb()+ "','"+Pt.getPtlx() + "','"+Pt.getPzrq()+"','" + Pt.getPzwh()+ "','" + Pt.getUsername()+ "')";
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
