<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<title>统计表查看</title>

</head>
<%
 Object object=request.getAttribute("a");
%>
<%if(object!=null&&!"".equals(object)) {%>
<form action="/Technology_innovation_system/Search2Servlet?method=search" method="post" onsubmit="return check()">
<table  width="800"border="1" cellspacing="0"style="border-color:#FFFFFF;">
       
        <tr height="30" align="center">
        <td><font color="black"style="font-family:宋体;">平台名称</font></td>
        <td><font color="black"style="font-family:宋体;">平台级别</font></td>
        <td><font color="black"style="font-family:宋体;">技术领域</font></td>
        <td><font color="black"style="font-family:宋体;">所属地区</font></td>
        <td><font color="black"style="font-family:宋体;">批准年月</font></td>
        <td><font color="black"style="font-family:宋体;">京津冀共建</font></td>
        </tr>

<c:forEach items="${a}" var="item" varStatus="status"> 
        <tr align="center">
        	<td>${item.ptmc}</td>
			<td>${item.ptjb}</td>
			<td>${item.jsly}</td>
			<td>${item.szxs}</td>
            <td>${item.pzrq}</td>
			<td>${item.jjjgj}</td>
        </tr>
</c:forEach>
</table>
</form>
<%}else{ %>
<p>请查询</p>
<%} %>
</body>
</html>