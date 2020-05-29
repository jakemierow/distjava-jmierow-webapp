<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var ="cp" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>Oops!</title>
    <link rel="stylesheet" type="text/css" href="${cp}/resources/css/style.css"/>
</head>
<body>
<%@include file="/WEB-INF/view/includes/header.jsp" %>
<div id="container">
    <div id="content">

        <h3>Oops! an error occurred</h3>
        <p>${errorMessage}</p>
    </div>

</div>


</body>
</html>
