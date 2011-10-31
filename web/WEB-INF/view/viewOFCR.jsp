<%-- 
    Document   : viewOFCR
    Created on : Oct 27, 2011, 1:23:23 AM
    Author     : Dell
--%>
<%@ include file="include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Oil and Fuel CHange Component Record</title>
         <%@include file="includeS.jsp" %>
    </head>
    <body>
        <div id="wrap">
        <%@include file="header.jsp" %>
        <div id="dt_example" >

        <h1>Oil & Fuel Change Component Record</h1>
        <table border="1">
            <tr><td>Nomenclature</td><td>${myOFCR.oafciNomenclature}</td></tr>
            <tr><td>Specifications</td><td>${myOFCR.oafciSpecs}</td></tr>
            <tr><td  rowspan="${fn:length(myOFCR.oafciIntervalSet)+1}">Interval</td></tr><c:forEach var="ofcHrs" items="${myOFCR.oafciIntervalSet}"><tr><td>${ofcHrs.oafcinvlHrs}</td></tr></c:forEach>
            <tr><td  rowspan="${fn:length(myOFCR.oafciDueAtHrsSet)+1}">Due At</td></tr><c:forEach var="dueAtHrs" items="${myOFCR.oafciDueAtHrsSet}"><tr><td>${dueAtHrs.oanfDahHrs}</td></tr></c:forEach>
            <tr><td  rowspan="${fn:length(myOFCR.oafciDueHrsSet)+1}">Remaining Time</td></tr><c:forEach var="dueHrs" items="${myOFCR.oafciDueHrsSet}"><tr><td>${dueHrs.oafdhHrs}</td></tr></c:forEach>
            <tr><td  rowspan="${fn:length(myOFCR.oafciRemarksSet)+1}">Remarks</td></tr><c:forEach var="remText" items="${myOFCR.oafciRemarksSet}"><tr><td>${remText.oafremText}</td></tr></c:forEach>
        </table>
        <br/><br/>
        <a href="/AirDynasty/viewCraftList">Back</a>
        </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
