<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">

		<title>会员列表</title>
		<!--tab图标引入-->
		<!--bootstrap样式表引入-->
		<link rel="stylesheet" type="text/css" href="../../css/bootstrapbread.min.css" />
		<link rel="stylesheet" href="../../css/bootstrap-datetimepicker.min.css">
		<!--自定义样式引入-->
		<link rel="stylesheet" type="text/css" href="../../css/menu.css" />
		<!--jquery引入-->
		<script src="../../js/jquery-1.10.1.min.js" type="text/javascript" charset="utf-8"></script>
		<!--bootstrapjs引入-->
		<script src="../../js/bootstrapbread.min.js"></script>
		<script src="../../js/bootstrap-datetimepicker.min.js"></script>
		<!--自定义js引入-->
		<script src="../../js/index.js" type="text/javascript" charset="utf-8"></script>

	</head>

	<body>
		<!---------------------------------------------内容部分---------------------->
		<div id="main" >
			<!----------------头部---------------------------->
			<div id="content-top" >

				<div id="content-top-list">

					<ul class="breadcrumb">

						<li>
							<a href="#">会员管理</a>
						</li>

						<li class="active">
							<a href="javascript:;">会员列表</a>
						</li>
					</ul>

				</div>

			</div>
			<!----------------会员列表----------------------------->
			<div class="vip-list">
				<table class="bgc" width="100%" cellspacing="10%" cellpadding="10" id="vip-list-condition">
					<tr>
						<td>
							<span>
								注册来源：
							</span>
							<select name="">
								<option value="phone">手机号注册</option>
								<option value="phone">手机号注册</option>
								<option value="phone">手机号注册</option>
								<option value="phone">手机号注册</option>
							</select>
						</td>
						<td>
							<span>
								会员编号：
							</span>
							<input type="text" />
						</td>
						<td>
							<span>
								真实姓名：
							</span>
							<input type="text" />

						</td>
						<td>
							<span>
								会员手机：
							</span>
							<input type="text" />

						</td>
						<td>
							<span>
								会员邮箱：
							</span>
							<input type="text" />

						</td>
					</tr>
					<tr>
						<td>
							<span>
								会员积分：
							</span>
							<input type="text" />

						</td>
						<td>
							<span>
								会员等级：
							</span>
							<input type="text" />

						</td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td colspan="5">
							<div class="clear">
								<div class="input-append date form_datetime fl">
									会员生日：<input style="border: none; background: none;" size="16" type="text" value="" readonly>
									<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
								</div>
								<div style="margin-left: 5px" class="input-append date form_datetime1 fl">
									至<input style="border: none; background: none;" size="16" type="text" value="" readonly>
									<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
								</div>
								<div class="input-append date form_datetime fl" style="margin-left: 50px;">
									注册时间：<input style="border: none; background: none;" size="16" type="text" value="" readonly>
									<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
								</div>
								<div style="margin-left: 5px" class="input-append date form_datetime1 fl">
									至<input style="border: none; background: none;" size="16" type="text" value="" readonly>
									<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
								</div>
								<div class="vip-list-serch fl" style="margin-left:50px ;">
									<button class="btn btn-primary magl10">
										搜索
									</button>
									<button class="btn btn-default magl10">
										导出Excel表
									</button>
								</div>
							</div>
						</td>
					</tr>
				</table>
				<p> </p>
				<table border="1" cellspacing="10%" cellpadding="10" width="100%" style="text-align: center;">
					<tr class="tableholor">
						<th><input type="checkbox" /></th>
						<th>序号</th>
						<th>注册来源</th>
						<th>会员编号</th>
						<th>手机号</th>
						<th>邮箱</th>
						<th>真实姓名</th>
						<th>会员积分</th>
						<th>会员等级</th>
						<th>注册时间</th>
						<th>操作</th>
					</tr>
					<tr>
						<td><input type="checkbox" /></td>
						<td>1</td>
						<td>手机号注册</td>
						<td>20170001</td>
						<td>18301888685</td>
						<td>achette@google.com</td>
						<td>amy</td>
						<td>1306</td>
						<td>LV1</td>
						<td>2017-09-10<br />12:00:00</td>
						<td>
							<a href="membershipDetails.html">查看</a>
						</td>
					</tr>
				</table>
				<div class="list-page">
					<ul>
						<li>
							<a href="#">上一页</a>
						</li>
						<li>
							<a href="#">1</a>
						</li>
						<li>
							<a href="#">2</a>
						</li>
						<li>
							<a href="#">3</a>
						</li>
						<li>
							<a href="#">4</a>
						</li>
						<li>
							<a href="#">5</a>
						</li>
						<li>
							<a href="#">下一页</a>
						</li>
					</ul>
				</div>

			</div>
			<!-- vip-list-->

		</div>
	</body>

</html>