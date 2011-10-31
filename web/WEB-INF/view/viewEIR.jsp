<%-- 
    Document   : viewEIR
    Created on : Oct 27, 2011, 1:23:07 AM
    Author     : Dell
--%>
<%@ include file="include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Engine Inspection Record</title>
         <%@include file="includeS.jsp" %>
    </head>
    <body>
        <div id="wrap">
        <%@include file="header.jsp" %>
        <div id="dt_example" >
        <h1>Engine Inspection Record</h1>
        <table>
            <tr><td>Nomenclature</td><td>${myEIR.aesNomenclature}</td></tr>
            <tr><td>Due A/F Hrs</td><td>${myEIR.aesDueAfHrs}</td></tr>
            <tr><td>Due Engine Hrs</td><td>${myEIR.aesDueEngHrs}</td></tr>
            <tr><td>Calendar Due Date</td><td>${myEIR.aesCalDueDate}</td></tr>
            <tr><td>Remaining Time</td><td>${myEIR.aesRemarks}</td></tr>
        </table>
        <br/><br/>
        <a href="/AirDynasty/viewCraftList">Back</a>
        </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
