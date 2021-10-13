<%--
  Created by IntelliJ IDEA.
  User: jimsb
  Date: 13.10.2021
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Meals</h2></caption>
        <tr>
            <th>Date</th>
            <th>Description</th>
            <th>Calories</th>
        </tr>
        <jsp:useBean id="listMeals" scope="request" type="java.util.List"/>
        <c:forEach var="meals" items="${listMeals}">
            <tr>
                <td ${(meals.excess) == true ? "style='color:red'" : "style='color:green'"}><c:out value="${meals.dateTime.toLocalDate()} ${meals.dateTime.toLocalTime()}" /></td>
                <td ${(meals.excess) == true ? "style='color:red'" : "style='color:green'"}><c:out value="${meals.description}"/></td>
                <td ${(meals.excess) == true ? "style='color:red'" : "style='color:green'"}><c:out value="${meals.calories}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
