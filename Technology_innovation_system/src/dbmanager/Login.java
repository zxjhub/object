package dbmanager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import helper.Helper;
public class Login {
    public String checkUser(String username,String password){
    	String sql = "select username,password from t_user";
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
        try {
        	state = conn.createStatement();
			rs = state.executeQuery(sql);
            while(rs.next()){
                String temp_username = rs.getString("username").trim();
                String temp_password = rs.getString("password").trim();
                if(username.equals(temp_username)){
                    if(password.equals(temp_password)){
                        return "hasUserNameAndPasswordCorrect";
                    }
                    return "hasUserNameButPasswordInCorrect";
                }
            }
        }catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
        return "hasNoUserName";
    }
	public static int code(String name,String password)
	{
		String sql="select code from t_user where username = '"+name+"'and password= '"+password+"'";
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		int c=0;
		try
		{
			state=conn.createStatement();
			rs = state.executeQuery(sql);
			while(rs.next())
			{
				 c=rs.getInt("code");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}
		return c;		
	}
	public static void updatecode(String name,String password)
	{
		String sql="update t_user set code = " + 1 + " where username = '"+name+"'and password= '"+password+"'";
		Connection conn = Helper.getConn();
		Statement state = null;
		ResultSet rs = null;
		try
		{
			state=conn.createStatement();
			rs = state.executeQuery(sql);
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Helper.close(rs, state, conn);
		}		
	}
}