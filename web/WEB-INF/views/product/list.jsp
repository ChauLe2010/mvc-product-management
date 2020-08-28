<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/28/2020
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@	taglib uri =	"http://java.sun.com/jsp/jstl/core"	prefix	=	"c"	%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products?action=create">Create new product</a>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Desc</th>
        <th colspan="2">Actions</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><c:out value="${product.getId()}"></c:out></td>
            <td><c:out value="${product.getName()}"></c:out></td>
            <td><c:out value="${product.getPrice()}"></c:out></td>
            <td><c:out value="${product.getDescrpit()}"></c:out></td>
            <td><a href="#"> Edit</a></td>
            <td><a href="#">Delete</a></td>

        </tr>

    </c:forEach>
</table>
</body>
</html>
