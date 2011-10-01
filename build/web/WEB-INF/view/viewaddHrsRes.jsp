<%-- 
    Document   : viewaddHrsRes
    Created on : Sep 15, 2011, 1:56:28 PM
    Author     : A187252
--%>
<%@page import="java.util.Calendar"%>
<%@page import="airdynasty.CmpSerialNumber"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="airdynasty.Components"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Add Hours Result Confirmation</title>
        <%@include file="includeS.jsp" %>
    </head>
    <body>
        <h1>Status after adding Air Frame hours.</h1>
        <% int i = 1;%>
        <table border="3">
        <tr><th>Sr. No.</th><th>Component Name</th><th>Part No.</th><th>Due-Off Installation hours(AF Hrs.)</th>
        <th>Current Air Craft Hours(User Input)</th><th>Remaining Life Hours</th><th>Remarks</th></tr>
        <c:forEach var="comp" items="${tempCompSet}">
        
        <tr><td><%= i++ %> </td><td>${comp.compPartname}</td><td>${comp.compPartnum}</td>
            
            <td>
                <c:forEach var="insdhrs" items="${comp.compDueoffAfhrsInstSet}">
                    <c:out  value="${insdhrs.cdaHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="crHrs" items="${comp.cmpCurAfhrsSet}">
                    <c:out value="${crHrs.cmpCurAfhrsHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="rlHrs" items="${comp.compRemLifeSet}">
                    <c:out value="${rlHrs.crlHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="rmText" items="${comp.cmpRemarksSet}">
                    <c:out value="${rmText.cmpRemarksText}"/><br/>
                </c:forEach>
            </td>
        </tr>
        </c:forEach>
        </table>
        
        <br/><br/><br/>
        <a href="/AirDynasty/updateCraftHRS">Confirm & Update</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/AirDynasty/viewCraftList"> Go Back</a>
        
    </body>
</html>
