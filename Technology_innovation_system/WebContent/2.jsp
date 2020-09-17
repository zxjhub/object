<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>河北省科技创新平台年报统计系统</title>
	<style type="text/css">
		table .blue {color:#0000FF;}
	</style>
</head>
<body>
<div style="margin-bottom:10px;">
	<a href="table7-1-1.jsp"><button type="button">表7-1-1</button></a>
	<a href="table7-1-2.jsp"><button type="button">表7-1-2</button></a>
	<a href="table7-1-3.jsp"><button type="button">表7-1-3</button></a>
	<a href="table7-2-1.jsp"><button type="button">表7-2-1</button></a>
	<a href="table7-2-2.jsp"><button type="button">表7-2-2</button></a>
	<a href="table7-3-1.jsp"><button type="button">表7-3-1</button></a>
	<a href="table7-3-2.jsp"><button type="button">表7-3-2</button></a>
	<a href="table7-4-1.jsp"><button type="button">表7-4-1</button></a>
	<a href="table7-4-2.jsp"><button type="button">表7-4-2</button></a>
	<a href="table7-5-1.jsp"><button type="button">表7-5-1</button></a>
	<a href="table7-6-1.jsp"><button type="button">表7-6-1</button></a>
	<a href="table7-6-2.jsp"><button type="button">表7-6-2</button></a>
	<a href="table7-7-1.jsp"><button type="button">表7-7-1</button></a>
</div>
<div>
    <!--startprint-->
<table border="1" width="1310" style="margin-bottom:10px;">
	<tr bgcolor="#A9A9A9">
        <th colspan="9" align="left">表7-4 技术标准和工法</th>
    </tr>
    <tr bgcolor="#A9A9A9">
        <th colspan="9" align="left">表7-4-2 技术标准和工法明细表</th>
    </tr>
    <tr align="center">
        <td width="50">合计</td>
        <td width="200">名称</td>
        <td width="150">下达任务单位</td>
        <td>标准/工法</td>
        <td width="150">编号</td>
        <td>起草单位</td>
        <td>起草人</td>
        <td width="150">平台在制定中作用</td>
        <td>颁布日期</td>
    </tr>
    <tr>
    	<td align="center">1.</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td align="center">2.</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
    	<td align="center">3.</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td colspan="9" class="blue" style="font-size:80%">注：只填写由本单位（平台）参与起草或本单位（平台）人员参加起草的已经颁布的标准或工法，先填写标准，再填写工法。</td>
    </tr>
</table>
    <!--endprint-->
    <input type="button" onclick="doPrint()" value="打印"/>
</div>
<div align="center">
	<input type="submit" value="下一步" />
</div>
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
</body>
</html>