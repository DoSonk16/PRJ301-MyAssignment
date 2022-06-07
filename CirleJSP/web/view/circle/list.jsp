<%-- 
    Document   : list
    Created on : May 19, 2022, 10:14:54 AM
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
        <canvas id="myCanvas" width="500" height="500" style="border:1px solid #d3d3d3;">
            Your browser does not support the HTML5 canvas tag.</canvas>
        ${ 2 mod 2 ne 0?"even":"odd"} <br/>
        ${requestScope.circles[0].radius}
        <script>
            var c = document.getElementById("myCanvas");
            var ctx = c.getContext("2d");
            <c:forEach items="${requestScope.circles}" var="c" varStatus="loop">
            ctx.beginPath();
            ctx.arc(${c.x},${c.y},${c.radius}, 0, 2 * Math.PI);
            ctx.stroke();
            <c:if test="${loop.index mod 2 eq 0}">
            ctx.fillStyle = "blue";
            </c:if>
            <c:if test="${loop.index mod 2 ne 0}">
            ctx.fillStyle = "red";
            </c:if>
            ctx.fill();            
            </c:forEach>
        </script> 
    </body>
</html>
