<%-- 
    Document   : index
    Created on : Sep 13, 2011, 11:21:29 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
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

        <h1>Air Craft Management System</h1>
            
        <a href="/AirDynasty/viewCraftList" class="ui-button ui-widget ui-state-default ui-button-text-only" role="button" alt="View Aircrafts registered in system." ><span class="ui-button-text">View Aircrafts</span></a>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
