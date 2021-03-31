<jsp:useBean id="customer" scope="request" type="model.Customer"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
    <link rel="stylesheet"
          href="css/styles.css"
          type="text/css"/>
</head>
<body>
<table class="title">
    <tr>
        <th>Update</th>
    </tr>
</table>
<br>

<fieldset>
    <legend>
        Customer
    </legend>

    <form action="UpdateServlet">
        <input type="hidden" name="id" value="${customer.id}">
        First name:
        <input type="text" name="name" value="${customer.firstName}"><br>
        Last Name:
        <input type="text" name="surname" value="${customer.lastName}"><br>
        Balance:
        <input type="number" name="balance" value="${customer.balance}"><br>
        <input type="submit" value="Update Customer">
    </form>
</fieldset>
</body>
</html>
