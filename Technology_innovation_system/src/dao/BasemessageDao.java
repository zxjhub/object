package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.BaseMessage;
import common.Ptmessage;
import helper.Helper;
public class BasemessageDao {
	/**
	 * Ìí¼Ó
	 * @param course
	 * @return
	 */
	public boolean add(BaseMessage BM) {
		String sql = "insert into basemessage(ptmc,pzny, jsly, ptjb, szxs,zzxt1,zzxt2,zzxt3,jjjgj, jjhy1,jjhy2,jjhy3,zyxk1,zyxk2,zyxk3, frdbxm,bgdh, dwlx, gjdw, wzmc,wz,txdz,yb,zrxm,zrxb,zrcsny,zrzc,zrsxzy,zrxl,zrxw,zrbgdh, zrsj,zrdz,username) values('" + BM.getPtmc() + "','" + BM.getPzny() + "','" + BM.getJsly()+ "','"+BM.getPtjb() + "','"+BM.getSzxs()+"','" + BM.getZzxt1()+ "','" + BM.getZzxt2()+ "','"+BM.getZzxt3() + "','" + BM.getJjjgj() + "','" +BM.getJjhy1()+ "','" + BM.getJjhy2()+ "','"+BM.getJjhy3() + "','"+BM.getZyxk1()+"','" + BM.getZyxk2()+ "','" + BM.getZyxk3()+ "','"+BM.getFrdbxm()+ "','" + BM.getBgdh()+ "','"+BM.getDwlx() + "','"+BM.getGjdw()+"','" + BM.getWzmc()+ "','" + BM.getWz()+ "','" + BM.getTxdz()+ "','" + BM.getYb()+ "','"+BM.getZrxm() + "','" + BM.getZrxb() + "','" +BM.getZrcsny()+ "','" + BM.getZrzc()+ "','"+BM.getZrsxzy()+ "','"+BM.getZrxl()+"','" + BM.getZrxw()+"','"+BM.getZrbgdh() + "','"+BM.getZrsj() + "','" + BM.getZrdz() + "','" + BM.getUsername() + "')";
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
				String pzrq = rs.getString("pzrq");
				String pzwh = rs.getString("pzwh");
				Ptmessage bean = new Ptmessage(ptmc,ytdw,pzrq,pzwh);
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


