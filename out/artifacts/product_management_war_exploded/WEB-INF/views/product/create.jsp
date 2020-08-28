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
<a href="/products">Back list</a>
<h1><c:out value="${message}"></c:out></h1>
<form action="/products?action=create" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>Desc</td>
            <td><input type="text" name="desc"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Add"></td>
            <td><input type="reset" value="Reset"></td>
        </tr>
    </table>
</form>
</body>
</html>
