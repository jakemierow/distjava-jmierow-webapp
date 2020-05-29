<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var ="cp" value="${pageContext.request.contextPath}" />
<html>
<head>
      <title>Jake's Shop :: Product List</title>
    <link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css"/>
    <ul>
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a class = "active" href="${pageContext.request.contextPath}/list">Product List</a></li>
        <li><a href="${pageContext.request.contextPath}/detail">Product Detail</a></li>
        <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
    </ul>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
<%@include file="/WEB-INF/view/includes/footer.jsp" %>
<div id="container">

    <div id="content">

        <h1 align="center">Jake's Shop</h1>

        <button class="add-button"
                onclick="window.location.href='${cp}/product/showAddProductForm'; return false;"> Add Product
        </button>

        <form:form action="search" method="GET">
            Search products
            <input type="search" name="theSearchTerm"/>
            <input type="submit" value="Search" class="add-button">
        </form:form>

        <table class="center">
            <tr>
                <th>Product</th>
                <th>Price</th>
                <th>Category</th>
                <th>Action</th>
            </tr>


            <c:forEach var="product" items="${product}">

                <c:url var="updateLink" value="/product/showUpdateProductForm">
                    <c:param name="productid" value="${product.id}" />
                </c:url>
                <c:url var="deleteLink" value="/product/delete">
                    <c:param name="productid" value="${product.id}" />
                </c:url>


                <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.category.categoryName}</td>
                <td><a href="${updateLink}">Update</a>
                    |
                    <a href="${deleteLink}" onclick="if (!confirm('Are you sure?')) return false">Delete</a>
                    </td>

                </tr>


            </c:forEach>




        </table>


</div>


 </body>

</html>
