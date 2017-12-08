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
			.marginTop {
				margin: 16px;
			}
			.container-fluid .btn-primary{
				background-color: #000000;
				width: 100%;
			}
			.container-fluid {width: 476px;}
		</style>
		<link rel="stylesheet" type="text/css" href="../login/css/bootstrap.min.css" />
	</head>

	<body>
		<div class="container-fluid">
			<form action="${ctx}/user/doRegister" method="post">
				<h2 class="text-center">注册clarks会员</h2>
				<div class="form-group">
					<input type="text" class="form-control" id="telephone" name="telephone" placeholder="手机号">
				</div>
				<div class="form-group">
					<div class="form-group">
						<input type="password" class="form-control" name="password" placeholder="密码（至少6个字符含数字大小写字母）">					
					</div>
					<div class="form-group">
						<input type="password" class="form-control" id="Password1" placeholder="确认密码">
					</div>
					<div class="row marginTop">
						<div class="col-xs-8">
							<input type="text" class="form-control" id="code" placeholder="验证码">
						</div>
						<div class="col-xs-4">
							<button type="button" class="btn btn-primary" onclick="sendCode()">验证码</button>
						</div>
					</div>
				</div>
				<p>登录即表示您已同意clarks的 隐私政策 和 使用条款</p>
				<button type="submit" id="registsubmit" class="btn btn-primary btn-lg btn-block">注册</button>
				<p class="text-right">已经是会员？
					<a href="${ctx}/user/login">立即登录</a>
				</p>
			</form>
		</div>
		
		
	<script type="text/javascript" src="../js/jquery-1.2.6.min.js"></script>
	<script type="text/javascript">
	function sendCode(){
		var inputCode = document.getElementById("code").value;
		var telephone=document.getElementById("telephone").value;
		 
		$.ajax({
			type:"get",
			url:"${ctx}/user/checkCode",
			data:{telephone:telephone},
			dataType:'json',
			success:function(result){
				alert("发送成功");
					
			}
		});
	       
	      
	      
	           
	       }   
		
	
/* 	$("#registsubmit").click(function(){
		var phone=$("#phone").val();
		var password=$("#Password").val();
		alert("1");
		$.ajax({
			type:"POST",
			url:"${ctx}/user/doRegister",
			data:{
				telephone:phone,
		        password:password
			},
			dataType:'json',
			success:function(result){
				if(result.status="200"){
					alert('注册成功，请登录');
					window.location.href = "${ctx}/user/login";
				}else{
					alert('注册失败，请重新注册');
				}
			}
			
		
		});
	}
	) */
	</script>
	</body>

</html>