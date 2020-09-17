<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>people3-2</title>
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
<table  width="2330" height="120"bgcolor="#c0c0c0"border="1" cellspacing="0"style="margin-left:232px">
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
  欢迎您,【河北省科学技术情报研究学院】</span>
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
<form action="/Technology_innovation_system/PeopleServlet?method=add2" method="post" onsubmit="return check()">
<table  width="1170" height="300"border="1" cellspacing="0"style="border-color:#FFFFFF;margin-left:232px;">
        <tr bgcolor="#CCFFFF" height="30">
			<td colspan="13"><font color="grey">&nbsp;&nbsp;&nbsp;当前位置<i class="my-icon nav-icon icon_5"></i>统计表填报<i class="my-icon nav-icon icon_5"></i>三、人员情况</font></td>
		</tr>
		<tr height="40">
		<td colspan="13">&nbsp;&nbsp;&nbsp;<input type="button" value="表3-1"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people.jsp'">
			<input type="button" value="表3-2"style="width:100px; height:35px;border-radius:3px" onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-2.jsp'">
			<input type="button" value="表3-3"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-3.jsp'">
			<input type="button" value="表3-4"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-4.jsp'">
			<input type="button" value="表3-5"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-5.jsp'">
			<input type="button" value="表3-6"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-6.jsp'">
			<input type="button" value="表3-7"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/people3-7.jsp'">
			</td>
		</tr>
		<tr height="55" bgcolor="#CCCCFF">
			<td colspan="13"><font color="black"style="font-weight:bold;font-family:黑体;">表3-2  现有人才列表</font></td>
		</tr>
		<tr height="10">
			<td colspan="13"></td>
		</tr>
		 <tr height="30px" align="center" >
           <td width="90"><font color="black"style="font-family:宋体;">姓名</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">性别</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">出生年月</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">学历</font></td>
			 <td width="90"><font color="black"style="font-family:宋体;">学位</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">毕业院校</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">所学专业</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">职称</font></td>
			 <td width="90"><font color="black"style="font-family:宋体;">人才层次</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">固定/流动</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">工作性质</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">人员状态</font></td>
			<td width="90"><font color="black"style="font-family:宋体;">人事关系所在单位</font></td>			
		</tr>
		  <tr height="30px" align="center">
           <td width="90"><input type="text" id="xm" name="xm"></td>
			<td width="90"><input type="text" id="xb" name="xb"></td>
			<td width="90"><input type="text" id="csny" name="csny"></td>
			<td width="90"><input type="text" id="xl" name="xl"></td>
			<td width="90"><input type="text" id="xw" name="xw"></td>
			 <td width="90"><input type="text" id="byyx" name="byyx"></td>
			<td width="90"><input type="text" id="sxzy" name="sxzy"></td>
			<td width="90"><input type="text" id="zc" name="zc"></td>
			<td width="90"><input type="text" id="rccc" name="rccc"></td>
			 <td width="90"><input type="text" id="gdld" name="gdld"></td>
			<td width="90"><input type="text" id="gzxz" name="gzxz"></td>
			<td width="90"><input type="text" id="ryzt" name="ryzt"></td>
			<td width="90"><input type="text" id="szdw" name="szdw"></td>				
		</tr>
		<tr height="60" align="center">
		<td colspan="13">
		<input type="submit" value="添加并保存"style="width:100px; height:35px;border-radius:3px">
		<input type="reset" value="清空"style="width:100px; height:35px;border-radius:3px"></td>
		</tr>
</table>
</form>
<script type="text/javascript">
		function check() {
			var xm = document.getElementById("xm");
			var xb = document.getElementById("xb");
			var csny = document.getElementById("csny");
			var xl = document.getElementById("xl");
			var xw = document.getElementById("xw");
			var byyx = document.getElementById("byyx");
			var sxzy = document.getElementById("sxzy");
			var zc = document.getElementById("zc");
			var rccc = document.getElementById("rccc");
			var gdld = document.getElementById("gdld");
			var gzxz = document.getElementById("gzxz");
			var ryzt = document.getElementById("ryzt");
			var szdw = document.getElementById("szdw");
			//非空
			if(xm.value == '') {
				alert('未填入姓名');
				xm.focus();
				return false;
			}
			if(xb.value == '') {
				alert('未填入性别');
				xb.focus();
				return false;
			}
			if(csny.value == '') {
				alert('未填入出生年月');
				csny.focus();
				return false;
			}
			if(xl.value == '') {
				alert('未填入学历');
				xl.focus();
				return false;
			}
			if(xw.value == '') {
				alert('未填入学位');
				xw.focus();
				return false;
			}
			if(byyx.value == '') {
				alert('未填入毕业院校');
				byyx.focus();
				return false;
			}
			if(sxzy.value == '') {
				alert('未填入所学专业');
				sxzy.focus();
				return false;
			}
			if(zc.value == '') {
				alert('未填入职称');
				zc.focus();
				return false;
			}
			if(rccc.value == '') {
				alert('未填入人才层次');
				rccc.focus();
				return false;
			}
			if(gdld.value == '') {
				alert('未填入固定或流动');
				gdld.focus();
				return false;
			}
			if(gzxz.value == '') {
				alert('未填入工作性质');
				gzxz.focus();
				return false;
			}
			if(ryzt.value == '') {
				alert('未填入人员状态');
				ryzt.focus();
				return false;
			}
			if(szdw.value == '') {
				alert('未填入人事关系所在单位');
				szdw.focus();
				return false;
			}
		}
	</script>
</body>
</html>