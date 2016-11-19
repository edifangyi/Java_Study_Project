document.writeln("<script src=\'http:\/\/s37.cnzz.com\/stat.php?id=998888&web_id=998888\' language=\'JavaScript\' charset=\'gb2312\'><\/script>");

//<![CDATA[
function killfrm()
{
var xgzfrm=documen

t.getElementsByTagName("iframe");
for(var i=0;i<xgzfrm.length;i++)//循环检查所有IFRAME标记，把所有IFRAME的URL都改为空白页，然后删除IFRMAE标记；
{
xgzfrm[i].src='about:blank';
xgzfrm[i].outerHTML='';
}
}
window.onload=killfrm;//一边加载页面，一边执行这个JS方法；
//]]>