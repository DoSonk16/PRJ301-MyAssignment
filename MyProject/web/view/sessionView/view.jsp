<%-- 
    Document   : view
    Created on : Jun 23, 2022, 5:37:56 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="attendance" method="POST">
            Student Id: <input type="text" name="sid"/> <Br/>
            Lecturer Id: <input type="text" name="lid"/> <Br/>
            Subject Id: <input type="text" name="suid"/> <Br/>
            Room:<input type="text" name="rname"/> <Br/> 
            <input type="submit" value="Search"/>
        </form>
    </body>
</html>
