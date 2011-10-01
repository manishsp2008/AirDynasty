<%-- 
    Document   : viewOAFCIntvl
    Created on : Sep 20, 2011, 4:15:00 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Oil and Fuel Change Interval Record status</title>
        <%@include file="includeS.jsp" %>
    </head>
    <body>
        <h1>Oil and Fuel Change Interval Records</h1>
        <%int i=1;%>
        <table border="3">
         <tr>
             <th>Sr. No.</th><th>Nomenclature</th><th>Specifications</th><th>Interval(Hrs/Years)</th>
             <th>Due At</th><th>Time Remained(Hrs or Date)</th><th>Remarks</th>   
         </tr>   
        <c:forEach var="oafciSet" items="${OAFCIntvlSet}">
        <tr>
            <td><%=i++%></td><td>${oafciSet.oafciNomenclature}</td><td>${oafciSet.oafciSpecs}</td>
            <td>
            <c:forEach var="myVar1" items="${oafciSet.oafciIntervalSet}">
                ${myVar1.oafcinvlHrs}&nbsp;${myVar1.oafcinvlHrsType}<br/>
            </c:forEach>
            </td>
            <td>
            <c:forEach var="myVar2" items="${oafciSet.oafciDueAtHrsSet}">
                ${myVar2.oanfDahHrs}&nbsp;${myVar2.oanfdahHrsType}<br/>
            </c:forEach>
            </td>
            <td>    
            <c:forEach var="myVar3" items="${oafciSet.oafciDueHrsSet}">
                ${myVar3.oafdhHrs}&nbsp;${myVar3.oafdhHrsType}<br/>
            </c:forEach>
            </td>
            <td>    
            <c:forEach var="myVar4" items="${oafciSet.oafciRemarksSet}">
                ${myVar4.oafremText}<br/>
            </c:forEach>
            </td>
        </tr>
        </c:forEach>
    </table>
    <ul>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
        <li><a href="/AirDynasty/addOAFCIRec.jsp">Add New Record</a></li>
    </ul>
    
        
    </body>
</html>
