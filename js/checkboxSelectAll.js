$(function(){
	//一键全选、取消全选
	//<input type="checkbox" id="checkboxAll"/>全选
	$("#checkboxAll").change(function(){
		var all = document.getElementById("checkboxAll");
		var ch = document.getElementsByName("xxxxxxCheckbox");
		for(var i=0;i<ch.length;i++) {
			ch[i].checked = all.checked;
		}
	});
})
	