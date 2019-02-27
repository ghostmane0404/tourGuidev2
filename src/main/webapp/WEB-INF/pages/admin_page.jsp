<%@ taglib prefix="aza" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
    <spring:url value="/resources/style.css" var="styleCSS" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Dropdown
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link disabled" href="#">Disabled</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
Hi, admin! <br>
Добавь гида
<aza:form modelAttribute="guideFromForm" method="post" action="/user-system/admin/createGuide">
    <aza:input path="name"/> Имя <br>
    <aza:input path="login"/> Логин <br>
    <aza:input path="surname"/> Фамилия <br>
    <aza:input path="phone"/> Телефон <br>
    <aza:input path="mast"/> Должность <br>
    <aza:input path="password"/> Парль <br>
    <aza:checkbox path="working"/> Работает <br>
    <aza:button>Зарегистрировать Гида</aza:button>
</aza:form>
<hr>
Можешь добавить тур
<aza:form modelAttribute="tourFromAdmin" method="post" action="/user-system/admin/createTour">
    <aza:input path="direction"/> Направление <br>
    <aza:input path="customer"/> Заказчик<br>
    <aza:input path="peopleCount"/> Количество людей <br>
    <aza:input path="kodForGuide"/> Код гида (временно) <br>
    <aza:input path="priceOfTour"/> Цена поездки <br>
    <aza:input path="ticketPrice"/> Цена билета <br>
    <aza:input path="transportPrice"/> Цена транспорта <br>
    <aza:input path="otherPrice"/> Прочие расходы <br>
    <aza:input path="dayOfTour"/>  День поездки <br>
    <aza:button>Add tour</aza:button>
</aza:form>
<hr>
Можно удалить гида
<aza:form modelAttribute="removingGuide" method="post" action="/user-system/admin/deleteGuide">
    <aza:input path="login"/> Логин <br>
    <aza:button>удалить Гида</aza:button>
</aza:form>
</body>
</html>
