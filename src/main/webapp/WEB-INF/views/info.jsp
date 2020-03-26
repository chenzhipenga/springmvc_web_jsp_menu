<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2>hello.jsp</h2>
<h2>Hello World</h2>
<h2>${test}</h2>
<h2>${test}</h2>
<h2>${info.id}</h2>
<c:forEach var="info" items="${list}">
  Item <c:out value="${info.id}"/><p>
</c:forEach>

</body>
</html>
