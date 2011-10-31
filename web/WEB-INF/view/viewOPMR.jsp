<%-- 
    Document   : viewOPMR
    Created on : Oct 27, 2011, 1:23:58 AM
    Author     : Dell
--%>
<%@ include file="include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Oil and Phase Maintenance Record</title>
         <%@include file="includeS.jsp" %>
    </head>
    <body>
        <div id="wrap">
        <%@include file="header.jsp" %>
        <div id="dt_example" >
        <h1>Oil & Phase Maintenance Record</h1>
        <table border="1" cellpadding="5" >
            <tr><td>Nomenclature</td><td>${myOPM.opmNomenclature}</td></tr>
            <tr><td>Due A/F Hrs</td><td><c:choose><c:when test="${myOPM.opmDueAt == 'A'}"><c:out value="${myOPM.opmDueHrs}"/></c:when><c:otherwise><c:out value="-"/></c:otherwise></c:choose></td></tr>
            <tr><td>Due Engine Hrs</td><td><c:choose><c:when test="${myOPM.opmDueAt == 'E'}"><c:out value="${myOPM.opmDueHrs}"/></c:when><c:otherwise><c:out value="-"/></c:otherwise></c:choose></td></tr>
            <tr><td>Calendar Due</td><td>${myOPM.opmCalDueDate}</td></tr>
            <tr><td rowspan="${fn:length(myOPM.opmIntervalSet)+1}">Interval</td></tr><c:forEach var="invlHrs" items="${myOPM.opmIntervalSet}"><tr><td><c:out value="${invlHrs.opminvlHrs}"/></td></tr></c:forEach>
            <tr><td rowspan="${fn:length(myOPM.opmTimeRemSet)+1}">Remaining Time</td></tr><c:forEach var="remTime" items="${myOPM.opmTimeRemSet}"><tr><td><c:out value="${remTime.opmtrHrs}"/></td></tr></c:forEach>
            <tr><td rowspan="${fn:length(myOPM.opmRemarksSet)+1}">Remarks</td></tr><c:forEach var="remText" items="${myOPM.opmRemarksSet}"><tr><td><c:out value="${remText.opmremText}"/></td></tr></c:forEach> 
        </table>
        <br/><br/>
        <a href="/AirDynasty/viewCraftList">Back</a>
        </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
