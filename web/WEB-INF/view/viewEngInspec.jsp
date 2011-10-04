<%-- 
    Document   : viewEngInsp
    Created on : Sep 20, 2011, 3:25:33 PM
    Author     : A187252
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Air Frame and Engine Inspection Records </title>
        <%@include file="includeS.jsp" %>
    </head>
      <body id="dt_example">
        <h1>Air Frame and Engine Inspection records</h1>
        <%int i=1;%>
    <table cellpadding="0" cellspacing="0" border="0" class="display" id="example"> 
        <thead> 
        <tr class="gradeA">
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Air Frame Hrs.</th><th>Due Engine Hrs.</th>
             <th>Calender Due Date</th><th>Time Remained(Hrs or Date)</th>   
        </tr> </thead>
        <tbody>
        <c:forEach var="eiSet" items="${EngInspSet}">
        <tr class="gradeA">
            <td class="center"><%=i++%></td><td class="center">${eiSet.aesNomenclature}</td><td class="center">${eiSet.aesDueAfHrs}</td>
            <td class="center">${eiSet.aesDueEngHrs}</td><td class="center">${eiSet.aesCalDueDate}</td><td class="center">${eiSet.aesDueTime}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <ul>
        <li><a href="/AirDynasty/addEIRec.jsp">Add New Record</a></li>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
    </ul>
    </body>
</html>
