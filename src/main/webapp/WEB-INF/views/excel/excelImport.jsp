<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Excel Import</title>
		<meta charset="UTF-8" />
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <link href="js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	    <script src="js/jquery/jquery-2.0.3.js"></script>
	    <script src="js/bootstrap/js/bootstrap.min.js"></script>
	    <script type="text/javascript">
	    	$( document ).ready(function() {
	    		$("#download").click(function() {
	    			$("#download_form").action = "FileDownload";
			    	$("#download_form").method = "post";
			    	$("#download_form").submit();
			 	});
	    	});
	    </script>
	</head>
	<body style="text-align: center; margin-top: 10px">
		<div class="row">
			<div class="col-sm-10">
				<h3>使用excel导入数据<span class="label label-primary">请按如下模板填写数据和导入数据</span></h3>
			</div>
		</div>
		<div class="row">
			<!-- 显示数据模板 -->
			<div class="col-sm-10">
				<table class="table">
					<tr>
						<th>姓名*</th>
						<th>英文姓名</th>
						<th>学号*</th>
						<th>性别*</th>
						<th>出生日期*</th>
						<th>入学时间*</th>
						<th>毕业时间*</th>
						<th>学院*</th>
						<th>专业*</th>
						<th>专业方向</th>
						<th>班级*</th>
						<th>照片</th>
						<th>毕业证编号*</th>
						<th>主修学位证编号*</th>
						<th>主修学位*</th>
						<th>第二学位*</th>
						<th>第二学位证编号*</th>
						<th>辅修学位*</th>
						<th>辅修学位证编号*</th>
						<th>身份证号*</th>
						<th>肄业证编号</th>
						<th>结业证编号</th>
						<th>离校类型</th>
					</tr>
					<tr>
						<td>张三</td>
						<td>zhangsan</td>
						<td>10010011</td>
						<td>男</td>
						<td>19920808</td>
						<td>20100901</td>
						<td>20150701</td>
						<td>理学院</td>
						<td>信息与计算科学+软件工程</td>
						<td>信息计算</td>
						<td>2</td>
						<td>照片</td>
						<td>15010021</td>
						<td>m160010</td>
						<td>理学学位</td>
						<td>工学学位</td>
						<td>s120012</td>
						<td>语言学学位</td>
						<td>f13001215</td>
						<td>123456789012345678901</td>
						<td>肄业证编号</td>
						<td>结业证编号</td>
						<td>离校类型</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2">
				<form id="download_form" action="FileDownload" method="post">
					<button type="button" class="btn btn-info" id="download">获取模板</button>
				</form>
			</div>
			<div class="col-sm-5">
				<!-- 上传数据文件 -->
				<form role="form" action="DataInput" method="post" enctype="multipart/form-data">
					<div class="form-group">
					    <label for="exampleInputFile">上传数据信息文件</label>
					    <input type="file" id="exampleInputFile" name="dataFile">
					</div>
					<button type="submit" class="btn btn-default">导入数据</button>
				</form>
			</div>
		</div>
	</body>
</html>
