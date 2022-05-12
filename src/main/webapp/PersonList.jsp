<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Покупатели</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="5">
            <caption>Список покупателей</h2></caption>
            <tr>
                <th>Номер</th>
                <th>Имя</th>
                <th>Возраст</th>
            </tr>
            <c:forEach var="person" items="${personList}">
                <tr>
                    <td><c:out value="${person.id}" /></td>
                    <td><c:out value="${person.name}" /></td>
                    <td><c:out value="${person.age}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>