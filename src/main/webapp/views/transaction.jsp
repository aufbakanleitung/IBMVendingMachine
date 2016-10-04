<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import = "java.io.IOException"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.sql.SQLException"%>
<%@page import = "com.ibm.vend0tron3000.Product"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Choice overview Vend0tron3000</title>
</head>
<body>
<h1>Transaction overview</h1></br>
You have bought: <c:out value="${theProduct.getName()}"/>.</br>
It costed you: <c:out value="${theProduct.getPrice()}"/>.</br>
There are <c:out value="${theProduct.getAmount()}"/> left inside this machine.
<form>
</form>
</body>
</html>