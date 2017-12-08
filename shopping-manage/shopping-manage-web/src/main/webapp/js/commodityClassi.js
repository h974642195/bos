
$(function() {
	//			设置背景
var bathPath=$("#basePath").val();
	function addSty(elem, index) {
		//	设置默认参数
		var elem = elem || ".commodity1 li";
		var index = index || 0;
		//添加样式
		$(elem).siblings().removeClass()
		$(elem)[index].className = "choose";

	}
	//	所需参数
	var _index1 = 0;
	var _index2 = 0;
	var _index3 = 0;
	var index1 = 0;
	var index2 = 0;
	var index3 = 0;
	//		列表一的ajax
	function first() {
		//					let j = 0;
		$.get(bathPath+"/rest/item/cat", function(msg) {
			_msg1 = msg;
			for(var i in msg) {
				$(".commodity1").append(
					"<li id="+msg[i].id+">" + msg[i].name)
					console.log(msg[i]);
			}
			addSty();
			second();
		})
	}
	//	列表2的ajax
	function second() {
		$.get(bathPath+"/rest/item/cat?id=" + _msg1[_index1].id, function(msg) {
			_msg2 = msg;
			$(".commodity2").children().remove();
			for(var i in msg) {
				$(".commodity2").append(
					"<li>" + msg[i].name)
			}

			addSty(".commodity2 li");
			third();

		})

	}
	//	列表3的ajax
	function third() {
		$.get(bathPath+"/rest/item/cat?id=" + _msg2[_index2].id, function(msg) {
			_msg3 = msg;
			$(".commodity3").children().remove();
			for(var i in msg) {
				$(".commodity3").append(
					"<li>" + msg[i].name)
			}
			addSty(".commodity3 li");
		})
	}
//添加类目事件
//	function addItemCat(){
//		index_add=$(this).length()-1;
//		$(".commodity1").append(
//				"<li><input type="+"'text'"+">" )
//		addSty(".commodity1 li");
//		var name=
//	}
	
	//	初始化目录自动生成	
	first();

	//			给条目1的li标签加点击事件
	$(".commodity1").on("click", "li", function() {
		_index1 = $(this).index()
		second();
		addSty(".commodity1 li", _index1);
		//初始化index
		index1 = _index1;
		index2 = 0;
		index3 = 0;
//		addItemCat();
		console.log($(this).text());
	})
	//			给条目2的li标签加点击事件

	$(".commodity2").on("click", "li", function() {
		_index2 = $(this).index()
		third();
		addSty(".commodity2 li", _index2);
		//初始化index
		index2 = _index2;
		index3 = 0;
	})

	//			给条目3的li标签加点击事件
	$(".commodity3").on("click", "li", function() {
		_index3 = $(this).index()
		addSty(".commodity3 li", _index3);
		//初始化index
		index3 = _index3;

	})

	//					条目1	上移动
	$(".commoditym1 .mup").click(function() {
		if(index1 == 0) return;
		EData=[{
			"id": _msg1[index1].id,
			"sortOrder": _msg1[index1 - 1].sortOrder
		}, {
			"id": _msg1[index1 - 1].id,
			"sortOrder": _msg1[index1].sortOrder
		}];
		
		console.log(_msg1[index1 - 1].sortOrder);
		let a = _msg1[index1];
		_msg1[index1] = _msg1[index1 - 1]
		_msg1[index1 - 1] = a;
		index1--;
		$.ajax({
			   url : bathPath+"/rest/item/move",
			   type : "POST",
			   cache : false,
			   contentType : "application/json; charset=utf-8",
			   data : JSON.stringify(EData),
			   dataType : "json",
			   success : function(result) {
				   console.log(result);
				   first();
				   
			   },
		error:function(msg){
			console.log(msg);
		}
		});
		

		/*$.post("http://58.246.173.90:9380/rest/item/move", {list:EData}, function(msg) {
			console.log(msg)
		},"json")*/
		$(".commodity1").children().remove();
		for(let i in _msg1) {
			$(".commodity1").append(
				"<li>" + _msg1[i].name)
		}
		addSty(".commodity1 li", index1);

	})
	//				条目1		下移动

	$(".commoditym1 .mdown").click(function() {
		if(index1 == _msg1.length - 1) return;
		list = {
			list: [{
				"id": _msg1[index1].id,
				"sortOrder": _msg1[index1 + 1].sortOrder
			}, {
				"id": _msg1[index1 + 1].id,
				"sortOrder": _msg1[index1].sortOrder
			}]
		}
		list = JSON.stringify(list)
		let a = _msg1[index1];
		_msg1[index1] = _msg1[index1 + 1]
		_msg1[index1 + 1] = a;
		index1++;
		$.post(bathPath+"/rest/item/move", list, function(msg) {
			console.log(msg)
		})
		$(".commodity1").children().remove();
		for(let i in _msg1) {
			$(".commodity1").append(
				"<li>" + _msg1[i].name)
		}
		addSty(".commodity1 li", index1);

	})

	//					条目2	上移动
	$(".commoditym2 .mup").click(function() {
		if(index2 == 0) return;
		list = {
			list: [{
				"id": _msg2[index2].id,
				"sortOrder": _msg2[index2 - 1].sortOrder
			}, {
				"id": _msg2[index2 - 1].id,
				"sortOrder": _msg2[index2].sortOrder
			}]
		}
		let a = _msg2[index2];
		_msg2[index2] = _msg2[index2 - 1]
		_msg2[index2 - 1] = a;
		index2--;
		$.post(bathPath+"/rest/item/move", list, function(msg) {
			console.log(msg)
		})
		$(".commodity2").children().remove();
		for(let i in _msg2) {
			$(".commodity2").append(
				"<li>" + _msg2[i].name)
		}
		addSty(".commodity2 li", index2);

	})
	//				条目2		下移动

	$(".commoditym2 .mdown").click(function() {

		if(index2 == _msg2.length - 1) return;
		list = {
			list: [{
				"id": _msg2[index2].id,
				"sortOrder": _msg2[index2 + 1].sortOrder
			}, {
				"id": _msg2[index2 + 1].id,
				"sortOrder": _msg2[index2].sortOrder
			}]
		}
		let a = _msg2[index2];
		_msg2[index2] = _msg2[index2 + 1]
		_msg2[index2 + 1] = a;
		index2++;
		$.post(bathPath+"/rest/item/move", list, function(msg) {
			console.log(msg)
		})
		$(".commodity2").children().remove();
		for(let i in _msg2) {
			$(".commodity2").append(
				"<li>" + _msg2[i].name)
		}
		addSty(".commodity2 li", index2);

	})

	//					条目3	上移动
	$(".commoditym3 .mup").click(function() {
		if(index3 == 0) return;
		list = {
			list: [{
				"id": _msg3[index3].id,
				"sortOrder": _msg3[index3 - 1].sortOrder
			}, {
				"id": _msg3[index3 - 1].id,
				"sortOrder": _msg3[index3].sortOrder
			}]
		}
		let a = _msg3[index3];
		_msg3[index3] = _msg3[index3 - 1]
		_msg3[index3 - 1] = a;
		index3--;
		$.post(bathPath+"/rest/item/move", list, function(msg) {
			console.log(msg)
		})
		$(".commodity3").children().remove();
		for(let i in _msg3) {
			$(".commodity3").append(
				"<li>" + _msg3[i].name)
		}
		addSty(".commodity3 li", index3);

	})
	//
	//						条目3下移动
	$(".commoditym3 .mdown").click(function() {
		if(index3 == _msg3.length - 1) return;
		list = {
			list: [{
				"id": _msg3[index3].id,
				"sortOrder": _msg3[index3 + 1].sortOrder
			}, {
				"id": _msg3[index3 + 1].id,
				"sortOrder": _msg3[index3].sortOrder
			}]
		}
		let a = _msg3[index3];
		_msg3[index3] = _msg3[index3 + 1]
		_msg3[index3 + 1] = a;
		index3++;
		$.post(bathPath+"/rest/item/move", list, function(msg) {
			console.log(msg)
		})
		$(".commodity3").children().remove();
		for(let i in _msg3) {
			$(".commodity3").append(
				"<li>" + _msg3[i].name)
		}
		addSty(".commodity3 li", index3);

	})

	//						end

})