<%-- 
    Document   : addHours
    Created on : Sep 15, 2011, 2:03:52 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add Air Craft Hours</title>
        <%@include file="includeS.jsp" %>
    </head>
      <body id="dt_example">
        <h3>Enter Air Craft Hours.</h3>
        <form action="/AirDynasty/addCraftHRS" method="get">
            <table border="10">
                <tr ><td >Air Craft Hours  </td><td><input type="text" name="afHRS"/></td></tr>
           <!-- <tr><td>Air Craft Start Count  </td><td><input type="text" name="acStCnt"/></td></tr>   -->
                <tr><td>Air Craft Landing Count  </td><td><input type="text" name="acLndCnt"/></td></tr>
                <tr><td>Air Craft flight Date(DD-MM-YYYY)  </td><td><input type="text" name="flDate"/></td></tr>
            </table>
            <br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
