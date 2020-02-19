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
            <td>${product.productid}</td>
            <td>${product.productname}</td>
            <td>${product.detail.categoryid}</td>
            <td>${product.detail.price}</td>

        </tr>
    </c:forEach>
</table>
</body>
</html>