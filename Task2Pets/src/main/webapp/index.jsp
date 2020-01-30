<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<h1>Всі домашні тварини</h1><br />

<c:forEach var="pet" items="${requestScope.pet}">
    <ul>

        <li>Ім'я: <c:out value="${pet.name}"/></li>
        <li>Порода: <c:out value="${pet.breed}"/></li>
        <li>Вік: <c:out value="${pet.age}"/></li>

        <form method="post" action="<c:url value='/delete'/>">
            <input type="number" hidden name="id" value="${pet.id}" />
            <input type="submit" name="delete" value="Видалити"/>
        </form>

        <form method="get" action="<c:url value='/update'/>">
            <input type="number" hidden name="id" value="${pet.id}" />
            <input type="submit" value="Редактувати"/>
        </form>
    </ul>
    <hr />

</c:forEach>

<h2>Добавлення нової тварини</h2><br />

<form method="post" action="<c:url value='/add'/>">

    <label><input type="text" name="name"></label>Ім'я<br>
    <label><input type="text" name="name"></label>Порода<br>
    <label><input type="number" name="age"></label>Вік<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>
