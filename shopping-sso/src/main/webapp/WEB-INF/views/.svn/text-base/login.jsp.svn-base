<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("ctx", basePath);
%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title></title>
		<style type="text/css">
			*{
				font-family: "微软雅黑";
			}
			.container-fluid .btn-primary{
				background-color: #000000;
			}
			.container-fluid {width: 476px;}
		</style>
		<link rel="stylesheet" type="text/css" href="${ctx}/login/css/bootstrap.min.css" />
	</head>

	<body>
		<div class="container-fluid">
			<form action="${ctx}/user/checkLogin" method="post">
				<h2 class="text-center">登录clarks账号</h2>	
				<div class="form-group">
					<input type="text" class="form-control" name="telephone" placeholder="手机号">
				</div>
				<div class="form-group">
					<input type="password" class="form-control" name="password" placeholder="密码">
				</div>
				<div class="checkbox">
					<label>
    					<input type="checkbox">
     		 			<p>请记住我 </p> 
   					 </label>
				</div>
				<p>登录即表示您已同意clarks的 隐私政策 和 使用条款</p>
				<button type="submit" id="gologin" class="btn btn-primary btn-lg btn-block">登录</button>
				<p class="text-right">还不是会员？<a href="${ctx}/user/register">立即加入</a></p>
			</form>
		</div>
	<script type="text/javascript" src="${ctx}/js/jquery-1.2.6.min.js"></script>
	<script type="text/javascript">
	/* $("#login").click(function(){
		var telephone=$("telephone").val();
		var password=$("password").val();
		$.ajax({
			type:"post",
			url:"",
			
		});
	}
	) */
	</script>
	</body>

</html>