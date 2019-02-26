<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alexandr
  Date: 25.02.19
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
Hi, admin! <br>
Добавь гида
<spring:form modelAttribute="guideFromForm" method="post" action="/user-system/admin/createGuide">
    <spring:input path="name"/> Имя <br>
    <spring:input path="login"/> Логин <br>
    <spring:input path="surname"/> Фамилия <br>
    <spring:input path="phone"/> Телефон <br>
    <spring:input path="mast"/> Должность <br>
    <spring:input path="password"/> Парль <br>
    <spring:checkbox path="working"/> Работает <br>
    <spring:button>Зарегистрировать Гида</spring:button>
</spring:form>
<hr>
Можешь добавить тур
<spring:form modelAttribute="tourFromAdmin" method="post" action="/user-system/admin/createTour">
    <spring:input path="direction"/> Направление <br>
    <spring:input path="customer"/> Заказчик<br>
    <spring:input path="peopleCount"/> Количество людей <br>
    <spring:input path="kodForGuide"/> Код гида (временно) <br>
    <spring:input path="priceOfTour"/> Цена поездки <br>
    <spring:input path="ticketPrice"/> Цена билета <br>
    <spring:input path="transportPrice"/> Цена транспорта <br>
    <spring:input path="otherPrice"/> Прочие расходы <br>
    <spring:input path="dayOfTour"/>  День поездки <br>
    <spring:button>Add tour</spring:button>
</spring:form>
<hr>
Можно удалить гида
<spring:form modelAttribute="removingGuide" method="post" action="/user-system/admin/deleteGuide">
    <spring:input path="login"/> Логин <br>
    <spring:button>удалить Гида</spring:button>
</spring:form>
</body>
</html>
