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
            <h3>Список покупок <c:out value="${person.id}" /></h3>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <tr>
                <th>Номер</th>
                <th>Имя</th>
                <th>Цена</th>
                <th>Покупатель</th>
            </tr>
            <c:forEach var="purchase" items="${purchaseList}">
                <tr>
                    <td><c:out value="${purchase.id}" /></td>
                    <td><c:out value="${purchase.name}" /></td>
                    <td><c:out value="${purchase.price}" /></td>
                    <td><c:out value="${purchase.id_person}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>