<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<table>
    <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Category</th>
        <th>Price</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.productID}</td>
            <td>${product.productName}</td>
            <td>${product.detail.categoryid}</td>
            <td>${product.detail.price}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>