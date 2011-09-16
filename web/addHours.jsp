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
        <title>Air Dynasty - Add Craft Hours</title>
    </head>
    <body>
        <h3>Enter Air Craft Hours.</h3>
        <form action="/AirDynasty/addCraftHRS" method="get">
            <table>
                <tr ><td >Air Craft Hours  </td><td><input type="text" name="afHRS"/></td></tr>
                <tr><td>Air Craft Start Count  </td><td><input type="text" name="acStCnt"/></td></tr>
                <tr><td>Air Craft Landing Count  </td><td><input type="text" name="acLndCnt"/></td></tr>
                <tr><td>Air Craft flight Date(YYYY-MM-DD)  </td><td><input type="text" name="flDate"/></td></tr>
            </table>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
