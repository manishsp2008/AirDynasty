<%-- 
    Document   : index
    Created on : Sep 13, 2011, 11:21:29 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty</title>
        <%@include file="includeS.jsp" %>
    </head>
     <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <h1>Aircraft Management System</h1>
        <ol>
            <li><a href="/AirDynasty/viewCraftList">View Air Crafts</a></li>
        </ol>
        <jsp:forward page="home.jsp" />    
   
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
