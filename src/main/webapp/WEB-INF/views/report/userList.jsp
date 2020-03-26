<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		我是用户列表 (っ´Ι`)っ
		<h2>hello.jsp</h2>
		<h2>Hello World</h2>
		<h2>${test}</h2>
		<h2>${test}</h2>
		<h2>${info.id}</h2>
		<c:forEach var="info" items="${list}">
		Item <c:out value="${info.id}"/><p>
		</c:forEach>
	</div>
</body>
</html>