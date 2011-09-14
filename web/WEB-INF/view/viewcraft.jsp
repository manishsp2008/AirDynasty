<%-- 
    Document   : viewcraft
    Created on : Sep 14, 2011, 2:22:35 PM
    Author     : A187252
--%>

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
            <li>Date : </li>
            <li>AirFrame Hours : ${craftObj.acAfhrs}</li>
            <li>Engine Hours : ${craftObj.acEnghrs}</li>
            <li>Landing Count : ${craftObj.acLandingcount}</li>
            <li>Start Count : ${craftObj.acStartcount}</li>
            <li>Engine Ng. Cycs. : ${craftObj.acEngngcycs}</li>
            <li>Np. Cycs. : ${craftObj.acNpcycs}</li>
        </ol>

        <h3>Components</h3>
        <table border="1">
        <tr><td>Sr. No.</td><td>Component Name</td><td>Part No.</td><td>Serial No.</td><td>Finite Life(TBO)</td>
        <td>Life Remaining (Installation)</td><td>Installation Air Frame Hours</td><td>Installation Date</td>
        <td>Installation Due Off Hours</td><td>Current Air Frame Hours</td><td>Remaining Life Hours</td>
        <td>Remarks</td></tr>
        <c:forEach var="comp" items="${craftComps}">
        
        <tr><td>1. </td><td>${comp.compPartname}</td><td>${comp.compPartnum}</td>
            <td><c:forEach var="Eachcomp" items="${craftcomps}">
                    
                    <c:forEach var="srnum" items="${Eachcomp.CmpSerialNumberCollection}">
                       <tr>${srnum.serialnumValue}</tr>
                    </c:forEach>
                </c:forEach>    
            </td>
        
        </tr>
        </c:forEach>
        
        </table>
		
    </body>
</html>
