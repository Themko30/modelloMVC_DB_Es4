<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="customers" scope="request" type="java.util.List"/>
<html>
<head>
    <title>Show All</title>
    <link rel="stylesheet"
          href="css/styles.css"
          type="text/css"/>
</head>
<body>
<h1>
    All Customers
</h1>

<ol>
    <c:forEach items="${customers}" var="customer">
    <li>${customer.firstName} ${customer.lastName} ${customer.balance}


        </c:forEach>
</ol>
</body>
</html>
