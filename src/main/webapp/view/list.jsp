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
    <title>Jake's Shop :: Item List</title>
    <link rel="stylesheet" type="text/css" href="distjava_jmierow_webapp/css/style.css"/>
    <ul>
        <li><a href="#home">Home</a></li>
        <li><a class="active" href="#list">Item List</a></li>
        <li><a href="#itemdetail">Item Detail</a></li>
        <li><a href="#login">Login</a></li>
    </ul>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<h1 align="center">Jake's Shop</h1>
<p>TV <i class='fa fa-edit' style='font-size:36px'></i> <i class='fa fa-trash-alt' style='font-size:36px'></i></p>
<p>Laptop <i class='fa fa-edit' style='font-size:36px'></i> <i class='fa fa-trash-alt' style='font-size:36px'></i></p></p>
<p>Headphones <i class='fa fa-edit' style='font-size:36px'></i> <i class='fa fa-trash-alt' style='font-size:36px'></i></p></p>
<p id="additem"><button class="btn" >Add Item</button></p>
 </body>

</html>
