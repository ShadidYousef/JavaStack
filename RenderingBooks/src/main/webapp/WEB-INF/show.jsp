<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/17/2023
  Time: 10:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html style="font-family: sans-serif;">
<head>
    <title><c:out value="${book.title}"/></title>
</head>
<body>
<h1><c:out value="${book.title}"/></h1>
<p>Description: <c:out value="${book.description}"/></p>
<p>Language: <c:out value="${book.language}"/></p>
<p>Number of Pages: <c:out value="${book.numberOfPages}"/></p>
</body>
</html>

