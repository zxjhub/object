<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<%@page import="com.enterprise.entity.entity"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业信息</title>
</head>
<body>
<table align="center" width="1000" height="555"border="1" cellspacing="0"style="border-color:#FFFFFF;">
		<%
			// 获取图书信息集合
			List<entity> list = (List<entity>) request.getAttribute("list");
			// 判断集合是否有效
			if (list == null || list.size() < 1) {
				out.print("没有数据！");
			} else {
				// 遍历图书集合中的数据
				for (entity book : list) {
		%>	
		<tr height="55">
			<td rowspan="4" width="300" align="center"><img src="images/星网公司.png"  width="220" height="220"alt="上海鲜花港 - 郁金香" /></td>
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;"><%=book.getCORP_NAME()%></font></td>
		</tr>
		<tr height="55">
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;">电话：<%=book.getTEL()%></font></td>
		</tr>
		<tr height="55">
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;">官网：<%=book.getWEB_URL()%>邮箱：<%=book.getEMAIL()%></font></td>
		</tr>
		<tr height="55">
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;">地址：<%=book.getADDR()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">注册资本：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getREG_CAPI()%></font></td>
			<td width="200"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">成立日期：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getSTART_DATE()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">经营状态：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getCORP_STATUS()%></font></td>
			<td width="200"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">统一社会信用代码：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getREG_NO()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">纳税人识别号：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getTAXPAY_NUM()%></font></td>
			<td width="200"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">注册号：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getUNI_SCID()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">组织机构代码：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getORG_INST_CODE()%></font></td>
			<td width="200" bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">公司类型：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getECON_KIND()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">人员规模：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getSTAFF_SIZE()%></font></td>
			<td width="200" bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">营业期限：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getFARE_TERM_START()%>至<%=book.getFARE_TERM_END()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">登记机关：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getBELONG_ORG()%></font></td>
			<td width="200"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">核准日期：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getCHECK_DATE()%></font></td>
		</tr>
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">英文名：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getENGLISH_NAME()%></font></td>
			<td width="200" bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">曾用名：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getFORMER_NAME()%></font></td>
		</tr>	
		<tr height="55">
			<td bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">所属地区：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getBELONG_DIST_ORG()%></font></td>
			<td width="200"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">所属行业：</font></td>
			<td width="300"><font color="black"style="font-family:宋体;"><%=book.getBELONG_TRADE()%></font></td>
		</tr>
		<tr height="55">
			<td width="300" bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">企业地址：</font></td>
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;"><%=book.getADDR()%></font></td>
		</tr>
		<tr height="55">
			<td width="300"bgcolor="#F0F8FF"><font color="black"style="font-family:宋体;">经营范围：</font></td>
			<td width="700" colspan="3"><font color="black"style="font-family:宋体;"><%=book.getFARE_SCOPE()%></font></td>
		</tr>
		<tr height="55">
		<td colspan="4" align="center"><h2><a href="search.jsp">返回</a></h2></td>
		</tr>
		<%
			}
			}
		%>
		</table>
</body>
</html>