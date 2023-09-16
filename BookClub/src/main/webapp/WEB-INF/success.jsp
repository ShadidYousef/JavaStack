<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Book Club</title>
  <link rel="stylesheet" href="/css/style.css">
</head>
<body>
  <div style="display: flex; justify-content: space-between;">
    <div>
      <h1>Welcome, <c:out value="${currentUser.userName}"/> !</h1>
      <h4>Books from everyone's shelves: </h4>
    </div>
    <div>
      <h4><a href="/logout">logout</a></h4>
      <h4><a href="/books/new">+Add a Book to my shelf</a></h4>
    </div>
  </div>

<div style="text-align: center; display: flex; justify-content: center; align-items: center; font-size: x-large;">
    <table>
      <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author Name</th>
        <th>Posted By</th>
      </tr>
      <tr>
        <c:forEach var="book" items="${books}">
      <tr>
        <td><c:out value="${book.id}"/></td>
        <td><a href="/books/${book.id}"><c:out value="${book.title}"/></a></td>
        <td><c:out value="${book.author}"/></td>
        <td><c:out value="${book.user.userName}"/></td>
      </tr>
      </c:forEach>
    </table>
</div>
</body>
</html>