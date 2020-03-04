<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 1/28/20
  Time: 1:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}">
    <title>Jake's Shop :: Item Detail</title>
    <link rel="stylesheet" type="text/css" href="distjava_jmierow_webapp/css/style.css"/>
    <ul>
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/list">Item List</a></li>
        <li><a class="detail" href="${pageContext.request.contextPath}/detail">Item Detail</a></li>
        <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
    </ul>
</head>
<body>
<h1 align="center">Jake's Shop</h1>
<p>Product Name<label>
    <input name="Product" type="text">
</label></p>
<p>Price<label>
    <input name="Category" type="text">
</label></p>
<p>Category<label>
    <input name="Category" type="text">
</label></p>
<p id="save"><button class="btn">Save</button></p>


</body>
</html>
