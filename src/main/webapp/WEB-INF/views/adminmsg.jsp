<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台管理</title>
<link href="js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="js/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/define2.css" rel="stylesheet">

<script src="js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery-2.1.0.js"></script>

</head>
<body>
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
						<li><a href="#">返回学校首页</a></li>
						<li><a href="#">教务处</a></li>
					</ul>
				</div>
			</div>
		</div>
		<!--  topbar end  -->
		<!--  found result  -->
		<form action="AdminMsg" method="post">
		<div id="page"  class="row" style="margin: 28px 50px 40px 50px;">
			<div class="col-sm-8 col-sm-offset-2"  id="modle-1" style="border: 1px solid #CCCCCC; border-radius: 5px;">
					<div class="row" style="margin: 30px;">
						<div class="col-sm-7">
							<div class="row">
								<span class="col-sm-3">标题：</span><input class="col-sm-9" value="" name="msg1_title" placeholder="title">
							</div>
							<div class="row" style="margin-top:16px">
								<div class="col-sm-3">URL：</div><input class="col-sm-9" value="" name="msg1_url" placeholder="url"/>	
							</div>
						</div>
						<div class="col-sm-3 col-sm-offset-1">
							是否显示<input type="checkbox" name="msg1_show" style="margin-right: 20px;" />
						</div>
					</div>
					
					<div class="row">
						<div class="col-sm-2" style="margin-left: 30px;">具体内容：</div>
						<textarea name="msg1_content" class="col-sm-8" rows="10" style="margin-left: -16px; margin-bottom:30px">
						
						</textarea>
					</div>
				</div>
				
				<div class="col-sm-8 col-sm-offset-2"  id="modle-1" style="border: 1px solid #CCCCCC; border-radius: 5px;">
					<div class="row" style="margin: 30px;">
						<div class="col-sm-7">
							<div class="row">
								<span class="col-sm-3">标题：</span><input class="col-sm-9" value="" name="msg2_title" placeholder="title">
							</div>
							<div class="row" style="margin-top:16px">
								<div class="col-sm-3">URL：</div><input class="col-sm-9" value="" name="msg2_url" placeholder="url"/>	
							</div>
						</div>
						<div class="col-sm-3 col-sm-offset-1">
							是否显示<input type="checkbox" name="msg2_show" style="margin-right: 20px;" />
						</div>
					</div>
					
					<div class="row">
						<div class="col-sm-2" style="margin-left: 30px;">具体内容：</div>
						<textarea name="msg2_content" class="col-sm-8" rows="10" style="margin-left: -16px; margin-bottom:30px">
						
						</textarea>
					</div>
				</div>
				
				<div class="col-sm-8 col-sm-offset-2"  id="modle-1" style="border: 1px solid #CCCCCC; border-radius: 5px;">
					<div class="row" style="margin: 30px;">
						<div class="col-sm-7">
							<div class="row">
								<span class="col-sm-3">标题：</span><input class="col-sm-9" value="" name="msg3_title" placeholder="title">
							</div>
							<div class="row" style="margin-top:16px">
								<div class="col-sm-3">URL：</div><input class="col-sm-9" value="" name="msg3_url" placeholder="url"/>	
							</div>
						</div>
						<div class="col-sm-3 col-sm-offset-1">
							是否显示<input type="checkbox" name="msg3_show" style="margin-right: 20px;" />
						</div>
					</div>
					
					<div class="row">
						<div class="col-sm-2" style="margin-left: 30px;">具体内容：</div>
						<textarea name="msg3_content" class="col-sm-8" rows="10" style="margin-left: -16px; margin-bottom:30px">
						
						</textarea>
					</div>
				</div>
				
				<div id="submit" class="row">
					<div class="col-sm-4 col-sm-offset-7" style="margin-top: 30px;">
						<input type="submit" value="保存" class="btn btn-primary">
						<button class="btn btn-primary">取消</button>
					</div>
				</div>
			</div>
		</form>
		<!--  found result  -->
		<div id="footer" style="color: #CCCCCC;">
			<hr />
			<p>
			<center>大连交通大学 辽ICP备05001355号</center>
			</p>
		</div>
	</div>

</body>
</html>