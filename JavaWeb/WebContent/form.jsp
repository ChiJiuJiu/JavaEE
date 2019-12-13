<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/form.jsp">
		<c:if test="${empty param.input}">
			input the text:<input type="text" name="input" />
			<input type="submit" value="submit" />
		</c:if>
		<c:if test="${not empty param.input }"> 
			输入是：${param.input}
		</c:if>
	</form>
</body>
</html>