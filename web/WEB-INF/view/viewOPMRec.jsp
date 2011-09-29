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
    </head>
    <body>
        <h1>Out of Phase Maintenance Records</h1>
        <%int i=1;%>
        <table border="3">
         <tr>
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Hours</th>
             <th>Calender Due Date</th><th>Interval(H/M/Y)</th><th>Time Remain (H/M/Y)</th><th>Remarks</th>   
         </tr>   
        <c:forEach var="opmSet"  items="${OPMRecSet}">
        <tr>
            <td><%=i++%></td><td>${opmSet.opmNomenclature}</td><td>${opmSet.opmDueHrs}&nbsp;&nbsp;${opmSet.opmDueHrsType} [&nbsp;${opmSet.opmDueAt}&nbsp;]</td>
            <td>${opmSet.opmCalDueDate}</td>
            <td>
            <c:forEach var="myVar1" items="${opmSet.opmIntervalSet}">
                ${myVar1.opminvlHrs}&nbsp;${myVar1.opminvlHrsType}<br/>
            </c:forEach>
            </td>
            <td>
            <c:forEach var="myVar2" items="${opmSet.opmTimeRemSet}">
                ${myVar2.opmtrHrs}&nbsp;${myVar2.opmtrHrsType}<br/>
            </c:forEach>
            </td>
            <td>    
            <c:forEach var="myVar3" items="${opmSet.opmRemarksSet}">
                ${myVar3.opmremText}<br/>
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
        <li><a href="/AirDynasty/addOPMRec.jsp">Add New Record</a></li>
    </ul>
        
    </body>
</html>
