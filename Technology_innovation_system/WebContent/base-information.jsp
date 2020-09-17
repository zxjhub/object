<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <%@page import="common.Ptmessage"%> 
<%@page import="dao.BasemessageDao"%> 
<%@page import="java.util.List" %> 
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>基本信息填报</title>
<%
String username=(String)session.getAttribute("name"); 
List<Ptmessage> list=new ArrayList<>();
list=BasemessageDao.list(username);
String ptmc=list.get(0).getPtmc();
String ytdw=list.get(0).getYtdw();
String pzny=list.get(0).getPzrq();
String pzwh=list.get(0).getPzwh();


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
<form action="/Technology_innovation_system/BasemessageServlet?method=add" method="post" onsubmit="return check()">
<!--startprint-->
<table width="1000" height="630"border="1" cellspacing="0"style="border-color:#FFFFFF;margin-left:232px;">
        <tr bgcolor="#CCFFFF" height="30">
			<td colspan="4"><font color="grey">&nbsp;&nbsp;&nbsp;当前位置<i class="my-icon nav-icon icon_5"></i>统计表在线填报<i class="my-icon nav-icon icon_5"></i>一、基本信息</font></td>
		</tr>

		<tr height="30" bgcolor="#CCCCFF">
		
			<td colspan="4">
			<input type="hidden" class="hidden" id="username" name="username"value="<%=username%>">
			<font color="black"style="font-weight:bold;font-family:黑体;">一、基本信息</font></td>
		</tr>
		 <tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">平台名称:</font></td>
			<td width="300"><input type="text" value="<%=ptmc%>"readonly="readonly"id="ptmc"name="ptmc"></td>
			<td width="300"><font color="black"style="font-family:宋体;">平台编号:</font></td>
			<td width="220"><font color="black"style="font-family:宋体;">Sa12879121</font></td>
		</tr>
		  <tr height="30" >
           <td width="180"><font color="black"style="font-family:宋体;">批准年月:</font></td>
			<td width="220"><input type="text" value="<%=pzny%>"readonly="readonly"id="pzny"name="pzny"></td>
			<td width="300"><font color="black"style="font-family:宋体;">批准文号:</font></td>
			<td width="220"><font color="black"style="font-family:宋体;"><%=pzwh%></font></td>
		</tr>
	<tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">技术领域:</font></td>
			<td width="180"colspan="3">
			<select id="jsly" name="jsly">
			<option value="物理学">物理学</option>
			<option value="渔业">渔业</option>
			<option value="牧畜业">牧畜业</option>
			<option value="化学科学">化学科学</option>
			</select>
			</td>
			</tr>
		<tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">平台级别:</font></td>
			<td>
			<select id="ptjb" name="ptjb">
			<option value="县级">县级</option>
			<option value="市级">市级</option>
			<option value="省级">省级</option>
			<option value="国家级">国家级</option>
			</select>
			</td>
			<td width="80"><font color="black"style="font-family:宋体;">所在县市（区）:</font></td>
			<td><input type="text"id="szxs" name="szxs"></td>
		</tr>
		<tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">平台组织形态</font></td>
				<td >
			<select id="zzxt1" name="zzxt1">
			<option value="独立法人">独立法人</option>
			<option value="企业法人">企业法人</option>
			<option value="事业法人">事业法人</option>
			<option value="社团法人">社团法人</option>
		
			</select>
			</td>
			<td >
			<select id="zzxt2" name="zzxt2">
			<option value="独立法人">独立法人</option>
			<option value="企业法人">企业法人</option>
			<option value="事业法人">事业法人</option>
			<option value="社团法人">社团法人</option>
			</select >
			</td>
			<td>
			<p>
			<select id="zzxt3" name="zzxt3">
			<option value="依托单位独自建设">依托单位独自建设</option>
			<option value="多单位联合共建">多单位联合共建</option>
			</select></p>
			<p>
			<font color="black"style="font-family:宋体;">京津冀共建</font>
            <select id="jjjgj" name="jjjgj">
			<option value="是">是</option>
			<option value="否">否</option>
			</select>
			</p>
			</td>
			</tr>
			<tr height="30">
           <td width="80"><font color="black"style="font-family:宋体;">服务的国民经济行业</font></td>
			<td width="1300" colspan="3">1.<input type="text"  id="jjhy1" name="jjhy1">&nbsp;&nbsp;&nbsp;2.<input type="text"  id="jjhy2" name="jjhy2">&nbsp;&nbsp;&nbsp;3.<input type="text"  id="jjhy3" name="jjhy3"></td>
			</tr>
			<tr height="30">
		<td width="80"><font color="black"style="font-family:宋体;">所属的主要学科</font></td>
			<td width="1300" colspan="3">1.<input type="text" id="zyxk1" name="zyxk1">&nbsp;&nbsp;&nbsp;2.<input type="text" id="zyxk2" name="zyxk2">&nbsp;&nbsp;&nbsp;3.<input type="text" id="zyxk3" name="zyxk3"></td>
		  </tr>
		  <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">依托单位名称:</font></td>
			<td width="220" ><%=ytdw %></td>
			<td width="300"><font color="black"style="font-family:宋体;">依托单位组织机构代码（社会信用代码）:</font></td>
			<td width="200" ><font color="black"style="font-family:宋体;">401997817</font></td>
		</tr>
		  <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">依托单位法人代表姓名:</font></td>
			<td width="220"><input type="text"  id="frdbxm" name="frdbxm" placeholder="测试帐号"></td>
			<td width="300"><font color="black"style="font-family:宋体;">办公电话:</font></td>
			<td width="200"><input type="text" id="bgdh" name="bgdh"></td>
		</tr>
		<tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">依托单位类型</font></td>
				<td colspan="3">
			<select  id="dwlx" name="dwlx">
			<option value="企业">企业</option>
			<option value="科研机构">科研机构</option>
			<option value="高等院校">高等院校</option>
			<option value="检测机构">检测机构</option>
		    <option value="医疗机构">医疗机构</option>
			<option value="政府机构">政府机构</option>
			<option value="社团组织">社团组织 </option>
			<option value="其他">其他</option>
			</select>
			</td>
			</tr>
		<tr height="30">
           <td width="180"><font color="black"style="font-family:宋体;">共建单位</font></td>
           <td width="200" colspan="3"><input type="text"  id="gjdw" name="gjdw"><font color="red"style="font-family:宋体;">依次填入共建单位，以";"区分</font></td>
           </tr>
           
		  <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">平台网站名称:</font></td>
			<td width="220"><input type="text" id="wzmc" name="wzmc"></td>
			<td width="300"><font color="black"style="font-family:宋体;">网址:</font></td>
			<td width="200"><input type="text"  id="wz" name="wz"></td>
		</tr>
		 <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">平台通讯地址:</font></td>
			<td width="220"><input type="text" id="txdz" name="txdz"></td>
			<td width="300"><font color="black"style="font-family:宋体;">邮编:</font></td>
			<td width="200"><input type="text" id="yb" name="yb"></td>
		</tr>
		 <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">平台主任(院长):</font></td>
           </tr>
          <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">姓名:</font></td>
			<td width="220"><input type="text"  id="zrxm" name="zrxm"></td>
			<td width="300"><font color="black"style="font-family:宋体;">性别:</font></td>
			<td width="200">
			<select  id="zrxb" name="zrxb">
			<option value="男">男</option>
			<option value="女">女</option>
			</select></td>
		</tr> 
		   <tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">出生年月:</font></td>
			<td width="220"><input type="text"  id="zrcsny" name="zrcsny"></td>
			<td width="300"><font color="black"style="font-family:宋体;">职称:</font></td>
			<td width="200">
			<select  id="zrzc" name="zrzc">
			<option value="高级">高级</option>
			<option value="中级">中级</option>
			<option value="其他">其他</option>
			</select></td>
		</tr> 
		<tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">所学专业:</font></td>
			<td width="220"><input type="text" id="zrsxzy" name="zrsxzy"></td>
			<td width="300"><font color="black"style="font-family:宋体;">学历:</font></td>
			<td width="200">
			<select  id="zrxl" name="zrxl">
			<option value="本科">本科</option>
			<option value="硕士研究生">硕士研究生</option>
			<option value="博士研究生">博士研究生</option>
			<option value="其他">其他</option>
			</select></td>
		</tr> 
		<tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">学位:</font></td>
           	<td width="200">
			<select  id="zrxw" name="zrxw">
			<option value="本科">本科</option>
			<option value="硕士">硕士</option>
			<option value="博士">博士</option>
			<option value="其他">其他</option>
			</select></td>
			<td width="300"><font color="black"style="font-family:宋体;">办公电话:</font></td>
			<td width="220"><input type="text" id="zrbgdh" name="zrbgdh"></td>
		</tr>
			<tr height="30" >
           <td width="250"><font color="black"style="font-family:宋体;">手机:</font></td>
           <td width="200"><input type="text"  id="zrsj" name="zrsj"></td>
			<td width="300"><font color="black"style="font-family:宋体;">E-mail地址:</font></td>
			<td width="220"><input type="text"  id="zrdz" name="zrdz"></td>
		</tr>
		<tr height="330">
			<td colspan="4"><font size="3"color="blue"style="font-family:宋体;">注：1.“平台编号”  ：与用户名相同，由平台批准单位统一配置派发。<br>
			&nbsp;&nbsp;&nbsp;&nbsp;2."所在市县（区）"  ：从行政区域代码中选择。<br>
			&nbsp;&nbsp;&nbsp;&nbsp;3."平台组织形态"  ：“内设机构相对独立（无法人资格）”或“独立法人”由系统自动生成，独立法人的需同时填写法人类型。“多单位联合共建”和“依托单位独自共建”据实单选。“京津冀单位”由北京、天津单位参加共建的选择“是”。<br>
		    &nbsp;&nbsp;&nbsp;&nbsp;4."服务的国民经济行业"  ：按国家标准（国民经济行业与代码）（GB/T4754-2011）中的分类代码填写；如服务于多个国民经济行业，按服务的主要行业依次填写。<br>
		    &nbsp;&nbsp;&nbsp;&nbsp;5."所属的主要学科"  按国家标准（学科分类与代码）（GB/T 13745-2009）按国家学科分类，填写三级小类。<br>
		    &nbsp;&nbsp;&nbsp;&nbsp;6."依托单位组织机构代码"  ：填写依托单位的法人机构或社会信用代码。<br>
		    &nbsp;&nbsp;&nbsp;&nbsp;7."依托单位类型"  ：单选。  “科研机构” 指事业法人性质的公益性非营利国办独立科研机构，不包括整体转制为企业的科研机构。大学附属医院按“医疗机构”填写。政府机构是指政府下设机构，如生产力促进中心、管委会、孵化器等其他事业机构。<br>
		    &nbsp;&nbsp;&nbsp;&nbsp;8."平台通讯地址"  ：是指平台办公所在地地址。</font></td>
		</tr>
		 <tr height="60" align="center">
		 <td colspan="4">
		<input type="submit" value="保存"style="width:100px; height:25px;border-radius:3px">
		<input type="submit" value="保存并下一步" style="width:100px; height:25px;border-radius:3px">
		    <input type="button" onclick="doPrint()" value="打印"/>

		</tr>
</table>
<!--endprint-->
</form>
<script>
    function doPrint() {

        bdhtml = window.document.body.innerHTML;
        sprnstr = "<!--startprint-->";
        eprnstr = "<!--endprint-->";
        prnhtml = bdhtml.substr(bdhtml.indexOf(sprnstr) + 17);
        prnhtml = prnhtml.substring(0, prnhtml.indexOf(eprnstr));

        //window.document.body.innerHTML =document.getElementById("mainbody").innerHTML;
        //window.print();

        window.document.body.innerHTML = prnhtml;
        window.print();
        window.document.body.innerHTML = bdhtml;
    }
</script>
<script type="text/javascript">
		function check() {
			var pzny = document.getElementById("pzny");
			var pzwh = document.getElementById("pzwh");
			var jsly = document.getElementById("jsly");
			var ptjb = document.getElementById("ptjb");
			var szxs = document.getElementById("szxs");
			var zzxt1 = document.getElementById("zzxt1");
			var zzxt2 = document.getElementById("zzxt2");
			var zzxt3 = document.getElementById("zzxt3");
			var jjjgj = document.getElementById("jjjgj");
			var jjhy1 = document.getElementById("jjhy1");
			var jjhy2 = document.getElementById("jjhy2");
			var jjhy3 = document.getElementById("jjhy3");
			var zyxk1 = document.getElementById("zyxk1");
			var zyxk2 = document.getElementById("zyxk2");
			var zyxk3 = document.getElementById("zyxk3");
			var dwmc = document.getElementById("dwmc");
			var jgdm= document.getElementById("jgdm");
			var frdbxm = document.getElementById("frdbxm");
			var bgdh = document.getElementById("bgdh");
			var dwlx = document.getElementById("dwlx");
			var gjdw= document.getElementById("gjdw");
			var wzmc = document.getElementById("wzmc");
			var wz = document.getElementById("wz");
			var txdz = document.getElementById("txdz");
			var yb = document.getElementById("yb");
			var zrxm = document.getElementById("zrxm");
			var zrxb = document.getElementById("zrxb");
			var zrcsny = document.getElementById("zrcsny");
			var zrzc = document.getElementById("zrzc");
			var zrsxzy = document.getElementById("zrsxzy");
			var zrxl = document.getElementById("zrxl");
			var zrxw = document.getElementById("zrxw");
			var zrbgdh = document.getElementById("zrbgdh");
			var zrsj = document.getElementById("zrsj");
			var zrdz = document.getElementById("zrdz");
			//非空
			if(jsly.value == '') {
				alert('未填入技术领域');
				jsly.focus();
				return false;
			}
			if(ptjb.value == '') {
				alert('未填入平台级别');
				ptjb.focus();
				return false;
			}
			if(szxs.value == '') {
				alert('未填入所在县市（区）:');
				szxs.focus();
				return false;
			}
			if(zzxt1.value == '') {
				alert('未填入平台组织形态1');
				zzxt1.focus();
				return false;
			}
			if(zzxt2.value == '') {
				alert('未填入平台组织形态2');
				zzxt2.focus();
				return false;
			}
			if(zzxt3.value == '') {
				alert('未填入平台组织形态3');
				zzxt3.focus();
				return false;
			}
			if(jjjgj.value == '') {
				alert('未填入京津冀共建');
				jjjgj.focus();
				return false;
			}
			if(jjhy1.value == '') {
				alert('未填入服务的国民经济行业1');
				jjhy1.focus();
				return false;
			}
			if(jjhy2.value == '') {
				alert('未填入服务的国民经济行业2');
				jjhy2.focus();
				return false;
			}
			if(jjhy3.value == '') {
				alert('未填入服务的国民经济行业3');
				jjhy3.focus();
				return false;
			}
			if(zyxk1.value == '') {
				alert('未填入所属的主要学科1');
				zyxk1.focus();
				return false;
			}
			if(zyxk2.value == '') {
				alert('未填入所属的主要学科2');
				zyxk2.focus();
				return false;
			}
			if(zyxk3.value == '') {
				alert('未填入所属的主要学科3');
				zyxk3.focus();
				return false;
			}
			if(frdbxm.value == '') {
				alert('未填入依托单位法人代表姓名');
				frdbxm.focus();
				return false;
			}
			if(bgdh.value == '') {
				alert('未填入办公电话');
				bgdh.focus();
				return false;
			}
			if(dwlx.value == '') {
				alert('未填入依托单位类型');
				dwlx.focus();
				return false;
			}
			if(gjdw.value == '') {
				alert('未填入共建单位');
				gjdw.focus();
				return false;
			}
			if(wzmc.value == '') {
				alert('未填入平台网站名称');
				wzmc.focus();
				return false;
			}
			if(wz.value == '') {
				alert('未填入网址');
				wz.focus();
				return false;
			}
			if(txdz.value == '') {
				alert('未填入平台通讯地址');
				txdz.focus();
				return false;
			}
			if(yb.value == '') {
				alert('未填入邮编');
				yb.focus();
				return false;
			}
			if(zrxm.value == '') {
				alert('未填入平台主任姓名');
				zrxm.focus();
				return false;
			}
			if(zrxb.value == '') {
				alert('未填入平台主任性别 ');
				zrxb.focus();
				return false;
			}
			if(zrcsny.value == '') {
				alert('未填入出生年月');
				zrcsny.focus();
				return false;
			}
			if(zrzc.value == '') {
				alert('未填入职称');
				zrzc.focus();
				return false;
			}
			if(zrsxzy.value == '') {
				alert('未填入所学专业');
				zrsxzy.focus();
				return false;
			}
			if(zrxl.value == '') {
				alert('未填入学历 ');
				zrxl.focus();
				return false;
			}
			if(zrxw.value == '') {
				alert('未填入学位');
				zrxw.focus();
				return false;
			}
			if(zrbgdh.value == '') {
				alert('未填入 办公电话 ');
				zrbgdh.focus();
				return false;
			}
			if(zrsj.value == '') {
				alert('未填入手机 ');
				zrsj.focus();
				return false;
			}
			if(zrdz.value == '') {
				alert('未填入E-mail地址');
				zrdz.focus();
				return false;
			}

		}
		</script>
</body>
</html>