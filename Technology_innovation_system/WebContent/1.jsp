<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css" media="all">    
  <script src="layui/layui.js" charset="utf-8"></script>
   <script type="text/javascript" src="js/dataTool.js"></script>
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <meta charset="utf-8">

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
<script type="text/javascript">
		layui.use([ 'tree', 'util' ], function() {
			var tree = layui.tree,util = layui.util;
			$.get('data.json', function(json) {
				tree.render({
					elem : '#tree', //默认是点击节点可进行收缩
					data : json,
					//showCheckbox : true	,
					id : 'diqu',
					click: function(obj){
						var data = obj.data;
						 /*layer.msg('状态：'+ obj.state + '<br>节点数据：' + JSON.stringify(data.title));*/ 
						window.result.location.href="Pservlet?method=shu&data="+data.title; 
					}
				});
				//按钮事件
				util.event('id', {
					setChecked : function() {
						tree.setChecked('diqu', [110000,120000,130100]); //勾选指定节点
					}
				});
			});
		});
	</script>
</head>
<div style="margin-left:250px;width: 1050px;border-color:black">

<div id="tree" class="demo-tree demo-tree-box" style="width:150px;float:left;"></div >
<div style="width:900px;float:right;">
<form action="/Technology_innovation_system/SearchServlet?method=search1" method="post" onsubmit="return check()">
<table  width="700" height="90"border="1" cellspacing="0"style="border-color:#FFFFFF;">
        <tr bgcolor="#CCFFFF" height="30">
			<td colspan="7"><font color="grey">&nbsp;&nbsp;&nbsp;当前位置<i class="my-icon nav-icon icon_5"></i>调查表查看<i class="my-icon nav-icon icon_5"></i>高级检索</font></td>
		</tr>
		<tr>
		<td colspan="2">输入检索条件：</td>
		</tr>
          <tr>
          <td> <input type="text" id="content"name="content"style="width:200px; height:25px;"> 
           <select id="search" name="search" style="width:60px;height:25px">
			<option value="ptmc">模糊</option>
			<option value="pzrq">标准</option>
			</select> </td>  
			 <td> <input type="text" id="content"name="content"style="width:200px; height:25px;"> 
           <select id="search" name="search" style="width:60px;height:25px">
			<option value="ptmc">模糊</option>
			<option value="pzrq">标准</option>
			</select> </td>      
          </tr>
           <tr>
          <td> <input type="text" id="content"name="content"style="width:200px; height:25px;"> 
           <select id="search" name="search" style="width:60px;height:25px">
			<option value="ptmc">模糊</option>
			<option value="pzrq">标准</option>
			</select> </td>  
			 <td> <input type="text" id="content"name="content"style="width:200px; height:25px;"> 
           <select id="search" name="search" style="width:60px;height:25px">
			<option value="ptmc">模糊</option>
			<option value="pzrq">标准</option>
			</select> </td>      
          </tr>
           <tr align="center">
          <td colspan="2"> <input type="submit" value="检索"style="width:60px; height:25px;border-radius:3px"></td>       
          </tr>
</table>
</form>


</div >
</div >



</body>
</html>