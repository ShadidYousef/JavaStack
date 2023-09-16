<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/21/2023
  Time: 7:56 PM
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
      <h1>Add a Book to Your Shelf!</h1>
    </div>
    <div>
      <h4><a href="/books">Back to the shelves</a></h4>
    </div>
  </div>

  <form:form action="/addBook" method="post" modelAttribute="book">
    <form:label path="title">Title</form:label>
    <form:input path="title" type="text"/>
    <form:errors path="title"/>

    <form:label path="author">Author</form:label>
    <form:input path="author" type="text"/>
    <form:errors path="author"/>

    <form:label path="thoughts">My Thoughts</form:label>
    <form:textarea path="thoughts" cols="30" rows="5"></form:textarea>
    <form:errors path="thoughts"/>

    <form:input type="hidden" path="user" value="${currentUser.id}"/>
    

    <input type="submit" class="create" value="Create">
  </form:form>

</body>
</html>


