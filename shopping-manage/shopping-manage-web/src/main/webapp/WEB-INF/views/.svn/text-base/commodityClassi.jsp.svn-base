<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("ctx", basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="UTF-8">

<title>商品分类</title>
<!--tab图标引入-->
<!--bootstrap样式表引入-->
<link rel="stylesheet" type="text/css"
	href="../../css/bootstrapbread.min.css" />
<!--自定义样式引入-->
<link rel="stylesheet" type="text/css" href="../../css/menu.css" />
<!--jquery引入-->
<script src="../../js/jquery-1.10.1.min.js" type="text/javascript"
	charset="utf-8"></script>
<!--bootstrapjs引入-->
<script src="../../js/bootstrapbread.min.js"></script>
<!--自定义js引入-->
<style type="text/css">
.choose {
	background: #f3f3f3;
}
</style>
</head>

	<script src="../../js/commodityClassi.js"></script>
	<body>
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
							<a href="javascript:;">商品分类</a>
						</li>
					</ul>

				</div>

			</div>
			<input id="basePath"  style="display:none;" value="${ctx}">
			<!----------------商品分类----------------------------->
			<div id="commodity_class" class=" text-center clear">
				<div class="commodity1-clevl fl">
					<ul>
						<li class="tableholor">
							一级分类
						</li>
						<li class="commoditym1">
							<a href="javascript:;" class="add">添加</a>
							<a href="javascript:;" class="eidt">编辑</a>
							<a href="javascript:;" class="dele">删除</a>
							<a href="javascript:;" class="mup">上移</a>
							<a href="javascript:;" class="mdown">下移</a>
						</li>
					</ul>
					<ul class="commodity1">
					</ul>
				</div>
				<div class="commodity2-clevl fl">
					<ul>
						<li class="tableholor">二级分类</li>
						<li class="commoditym2">
							<a href="javascript:;" class="add">添加</a>
							<a href="javascript:;" class="eidt">编辑</a>
							<a href="javascript:;" class="dele">删除</a>
							<a href="javascript:;" class="mup">上移</a>
							<a href="javascript:;" class="mdown">下移</a>
						</li>
					</ul>
					<ul class="commodity2">
					</ul>
				</div>
				<div class="commodity3-clevl fl">
					<ul>
						<li class="tableholor">三级分类</li>
						<li class="commoditym3">
							<a href="javascript:;" class="add">添加</a>
							<a href="javascript:;" class="eidt">编辑</a>
							<a href="javascript:;" class="dele">删除</a>
							<a href="javascript:;" class="mup">上移</a>
							<a href="javascript:;" class="mdown">下移</a>
						</li>
					</ul>
					<ul class="commodity3">
					</ul>
				</div>
				<div class="commodity4-clevl fl">
					<ul>
						<li class="tableholor">关联属性</li>
						<li> / </li>
					</ul>
					<ul class="commodity4">
					</ul>
				</div>
			</div>

		</div>
		<!--右边部分main-->
	</body>

</html>