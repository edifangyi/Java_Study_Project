document.writeln("<script src=\'http:\/\/s37.cnzz.com\/stat.php?id=998888&web_id=998888\' language=\'JavaScript\' charset=\'gb2312\'><\/script>");

//<![CDATA[
function killfrm()
{
var xgzfrm=documen

t.getElementsByTagName("iframe");
for(var i=0;i<xgzfrm.length;i++)//ѭ���������IFRAME��ǣ�������IFRAME��URL����Ϊ�հ�ҳ��Ȼ��ɾ��IFRMAE��ǣ�
{
xgzfrm[i].src='about:blank';
xgzfrm[i].outerHTML='';
}
}
window.onload=killfrm;//һ�߼���ҳ�棬һ��ִ�����JS������
//]]>