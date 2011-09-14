<%-- 
    Document   : aircraft.jsp
    Created on : Sep 14, 2011, 12:14:58 AM
    Author     : Dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Air Craft Details Page</title>
    </head>
    <body>
        <h2>List of Air Crafts</h2>
        <ol>
            <li>
                <c:forEach var="craft" items="${aircrafts}">
                    <a href="<c:url value="viewCraft?${craft.acId}"/>">${craft.acName}&nbsp;(${craft.acSerialnum})</a>
                </c:forEach>
            </li>
        </ol>
    </body>
</html>
