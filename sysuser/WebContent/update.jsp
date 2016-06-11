<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	修改用户
	<form action="update" method="post">
		<input type="hidden" name="id" value="${user.id}"/> <br /> 
	
		<input type="text" name="username" value="${user.username}"/> <br /> 
		<input type="text" name="password" value="${user.password}"/> <br /> 
		<input type="submit" value="修改保存" />
	</form>
</body>
</html>