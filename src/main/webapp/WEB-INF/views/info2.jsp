<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h2>hello.jsp</h2>
<h2>Hello World</h2>
<h2>${info.id}</h2>
<h2>${info.branchName}</h2>
${requestScope.info.id }
${requestScope.info.branchName }

</body>
</html>
