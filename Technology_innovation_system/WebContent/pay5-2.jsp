<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>pay5-2</title>
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
<table  width="2340" height="120"bgcolor="#c0c0c0"border="1" cellspacing="0"style="margin-left:232px">
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
<form action="/Technology_innovation_system/PayServlet?method=add" method="post" onsubmit="return check()">
<table  width="1000" height="350"border="1" cellspacing="0"style="border-color:#FFFFFF;margin-left:232px;">
        <tr bgcolor="#CCFFFF" height="30">
			<td colspan="13"><font color="grey">&nbsp;&nbsp;&nbsp;当前位置<i class="my-icon nav-icon icon_5"></i>统计表填报<i class="my-icon nav-icon icon_5"></i>五、年度经费筹集和支出情况</font></td>
		</tr>
		<tr height="40">
			<td colspan="13">&nbsp;&nbsp;&nbsp;
			<input type="button" value="表5-1"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/pay.jsp'">
			<input type="button" value="表5-2"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/pay5-2.jsp'">
			<input type="button" value="表5-3"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/pay5-3.jsp'">
			<input type="button" value="表5-4"style="width:100px; height:35px;border-radius:3px"onclick="window.location.href= 'http://localhost:8080/Technology_innovation_system/pay5-4.jsp'">		
			</td>
		</tr>
		<tr height="30" bgcolor="#CCCCFF">
			<td colspan="13"><font color="black"style="font-weight:bold;font-family:黑体;">表5-1  政府资金和依托单位投入明细表                              单位：万元</font></td>
		</tr>
		<tr height="20">
			<td colspan="13"></td>
		</tr>
		<tr height="30" align="center" >
		<td width="200" colspan="5"><font color="black"style="font-family:宋体;">政府资金</font></td>
		<td width="200" colspan="8"><font color="black"style="font-family:宋体;">依托单位投入</font></td>
		</tr>
		 <tr height="30" align="center" >
           <td width="200" rowspan="2"><font color="black"style="font-family:宋体;">国家财政</font></td>
			<td width="200" rowspan="2"><font color="black"style="font-family:宋体;">省级财政</font></td>
			<td width="200"rowspan="2"><font color="black"style="font-family:宋体;">市级财政</font></td>
			<td width="200"rowspan="2"><font color="black"style="font-family:宋体;">县级财政</font></td>
			<th width="200" rowspan="2"><font color="black"style="font-family:宋体;">小计</font></th>
			<td width="200" colspan="2"><font color="black"style="font-family:宋体;">年度运行经费</font></td>
			<td width="200"colspan="2"><font color="black"style="font-family:宋体;">固定资产投资</font></td>
			<td width="200"colspan="2"><font color="black"style="font-family:宋体;">科研项目（课题）经费</font></td>
			<td width="200"rowspan="2"><font color="black"style="font-family:宋体;">其他</font></td>
			<th width="200"rowspan="2"><font color="black"style="font-family:宋体;">小计</font></th>
		</tr>
		  <tr height="30">
         <td width="200"><font color="black"style="font-family:宋体;">人员工资</font></td>
         <td width="200"><font color="black"style="font-family:宋体;">办公费用</font></td>
         <td width="200"><font color="black"style="font-family:宋体;">设施</font></td>
         <td width="200"><font color="black"style="font-family:宋体;">仪器设备</font></td>
         <td width="200"><font color="black"style="font-family:宋体;">自主研发项目</font></td>
          <td width="200"><font color="black"style="font-family:宋体;">合作研发项目</font></td>
		</tr>
			<tr height="30">
            <td width="200"><input type="text" id="gjcz" name="gjcz"onkeyup="sum();" ></td>
         <td width="200"><input type="text" id="sjcz" name="sjcz"onkeyup="sum();" ></td>
         <td width="200"><input type="text" id="sjcz1" name="sjcz1"onkeyup="sum();" ></td>
         <td width="200"><input type="text" id="xjcz" name="xjcz"onkeyup="sum();" ></td>
         <td width="200"><input type="text" id="xj1" name="xj1"></td>
         <td width="200"><input type="text" id="rygz" name="rygz"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="bgfy" name="bgfy"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="ss" name="ss"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="yqsb" name="yqsb"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="zzyfxm" name="zzyfxm"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="hzyfxm" name="hzyfxm"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="qt" name="qt"onkeyup="sum();"></td>
         <td width="200"><input type="text" id="xj2" name="xj2"></td>
		</tr>
		<tr height="60" align="center">
		<td colspan="13">
		<input type="submit" value="添加并保存"style="width:100px; height:35px;border-radius:3px">
		<input type="reset" value="清空"style="width:100px; height:35px;border-radius:3px"></td>
		</tr>

</table>
</form>
 <script type="text/javascript">
     function sum(){
    	    var gjcz = document.getElementById("gjcz").value;
			var sjcz = document.getElementById("sjcz").value;
			var sjcz1 = document.getElementById("sjcz1").value;
			var xjcz = document.getElementById("xjcz").value;
	        document.getElementById("xj1").value=parseFloat(gjcz)+parseFloat(sjcz)+parseFloat(sjcz1)+parseFloat(xjcz);
	        var rygz = document.getElementById("rygz").value;
			var bgfy = document.getElementById("bgfy").value;
			var ss = document.getElementById("ss").value;
			var yqsb = document.getElementById("yqsb").value;
			var zzyfxm = document.getElementById("zzyfxm").value;
			var hzyfxm = document.getElementById("hzyfxm").value;
			var qt = document.getElementById("qt").value;
			document.getElementById("xj2").value=parseFloat(rygz)+parseFloat(bgfy)+parseFloat(ss)+parseFloat(yqsb)+parseFloat(zzyfxm)+parseFloat(hzyfxm)+parseFloat(qt);
	 }
		function check() {
			var gjcz = document.getElementById("gjcz");
			var sjcz = document.getElementById("sjcz");
			var sjcz1 = document.getElementById("sjcz1");
			var xjcz = document.getElementById("xjcz");
			var xj1 = document.getElementById("xj1");
			var rygz = document.getElementById("rygz");
			var bgfy = document.getElementById("bgfy");
			var ss = document.getElementById("ss");
			var yqsb = document.getElementById("yqsb");
			var zzyfxm = document.getElementById("zzyfxm");
			var hzyfxm = document.getElementById("hzyfxm");
			var qt = document.getElementById("qt");
			var xj2 = document.getElementById("xj2");
			//非空
			if(gjcz.value == '') {
				alert('未填入国家财政');
				gjcz.focus();
				return false;
			}
			if(sjcz.value == '') {
				alert('未填入省级财政');
				sjcz.focus();
				return false;
			}
			if(sjcz1.value == '') {
				alert('未填入市级财政');
				sjcz1.focus();
				return false;
			}
			if(xjcz.value == '') {
				alert('未填入县级财政');
				xjcz.focus();
				return false;
			}
			if(xj1.value == '') {
				alert('未填入小计1');
				xj1.focus();
				return false;
			}
			if(rygz.value == '') {
				alert('未填入人员工资');
				rygz.focus();
				return false;
			}
			if(bgfy.value == '') {
				alert('未填入办公费用');
				bgfy.focus();
				return false;
			}
			if(ss.value == '') {
				alert('未填入设施');
				ss.focus();
				return false;
			}
			if(yqsb.value == '') {
				alert('未填入仪器设备');
				yqsb.focus();
				return false;
			}
			if(zzyfxm.value == '') {
				alert('未填入自主研发项目');
				zzyfxm.focus();
				return false;
			}
			if(hzyfxm.value == '') {
				alert('未填入合作研发项目');
				hzyfxm.focus();
				return false;
			}
			if(qt.value == '') {
				alert('未填入其他');
				qt.focus();
				return false;
			}
			if(xj2.value == '') {
				alert('未填入小计2');
				xj2.focus();
				return false;
			}
		}
	</script>
</body>
</html>