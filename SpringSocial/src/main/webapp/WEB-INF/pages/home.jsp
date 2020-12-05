<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jmcc List</title>
</head>
<style>
header {
  background-color: cyan;
  padding: 30px;
  text-align: center;
  font-size: 25px;
  color: red;
}

</style>
<body style="background: url('https://images.unsplash.com/photo-1540747913346-19e32dc3e97e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80');background-position: center;background-repeat: no-repeat;background-size:124%;">
<h1 align="center" style="color: #EEBA30">JMCC CRICKET PATRAPUR</h1>


<fieldset>
<legend style="color: #FFAD60">Register Details</legend>
<table align="left" style="color: #fff400">
<form:form action="create" method="post" modelAttribute="jmccnew">
<tr>
<td><form:hidden path="id"/><td>
</tr>
<tr>
<td>PlayerName::</td>
<td><form:input path="playerName"/></td>
</tr>
<tr>
<td>JerseyNumber::</td>
<td><form:input path="jerseyNo"/></td>
</tr>
<tr>
<td>BatName::</td>
<td><form:input path="batName"/></td>
</tr>

<tr>
<th colspan="1">
<td><input type="submit" value="register"></td>
</tr>
</form:form>
</table>
</fieldset>


<div align="center">
<table border="1" align="left" draggable="true" >
<tr style="color: #09ff00">
<th>ID</th>
<th>PLAYERNAME</th>
<th>JERSEYNO</th>
<th>BATNAME</th>
<th>ACTION</th>
</tr>
<c:forEach var="asish" items="${jmcc}">
<tr style="color: #30e0ee">
<td>${asish.id}</td>
<td>${asish.playerName}</td>
<td>${asish.jerseyNo}</td>
<td>${asish.batName}</td>
<td><a href="update?id=${asish.id}">Edit</a>&nbsp;<a href="delete?id=${asish.id}">Delete</a></td>
</tr>
</c:forEach>
</table><br>
</div>



<form action="send" method="post">
<table align="right" style="color: #FDFE02">
<tr>
	<td>To:</td>
	<td><input type="text" name="abc"></td>
</tr>
<tr>
	<td>Subject:</td>
	<td><input type="text" name="sub"></td>
</tr>
<tr>
	<td>Body:</td>
	<td><textarea cols="30" rows="5" name="text"></textarea></td>
</tr>
<tr>
	<th colspan="1">
	<td><input type="submit" value="Send"></td>
</tr>
</table>
</form>
</body>
</html>