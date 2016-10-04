<%@ page import="java.sql.ResultSet"%>
<%@ page import="com.ibm.vend0tron3000.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Vend0tron 30000</title>
</head>

    <body>
        <table cellspacing="20">
        <caption><font size="6">List of Products</font></caption>

         <tr>
            <th>Id</th>
            <th>Category</th>
            <th>Name</th>
            <th>Amount</th>
            <th>Price</th>
            <th></th>
          </tr>

          <tr>
             <%int i = 0;%>
             <c:forEach items="${theList}" var="product">
             <td>${product.id}</td>
             <td>${product.category}</td>
             <td>${product.name}</td>
             <td>${product.amount}</td>
             <td>${product.price}<td/>
             <td><form action="/transaction" method="post"><button name="theChoice" value=${i}>
             Pick me!
             </button></form></td>
             <%=i%>
             <%i++;%>
          </tr>

          </c:forEach>
        </table>
    </body>
</html>