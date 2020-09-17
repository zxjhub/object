<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>综合管理登录</title>
</head>
<body>
<center>
<table  border="1"cellspacing="0"bordercolor="green"height="800"width="950" style="border-color:#FFFFFF">
<tr height="150">
<td><img src="Images/bj2.jpg" width="950px" height="150px"></td>
</tr>
<div style="position:absolute;left:350px;top:85px;">
<font size="7" color="red"style="font-weight:bold;font-family:楷体;">河北省科技创新平台年报统计系统</font>
</div>
<tr height="500">
<td>
<font size="3" color="black"style="font-weight:bold;font-family:黑体;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="Images/3.jpg" width="35px" height="30px">综合管理-用户登录</font>
<hr width="650">
<form action="/Technology_innovation_system/LoginServlet">
<table align="center" width="450">
		<tr>
			<td >用户名：<input type="text" name="username"></td>
		</tr>
		<tr>
			<td >密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"></td>
		</tr>
		<tr>
			<td> 验证码：<input type = "text" name = "validationCode"/>
                      <img src="/Technology_innovation_system/validationCode"></td>
		</tr>
		<tr>
			<td align="center" colspan="2"><input type="submit" value="登录" />
			</td>
		</tr>
		</table>
		</form>
</td>
</tr>
<tr height="150" bgcolor="#999999">
<td align="center">
<font color="white"style="font-family:黑体;">主办单位：河北省科学技术厅 技术支持：河北省科学技术情报研究院</font><br>
<font color="white"style="font-family:黑体;">统计工作联系人；陈娟 0311-85813216 技术支持人：张朝宗、王翠姣 0311-85811713</font><br>
<font color="white"style="font-family:黑体;">纸件寄送地址：石家庄市青园街233号 河北省科技评估中心（收） 邮编：050021</font>
</td>
</tr>
</table>
</body>
</html>
<script> 
  var error1 ='<%=request.getParameter("error1")%>';
  if(error1=='yes1'){
   alert("密码错误!");
  }else if(error1=='yes2'){
   alert("该用户不存在!");
  }
  else if(error1=='yes3'){
   alert("验证码错误!");
  }
</script>