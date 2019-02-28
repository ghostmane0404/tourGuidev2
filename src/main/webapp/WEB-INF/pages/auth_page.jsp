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

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>

    <spring:url value="/resources/style.css" var="styleCSS" />

    <link href="${styleCSS}" rel="stylesheet" />

</head>
<body>


<%--<forms:form modelAttribute="userFromClient"  method="post" action="/user-system/users/valid">--%>
<%--<forms:input cssClass="login" path="login" />--%>
<%--<forms:input path="password"/>--%>
<%--<forms:button>Sign in</forms:button>--%>
<%--</forms:form>--%>
<div cssClass="container">
    <div cssClass="row">
        <div cssClass="col-sm-9 col-md-7 col-lg-5 mx-auto">
            <div cssClass="card card-signin my-5">
                <div cssClass="card-body">
                    <h5 cssClass="card-title text-center">Sign In</h5>
                    <forms:form cssClass="form-signin">
                        <div cssClass="form-label-group">
                            <forms:label path="">Email address</forms:label>
                            <forms:input type="email" path="login" id="inputEmail" cssClass="form-control"
                                         placeholder="Email address" required="" autofocus=""></forms:input>

                        </div>

                        <hr cssClass="my-4">
                        <div cssClass="form-label-group">
                            <forms:label for="inputPassword" path="">Password</forms:label>
                            <forms:input type="password" path="password" id="inputPassword" cssClass="form-control"
                                         placeholder="Password" required=""></forms:input>
                        </div>
                        <hr cssClass="my-4">
                        <forms:button cssClass="btn btn-lg btn-primary btn-block text-uppercase"
                                      type="submit">Sign in</forms:button>
                        <hr cssClass="my-4">
                    </forms:form>
                </div>
            </div>
        </div>
    </div>
</div>

</forms:>
</body>
</html>
