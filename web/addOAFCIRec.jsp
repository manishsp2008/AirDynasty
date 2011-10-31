<%-- 
    Document   : addOAFCIRec
    Created on : Sep 28, 2011, 2:36:16 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add New Oil & Fuel Change Interval Record</title>
        <%@include file="includeS.jsp" %>
    </head>
     <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <form name="myForm" action="/AirDynasty/addOAFCIntvl" method="GET">
        <h1>Add New Oil & Fuel Change Interval Record</h1>
        <table>
            <tr colspan="2"><td>Basic Details</td></tr>
            <tr><td>Nomenclature </td><td><input type="text" name="nmText"/></td> </tr>
            <tr><td>Specification </td><td><input type="text" name="specText"/></td> </tr>
            <tr><td>Hours Type</td><td><select name="hrsType"><option value="A">Air Craft Hours</option><option value="D">Days</option><option value="E">Engine Hours</option></select></td></tr>
            <tr><td>Interval Details</td></tr>
            <tr><td>Interval </td><td><input type="text" name="intHRS"/></td> </tr>
            <tr><td>Due At Hours </td><td><input type="text" name="dueHRS"/></td> </tr>
            <tr><td>Time Remaining </td><td><input type="text" name="remTime"/></td> </tr>
            <tr><td>Remarks</td><td><input type="text" name="remText"/></td> </tr>
        </table>
        <br/><br/>
        <input type="submit" value="Add Record"/>
    </form>
  
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
