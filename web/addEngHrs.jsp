<%-- 
    Document   : addEngHrs
    Created on : Sep 30, 2011, 12:22:22 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add Engine Hours</title>
    </head>
    <body>
        <h3>Enter Engine Hours.</h3>
        <form action="/AirDynasty/addEngHrs" method="get">
            <table border="10">
                <tr><td>Engine Hours  </td><td><input type="text" name="engHrs"/></td></tr>
                <tr><td>Engine Ng. Cycles </td><td><input type="text" name="ngCycs"/></td></tr>
                <tr><td>Engine Np. Cycles </td><td><input type="text" name="npCycs"/></td></tr>
                <tr><td>Air Craft Flight Date(DD-MM-YYYY) </td><td><input type="text" name="engDate"/></td></tr>
            </table>
            <br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
