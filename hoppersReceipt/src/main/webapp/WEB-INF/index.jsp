<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/13/2023
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="static/style.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Customer Name: <c:out value="${name}"/></h1>
    <h3>Item name: <c:out value="${itemName}"/></h3>
    <h3>Price: $<c:out value="${price}"/></h3>
    <h3>Description: <c:out value="${desc}"/></h3>
    <h3>Vendor: <c:out value="${vendor}"/></h3>
</body>
</html>
