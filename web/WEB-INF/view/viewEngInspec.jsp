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
    </head>
    <body>
        <h1>Air Frame and Engine Inspection records</h1>
        <%int i=1;%>
    <table border="3">
         <tr>
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Air Frame Hrs.</th><th>Due Engine Hrs.</th>
             <th>Calender Due Date</th><th>Time Remained(Hrs or Date)</th>   
         </tr>   
        <c:forEach var="eiSet" items="${EngInspSet}">
        <tr>
            <td><%=i++%></td><td>${eiSet.aesNomenclature}</td><td>${eiSet.aesDueAfHrs}</td>
            <td>${eiSet.aesDueEngHrs}</td><td>${eiSet.aesCalDueDate}</td><td>${eiSet.aesDueTime}</td>
        </tr>
        </c:forEach>
    </table>
    <ul>
        <li><a href="/AirDynasty/addEIRec.jsp">Add New Record</a></li>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
    </ul>
    </body>
</html>
