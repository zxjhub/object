<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ page import="java.util.Date"%>  
      <%@page import="common.Ptmessage"%> 
<%@page import="dao.FmDao"%> 
<%@page import="java.util.List" %> 
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>封面</title>
<%
Date date=new Date();
String datestr=java.text.DateFormat.getDateInstance().format(date);
String username=(String)session.getAttribute("name"); 
List<Ptmessage> list=new ArrayList<>();
  list=FmDao.list(username);
  String ptmc=list.get(0).getPtmc();
  String ptlx=list.get(0).getPtlx();
  String ytdw=list.get(0).getYtdw();

%>
<link rel="stylesheet" type="text/css" href="css/nav.css">
<link rel="stylesheet" type="text/css" href="font/iconfont.css">
<script type="text/javascript" src="js/nav.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<link rel="stylesheet" href="dist/sidebar-menu.css">
<style type="text/css">
.main-sidebar{
	position: absolute;
	top: 0;
	left: 0;
	height: 100%;
	min-height: 100%;
	width: 230px;
	z-index: 810;
	background-color:#b8c7ce;
 }
</style>

</head>
<body>
<form action="">
<table  width="1000" height="120"bgcolor="#c0c0c0"border="1" cellspacing="0"style="margin-left:232px">
<tr height="50">
<td><font  size="6" color="#9AC0CD"style="font-weight:bold;font-family:楷体;">河北省科技创新平台年报统计系统</font> 

<div>
<span style="position:absolute; right:470px; bottom:650px;">
   <input type="button" value="填报流程" onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/menu-bar.jsp'">
  </span>
</div>
<div>
<span style="position:absolute;  right:400px; bottom:650px;">
<input type="button" value="修改密码" onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/change.jsp'">
  </span>
</div>
<div>
<span style="position:absolute; right:330px; bottom:650px;">
<input type="button" value="退出登录" onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/index.jsp'">
  </span>
</div>
<div>
<span style="position:absolute; right:350px; bottom:600px;">
  欢迎您,<%=username %></span>
</div>
</table>
</form>
<aside class="main-sidebar">
<section  class="sidebar">
	<ul class="sidebar-menu">
	  <li class="header">系统操作菜单</li>
	  <li class="treeview">
		<a href="#">
		  <i class="fa fa-edit"></i> <span>统计表在线填报</span>
		  <i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
		  <li><a href="fengmian.jsp"><i class="fa fa-circle-o"></i>封面</a></li>
		  <li><a href="base-information.jsp"><i class="fa fa-circle-o"></i>一、基本信息</a></li>
		  <li><a href="system2-1.jsp"><i class="fa fa-circle-o"></i>二、主要研究方向和体系结构</a></li>
		  <li><a href="people.jsp"><i class="fa fa-circle-o"></i>三、人员情况</a></li>
		  <li><a href="equipment.jsp"><i class="fa fa-circle-o"></i>四、科研用房和仪器设备</a></li>
		  <li><a href="pay.jsp"><i class="fa fa-circle-o"></i>五、年度经费筹集和支出情况</a></li>
		  <li><a href="project.jsp"><i class="fa fa-circle-o"></i>六、年度研发项目情况</a></li>
		  <li><a href="publish.jsp"><i class="fa fa-circle-o"></i>七、年度研发成果产出情况</a></li>
		  <li><a href="cooperation.jsp"><i class="fa fa-circle-o"></i>八、开放合作情况</a></li>
		  <li><a href="service.jsp"><i class="fa fa-circle-o"></i>九、成果转化和对外服务情况</a></li>
		  <li><a href="train.jsp"><i class="fa fa-circle-o"></i>十、人才培训情况</a></li>
		</ul>
	  </li>
	  <li class="treeview">
		<a href="#">
		  <i class="fa fa-files-o"></i> <span>统计表查看</span>
		  <i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
		  <li><a href="search.jsp"><i class="fa fa-circle-o"></i>统计表查看</a></li>
		  <li>
			<a href="#"><i class="fa fa-circle-o"></i>分类查看<i class="fa fa-angle-left pull-right"></i></a>
			<ul class="treeview-menu">
			  <li><a href="search1.jsp"><i class="fa fa-circle-o"></i>全文检索</a></li>
			  <li><a href="search2.jsp"><i class="fa fa-circle-o"></i>高级检索</a></li>
			  <li>
				<a href="#"><i class="fa fa-circle-o"></i> Level Two <i class="fa fa-angle-left pull-right"></i></a>
				<ul class="treeview-menu">
				  <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
				  <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
				</ul>
			  </li>
			</ul>
		  </li>
		</ul>
	  </li>
	  <li class="treeview">
		<a href="#">
		  <i class="fa fa-laptop"></i> <span>统计表提交上报</span>
		  <i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
		  <li><a href="#"><i class="fa fa-circle-o"></i>校核并上报</a></li>
		</ul>
	  </li>
	  	  <li class="treeview">
		<a href="#">
		  <i class="fa fa-book"></i> <span>用户信息查看</span>
		  <i class="fa fa-angle-left pull-right"></i>
		</a>
		<ul class="treeview-menu">
		  <li><a href="#"><i class="fa fa-circle-o"></i>用户信息</a></li>
		</ul>
	  </li>
	</ul>
  </section>
 </aside>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="./dist/sidebar-menu.js"></script>
<script>
$.sidebarMenu($('.sidebar-menu'))
</script>
	<%
	     Object message = request.getAttribute("message");
	     if(message!=null && !"".equals(message)){
	 
	%>
	     <script type="text/javascript">
	          alert("<%=request.getAttribute("message")%>");
	     </script>
	<%} %>
<form action="/Technology_innovation_system/FmServlet?method=add" method="post" onsubmit="return check()">
<table  width="1000" height="630"border="1" cellspacing="0"style="border-color:#FFFFFF;margin-left:232px;">
        <tr bgcolor="#CCFFFF" height="30">
			<td colspan="4"><font color="grey">&nbsp;&nbsp;&nbsp;当前位置<i class="my-icon nav-icon icon_5"></i>统计表在线填报<i class="my-icon nav-icon icon_5"></i>封面</font></td>
		</tr>

		<tr height="30" bgcolor="#CCCCFF">
			<td colspan="4"><font color="black"style="font-weight:bold;font-family:黑体;">河北省科技创新平台年度统计表</font></td>
		</tr>
		 <tr height="50" align="center" >
           <td width="80">
           <input type="hidden" class="hidden" id="username" name="username"value="<%=username%>">
           <font color="black"style="font-family:宋体;">平台名称:</font>
           </td>
			<td width="300"><font color="black"style="font-family:宋体;"></font><%=ptmc%></td>
			<td width="400"><font color="black"style="font-family:宋体;">平台类型:</font></td>
			<td width="220"><font color="black"style="font-family:宋体;"></font><%=ptlx%></td>
		</tr>
		  <tr height="50" align="center">
           <td width="80"><font color="black"style="font-family:宋体;">依托单位:</font></td>
			<td><font color="black"style="font-family:宋体;"></font><%=ytdw %></td>
			<td width="300"><font color="black"style="font-family:宋体;">归口管理部门:</font></td>
			<td><input type="text" id="glbm" name="glbm"></td>
		</tr>
	<tr height="50" align="center">
           <td width="80"><font color="black"style="font-family:宋体;">填表人:</font></td>
			<td><input type="text" id="tbr" name="tbr"></td>
			<td width="300"><font color="black"style="font-family:宋体;">填表人所在部门:</font></td>
			<td><input type="text" id="szbm" name="szbm"></td>
		<tr height="50"align="center">
           <td width="80"><font color="black"style="font-family:宋体;">填表人联系电话:</font></td>
			<td><input type="text" id="lxdh" name="lxdh"></td>
			<td width="300"><font color="black"style="font-family:宋体;">填表人手机号码:</font></td>
			<td><input type="text" id="sjhm" name="sjhm"></td>
		<tr height="50"align="center">
           <td width="80"><font color="black"style="font-family:宋体;">E-mail地址:</font></td>
			<td><input type="text" id="e_mail" name="e_mail"></td>
			<td width="300"><font color="black"style="font-family:宋体;">填表时间:</font></td>
			<td width="220"><input value=<%=datestr %> type="text" id="tb_time"name="tb_time"></td>
		<tr height="110">
           <td colspan="4"><font size="3" color="blue"style="font-family:宋体;">注：1.“填表人所在部门”为填表人所在平台的内设机构名称.<br>
           &nbsp;&nbsp;&nbsp;&nbsp;2.联系电话和手机号码请在英文半角状态下输入。<br><br></font>
		</tr>
		 <tr height="60" align="center">
		 <td colspan="4">
		<input type="submit" value="保存"style="width:100px; height:25px;border-radius:3px">
		<input type="submit" value="保存并下一步"style="width:100px; height:25px;border-radius:3px">
		</td>
		</tr>
</table>
</form>
<script type="text/javascript">
		function check() {
			var ytdw = document.getElementById("ytdw");
			var glbm = document.getElementById("glbm");
			var tbr = document.getElementById("tbr");
			var szbm = document.getElementById("szbm");
			var sjhm = document.getElementById("sjhm");
			var e_mail = document.getElementById("e_mail");
			var tb_time = document.getElementById("tb_time");
			var lxdh = document.getElementById("lxdh");
			//非空
			if(ytdw.value == '') {
				alert('未填入依托单位');
				ytdw.focus();
				return false;
			}
			if(glbm.value == '') {
				alert('未填入归口管理部门');
				glbm.focus();
				return false;
			}
			if(tbr.value == '') {
				alert('未填入填表人');
				tbr.focus();
				return false;
			}
			if(szbm.value == '') {
				alert('未填入填表人所在部门');
				szbm.focus();
				return false;
			}
			if(lxdh.value == '') {
				alert('未填入填表人联系电话');
				lxdh.focus();
				return false;
			}
			if(sjhm.value == '') {
				alert('未填入填表人手机号码');
				sjhm.focus();
				return false;
			}
			if(e_mail.value == '') {
				alert('未填入E-mail地址');
				e_mail.focus();
				return false;
			}

		}
	</script>
</body>
</html>