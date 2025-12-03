<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

</head>
<body>
<table class="table table-dark table-hover" border="1" cellpadding="10">
        <tr>
            <th>Jersey Number</th>
            <th>Player Name</th>
            <th>Matches Played</th>
            <th>Runs Scored</th>
        </tr>
        <c:forEach var="player" items="${players}">
            <tr>
                <td>${player.jno}</td>
                <td>${player.pname}</td>
                <td>${player.mp}</td>
                <td>${player.rs}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>