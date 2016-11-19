document.writeln("本站文章均为网上网友上传，如果有非法内容请联系我们，我们会在第一时间删除<br><br>本站招聘编辑一名：联系电话:15009259087 联系qq 258622672");
document.body.oncopy = function () { 
	setTimeout( function () { 
		var text = clipboardData.getData("text");
		if (text) { 
			text = text + "\r\n文章出处："+location.href; clipboardData.setData("text", text);
		} 
				}, 100 ) 
}