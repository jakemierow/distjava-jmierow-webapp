<html>
<head>
    <title>Products</title>

</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach var="products" items="${products}">
        <tr>
            <td>${products.ProductID}</td>
            <td>${products.productname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>