<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alexandr
  Date: 25.02.19
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guide</title>
</head>
<body>

<spring:form modelAttribute="tourFromGuide" method="post" action="/user-system/guide/createTour">
    <spring:input path="direction"/> Направление <br>
    <spring:input path="customer"/> Заказчик<br>
    <spring:input path="peopleCount"/> Количество людей <br>
    <spring:input path="priceOfTour"/> Цена поездки <br>
    <spring:input path="ticketPrice"/> Цена билета <br>
    <spring:input path="transportPrice"/> Цена транспорта <br>
    <spring:input path="otherPrice"/> Прочие расходы <br>
    <spring:input path="dayOfTour"/>  День поездки <br>
    <spring:button>Add tour</spring:button>
</spring:form>


<a href="/user-system/guide/view">Show your tours</a>

</body>
</html>
