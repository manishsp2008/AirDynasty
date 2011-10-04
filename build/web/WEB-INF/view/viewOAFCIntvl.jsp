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
      <body id="dt_example">
        <h1>Oil and Fuel Change Interval Records</h1>
        <%int i=1;%>
        <table cellpadding="0" cellspacing="0" border="0" class="display" id="example"> 
            <thead>
         <tr class="gradeA">
             <th>Sr. No.</th><th>Nomenclature</th><th>Specifications</th><th>Interval(Hrs/Years)</th>
             <th>Due At</th><th>Time Remained(Hrs or Date)</th><th>Remarks</th>   
         </tr>
            </thead>
            <tbody>
        <c:forEach var="oafciSet" items="${OAFCIntvlSet}">
        <tr class="gradeA">
            <td class="center"><%=i++%></td><td class="center">${oafciSet.oafciNomenclature}</td><td class="center">${oafciSet.oafciSpecs}</td>
            <td class="center">
            <c:forEach var="myVar1" items="${oafciSet.oafciIntervalSet}">
                ${myVar1.oafcinvlHrs}&nbsp;${myVar1.oafcinvlHrsType}<br/>
            </c:forEach>
            </td>
            <td class="center">
            <c:forEach var="myVar2" items="${oafciSet.oafciDueAtHrsSet}">
                ${myVar2.oanfDahHrs}&nbsp;${myVar2.oanfdahHrsType}<br/>
            </c:forEach>
            </td>
            <td class="center">    
            <c:forEach var="myVar3" items="${oafciSet.oafciDueHrsSet}">
                ${myVar3.oafdhHrs}&nbsp;${myVar3.oafdhHrsType}<br/>
            </c:forEach>
            </td>
            <td class="center">    
            <c:forEach var="myVar4" items="${oafciSet.oafciRemarksSet}">
                ${myVar4.oafremText}<br/>
            </c:forEach>
            </td>
        </tr>
        </c:forEach>
            </tbody>
    </table>
    <ul>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
        <li><a href="/AirDynasty/addOAFCIRec.jsp">Add New Record</a></li>
    </ul>
    
        
    </body>
</html>
