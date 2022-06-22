<%-- 
    Document   : RequestSearch
    Created on : Jun 13, 2022, 7:12:54 PM
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
        <form action="request/search" method="POST">
            Create_by:<select name="create_by"> 
                <c:forEach items="${requestScope.reqs}" var="r">
                    <option 
                        <c:if test="${r.create_by eq requestScope.create_by}">
                            selected="selected"
                        </c:if>
                        value="${r.create_by}">${e.ename}</option>
                </c:forEach>
            </select>
            Review_by:<select name="review_by"> 
                <c:forEach items="${requestScope.reqs}" var="r">
                    <option 
                        <c:if test="${r.review_by eq requestScope.review_by}">
                            selected="selected"
                        </c:if>
                        value="${r.review_by}">${e.ename}</option>
                </c:forEach>
            </select>
            <input type="submit" value="RequestSearch"/>
        </form>
        <c:if test="${requestScope.reqs ne null}">
            <table>
                <tr>
                    <td>Id</td>
                    <td>Reason</td>
                    <td>From</td>
                    <td>To</td>
                    <td>Create by</td>
                    <td>Review by</td>
                    <td>Status</td>
                </tr>
                <c:forEach items="${requestScope.reqs}" var="r">
                    <tr>
                        <td>${r.rid}</td>
                        <td>${r.reason}</td>
                        <td>${r.fromdate}</td>
                        <td>${r.todate}</td>
                        <td>${r.create_by}</td>
                        <td>${r.review_by}</td>
                        <td>${r.sta.sname}</td>
                        <td><a href="edit?id=${r.rid}">Edit</a></td>
                        <td><input type="button" value="Delete" onclick="removeEmp(${r.rid})" /></td>
                    </tr>  
                </c:forEach>
            </table>
        </c:if> 
        <a href="create">Create</a>
    </body>
</html>
