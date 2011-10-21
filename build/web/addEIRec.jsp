<%-- 
    Document   : addEIRec
    Created on : Sep 24, 2011, 10:46:14 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add New Engine Inspection Record </title>
        <%@include file="includeS.jsp" %>
    </head>
  <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <h1>New Engine Inspection Record</h1>
        <form name="myForm" action="/AirDynasty/addEngInspec" method="get">
        <table>
            <tr>
                <td>Nomenclature</td><td><input type="text" name="ncText"/></td>
            </tr>
            <tr>
                <td>Due A/F Hours</td><td><input type="text" name="dueAFhrs"/></td>
            </tr>
            <tr>
                <td>Due Engine Hours</td><td><input type="text" name="dueENGhrs"/></td>
            </tr>
            <tr>
                <td>Calender Due Date</td><td><input type="text" name="calDate"/></td>
            </tr>
            <tr>
                <td>Remaining Time</td><td><input type="text" name="remTime"/></td>
            </tr>
            <tr>
                <td>Remarks</td><td><input type="text" name="remText"/></td>
            </tr>
        </table>
        
        <input type="submit" value="Submit"/>
        </form>
   
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
