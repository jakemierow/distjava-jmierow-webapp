<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css"/>
    <ul>
        <li><a href="${pageContext.request.contextPath}/product">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/product/list">Item List</a></li>
        <li><a href="${pageContext.request.contextPath}/detail">Item Detail</a></li>
        <li><a class="active" href="${pageContext.request.contextPath}/login">Login</a></li>
    </ul>
</head>
<body>
<div id="container">
    <form:form action="${cp}/authenticate" method="POST">
        <table>
            <tr>
                <td><label>Username</label></td>
                <td><input type="text" name="username"</td>
            </tr>
            <tr>
                <td><label>Password</label></td>
                <td><input tpye="password" name="password"</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Login>"</td>
            </tr>
        </table>
    </form:form>
</div>
<h1 align="center">Login to Jake's Shop</h1>


    </body>
</html>
