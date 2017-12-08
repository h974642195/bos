<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">

		<title>会员详情</title>
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
		<!---------------------------后台管理系统菜单栏------------------------------------------>
		<!---------------------------------------------内容部分---------------------->
		<div id="main">
			<!----------------头部---------------------------->
			<div id="content-top" >

				<div id="content-top-list">

					<ul class="breadcrumb">

						<li>
							<a href="#">会员管理</a>
						</li>
						<li>
							<a href="#">会员列表</a>
						</li>
						<li class="active">
							<a href="javascript:;">会员详情</a>
						</li>
					</ul>

				</div>

			</div>
			<!----------------会员详情---------------------------->
			<div class="vip-detail magl20">
				<table class="table-striped" style="border: 1px #ccc solid;" width="100%" cellspacing="10%" cellpadding="10">
					<tr class="bgc">
						<td>用户信息</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<div class="vip-user-img">
								<img src="" alt="用户头像" />
							</div>
						</td>
						<td>
							<button class="btn btn-primary">重置密码</button>
						</td>
						<td></td>
					</tr>
					<tr>
						<td>
							<span>
								会员编号：
							</span>
							<span>
								20170001
							</span>
						</td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>
							<span>
								注册来源：	
							</span>
							<span>
								手机号注册
							</span>
						</td>
						<td>
							<span>
								手 机 号：	
							</span>
							<span>
								20170145552
							</span>
						</td>
						<td>
							<span>
								邮&nbsp;箱：	
							</span>
							<span>
								1046511206@qq.com
							</span>
						</td>
					</tr>
					<tr>
						<td>
							<span>
								真实姓名：	
							</span>
							<span>
								Amy
							</span>
						</td>
						<td>
							<span>
								
								
								会员积分：	
							</span>
							<span>
								104
							</span>
						</td>
						<td>
							<span>
								会员等级：	
							</span>
							<span>
								LV1
							</span>
						</td>
					</tr>
					<tr>
						<td>
							<span>
								注册时间
							</span>
							<span>
								2017-09-10 12:00:00
							</span>
						</td>
						<td></td>
						<td></td>
					</tr>
				</table>
				<p> </p>
				<table class="table-bordered" cellspacing="10%" cellpadding="10" width="100%">
					<tr>
						<th>序号</th>
						<th>来源</th>
						<th>任务名称</th>
						<th>积分变动</th>
						<th>当前积分</th>
						<th>时间</th>
					</tr>
					<tr>
						<td>1</td>
						<td>官方商城</td>
						<td>订单换积分</td>
						<td>+100</td>
						<td>2000</td>
						<td>2017-09-10 12:00:00</td>
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
		</div>
	</body>

</html>