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
<h1>Chosen category: <c:out value="${theProductsList.get(i).getCategory()}"/></h1>
Welcome to your doom, mere mortal. Here is your selection.</br>
<table style="width:75%">
<tr>
    <td>ID</td>
    <td>Category</td>
    <td>Name</td>
    <td>Amount</td>
    <td>Price</td>
</tr>

<tr></br></tr>

<c:forEach items="${theProductsList}" var="current">
    <tr>
          <td><c:out value="${current.getId()}" /></td>
          <td><c:out value="${current.getCategory()}" /></td>
          <td><c:out value="${current.getName()}" /></td>
          <td><c:out value="${current.getAmount()}" /></td>
          <td><c:out value="${current.getPrice()}" /></td>
          <td><form method="post" action="/Transaction">
          <button name="theChoice" value="${current.getId()}">
          Buy <c:out value="${current.getName()}"/>
          </button>
          </form>
          </td>
    </tr>
</c:forEach>

</table>

<form>
</form>
</body>
</html>