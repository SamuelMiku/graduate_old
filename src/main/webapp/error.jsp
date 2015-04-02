<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery/jquery-2.0.3.js"></script>
    <script src="js/bootstrap/js/bootstrap.min.js"></script>
  </head>
  	<body style="text-align: center">
		<h1>你的信息有错误,请通过教务处确认你的信息后再次验证,谢谢!</h1>
		<form action="Error" method="post">
			<button type="submit" class="btn btn-default" id="check">再次验证</button>
		</form>
	</body>
</html>
