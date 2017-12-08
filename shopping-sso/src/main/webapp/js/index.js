var _nav ={
	init:function(){//初始化导航
		_nav.listDown()
	},
	el:$("nav ul li:not(:nth-child(4))"),
	listDown:function(){
		_nav.el.mouseenter(function(e){
			$(this).children("div").stop().slideDown(1500)
		})
		_nav.el.mouseleave(function(e){
			$(this).children("div").stop().slideUp(1000)
		})
	}
}
_nav.init();
var swiper={
	el:$(".swiper img"),
	index:2,
	front:-1,
	run:function(){
		$(swiper.el[swiper.index]).fadeOut(2000)
		swiper.index+=swiper.front;
		if(swiper.index<0)swiper.index=2;
		if(swiper.index>2)swiper.index=0;
		$(swiper.el[swiper.index]).fadeIn(2000)
	}
}
setInterval(swiper.run,4000)
