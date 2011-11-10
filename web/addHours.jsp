<%-- 
    Document   : addHours
    Created on : Sep 15, 2011, 2:03:52 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add Air Craft Hours</title>
        <%@include file="includeS.jsp" %>
    </head>
     <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <h1>Enter Air Craft Hours.</h1>
        <form action="/AirDynasty/addCraftHRS" method="get">
            <table id ="addPageTable" border="0">
                <tr ><td >Air Craft Hours  </td><td><input type="text" name="afHRS"/></td></tr>
                <tr><td>Air Craft Landing Count  </td><td><input type="text" name="acLndCnt"/></td></tr>
                <tr><td>Air Craft flight Date(DD-MM-YYYY)  </td><td><input type="text" name="flDate"/></td></tr>
            </table>
            <br/><br/>
            <input class="ui-button ui-widget ui-state-default ui-button-text-only" type="submit" value="Submit"/>
        </form>
    
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
