<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="user" items="${list}">
		<div>
		${user.id} ${user.username} ${user.password} 
			<a href="delete?id=${user.id}">删除</a> <a href="updateinit?id=${user.id}">修改</a>
		</div>
	</c:forEach>


</body>
</html>