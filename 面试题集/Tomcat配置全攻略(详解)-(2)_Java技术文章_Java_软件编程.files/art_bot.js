document.writeln("��վ���¾�Ϊ���������ϴ�������зǷ���������ϵ���ǣ����ǻ��ڵ�һʱ��ɾ��<br><br>��վ��Ƹ�༭һ������ϵ�绰:15009259087 ��ϵqq 258622672");
document.body.oncopy = function () { 
	setTimeout( function () { 
		var text = clipboardData.getData("text");
		if (text) { 
			text = text + "\r\n���³�����"+location.href; clipboardData.setData("text", text);
		} 
				}, 100 ) 
}