package code;

import dbmanager.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String validationCode = req.getParameter("validationCode");
        String validation_code = (String)req.getSession().getAttribute("validation_code");
    
        Login mss = new Login();
        String result = mss.checkUser(username,password);
        int c=Login.code(username,password);
        HttpSession session=req.getSession();
        
        


        if (result.equals("hasUserNameAndPasswordCorrect")&&validationCode.equals(validation_code)&&c==0) {
        	Login.updatecode(username,password);
        	resp.sendRedirect("ptmessage.jsp?error1=yes4");
        	session.setAttribute("name", username);
        } else if(result.equals("hasUserNameAndPasswordCorrect")&&validationCode.equals(validation_code)&&c!=0) {  
        	session.setAttribute("name", username);
        	req.getRequestDispatcher("menu-bar.jsp").forward(req, resp);
        }else if (result.equals("hasUserNameButPasswordInCorrect")&&validationCode.equals(validation_code)) {
        	resp.sendRedirect("login1.jsp?error1=yes1");
           
        } else if (result.equals("hasNoUserName")&&validationCode.equals(validation_code)||result.equals("hasUserNameAndPasswordCorrect")==false) {
        	resp.sendRedirect("login1.jsp?error1=yes2");
        	      	
        }
        if (result.equals("hasUserNameAndPasswordCorrect")&&validationCode.equals(validation_code)==false) {
        	
        	resp.sendRedirect("login1.jsp?error1=yes3");
      
    }
       
}
 
}