<%-- 
    Document   : addOPMRec
    Created on : Sep 25, 2011, 12:42:06 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add New OPM Record</title>
        <%@include file="includeS.jsp" %>
    </head>
    <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >
        <h1>Add New OPM Record</h1>
        <form name="myForm" action="/AirDynasty/addOPMRec">
        <table id="addPageTable">
            <tr colspan="2" style="background-color: yellowgreen" ><td>Basic Details</td></tr>
            <tr><td>Hours Type</td><td><select name="hrsType"><option value="A">Air Frame Hours</option><option value="D">In Days</option><option value="E">Engine Hours</option><option value="N">Ng Cycles</option></select></td></tr>
            <tr><td>Nomenclature</td><td><input type="text" name="ncText"/></td></tr>
            <tr><td>Due A/F Hours</td><td><input type="text" name="dueAFhrs"/></td></tr>
            <tr><td>Due Engine Hours</td><td><input type="text" name="dueENGhrs"/></td></tr>
            <tr><td>Calender Due Date</td><td><input type="text" name="calDate"/></td></tr>
            <tr colspan="2" style="background-color: yellowgreen" ><td>Other Details</td></tr>
            <tr><td>Interval</td><td><input type="text" name="intvl"/></td></tr>
            <tr><td>Time Remain</td><td><input type="text" name="remTime"/></td></tr>
            <tr><td>Remarks</td><td><input type="text" name="remText"/></td></tr>
        </table>
        <br/><br/>
        <input class="ui-button ui-widget ui-state-default ui-button-text-only" type="submit" value="Submit"/>
        </form>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
