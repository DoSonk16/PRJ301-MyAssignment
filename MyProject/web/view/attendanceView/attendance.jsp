<%-- 
    Document   : attendance
    Created on : Jul 13, 2022, 9:21:25 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="/attendance" method="POST">
            Student ID: <select name="sid"> 
                <c:forEach items="${requestScope.stud}" var="s">
                    <option 
                        <c:if test="${s.sid eq requestScope.sid}">
                            selected="selected"
                        </c:if>
                        value="${s.sid}">${s.sname}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Show"/>
        </form>
        <c:if test="${requestScope.atts ne null}">
            <table>
                <tr>
                    <td>Date</td>
                    <td>Room</td>
                    <td>Lecturer</td>
                    <td>Group Name</td>
                    <td>Attendance Status</td>
                    <td>Edit Date</td>
                    <td></td>
                    <td></td>
                </tr>
                <c:forEach items="${requestScope.atts}" var="a">
                    <tr>
                        <td>${slo.slname}</td>
                        <td>${roo.rname}</td>
                        <td>${lec.lname}</td>
                        <td>${grp.gname}</td>
                        <td>${att.status}</td>
                        <td>${att.editdate}</td>
                    </tr>  
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
