<%-- 
    Document   : viewOPMRec
    Created on : Sep 20, 2011, 5:00:54 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Out of Phase Maintenance records</title>
        <%@include file="includeS.jsp" %>
    </head>
     <body id="dt_example">
        <h1>Out of Phase Maintenance Records</h1>
        <%int i=1;%>
        <table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
            <thead>
         <tr class="gradeA">
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Hours</th>
             <th>Calender Due Date</th><th>Interval(H/M/Y)</th><th>Time Remain (H/M/Y)</th><th>Remarks</th>   
         </tr>
            </thead>
            <tbody>
        <c:forEach var="opmSet"  items="${OPMRecSet}">
        <tr class="gradeA">
            <td class="center"><%=i++%></td><td class="center">${opmSet.opmNomenclature}</td><td class="center">${opmSet.opmDueHrs}&nbsp;&nbsp;${opmSet.opmDueHrsType} [&nbsp;${opmSet.opmDueAt}&nbsp;]</td>
            <td class="center">${opmSet.opmCalDueDate}</td>
            <td class="center">
            <c:forEach var="myVar1" items="${opmSet.opmIntervalSet}">
                ${myVar1.opminvlHrs}&nbsp;${myVar1.opminvlHrsType}<br/>
            </c:forEach>
            </td>
            <td class="center">
            <c:forEach var="myVar2" items="${opmSet.opmTimeRemSet}">
                ${myVar2.opmtrHrs}&nbsp;${myVar2.opmtrHrsType}<br/>
            </c:forEach>
            </td>
            <td class="center">    
            <c:forEach var="myVar3" items="${opmSet.opmRemarksSet}">
                ${myVar3.opmremText}<br/>
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
        <li><a href="/AirDynasty/addOPMRec.jsp">Add New Record</a></li>
    </ul>
        
    </body>
</html>
