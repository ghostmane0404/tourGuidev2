<%@ taglib prefix="forms" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
    <spring:url value="/resources/style.css" var="styleCSS" />
    <link href="${styleCSS}" rel="stylesheet" />
</head>
<body>

<forms:form modelAttribute="userFromClient"  method="post" action="/user-system/users/valid">
    <forms:input cssClass="login" path="login" />
    <forms:input path="password"/>
    <forms:button>Sign in</forms:button>
</forms:form>

</body>
</html>
