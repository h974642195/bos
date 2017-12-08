<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		
		<meta charset="utf-8" />
		
		<title>后台管理系统</title>
		<!--tab图标引入-->
		<!--bootstrap样式表引入-->
		<link rel="stylesheet" type="text/css" href="../../css/bootstrapbread.min.css"/>
		<link rel="stylesheet" href="../../css/bootstrap-datetimepicker.min.css">
		<link rel="stylesheet" href="../../css/summernote.css" />
		<!--自定义样式引入-->
		<link rel="stylesheet" type="text/css" href="../../css/menu.css"/>
		<!--jquery引入-->
		<script src="../../js/jquery-1.10.1.min.js" type="text/javascript" charset="utf-8"></script>
		<!--bootstrapjs引入-->
		<script src="../../js/bootstrapbread.min.js"></script>
		<script src="../../js/bootstrap-datetimepicker.min.js"></script>
		<script src="../../js/summernote.js" type="text/javascript" charset="utf-8"></script>
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
						<li>
							<a href="#">商品列表</a>
						</li>				
						<li class="active">
							<a href="javascript:;">发布商品</a>
						</li>
					</ul>					

				</div>
				
			</div>
<!----------------商品列表内容部分----------------------------->
			<div class="release-goods magl20">
		
						<div class="release-goods-process clear">
							<p class="fl">
								<img width="45" src="../../img/release.png" alt="">
							</p>
							<p class="fl goods-process magl10">发布流程：1.基本信息。2.属性/库存。3.商品信息。4.物流/其他。</p>
		
						</div>
		
						<div class="release-goods-bacinformat bgc">
							<b>1.基本信息</b>
							<table width="70%" cellspacing="10%" cellpadding="10">
								<tr>
									<td width="80">
										*商品分类：
									</td>
									<td width="170">
										<select name="">
											<option value="一级分类">一级分类</option>
										</select>
									</td>
									<td width="170">
										<select name="">
											<option value="一级分类">一级分类</option>
										</select>
									</td>
									<td width="170">
										<select name="">
											<option value="一级分类">一级分类</option>
										</select>
									</td>
								</tr>
								<tr>
									<td> &nbsp商品类型：</td>
									<td>
											<input type="radio" name="goodsclass" id="goodsRadios1" value="实物商品" checked>
											实物商品&nbsp
											<input type="radio" name="goodsclass" id="goodsRadios2" value="积分商品">
											积分商品
									</td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td>
										&nbsp预售设置：
									</td>
									<td>
											<input type="checkbox" value="">
											预售商品
									</td>
									<td></td>
									<td></td>
								</tr>
							</table>
							<p class="row">
								<div class="col-xs-5 col-xs-offset-1">
									<span>
									*发货时间：
									</span>
									<input type="radio" name="releasetime">
									<div class="input-append date form_datetime dsplayib">
										<input style="border: none; background: none;margin-left: 5px;" size="16" type="text" value="" readonly >
										<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
									</div>
								</div>
		
								<div class="col-xs-6">
									<input type="radio" name="releasetime" class="text-top">
									<span>付款成功</span>
									<input type="text" style="width: 60px;height: 30px;" placeholder="多少天">
									<span>内发货</span>
								</div>
		
							</p>
						</div>
		<!---------------------------------------------属性/库存----------------------------->
						<div class="release-goods-property bgc">
							<b>2.属性/库存</b>
							<table width="90%" cellpadding="10" cellspacing="10%" class="release-goods-property-maint">
								<tr>
									<td width="96" class="text-top">
										*商品属性
									</td>
									<td width="1125">
										<div class="add-property">
											<p>
												<button class="btn" type="button">添加规格项目</button>
											</p>
		
										</div>
									</td>
								</tr>
								<tr>
									<td class="text-top">*商品库存</td>
									<td>
										<table class="table table-bordered text-center" >
											<thead>
											<tr>
												<th>
													颜色
												</th>
												<th>
													尺寸
												</th>
												<th>
													销售价格(元)
												</th>
												<th>
													sku
												</th>
												<th>
													库存
												</th>
											</tr>
											</thead>
											<tbody style="background-color:#fff;">
											<tr>
												<td rowspan="2" style="vertical-align: middle">
													薰衣草
												</td>
												<td>
													36
												</td>
												<td>
													12.00
												</td>
												<td>
		
												</td>
												<td>
													10
												</td>
											</tr>
											<tr>
												<td>
													36
												</td>
												<td>
													12.00
												</td>
												<td>
		
												</td>
												<td>
													10
												</td>
											</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<td>
										总库存
									</td>
									<td>
										<input type="checkbox">
										&nbsp;页面不显示库存
									</td>
								</tr>
								<tr>
									<td colspan="2" style="color: #949494">
										总库存为0时，会上架到【已售罄的商品】列表里
									</td>
								</tr>
							</table>
						</div>
		<!--------------------------------------------------商品信息----------------------------------->
						<div class="release-goods-information bgc">
		
							<b>3.商品信息</b>
							<table width="90%" cellpadding="10" cellspacing="10%" class="release-goods-property-maint">
								<tr>
									<td width="96">*商品名称:</td>
									<td width="1125">
										<input type="text" class="goodsinput" placeholder="输入商品名称">
									</td>
								</tr>
								<tr>
									<td>*商品货号:</td>
									<td>
										<input type="text" class="goodsinput" placeholder="输入商品货号">
									</td>
								</tr>
								<tr>
									<td>*销售价格:</td>
									<td>
										<button class="btn disabled" type="button">¥12.00</button>
										<button class="btn disabled" type="button">原价：¥25.00</button>
									</td>
								</tr>
								<tr>
									<td class="text-top">*商品图片:</td>
									<td>
										<!-- 按钮触发模态框 -->
										<div  data-toggle="modal" data-target="#addImg" class="addimg">+</div>
										<!-- 模态框（Modal） -->
										<div class="modal fade" id="addImg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
														<h4 class="modal-title" >模态框（Modal）标题</h4>
													</div>
													<div class="modal-body">点击关闭按钮检查事件功能。</div>
													<div class="modal-footer">
														<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
														<button type="button" class="btn btn-primary">提交更改</button>
													</div>
												</div><!-- /.modal-content -->
											</div><!-- /.modal-dialog -->
										</div>
		
									</td>
								</tr>
								<tr>
									<td></td>
									<td style="color: #949494">上传图片的最佳尺寸：640*640像素，其他尺寸会影响页效果，格式png，jpeg，jpg，gif。大小不超过3M，商品图片一共可以上传5张，默认第一张为主图封面</td>
								</tr>
								<tr>
									<td class="text-top">商品视频:</td>
									<td>
										<!-- 按钮触发模态框 -->
										<div  data-toggle="modal" data-target="#addVideo" class="addimg">+</div>
										<!-- 模态框（Modal） -->
										<div class="modal fade" id="addVideo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
											<div class="modal-dialog">
												<div class="modal-content">
													<div class="modal-header">
														<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
														<h4 class="modal-title" id="myModalLabel">模态框（Modal）标题</h4>
													</div>
													<div class="modal-body">点击关闭按钮检查事件功能。</div>
													<div class="modal-footer">
														<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
														<button type="button" class="btn btn-primary">提交更改</button>
													</div>
												</div><!-- /.modal-content -->
											</div><!-- /.modal-dialog -->
										</div>
									</td>
								</tr>
								<tr>
									<td></td>
									<td style="color: #949494">建议时长9-30秒，建议视频宽高比16:9</td>
								</tr>
								<tr>
									<td class="text-top">*商品描述:</td>
									<td>
										<div class="summernote"></div>
									</td>
								</tr>
								<script type="text/javascript">
									/***********************文本编辑**************/
								    $('.summernote').summernote({
								        height: 200,
								        tabsize: 2,
										maxHeight:280,
								        lang: 'zh-CN'
								    });
								</script>
							</table>
		
						</div>
		<!---------------------------------------------------------物流其他--------------------------------->
						<div class="release-goods-logistical bgc">
		
							<b>4.物流其他</b>
							<table width="90%" cellpadding="10" cellspacing="10%" class="release-goods-property-maint">
								<tr>
									<td class="text-top" width="96">*运费设置</td>
									<td width="1125">
										<p>
											<input type="checkbox" class="text-top"><span class="magl10">快递物流</span>
										</p>
										<p>
											<span>默认运费：一件内</span>
											<input type="text" readonly="readonly" value="&nbsp;5" class="disinput magl10">
											<span>元，每增加1件，增加</span>
											<input type="text" readonly="readonly" value="&nbsp;1" class="disinput magl10">
											<span>元</span>
										</p>
										<p>
											指定区域运费
										</p>
										<p>
											<span>香港、澳门、台湾1件内</span>
											<input type="text" readonly="readonly" value="&nbsp;10" class="disinput magl10">
											<span>元，每增加1件，增加</span>
											<input type="text" readonly="readonly" value="&nbsp;5" class="disinput magl10">
										</p>
										<p>
											<input type="checkbox" class="text-top"><span class="magl10">门店自提</span>
										</p>
										<p class="magl20">
											免运费
										</p>
									</td>
								</tr>
								<tr>
									<td class="text-top">&nbsp;每人限购</td>
									<td>
										<p>
											<input type="text" value="0">
										</p>
										<p>
											0表示不限购
										</p>
									</td>
								</tr>
								<tr>
									<td class="text-top">&nbsp;购买权限</td>
									<td>
										<p>
											<input type="checkbox"><span>设置购买权限</span>
										</p>
										<p>
											请选择可以购买该商品的会员身份
										</p>
										<p class="vip-permissions"></p>
										<p>
										<ul class="vip-shoose">
											<li><input type="text" class="vip-shoose-input"></li>
											<li>普通会员</li>
											<li>VIP1</li>
											<li>VIP2</li>
										</ul>
										</p>
									</td>
								</tr>
								<tr>
									<td class="text-top">*开售时间</td>
									<td>
										<p>
											<input type="radio" name="saletime">
											<span>立即开售</span>
										</p>
										<p>
											<input type="radio" name="saletime">
											<span>定时开售</span>
											<span class=" input-append date form_datetime dsplayib">
												<input style="border: none; background: none;margin-left: 5px;" size="16" type="text" value="" readonly >
												<span class="add-on"><i class="icon-calendar"><img src="../../img/u1029.png" alt=""></i></span>
											</span>
										</p>
									</td>
								</tr>
								<tr>
									<td class="text-top">&nbsp;会员折扣</td>
									<td>
										<input type="checkbox" class="text-top">
										<span>参与会员折扣</span>
									</td>
								</tr>
								<tr>
									<td></td>
									<td style="color: #949494">指的是统一的会员卡折扣，是否勾选不影响自定义会员价生效。</td>
								</tr>
								<tr>
									<td></td>
									<td class="text-center">
										<button class="btn btn-primary">&nbsp; 保存 &nbsp;</button>
										<button class="magl10 btn btn-primary">&nbsp; 继续 &nbsp; </button>
									</td>
								</tr>
							</table>
						</div>
		
					</div>
					
		</div>
	</body>
</html>
