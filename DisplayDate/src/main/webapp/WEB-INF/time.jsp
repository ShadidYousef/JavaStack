<%--
  Created by IntelliJ IDEA.
  User: Reg
  Date: 7/13/2023
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Time</title>
</head>
<body style="background-color: gainsboro; font-family: Consolas;" onpageshow="timeAlert()">
    <h1 style="text-align: center; margin-top: 200px;">Time: <c:out value="${time}"/></h1>
    <script type="text/javascript" src="/js/script.js"></script>
</body>
</html>
