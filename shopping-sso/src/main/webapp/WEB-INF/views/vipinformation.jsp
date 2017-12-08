<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
    %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta charset="UTF-8">
		<title>我的信息</title>
		<link rel="stylesheet" type="text/css" href="../../css/pubilc.css" />
		<link rel="stylesheet" type="text/css" href="../../css/vipinformation.css" />
		<script src="../../js/lib/jquery.min.js" type="text/javascript" charset="utf-8"></script>
	</head>

	<body>
		<div class="cont">
			<header>
				<div class="clear">
					<ul class="fl">
						<li>
							<a href="javascript:;">中国</a>
						</li>
						<li>|</li>
						<li>
							<a href="javascript:;">客服服务</a>
						</li>
					</ul>
					<ul class="fr">
						<li>
							<a href="login.jsp">登录/注册clarks账号</a>
						</li>
						<li>
							<a href="javascript:;">帮助</a>
						</li>
						<li>
							<a href="javascript:;" class="iconfont icon-caigou">
							</a>
						</li>
					</ul>
				</div>
			</header>
			<!--nav begin---------------------------------------------->
			<nav class="clear">
				<div class="logo fl">
					<img src="../../img/list/logo1.png" />
				</div>
				<div class="fl nav ">
					<ul class="clear">
						<li>秋冬新品</li>
						<li>单鞋</li>
						<li>靴子</li>
						<li>正装</li>
						<li>运动</li>
						<li>彩色武士</li>
					</ul>
				</div>
				<div class="search fr">
					<input type="search" placeholder="搜索" />
				</div>
			</nav>
			<!--nav end---------------------------------------------->
			<!--main begin---------------------------------------------->
			<div class="main">

				<p class="top">
					我的账户&gt;会员信息
				</p>

				<div class="vipinfor clear">
					<div class="tools fl">
						<p class="user">
							<span>欢迎回来，</span>
							<br />
							<span class="username">
							joke
						</span>
						</p>
						<ul>
							<li>
								<a href="">消息</a>
							</li>
							<li>
								<a href="">订单</a>
							</li>
							<li>
								<a href="">会员中心</a>
							</li>
							<li>
								<a href="">我的活动</a>
							</li>
							<li>
								<a href="">用户设置</a>
							</li>
							<li>
								<a href="">注销</a>
							</li>
						</ul>
					</div>
					<div class="detals fl">
						<div class="clear">
							<div class="vip_card fl">
								<p>
									<div class="userhead">
										<img src="../../img/detail/微博.png" alt="" />
										<span>clarks会员卡</span>
									</div>
									<div class="qrcode">
										<img src="../../img/list/app.png" />
									</div>
								</p>
								<div class="vip_card_numb">
									1130 2630 125
								</div>
							</div>
							<div class="fl">
								<div style="vertical-align:middle;display: table-cell;">
									亲爱的clarksclarks会员<span class="username">joke</span>,欢迎莅临clarks官方商城。
									<br />诚邀您
									<a href="">完善个人信息</a>，届时您将获得惊喜礼遇。
								</div>
							</div>
						</div>
						<div class="panel">
							<h4>您的等级和积分</h4>
							<table class="level tcenter" width="100%">
								<thead>
									<th width="150">VIP1</th>
									<th width="150">VIP2</th>
									<th width="150">VIP3</th>
									<th width="150">VIP4</th>
									<th width="150">VIP5</th>
									<th width="150">VIP6</th>
								</thead>
								<tr>
									<td><i class="active"></i></td>
									<td><i></i></td>
									<td><i></i></td>
									<td><i></i></td>
									<td><i></i></td>
									<td><i></i></td>
								</tr>
								<tr>
									<td>当前积分<span>582</span> </td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</table>
						</div>
						<div class="panel">
							<h4>您的礼券提醒</h4>
							<ul class="gift">
								<li>暂无礼券可用。</li>
							</ul>
						</div>
						<div class="panel">
							<h4>三个月内积分变动记录</h4>
							<table cellspacing="20%" cellpadding="50" width="100%" class="integral tcenter">
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
								<tr>
									<td>2</td>
									<td>微信</td>
									<td>积分兑换</td>
									<td>-50</td>
									<td>1900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>3</td>
									<td>线下门店</td>
									<td>订单换积分</td>
									<td>+500</td>
									<td>1400</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>4</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>5</td>
									<td>线下门店</td>
									<td>订单换积分</td>
									<td>+500</td>
									<td>1400</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>6</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>7</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>8</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>9</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>10</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>11</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
									<td>2017-09-10 12:00:00</td>
								</tr>
								<tr>
									<td>12</td>
									<td>天猫旗舰店</td>
									<td>积分抽奖</td>
									<td>-200</td>
									<td>900</td>
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

				</div>

			</div>
			<!--main end---------------------------------------------->
			<!--
			<footer>
				<div class="adre clear">
					<div class="aleft fl">
						<div class="atop clear">
							<ul>
								<li>关于clarks</li>
								<li>
									<a href="list.jsp">品牌介绍</a>
								</li>
								<li>
									<a href="list.jsp">联系我们</a>
								</li>
							</ul>
							<ul>
								<li>购物须知</li>
								<li>
									<a href="list.jsp">退换货政策</a>
								</li>
								<li>
									<a href="list.jsp">支付与配送</a>
								</li>
								<li>
									<a href="list.jsp">发票</a>
								</li>
								<li>
									<a href="list.jsp">保养与维修</a>
								</li>
							</ul>
							<ul>
								<li>帮助中心</li>
								<li>
									<a href="list.jsp">常见问题</a>
								</li>
								<li>
									<a href="list.jsp">网站地图</a>
								</li>
							</ul>
							<ul>
								<li>关于我们</li>
								<li>
									<a href="list.jsp">微博</a>
								</li>
								<li>
									<a href="list.jsp">微信</a>
								</li>
							</ul>
						</div>
						<div class="abot clear">
							<ul>
								<li>客服邮箱</li>
								<li>
									<a href="list.jsp">achtte@Google.com</a>
								</li>
							</ul>
							<ul>
								<li>客服电话</li>
								<li>
									<a href="list.jsp">400-100-0000</a>
								</li>
							</ul>
						</div>
					</div>
					<div class="aright fr">
						<ul>
							<li>邮件订阅</li>
							<li><input type="text" name="" placeholder="了解相关资讯产品及最新活动信息" /></li>
						</ul>
						<ul>
							<li>直营店查询</li>
							<li>
								<select name="">
									<option value="" selected="selected">请选择省</option>
									<option value=""></option>
								</select>
								<select name="">
									<option value="" selected="selected">请选择市</option>
									<option value=""></option>
								</select>
							</li>
						</ul>
					</div>

				</div>

				<div class="last">
					<a href="">@2017clarks（中国） 保留所有权利</a>
					<a href="">沪公网安备31011000000800</a>
					<a href="">沪ICP备13000000号</a>

				</div>
			</footer>-->
		</div>
	</body>

</html>