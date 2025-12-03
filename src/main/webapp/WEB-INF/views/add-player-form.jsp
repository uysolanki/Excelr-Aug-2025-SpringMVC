<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="addPlayer" modelAttribute="player" method="post">
			Enter Jersey Number : <form:input path="jno" />	<br>
			Enter Player Name : <form:input path="pname" /> <br>
			Enter Matches Played : <form:input path="mp" /> <br>
			Enter Runs Scored : <form:input path="rs" /> <br>
			
			<input type="submit" name="s1" value="Add Player">
		</form:form >
</body>
</html>