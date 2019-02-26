<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alexandr
  Date: 22.02.19
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auth</title>
</head>
<body>


<spring:form modelAttribute="userFromClient" method="post" action="/user-system/users/valid">
    <spring:input path="login"/>
    <spring:input path="password"/>
    <spring:button>Sign in</spring:button>
</spring:form>

</body>
</html>
