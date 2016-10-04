<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.io.IOException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>

<html>
    <body>
        <table cellspacing="20">
        <caption><font size="6">List of Products</font></caption>

         <tr>
            <th>Id</th>
            <th>Category</th>
            <th>Name</th>
            <th>Amount</th>
            <th>Price</th>
          </tr>

          <tr>
             <c:forEach items="${theList}" var="product">
             <td>${product.id}</td>
             <td>${product.category}</td>
             <td>${product.name}</td>
             <td>${product.amount}</td>
             <td>${product.price}<td/>
          </tr>

          </c:forEach>
        </table>

        <form action="/Choice" method="post">
          <h3>Choose the product of your likeness:</h3>
          <button name="category" value="0"><font size="5">Drink</font></button>
          <button name="category" value="1"><font size="5">Candy</font></button>
          <button name="category" value="2"><font size="5">Chips</font></button>
        </form>

    </body>
</html>