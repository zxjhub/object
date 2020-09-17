<%@ include file="left.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet?method=view" method="post">
<div style="position:absolute;left:450px;top:20px;">
<input type="text" name="corp_name"style="width:180px; height:38px;border-radius:3px">
</div>
<div style="position:absolute;left:640px;top:24px;">
<button type="submit" style="width:32px; height:32px;background-image:url(images/search.png);"></button>
</div>
</form>
</body>
</html>