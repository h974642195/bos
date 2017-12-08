var _lis = document.getElementsByClassName("color")[0].getElementsByTagName("li");
for(var i = 0; i < _lis.length; i++) {
	var _r = parseInt(Math.random() * 255);
	var _g = parseInt(Math.random() * 255);
	var _b = parseInt(Math.random() * 255);
	_lis[i].style.backgroundColor="rgb("+_r+","+_g+","+_b+")";
}