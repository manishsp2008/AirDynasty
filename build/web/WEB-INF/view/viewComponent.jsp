<%-- 
    Document   : viewComponent
    Created on : Oct 25, 2011, 2:45:43 PM
    Author     : Dell
--%>

<%@ include file="include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Component Details Page</title>
        <%@include file="includeS.jsp" %>
    </head>
    <body>
        <div id="wrap">
        <%@include file="header.jsp" %>
        <div id="dt_example" >
        <h1>Component Details</h1>
        
        <table border="1" >
            <tbody>
                <tr style="background-color: #fcefa1 "><td colspan="2">Basic Details</td></tr>
                <tr><td>Component Name</td><td>${myComp.compPartname}</td></tr>
                <tr><td>Part No</td><td>${myComp.compPartnum}</td></tr>
                <tr><td rowspan="${fn:length(myComp.cmpSerialNumberSet) + 1}">Serial No</td></tr><c:forEach var="srNum" items="${myComp.cmpSerialNumberSet}"><tr><td><c:out value="${srNum.serialnumValue}"/></td></tr></c:forEach>
                <tr style="background-color: #fcefa1 "><td colspan="2">Installation Details</td></tr>
                <tr><td rowspan="${fn:length(myComp.cmpLiferemInstSet) + 1}">Remaining Life</td></tr><c:forEach var="remLifeInst" items="${myComp.cmpLiferemInstSet}"><tr><td><c:out value="${remLifeInst.cmplifeRemHrs}"/></td></tr></c:forEach>
                <tr><td rowspan="${fn:length(myComp.cmpAfhrsInstSet) + 1}">AF/Eng. Hrs</td></tr><c:forEach var="afHrsInst" items="${myComp.cmpAfhrsInstSet}"><tr><td><c:out value="${afHrsInst.cmpAfhrsInstHrs}"/></td></tr></c:forEach>
                <tr><td rowspan="${fn:length(myComp.cmpDateInstSet) + 1}">Installation Date</td></tr><c:forEach var="instDate" items="${myComp.cmpDateInstSet}"><tr><td><fmt:formatDate pattern="dd-MM-yyyy" value="${instDate.cmpDateInstDate}" var="iDate" /><c:out value="${iDate}"/></td></tr></c:forEach>
                <tr><td rowspan="${fn:length(myComp.compDueoffAfhrsInstSet) + 1}">Due-off Hrs</td></tr><c:forEach var="instDOHrs" items="${myComp.compDueoffAfhrsInstSet}"><tr><td><c:out value="${instDOHrs.cdaHrs}"/></td></tr></c:forEach>
                <tr style="background-color: #fcefa1 "><td colspan="2">Component Life Details</td></tr>
                <tr><td rowspan="${fn:length(myComp.cmpCurAfhrsSet) + 1}">Current AF/Eng Hrs</td></tr><c:forEach var="curAFHrs" items="${myComp.cmpCurAfhrsSet}"><tr><td><c:out value="${curAFHrs.cmpCurAfhrsHrs}"/></td></tr></c:forEach>
                <tr><td rowspan="${fn:length(myComp.compRemLifeSet) + 1}">Remaining Life</td></tr><c:forEach var="remLifeHrs" items="${myComp.compRemLifeSet}"><tr><td><c:out value="${remLifeHrs.crlHrs}"/></td></tr></c:forEach>
                <tr><td rowspan="${fn:length(myComp.cmpRemarksSet) + 1}">Remarks</td></tr><c:forEach var="remText" items="${myComp.cmpRemarksSet}"><tr><td><c:out value="${remText.cmpRemarksText}"/></td></tr></c:forEach>
            </tbody>
        </table>
            <br/><br/>
            <a class="ui-button ui-widget ui-corner-all ui-state-default ui-button-text-only" href="javascript:history.go(-1)" onMouseOver="self.status=document.referrer;return true"><span class="ui-button-text">Back</span></a>
      </div>
      </div>
      <%@include file="footer.jsp" %>
    </body>
</html>
