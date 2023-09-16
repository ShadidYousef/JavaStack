<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 8:22 PM
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
        <h1><c:out value="${book.title}"/> </h1>
    </div>
    <div>
        <h4><a href="/books">Back to all Shelves</a></h4>
    </div>
</div>

<c:if test="${currentUser.id == book.user.id}" >
    <p><b><span style="color: indianred;"><c:out value="${book.user.userName}"/></span> read <span style="color: mediumvioletred;"><c:out value="${book.title}"/></span> by <span style="color: springgreen;"><c:out value="${book.author}"/></span>.</b></p>
    <br>
</c:if>
<p>Here are <c:out value="${book.user.userName}"/>'s Thoughts:</p>
<br>
<hr>
<p><em><c:out value="${book.thoughts}"/> </em></p>
<hr>

<c:if test="${currentUser.id == book.user.id}">
    <div class="footer">
        <a href="/books/${book.id}/edit">Edit</a>
        <a href="/books/${book.id}/delete">Delete</a>
    </div>
</c:if>
</body>
</html>
