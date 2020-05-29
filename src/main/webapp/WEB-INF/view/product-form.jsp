<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var ="cp" value="${pageContext.request.contextPath}" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jake's Shop:: Update Product</title>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/product-form-style.css">
    <ul>
        <li><a href="${pageContext.request.contextPath}/">Home</a></li>
        <li><a href="${pageContext.request.contextPath}/product/list">Product List</a></li>
        <li><a class="active" href="${pageContext.request.contextPath}/detail">Product Detail</a></li>
        <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
    </ul>
</head>
<body>
<%@include file="/WEB-INF/view/includes/header.jsp" %>
<%@include file="/WEB-INF/view/includes/footer.jsp" %>

<form:form action="${cp}/product/save" modelAttribute="aProduct">
    <form:hidden path="id" value="${aProduct.id}"/>
    <table>
        <tr>
            <td><label>Name</label></td>
            <td><form:input path="name"/></td>
                <form:errors path="name" cssClass="error" />
        </tr>
        <tr>
            <td><label>Price</label></td>
            <td><form:input path="price"/>
                <form:errors path="price" cssClass="error" />
    </td>
        </tr>
        <tr>
            <td><label>Category</label></td>
            <td>
                <form:select path="category" items="${Categories}" itemLabel="categoryName" itemValue="categoryId"/>
            </td>
            <td></td>
            <td><input type="submit" value="Save" class="save"></td>
        </tr>
    </table>
</form:form>






</body>

</html>
