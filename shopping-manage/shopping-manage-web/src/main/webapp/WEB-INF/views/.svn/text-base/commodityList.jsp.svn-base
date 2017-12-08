<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>

		<meta charset="utf-8" />

		<title>商品列表</title>
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

	<body class="clear">

		<!---------------------------后台管理系统菜单栏------------------------------------------>
		<!---------------------------------------------内容部分---------------------->
		<div id="main">
			<!----------------头部---------------------------->
			<div id="content-top">

				<div id="content-top-list">

					<ul class="breadcrumb">

						<li>
							<a href="#">商品管理</a>
						</li>

						<li class="active">
							<a href="javascript:;">商品列表</a>
						</li>
					</ul>

				</div>

			</div>
			
			<!----------------商品列表内容部分----------------------------->
			<div id="commodity-list">

				<div class="commodity-list-state">
					<span class="spancolor">出售中</span>
					<span>已售罄</span>
					<span>仓库中</span>
				</div>

				<p class="commodity-list-smit">
					<a href="releaseGoods.html" class="btn btn-primary">
						发布商品
					</a>
				</p>

				<div class="commodity-list-set">
					<table width="100%" cellspacing="20%" cellpadding="40" class="commodity-list-set-table">
						<tr>
							<td>
								商品ID：
							</td>
							<td>
								<input type="text" placeholder="输入商品id"></span>
							</td>
							<td>
								商品sku:
							</td>
							<td>
								<input type="text"></span>
							</td>
							<td>
								商品分类：
							</td>
							<td>
								<select name="fclass" id="fclass">
									<option value="一级分类">一级分类</option>
									<option value="一级分类">一级分类</option>
									<option value="一级分类">一级分类</option>
								</select>
								<select name="sclass" id="sclass">
									<option value="二级分类">一级分类</option>
									<option value="二级分类">一级分类</option>
									<option value="二级分类">一级分类</option>
								</select>
								<select name="tclass" id="tclass">
									<option value="三级分类">一级分类</option>
									<option value="三级分类">一级分类</option>
									<option value="三级分类">一级分类</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>
								商品名称:
							</td>
							<td>
								<input type="text" placeholder="输入商品名称">
							</td>
							<td>
								销售价格:
							</td>
							<td>
								<input type="text" placeholder="输入价格"> — <input type="text" placeholder="输入价格">元
							</td>
							<td>
								门店:
							</td>
							<td>
								<select name="">
									<option value="指定门店">指定门店</option>
								</select>
								<input type="text" placeholder="输入门店名称">
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<div class="commodity-list-set-threeline clear">
									<div class="input-append date form_datetime fl">
										创建时间<input style="border: none; background: none;margin-left: 5px;" size="16" type="text" value="" readonly>
										<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
									</div>
									<div style="margin-left: 5px" class="input-append date form_datetime1 fl">
										至<input style="border: none; background: none;margin-left: 5px;" size="16" type="text" value="" readonly>
										<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
									</div>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<button class="btn btn-primary magl10">
									搜索
								</button>
								<button class="btn btn-default magl10">
									导出Excel表
								</button>
							</td>
						</tr>
					</table>

				</div>
				<!--<div class="commodity-list-make">
					<input class="magl20 commodity-list-make-allchoose text-top" type="checkbox" name="" value="" />
					<span>
						全选
					</span>
					<button class="magl20 commodity-list-make-undercarriage">下架</button>
					<button class="magl20 commodity-list-make-delet">删除</button>
				</div>-->
				<p> </p>
				<div class="commodity-list-lists">
					<table width="100%" cellspacing="30%" cellpadding="20">
						<thead>
							<th width="45">
								<input type="checkbox" name="" value="" />
							</th>
							<th width="76">
								商品id
							</th>
							<th width="150">
								商品sku
							</th>
							<th width="296">
								商品名称
							</th>
							<th width="90">
								商品分类
							</th>
							<th width="100">
								商品价格(￥)
							</th>
							<th width="70">
								在售
							</th>
							<th width="65">
								库存
							</th>
							<th width="150">
								创建时间
							</th>
							<th width="160">
								操作
							</th>
						</thead>
						<tr>
							<td>
								<input type="checkbox" name="" value="" />
							</td>
							<td>
								131330
							</td>
							<td>
								K15316K7700F
							</td>
							<td class="row">
								<img src="../../img/goodlist.png" width="60" class="col-xs-4" />
								<span class="col-xs-8 text-left">achette雅氏9KN2 2017秋冬新品中口坡跟圆头柔软奶奶鞋 女鞋</span>
							</td>
							<td>
								靴子
							</td>
							<td>
								1280
							</td>
							<td>
								√
							</td>
							<td>
								500
							</td>
							<td>
								<time>2017-09-10 12:00:00</time>
							</td>
							<td>
								<a>查看</a>
								<a>编辑</a>
								<a>下架</a>
							</td>
						</tr>
					</table>
				</div>

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