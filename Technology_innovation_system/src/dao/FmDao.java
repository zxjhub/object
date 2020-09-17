package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.Fm;
import common.Ptmessage;
import helper.Helper;
public class FmDao {
	/**
	 * Ìí¼Ó
	 * @param course
	 * @return
	 */
	public boolean add(Fm Fm) {
		String sql = "insert into Fm(glbm,tbr,szbm,lxdh, sjhm, e_mail,tb_time,username) values('" + Fm.getGlbm()+ "','" + Fm.getTbr()+ "','"+Fm.getSzbm() + "','"+Fm.getLxdh()+"','" + Fm.getSjhm()+ "','" + Fm.getE_mail()+ "','"+Fm.getTb_time() + "','"+Fm.getUsername() + "')";
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
	public static List<Ptmessage> list(String username) {
		String sql = "select * from ptmessage where username ='" + username + "'";
		List<Ptmessage> list = new ArrayList<>();
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		try {
			state = conn.createStatement();
			rs = state.executeQuery(sql);
			while (rs.next()) {
				String ptmc = rs.getString("ptmc");
				String ytdw = rs.getString("ytdw");
				String ptlx = rs.getString("ptlx");
				Ptmessage bean = new Ptmessage(ptmc,ytdw,ptlx);
				list.add(bean);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		
		return list;
	}
	
}


