<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
<head>
<base href="<%=basePath%>">

<title>index</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="css/define2.css" rel="stylesheet" >

<script src="js/jquery/jquery-2.1.0.js"></script>
<script src="js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript">
	//控制表单显示
	function show(type, oth) {
		if ($("#search-form" + type).css("display") == "none") {
			$("#search-form" + type).css("display", "block");
			$("#search-form" + oth).css("display", "none");
			$("#main-img").css("height", "768px");
		} else {
			$("#search-form" + type).css("display", "none");
			$("#main-img").css("height", "468px");
		}
	}
	function gotourl(url){
		window.open(url);
	}
	function open(){
		open("http://www.baidu.com","");
	}
</script>
<script type="text/javascript">
	$(document).ready(function() {
		/*
		$( "#btn_searchLess" ).click(function( event ) {
			$( "#div_stuLess" ).css("display", "block");
			$( "#div_stuMore" ).css("display", "none");
			$( "#btn_searchLess" ).attr("disabled", true);
			$( "#btn_searchMore" ).attr("disabled", false);
		});
		
		$( "#btn_searchMore" ).click(function( event ) {
			$( "#div_stuLess" ).css("display", "none");
			$( "#div_stuMore" ).css("display", "block");
			$( "#btn_searchLess" ).attr("disabled", false);
			$( "#btn_searchMore" ).attr("disabled", true);
		});
		 */

		//查询学生info，字段少的表单
		$("#btn_selectLessAction").click(function(event) {
			document.getElementById("form_stuLess").submit();
		});

		//查询学生info，字段多的表单
		$("#btn_selectMoreAction").click(function(event) {
			$("#form_stuMore").action = "SearchStuMore";
			$("#form_stuMore").method = "post";
			$("#form_stuMore").submit();
		});

		//跳转到数据录入页面
		$("#inputData").click(function() {
			$("#form_inputData").action = "RouteExcelImportJSP";
			$("#form_inputData").method = "post";
			$("#form_inputData").submit();
		});

		//跳转到日志查看页面
		$("#logData").click(function() {
			$("#form_log").action = "RouteLogJSP";
			$("#form_log").method = "post";
			$("#form_log").submit();
		});
	});
	
	function changeImage()
	{
		//后面加入new Date().getTime()函数是为了防止浏览器的缓存,加上随机的数字就会重新请求该资源
		img.src = img.src + "?" + new Date().getTime();
	}
</script>
</head>
<body style="text-align: center">
	<div id="wraper">
		<!--  topbar  -->
		<div id="header" class="row">
			<div class="navbar-define">
				<div class="col-sm-3 col-sm-offset-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">首页</a></li>
						<li><a href="#">联系方式</a></li>
						<li><a href="#">关于</a></li>
					</ul>
				</div>
				<div class="col-sm-3 col-sm-offset-4">
					<ul class="nav navbar-nav">
						<li><a href="#">登录</a></li>
						<li><a href="#">学校首页</a></li>
						<li><a href="#">教务处</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!--  topbar end  -->
		<!--  main  -->
		<div id="main" style="margin-top: 20px;">
			<div class="row">
				<div id="main-img" class="col-md-10 col-md-offset-1"
					style="border: 1px solid #e9e9e9; border-radius: 10px;">
					<p id="welcome-text">大连交通大学学位查询与认证系统</p>
					<p id="welcome-en">Dalian Jiaotong University degree queries
						and certification system</p>

					<div id="btn-img" style="margin-top: 40px; margin-left: 40px;">
						<a class="btn btn-primary" onClick="show(1,2);" id="btn_searchLess">查询
							<span class="caret">
							</span>
						</a>
						<a class="btn btn-primary" onClick="show(2,1);" id="btn_searchMore">认证<span
							class="caret"></span>
						</a>
					</div>

					<div id="search-form1" class="col-sm-7">
						<div>
							<div class="col-sm-7">
								<div class="arrow"></div>
								<form id="form_stuLess" class="form-horizontal" action="SearchStuLess" method="post">
									<div class="form-group">
										<label class="col-sm-4 control-label">姓名：</label>
										<div class="col-sm-8">
											<input class="form-control" name="stuName" placeholder="学生本人姓名">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-4 control-label">身份证号：</label>
										<div class="col-sm-8">
											<input class="form-control" name="stuIdentificationNum" placeholder="学生本人18位身份证号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-4 control-label">验证码：</label>
										<div class="col-sm-4">
											<input class="form-control" name="authcode">
											<img id="img" alt="test" src="Authcode" onclick="changeImage();"/>
										</div>
									</div>
									<div class="form-group" style="margin-top: 20px;">
										<div class="col-sm-offset-4 col-sm-8">
											<!-- <a href="#" id="btn_selectLessAction" class="btn btn-primary">确定</a>  -->
											<input type="submit" value="确定" class="btn btn-primary" />
											<a href="#" class="btn btn-primary">取消</a>
										</div>
									</div>
								</form>
							</div>
							<!-- search-form end -->
						</div>
						<div class="col-sm-5" id="information">
							<p>1.4~20个字符，报括字母、数字、汉字，一个汉字为2个字符</p>
							<p>2.输入有效的本人18位身份证号</p>
							<p>3.6~16个字符</p>
						</div>
					</div>

					<div id="search-form2" class="col-sm-7">
						<div>
							<div class="col-sm-7">
								<div class="arrow"></div>
								<form class="form-horizontal" action="SearchStuMore" method="post">
									<div class="form-group">
										<label class="col-sm-4 control-label"> 姓名：</label>
										<div class="col-sm-8">
											<input class="form-control" name="stuName"  placeholder="学生本人姓名">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-4 control-label"> 身份证号：</label>
										<div class="col-sm-8">
											<input class="form-control" name="stuSpecialty" placeholder="学生本人18位身份证号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-4 control-label">学位证号：</label>
										<div class="col-sm-8">
											<input class="form-control" name="stuMajorDegreeCertNum" placeholder="学生本人学位证号">
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-4 control-label">验证码：</label>
										<div class="col-sm-4">
											<input class="form-control" name="authcode">
											<img id="img" alt="test" src="Authcode" onclick="changeImage();"/>
										</div>
									</div>
									<div class="form-group" style="margin-top: 20px;">
										<div class="col-sm-offset-4 col-sm-8">
											<!-- <a href="#" id="btn_selectLessAction" class="btn btn-primary">确定</a>  -->
											<input type="submit" value="确定" class="btn btn-primary" />
											<a href="#" class="btn btn-primary">取消</a>
										</div>
									</div>
								</form>
							</div>
							<!-- search-form end -->
						</div>
						<div class="col-sm-5" id="information">
							<p>1.4~20个字符，报括字母、数字、汉字，一个汉字为2个字符</p>
							<p>2.输入有效的本人18位身份证号</p>
							<p>3.6~16个字符</p>
						</div>
					</div>

				</div>
			</div>
			<div id="model-head" class="row">
				<div class="col-md-4 col-md-offset-4">
					<h1>NEW INFORMATION</h1>
				</div>
			</div>
			<div id="model" class="row"
				style="margin-top: 20px; margin-bottom: 40px;">
				<div class="col-md-10 col-md-offset-1">
					<%if(Boolean.parseBoolean(request.getAttribute("news1_show").toString())){ %>
					<div class="col-md-4">
						<div class="panel-define" id="model1">
							<h3><%=request.getAttribute("news1_title") %></h3>
							<hr />
							<p><%=request.getAttribute("news1_content") %></p>
							<button onclick="gotourl('<%=request.getAttribute("news1_url") %>')" class="btn btn-primary">了解更多</button>
						</div>
					</div>
					<%} %>
					<%if(Boolean.parseBoolean(request.getAttribute("news2_show").toString())){ %>
					<div class="col-md-4" style="">
						<div class="panel-define" id="model2">
							<h3><%=request.getAttribute("news2_title") %></h3>
							<hr />
							<p><%=request.getAttribute("news2_content") %></p>
							<button onclick="gotourl('<%=request.getAttribute("news2_url") %>')" class="btn btn-primary">了解更多</button>
						</div>
					</div>
					<%} %>
					<%if(Boolean.parseBoolean(request.getAttribute("news3_show").toString())){ %>
					<div class="col-md-4" style="">
						<div class="panel-define" id="model3">
							<h3><%=request.getAttribute("news3_title") %></h3>
							<hr />
							<p><%=request.getAttribute("news3_content") %></p>
							<button onclick="gotourl('<%=request.getAttribute("news3_url") %>')" class="btn btn-primary">了解更多</button>
						</div>
					</div>
					<%} %>
				</div>
			</div>
		</div>
		<!--  main end  -->
		<div id="footer" style="color: #CCCCCC;">
			<hr />
			<p><center>大连交通大学   辽ICP备05001355号</center></p>
		</div>
	</div>
</body>
</html>
