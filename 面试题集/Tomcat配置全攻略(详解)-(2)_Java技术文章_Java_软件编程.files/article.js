// JavaScript Document
//========================= 设置字体大中小 start =============
	function doZoom(size){
		var artibody = document.getElementById('artibody');
		if(!artibody){
			return;
		}
		var artibodyChild = artibody.childNodes;
		artibody.style.fontSize = size + 'px';
		//再对artibody div内的直接html节点设置fontSize属性
		for(var i = 0; i < artibodyChild.length; i++){
			if(artibodyChild[i].nodeType == 1){
				artibodyChild[i].style.fontSize = size + 'px';
			}
		}		
	}
function openadinfo(){
window.open('tencent://message/?uin=222&Site=www.diybl.com&Menu=yes');
}
function openerror(c_id,c_title){
	window.open('/user/error.asp?c_id='+c_id+'&c_title='+c_title,'','width=300,height=260');
}
function showchk(){

	document.all.checkCode.style.display="";
	document.all.codeImg.src="/user/getcode.asp?t='+Math.random()";
}
function iframe_resize() 
{ 
 document.getElementById("pindex").style.height= pindex.document.body.scrollHeight; // IE7 和Firefox 都可以
 return true; 
} 
function setcookie(key,value)
{
	var today=new Date();
	var expireday=new Date();
	var mspermonth=24*60*60*1000*30*300;
	expireday.setTime(today.getTime()+mspermonth);	
	document.cookie=key+"="+value+";expires="+expireday.toGMTString();
}

function getcookie(key)
{
	var end;
	var search=key+"=";
	begin=document.cookie.indexOf(search);
	if(begin!=-1)
	{
		begin+=search.length;
		end=document.cookie.indexOf(";",begin);
		if(end==-1)	end=document.cookie.length;
		return document.cookie.substring(begin,end);
	}
}
function tosearch(obj){
	var str=obj.value;
	window.open('http://so.diybl.com/s?query='+encodeURI(str));
	
}
function getcontente(bi){
	flag=Math.floor(Math.random()*bi.length);
	return bi[flag];
}