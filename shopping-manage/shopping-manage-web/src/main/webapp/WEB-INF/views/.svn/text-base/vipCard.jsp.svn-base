<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta charset="UTF-8">
		<title>非门店自提</title>
		<!--tab图标引入-->
		<!--bootstrap样式表引入-->
		<link rel="stylesheet" type="text/css" href="../../css/bootstrapbread.min.css" />
		<link rel="stylesheet" href="../../css/bootstrap-datetimepicker.min.css">
		<link rel="stylesheet" type="text/css" href="../../css/menu.css" />
		<link rel="stylesheet" type="text/css" href="../../css/vipcard.css" />
		<!--jquery引入-->
		<script src="../../js/jquery-1.10.1.min.js" type="text/javascript" charset="utf-8"></script>
		<!--bootstrapjs引入-->
		<script src="../../js/bootstrapbread.min.js"></script>
		<script src="../../js/bootstrap-datetimepicker.min.js"></script>
		<!--自定义js引入-->

	</head>

	<body>
		<!---------------------------后台管理系统菜单栏------------------------------------------>
		<!---------------------------------------------内容部分---------------------->
		<div id="main">
			<!----------------头部---------------------------->
			<div id="content-top">

				<div id="content-top-list">

					<ul class="breadcrumb">

						<li>
							<a href="#">会员管理</a>
						</li>

						<li class="active">
							<a href="javascript:;">会员卡管理</a>
						</li>
					</ul>

				</div>

			</div>
			<!--头部结束-->
			<div id="vipcard" class="clear magl20">
				<div class="fl">
					<div class="vip_card">
						<p>
							<div class="userhead">
								<span class="imgin">
								<img src="../../img/logo1.png" alt="" />
								</span>
								<span>clarks会员卡</span>
							</div>
							<div class="qrcode">
								<img src="../../img/goodlist.png" />
							</div>
						</p>
						<div class="vip_card_numb">
							1130 2630 125
						</div>
					</div>
				</div>
				<div class="fl magl20 vipform">
					<table cellspacing="0" cellpadding="20">
						<tr>
							<td>*会员卡名称：</td>
							<td>
								<input type="text" class="vipcardname" placeholder="请输入会员卡名称" />
								<p class="nametip">会员卡名称不能为空</p>
							</td>
						</tr>
						<tr>
							<td>*Logo：</td>
							<td>
								<div class="logos">
									<div class="imgin">
										<img src="../../img/logo1.png" alt="" />
									</div>
									<a href="#" class="magl20">修改</a>
								</div>
							</td>
						</tr>
						<tr>
							<td>*卡片背景：</td>
							<td>
								<input type="radio" name="bagc" />
								<lable>背景色</lable>
							</td>
						</tr>
						<tr>
							<td>
								<td class="color-contrl">
									<ul>
										<li></li>
										<li></li>
										<li></li>
										<li></li>
										<li></li>
										<li></li>
									</ul>
								</td>

							</td>
						</tr>
						<tr>
							<td></td>
							<td class="color-contrl">
								<ul>
									<li></li>
									<li></li>
									<li></li>
									<li></li>
									<li></li>
									<li></li>
								</ul>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<input type="radio" name="bagc" />
								<lable>封面背景</lable>
							</td>
						</tr>
						<tr class="chose-img">
							<td></td>
							<td>
								<span>普通VIP</span>
								<a href="">选择图片</a>
							</td>
						</tr>
						<tr class="chose-img">
							<td></td>
							<td>
								<span>普通VIP</span>
								<a href="">选择图片</a>
							</td>
						</tr>
						<tr class="chose-img">
							<td></td>
							<td>
								<span>普通VIP</span>
								<a href="">选择图片</a>
							</td>
						</tr>
						<tr class="chose-img">
							<td></td>
							<td>
								<span>普通VIP</span>
								<a href="">选择图片</a>
							</td>
						</tr>
						<tr>
							<td></td>
							<td>
								<button class="btn form-control btn-primary">保存</button>
							</td>
						</tr>
					</table>
				</div>
			</div>

		</div>

	</body>
	<script type="text/javascript">
		for(let i = 0; i < $(".color-contrl").find("li").length; i++) {
			var _r = parseInt(Math.random() * 255);
			var _g = parseInt(Math.random() * 255);
			var _b = parseInt(Math.random() * 255);
			$(".color-contrl").find("li")[i].style.backgroundColor = "rgb(" + _r + "," + _g + "," + _b + ")";
		}
	</script>

</html>