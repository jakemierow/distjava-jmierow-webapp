<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 1/28/20
  Time: 1:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var ="cp" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Jake's Shop :: Home</title>
    <link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css"/>
    <ul>
        <li><a class="active" href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/product/list">Product List</a></li>
        <li><a href="${pageContext.request.contextPath}/detail">Product Detail</a></li>
        <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
    </ul>
</head>
<body>

<main>
   <br><br><br><br><br><br><br><br><br><br><br>
    <h1>Jake's Shop</h1>
    </main>

 </body>

</html>
