<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty param.username}">
			unknown user.
		</c:when>
		<c:when test="${param.username=='itcast'}">
			${param.username} is a manager.
		</c:when>
		<c:otherwise>
			you are a manager.
		</c:otherwise>
	</c:choose>
</body>
</html>