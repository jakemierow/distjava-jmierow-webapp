<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <td>${products.productID}</td>
            <td>${products.productName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>