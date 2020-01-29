<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 1/28/20
  Time: 2:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}">
    <title>Jake's Shop :: Login</title>
    <link rel="stylesheet" type="text/css" href="distjava_jmierow_webapp/css/style.css"/>
    <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#list">Item List</a></li>
        <li><a href="#itemdetail">Item Detail</a></li>
        <li><a class="active" href="#login">Login</a></li>
    </ul>
</head>
<body>
<h1 align="center">Login to Jake's Shop</h1>
<form>
    <p>Username <label>
        <input name="Username" type="text">
    </label></p>
    <p>Password <label>
        <input name="Password" type="text">
    </label></p>
    <p id="login"><button class="btn">Login</button></p>
</form>

    </body>
</html>
