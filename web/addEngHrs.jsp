<%-- 
    Document   : addEngHrs
    Created on : Sep 30, 2011, 12:22:22 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add Engine Hours</title>
        <%@include file="includeS.jsp" %>
    </head>
      <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <h1>Enter Engine Hours.</h1>
        <form action="/AirDynasty/addEngHrs" method="get">
            <table border="0">
                <tr><td>Engine Hours  </td><td><input type="text" name="engHrs"/></td></tr>
                <tr><td>Engine Ng. Cycles </td><td><input type="text" name="ngCycs"/></td></tr>
                <tr><td>Engine Np. Cycles </td><td><input type="text" name="npCycs"/></td></tr>
                <tr><td>Air Craft Flight Date(DD-MM-YYYY) </td><td><input type="text" name="engDate"/></td></tr>
            </table>
            <br/><br/>
            <input type="submit" value="Submit"/>
        </form>
  
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
