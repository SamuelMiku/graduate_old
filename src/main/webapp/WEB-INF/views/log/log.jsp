<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="page" uri="/pagerTag"%>
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
    <script type="text/javascript">
		
    </script>
  </head>
  
  <body>
  <div class="row">
    <div class="col-md-10" style="margin: 10px">
		<table class="table table-striped">
			<tr>
				<td>logId</td>
				<td>createDate</td>
				<td>thread</td>
				<td>level</td>
				<td>class</td>
				<td>message</td>
			</tr>
			<c:forEach items="${requestScope.p.result}" var="log">
				<tr>
					<td>${log.logId }</td>
					<td>${log.createDate }</td>
					<td>${log.thread }</td>
					<td>${log.level }</td>
					<td>${log.clazz }</td>
					<td>${log.message }</td>
				</tr>
			</c:forEach>
		</table>			
	  </div>
	</div>
	<form>
		<page:page url="/RouteLogJSP"/>
	</form>
  </body>
</html>