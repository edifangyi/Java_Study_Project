//Ëæ»ú¹ã¸æ
var refers_url = new Array(1);
var refers_pic = new Array(1);


refers_url[0] = "http://askexpert.ctocio.com.cn/";
refers_pic[0] = "http://www.ctocio.com.cn/ttfiles/2008/ctocio/askexpert_random_760x90_20080324.jpg";

refers_url[1] = "http://networking.ctocio.com.cn/telecom_zjq/";
refers_pic[1] = "http://www.ctocio.com.cn/ttfiles/2008/ctocio/xinchanbu_networking_760x90_20080425.jpg";

function getRandomRefer(){
	var number = Math.floor(Math.random() * (refers_url.length));
	return number;
}