//��ҳ
var texturl
var jsurl
var ifurl
var iheight = 90

function sitelinks(articleurl)
{
	var newslettername
	var articleurl;
	var ename = "";
	reg = /(\w+)\.(\w+)\.(\w+)\.(\w+)/;

	if(reg.test(articleurl)) {
		reg.exec(articleurl);
		ename = RegExp.$1;
	}
	 switch (ename) {
		case "webservices" :
			sitename = "<em>(<a href='http://webservices.ctocio.com.cn/'>Web����</a>)</em> "
			break
		case "win2000" :
			sitename = "<em>(<a href='http://winsystem.ctocio.com.cn/'>WinSystem</a>)</em> "
			break
		case "winsystem" :
			sitename = "<em>(<a href='http://winsystem.ctocio.com.cn/'>WinSystem</a>)</em> "
			break
		case "database" :
			sitename = "<em>(<a href='http://database.ctocio.com.cn/'>���ݿ�</a>)</em> "
			break
		case "mobilecomputing" :
			sitename = "<em>(<a href='http://mobilecomputing.ctocio.com.cn/'>�ƶ�����</a>)</em> "
			break
		case "security" :
			sitename = "<em>(<a href='http://security.ctocio.com.cn/'>��ȫ</a>)</em> "
			break
		case "cio" :
			sitename = "<em>(<a href='http://cio.ctocio.com.cn/'>CIO</a>)</em> "
			break
		case "storage" :
			sitename = "<em>(<a href='http://storage.ctocio.com.cn/'>�洢</a>)</em> "
			break
		case "networking" :
			sitename = "<em>(<a href='http://networking.ctocio.com.cn/'>����</a>)</em> "
			break
		case "exchange" :
			sitename = "<em>(<a href='http://exchange.ctocio.com.cn/'>Exchange</a>)</em> "
			break
		case "smallbizit" :
			sitename = "<em>(<a href='http://smallbizit.ctocio.com.cn/'>��С��ҵIT</a>)</em> "
			break
             case "windowssecurity" :
			sitename = "<em>(<a href='http://windowssecurity.ctocio.com.cn/'>Win��ȫ</a>)</em> "
			break
		case "crm" :
			sitename = "<em>(<a href='http://crm.ctocio.com.cn/'>CRM</a>)</em> "
			break
		case "erp" :
			sitename = "<em>(<a href='http://erp.ctocio.com.cn/'>ERP</a>)</em> "
			break		
		case "server" :
			sitename = "<em>(<a href='http://server.ctocio.com.cn/'>������</a>)</em> "
			break		
		case "news" :
			sitename = "<em>(<a href='http://news.ctocio.com.cn/'>��ҵ����</a>)</em> "
			break		
		case "bbs" :
			sitename = "<em>(<a href='http://bbs.ctocio.com.cn/'>BBS</a>)</em> "
			break		
		case "blog" :
			sitename = "<em>(<a href='http://blog.ctocio.com.cn/'>Blog</a>)</em> "
			break		
		case "soa" :
			sitename = "<em>(<a href='http://soa.ctocio.com.cn/'>SOA</a>)</em> "
			break		
		case "datacenter" :
			sitename = "<em>(<a href='http://datacenter.ctocio.com.cn/'>��������</a>)</em> "
			break		
		case "career" :
			sitename = "<em>(<a href='http://career.ctocio.com.cn/'>ITְ��</a>)</em> "
			break		
		case "virtualization" :
			sitename = "<em>(<a href='http://virtualization.ctocio.com.cn/'>���⻯</a>)</em> "
			break		
		default :
			sitename = "<em>(<a href='http://www.ctocio.com.cn/'>ITר����</a>)</em> "
	}
	document.write(sitename)
}
//������ת��
function big5()
{
base="http://big5.ctocio.com.cn/b5/";
url = window.location.href;

if(url.indexOf("big5")==-1)   {
url = url.replace("http://", "");  
document.write("<a href='"+base+url+"'>�����</a>");
}else{
url = url.replace("big5.ctocio.com.cn/b5/", "");
url = url.replace("big5.yesky.com/b5/", "");
document.write("<a href='"+url+"'>�����</a>");
}

}
//RSS
function siterss(articleurl)
{
	var newslettername
	var articleurl;
	var ename = "";
	reg = /(\w+)\.(\w+)\.(\w+)\.(\w+)/;

	if(reg.test(articleurl)) {
		reg.exec(articleurl);
		ename = RegExp.$1;
	}
	 switch (ename) {
		case "webservices" :
			sitename = "<a href='http://webservices.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "win2000" :
			sitename = "<a href='http://winsystem.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "winsystem" :
			sitename = "<a href='http://winsystem.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "database" :
			sitename = "<a href='http://database.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "mobilecomputing" :
			sitename = "<a href='http://mobilecomputing.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "security" :
			sitename = "<a href='http://security.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "cio" :
			sitename = "<a href='http://cio.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "storage" :
			sitename = "<a href='http://storage.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "networking" :
			sitename = "<a href='http://networking.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "exchange" :
			sitename = "<a href='http://exchange.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "smallbizit" :
			sitename = "<a href='http://smallbizit.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
             case "windowssecurity" :
			sitename = "<a href='http://windowssecurity.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "crm" :
			sitename = "<a href='http://crm.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break
		case "erp" :
			sitename = "<a href='http://erp.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break		
		case "server" :
			sitename = "<a href='http://server.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break		
		case "datacenter" :
			sitename = "<a href='http://datacenter.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
			break		
		default :
			sitename = "<a href='http://www.ctocio.com.cn/index.xml'><IMG SRC='http://www.ctocio.com.cn/w/share/rss.gif' WIDTH='36' HEIGHT='14' BORDER='0' ALT='RSS����'></a>"
	}
	document.write(sitename)
}

//����ͻ����ʾ

function siteid(articleurl)
{
	var newslettername
	var articleurl;
	var ename = "";
	reg = /(\w+)\.(\w+)\.(\w+)\.(\w+)/;

	if(reg.test(articleurl)) {
		reg.exec(articleurl);
		ename = RegExp.$1;
	}
	if(/cn\/qa\//.test(articleurl))ename="qa";
	if(/cn\/olympics\//.test(articleurl))ename="olympics";
	if(/cn\/hyhd\//.test(articleurl))ename="hyhd";
//	if(/cn\/soa\//.test(articleurl))ename="soa";
	 switch (ename) {
		case 'webservices' :
			sitename = '<strong><a href="http://webservices.ctocio.com.cn/"  target="_self">Web����</a></strong>'
			break
		case 'win2000' :
			sitename = '<strong><a href="http://winsystem.ctocio.com.cn/"  target="_self">WinSystem</a></strong>'
			break
		case 'winsystem' :
			sitename = '<strong><a href="http://winsystem.ctocio.com.cn/"  target="_self">WinSystem</a></strong>'
			break
		case 'database' :
			sitename = '<strong><a href="http://database.ctocio.com.cn/"  target="_self">���ݿ�</a></strong>'
			break
		case 'mobilecomputing' :
			sitename = '<strong><a href="http://mobilecomputing.ctocio.com.cn/"  target="_self">�ƶ�����</a></strong>'
			break
		case 'security' :
			sitename = '<strong><a href="http://security.ctocio.com.cn/"  target="_self">��ȫ</a></strong>'
			break
		case 'cio' :
			sitename = '<strong><a href="http://cio.ctocio.com.cn/"  target="_self">CIO</a></strong>'
			break
		case 'storage' :
			sitename = '<strong><a href="http://storage.ctocio.com.cn/"  target="_self">�洢</a></strong>'
			break
		case 'networking' :
			sitename = '<strong><a href="http://networking.ctocio.com.cn/"  target="_self">����</a></strong>'
			break
		case 'exchange' :
			sitename = '<strong><a href="http://exchange.ctocio.com.cn/"  target="_self">Exchange</a></strong>'
			break
		case 'smallbizit' :
			sitename = '<strong><a href="http://smallbizit.ctocio.com.cn/"  target="_self">��С��ҵIT</a></strong>'
			break
             case 'windowssecurity' :
			sitename = '<strong><a href="http://windowssecurity.ctocio.com.cn/"  target="_self">Win��ȫ</a></strong>'
			break
		case 'crm' :
			sitename = '<strong><a href="http://crm.ctocio.com.cn/"  target="_self">CRM</a></strong>'
			break
		case 'erp' :
			sitename = '<strong><a href="http://erp.ctocio.com.cn/"  target="_self">ERP</a></strong>'
			break		
		case 'server' :
			sitename = '<strong><a href="http://server.ctocio.com.cn/"  target="_self">������</a></strong>'
			break
		case 'askexpert' :
			sitename = '<strong><a href="http://askexpert.ctocio.com.cn/"  target="_self">ITר�ҿ�</a></strong>'
			break
		case 'hyhd' :
			sitename = '<strong><a href="http://www.ctocio.com.cn/hyhd/"  target="_self">��Ա�</a></strong>'
			break
		case 'whatis' :
			sitename = '<strong><a href="http://whatis.ctocio.com.cn/"  target="_self">Whatis</a></strong>'
			break
		case 'whitepaper' :
			sitename = '<strong><a href="http://whitepaper.ctocio.com.cn/"  target="_self">��Ƥ��</a></strong>'
			break
        case 'webcast' :
			sitename = '<strong><a href="http://webcast.ctocio.com.cn/"  target="_self">Webcast</a></strong>'
			break
		case 'qa' :
			sitename = '<strong><a href="http://www.ctocio.com.cn/ttfiles/qa/index.htm"  target="_self">QA�տ���</a></strong>'
			break
		case 'bbs' :
			sitename = '<strong><a href="http://bbs.ctocio.com.cn/"  target="_self">BBS</a></strong>'
			break
		case 'news' :
			sitename = '<strong><a href="http://news.ctocio.com.cn/"  target="_self">��ҵ����</a></strong>'
			break
		case "bbs" :
			sitename = "<strong><a href='http://bbs.ctocio.com.cn/'>BBS</a></strong> "
			break		
		case "blog" :
			sitename = "<strong><a href='http://blog.ctocio.com.cn/'>Blog</a></strong> "
			break		
		case "datacenter" :
			sitename = "<strong><a href='http://datacenter.ctocio.com.cn/'>��������</a></strong> "
			break		
		case 'career' :
			sitename = "<strong><a href='http://career.ctocio.com.cn/'>ITְ��</a></strong> "
			break
		case 'olympics' :
			sitename = "<strong><a href='http://cio.ctocio.com.cn/olympics'>������Ϣ��</a></strong> "
			break
		case 'virtualization' :
			sitename = "<strong><a href='http://virtualization.ctocio.com.cn/'>���⻯</a></strong> "
			break
		case 'soa' :
			sitename = "<strong><a href='http://soa.ctocio.com.cn/'>SOA</a></strong> "
			break
		default :
			sitename = '<strong><a href="http://www.ctocio.com.cn" target="_self">ר����ҳ</a></strong>'
	}
	document.write(sitename)
}

//�ʼ�����
function datacheck() {
			var op = newsletter.email.value;
			//m = op.match(new RegExp("^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$"));
			m = op.match(new RegExp("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"));		
			//�ͻ�ID(����Ϊ��)
			if (newsletter.email.value==""){
				alert("�ʼ���ַ����Ϊ�գ�");
				newsletter.email.focus();
				return false;
			} else if(m == null) {
				alert("�ʼ���ʽ����ȷ��");
				newsletter.email.focus();
				return false; 
			}
			else
			return true; 
	}

//��ʾ���ۿ�
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}
function MM_showHideLayers() { //v6.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; 
	if (v == 'hidden') { obj.display = 'none';} 
	if (v == 'visible') {obj.display = 'block'} }
    obj.visibility=v; }
}
//��Ҫ����
function submitFeedback() {
	document.getElementById("refurl").value=document.location.href;
	document.getElementById("reftitle").value=document.title;
	document.getElementById("feedbackForm").submit();
}

//��ǩ�л�
function GetObj(objName){
	if(document.getElementById){
		return eval('document.getElementById("' + objName + '")');
	}else{
		return eval('document.all.' + objName);
	}
}

function ccw(id_num,num){ 
	for(var i = 0;i <= 9;i++){
		if(GetObj("h" + id_num + i)){GetObj("h" + id_num + i).className = '';}
		if(GetObj("l" + id_num + i)){GetObj("l" + id_num + i).style.display = 'none';}
	}
	if(GetObj("h" + id_num + num)){GetObj("h" + id_num + num).className = 'on';}
	if(GetObj("l" + id_num + num)){GetObj("l" + id_num + num).style.display = 'block';}
}

//����ҳ���
function contentad()
{
	var newslettername
	var url = window.location.href;
	var articleurl;
	var ename = "";
	reg = /(\w+)\.(\w+)\.(\w+)\.(\w+)/;

	if(reg.test(url)) {
		reg.exec(url);
		ename = RegExp.$1;
	}
//	if(/cn\/news\//.test(url))ename="news";
//	if(/cn\/news/.test(url))ename="news";
	 switch (ename) {
		case "webservices" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/webservices_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/webservices_pip.js"
			ifurl="webservices2"
			break
		case "win2000" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/winsystem_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/winsystem_pip.js"
			ifurl="winsystem2"
			break
		case "winsystem" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/winsystem_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/winsystem_pip.js"
			ifurl="winsystem2"
			break
		case "database" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/database_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/database_pip.js"
			ifurl="database2"
			break
		case "mobilecomputing" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/mobilecomputing_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/mobilecomputing_pip.js"
			ifurl="mobilecomputing2"
			iheight=182
			break
		case "security" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/security_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/security_pip.js"
			ifurl="security2"
			iheight=182
			break
		case "cio" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/cio_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/cio_pip.js"
			ifurl="cio2"
			iheight=182
			break
		case "storage" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/storage_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/storage_pip.js"
			ifurl="storage2"
			iheight=182
			break
		case "networking" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/networking_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/networking_pip.js"
			ifurl="networking2"
			iheight=182
			break
		case "exchange" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/exchange_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/exchange_pip.js"
			ifurl="exchange2"
			break
		case "smallbizit" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/smallbizit_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/smallbizit_pip.js"
			ifurl="smallbizit2"
			break
             case "windowssecurity" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/windowssecurity_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/windowssecurity_pip.js"
			ifurl="windowssecurity2"
			break
		case "crm" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/crm_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/crm_pip.js"
			ifurl="crm2"
			break
		case "erp" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/erp_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/erp_pip.js"
			ifurl="erp2"
			break		
		case "server" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/server_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/server_pip.js"
			ifurl="server2"
			break		
		case "whitepaper" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/server_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/server_pip.js"
			ifurl="index2"
			break		
		case "news" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/news_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/news_pip.js"
			ifurl="news2"
			break
		case "whatis" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/whatis_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/whatis_pip.js"
			ifurl="index2"
			break				
		case "datacenter" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/datacenter_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/datacenter_pip.js"
			ifurl="datacenter2"
			break	
		case "virtualization" :
			texturl = "http://www.ctocio.com.cn/ttfiles/ccimages/virtualization_text.js"
			jsurl = "http://www.ctocio.com.cn/ttfiles/ccimages/virtualization_pip.js"
			ifurl="virtualization2"
			break					
		default :
			texturl = ""
			jsurl = ""
			ifurl="index2"
			
	}
}
contentad();
/* ���а� */
function month(){ 
for(i=0; i<artTitle_Month.length; i++)
		document.write("<li><a href="+artUrl_Month[i]+">"+artTitle_Month[i] + "</a></li>");
} 
function week(){ 
for(i=0; i<artTitle_Week.length; i++)
		document.write("<li><a href="+artUrl_Week[i]+">"+artTitle_Week[i] + "</a></li>");
} 
function day(){ 
for(i=0; i<artTitle_Day.length; i++)
		document.write("<li><a href="+artUrl_Day[i]+">"+artTitle_Day[i] + "</a></li>");
} 