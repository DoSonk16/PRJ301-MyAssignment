<%-- 
    Document   : sessionView
    Created on : Jun 23, 2022, 4:38:28 AM
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
        <form action="attendance" method="GET">
            Student Id: <input type="text" name="sid"/> <Br/>
            Lecturer Id: <input type="text" name="lid"/> <Br/>
            Subject Id: <input type="text" name="suid"/> <Br/>
            Dob From: <input type="date" name="from"/> 
            Dob To: <input type="date" name="from"/> <Br/>
            Room:<input type="text" name="rname"/> <Br/> 
            <input type="submit" value="Search"/>
        </form>
        <table>
            <tr>
                <td>Student Id</td>
                <td>Student Name</td>
                <td>Lecturer Name</td>
                <td>Subject Id</td>
                <td>Subject Name</td>
                <td>Slot</td>
                <td>Room</td>
            </tr>
            <c:forEach items="${requestScope.sess}" var="ses">
                <tr>
                    <td>${ses.sid}</td>
                    <td>${ses.stu.sname}</td>
                    <td>${ses.lec.lname}</td>
                    <td>${ses.suid}</td>
                    <td>${ses.sub.suname}</td>
                    <td>${ses.sldate}</td>
                    <td>${ses.rname}</td>
                </tr>  
            </c:forEach>
        </table>
    </body>
</html>
