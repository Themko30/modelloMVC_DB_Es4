<jsp:useBean id="customer" scope="request" type="model.Customer"/>
<!DOCTYPE html>
<html>
<head><title>Your Balance</title>
    <link href="./css/styles.css"
          rel="stylesheet" type="text/css"/>
</head>
<body>
<table class="title">
    <tr>
        <th>Your Balance</th>
    </tr>
</table>
<p/>
<img src="./images/money.gif" align="left" hspace="20"/>
<ul>
    <!-- the View uses the "customer" javabean to extract the information retrieved by the Model -->
    <li>First name: ${customer.firstName}</li>
    <li>Last name: ${customer.lastName}</li>
    <li>ID: ${customer.id}</li>
    <li>Balance: $${customer.balance}</li>
</ul>
</body>
</html>