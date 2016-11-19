var Request = new Object();
Request.send = function(url, method, callback, data, urlencoded) {
	var req;
	if(window.XMLHttpRequest){
		req = new XMLHttpRequest();
	}else if(window.ActiveXObject){
		req = new ActiveXObject("Microsoft.XMLHTTP");
	}
	req.onreadystatechange = function() {
		if(req.readyState == 4){
			if (req.status < 400) {
				(method=="POST") ? callback(req) : callback(req,data);
			}else{
				//alert("服务器繁忙请稍后再试!");
			}
		}
	}
	if (method=="POST") {
		req.open("POST", url, true);
		if (urlencoded) req.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		req.send(data);
	} else {
		req.open("GET", url, true);
		req.send(null);
	}
	return req;
}
Request.sendRawPOST = function(url, data, callback) {
	Request.send(url, "POST", callback, data, false);
}
Request.sendPOST = function(url, data, callback) {
	Request.send(url, "POST", callback, data, true);
}
Request.sendGET = function(url, callback, args) {
	return Request.send(url, "GET", callback, args);
}

