<%-- 
    Document   : list
    Created on : May 31, 2022, 8:03:20 AM
    Author     : DELL
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
            var c = document.getElementById("myCanvas");
            var ctx = c.getContext("2d");
            <c:forEach items="${requestScope.circles}" var="c" varStatus="loop">
            <c:if test="num = ${requestScope.circles}">
            ctx.beginPath();
            ctx.arc(${c.x},${c.y},${c.radius}, 0, 2 * Math.PI);
            ctx.stroke(); 
            </c:if>
            </c:forEach>
        </script> 
    </body>
</html>
