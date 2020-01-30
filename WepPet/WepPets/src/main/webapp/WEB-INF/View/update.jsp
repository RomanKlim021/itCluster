<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<div>Имя: <c:out value="${requestScope.pet.name}"/> </div>
<div>Возраст: <c:out value="${requestScope.pet.age}"/> </div>

<br />

<form method="post" action="<c:url value='/update'/>">

    <label>Нове ім'я: <input type="text" name="name" /></label><br>

    <input type="number" hidden name="id" value="${requestScope.pet.id}"/>

    <input type="submit" value="Ok" name="Ok"><br>
</form>
</body>
</html>
