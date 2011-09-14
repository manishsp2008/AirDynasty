<%-- 
    Document   : viewcraft
    Created on : Sep 14, 2011, 2:22:35 PM
    Author     : A187252
--%>

<%@page import="java.util.Calendar"%>
<%@page import="airdynasty.CmpSerialNumber"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.Collection"%>
<%@page import="airdynasty.Components"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Air Craft Details</title>
    </head>
    <body>
        <h1>${craftObj.acName}</h1>
        
        <ol>
            <li>Form Number : ${craftObj.acFormnum}</li>
            <li>Date : <%= Calendar.getInstance().getTime() %></li>
            <li>AirFrame Hours : ${craftObj.acAfhrs}</li>
            <li>Engine Hours : ${craftObj.acEnghrs}</li>
            <li>Landing Count : ${craftObj.acLandingcount}</li>
            <li>Start Count : ${craftObj.acStartcount}</li>
            <li>Engine Ng. Cycs. : ${craftObj.acEngngcycs}</li>
            <li>Np. Cycs. : ${craftObj.acNpcycs}</li>
        </ol>

        <h3>Components</h3>
        <table border="3">
        <tr><th>Sr. No.</th><th>Component Name</th><th>Part No.</th><th>Serial No.</th><th>Finite Life(TBO)</th>
        <th>Life Remaining (Installation)</th><th>Installation Air Frame Hours</th><th>Installation Date</th>
        <th>Installation Due Off Hours</th><th>Current Air Frame Hours</th><th>Remaining Life Hours</th>
        <th>Remarks</th></tr>
        <c:forEach var="comp" items="${craftComps}">
        
        <tr><td>1. </td><td>${comp.compPartname}</td><td>${comp.compPartnum}</td>
            <td>
                <c:forEach var="srnum" items="${comp.cmpSerialNumberCollection}">
                    <c:out  value="${srnum.serialnumValue}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="ftlife" items="${comp.cmpFinitelifeCollection}">
                    <c:out  value="${ftlife.cmpFinitelifeHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="lreminst" items="${comp.cmpLiferemInstCollection}">
                    <c:out  value="${lreminst.cmplifeRemHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="iafhrs" items="${comp.cmpAfhrsInstCollection}">
                    <c:out  value="${iafhrs.cmpAfhrsInstHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="insdate" items="${comp.cmpDateInstCollection}">
                    <c:out  value="${insdate.cmpDateInstDate}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="insdhrs" items="${comp.compDueoffAfhrsInstCollection}">
                    <c:out  value="${insdhrs.cdaHrs}" /><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="crafhrs" items="${comp.cmpCurAfhrsCollection}">
                    <c:out  value="${crafhrs.cmpCurAfhrsHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="rlhrs" items="${comp.compRemLifeCollection}">
                    <c:out  value="${rlhrs.crlHrs}"/><br/>
                </c:forEach>
            </td>
            <td>
                <c:forEach var="remark" items="${comp.cmpRemarksCollection}">
                    <c:out  value="${remark.cmpRemarksText}"/><br/>
                </c:forEach>
            </td>
        </tr>
        </c:forEach>
        
        </table>
       
    </body>
</html>
