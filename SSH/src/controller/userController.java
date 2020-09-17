package controller;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import entity.User;
import servicesDao.userServiceDao;
import utils.ImageUtil;

@Controller
public class userController {
 @Autowired
 userServiceDao useDao;
  @RequestMapping("/user_login")
   public String login(User u,String number,HttpSession session) throws Exception{
	   String imageCode=(String)session.getAttribute("imageCode");
	    if(imageCode.equals(number.toUpperCase())){
	    	User user=useDao.login(u);
	    	 if(user!=null){
	    		 session.setAttribute("user", user);
	    		 return "redirect:/emp_list.action";	
	    	 }
	     
	    }
	   return "login";
   }
   @RequestMapping("/createValidCode")
   @ResponseBody
   public OutputStream createImg(HttpServletResponse response,HttpSession session)throws Exception{
	   
	   // 1.璋冪敤宸ュ叿绫伙紝鐢熸垚楠岃瘉鐮佸強鍥剧墖
			Map<String, BufferedImage> imageMap = ImageUtil.createImage();
			// 2.浠巌mageMap涓彇鍒伴獙璇佺爜锛屽苟鏀惧叆session
			String imageCode = imageMap.keySet().iterator().next();
			session.setAttribute("imageCode", imageCode.toUpperCase());
			// 3.浠巌mageMap涓彇鍒板浘鐗囷紝杞负杈撳叆娴�
			BufferedImage image = imageMap.get(imageCode);
			OutputStream output=response.getOutputStream();
			ImageUtil.WriteOutputStream(image,output);			
			return output;
   }
 
 
public userServiceDao getUseDao() {
	return useDao;
}

public void setUseDao(userServiceDao useDao) {
	this.useDao = useDao;
}

}
