<jsp:useBean id="customer" scope="request" type="model.Customer"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Done</title>
    <link rel="stylesheet"
          href="css/styles.css"
          type="text/css"/>
</head>
<body>
<h1>
    Insert done...
</h1>

<p>
    ID: ${customer.id}<br>
    First Name : ${customer.firstName}<br>
    Last Name: ${customer.lastName}<br>
    Balance: ${customer.balance}<br>
</p>
<p>
    Go to <a href="index.html">homepage</a>.
</p>
</body>
</html>
