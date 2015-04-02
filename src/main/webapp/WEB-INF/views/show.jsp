<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>New Document</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>

<body>
	<div id="header">
		<img class="logo" src="images/schlog.jpg" width="124" height="84">
		<h1>
			<span class="text">本科学位信息查询与认证系统</span>
		</h1>
	</div>
	<div id="wrap">
		<div id="First">
			<table>
				<tr>
					<td class="center" colspan="4">姓名</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td>${stu.stuName}</td>
					<td>英文：</td>
					<td>${stu.stuEnName}</td>
				</tr>
				<tr>
					<td class="center" colspan="4">性别</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td>${stu.stuGender }</td>
					<td>英文：</td>
					<td></td>
				</tr>
				<tr>
					<td class="center" colspan="4">出生日期</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td>${stu.stuBrithday }</td>
					<td>英文：</td>
					<td></td>
				</tr>
				<tr>
					<td>身份证编号：</td>
					<td colspan="3">${stu.stuIdentificationNum }</td>
				</tr>
			</table>
		</div>
		<div id="pic">
			<img class="picture" src="images/pic.jpg">
		</div>
		<div id="Two">
			<table>
				<tr>
					<td class="center" colspan="6">入学时间</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td colspan="2">${stu.stuEnrollment }</td>
					<td>英文：</td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<td class="center" colspan="6">离校时间</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td colspan="2">${stu.stuGraduation }</td>
					<td>英文：</td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<td class="center" colspan="6">离校类型</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td colspan="2">${stu.stuLeaveType }</td>
					<td>英文：</td>
					<td colspan="2"></td>
				</tr>
				<tr>
					<td class="center" colspan="6">专业</td>
				</tr>
				<tr>
					<td>中文：</td>
					<td>${stu.stuSpecialty }</td>
					<td>${stu.stuSpecialtyMajor }</td>
					<td>英文：</td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
		<div id="Three">
			<table>
				<tr>
					<td>毕业证编号：</td>
					<td class="four_w">${stu.stuGraduationCardNum }</td>
				</tr>
				<tr>
					<td>肄业证编号：</td>
					<td class="four_w">${stu.stuPostgraduateNum }</td>
				</tr>
				<tr>
					<td>结业证编号：</td>
					<td class="four_w">${stu.stuCompletionNum }</td>
				</tr>
			</table>
		</div>
		<div id="Four">
			<table>
				<tr>
					<td>主修学位：</td>
					<td class="four_w">${stu.stuMajorDegree }</td>
				</tr>
				<tr>
					<td>主修学位证编号：</td>
					<td>${stu.stuMajorDegreeCertNum }</td>
				</tr>
				<tr>
					<td>第二学位：</td>
					<td>${stu.stuDoubleMajorDegree }</td>
				</tr>
				<tr>
					<td>第二学位证编号：</td>
					<td>${stu.stuDoubleMajorDegreeNum }</td>
				</tr>
				<tr>
					<td>辅修学位：</td>
					<td>${stu.stuMinorDegree }</td>
				</tr>
				<tr>
					<td>辅修学位证编号：</td>
					<td>${stu.stuMinorDegreeNum }</td>
				</tr>
			</table>
		</div>
		<div id="Five">
			<table>
				<tr>
					<td class="five_w">证书说明</td>
				</tr>
			</table>
			<div id="box_five"></div>
		</div>
	</div>
	<div id="footer">
		<span>copyright by 大连交通大学</span>
	</div>
</body>
</html>
