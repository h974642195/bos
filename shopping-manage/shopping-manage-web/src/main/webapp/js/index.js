$(function(){

    /***
	 * 	商品列表中的日期设置
     */
    $('.form_datetime').children('input').val(
        function () {
            var nowtime = new Date();
            nowtime=nowtime.getFullYear()+'-'+nowtime.getMonth()+'-'+nowtime.getDate()+'  '+nowtime.getHours()+":"+nowtime.getMinutes()
            return nowtime
        });
    $(".form_datetime").datetimepicker({
        format: "yyyy-mm-dd hh:ii",
        autoclose: true,
        todayBtn: true,
        keyboardNavigation:true,
        minuteStep: 10,
        startDate: function () {
            var nowtime = new Date();
            return nowtime
        }
    });
    $('.form_datetime1').children('input').val(
        function () {
            var nowtime = new Date();
            nowtime=nowtime.getFullYear()+'-'+nowtime.getMonth()+'-'+(nowtime.getDate()+1)+'  '+nowtime.getHours()+":"+nowtime.getMinutes()
            return nowtime
        });
    $(".form_datetime1").datetimepicker({
        format: "yyyy-mm-dd hh:ii",
        autoclose: true,
        todayBtn: true,
        keyboardNavigation:true,
        minuteStep: 10,
        startDate: function () {
            var nowtime = new Date();
            return nowtime
        }
    });
	/****
 	****************************************************** 商品分类页面
 */

})