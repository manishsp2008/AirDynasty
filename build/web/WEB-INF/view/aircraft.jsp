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
        <%@include file="includeS.jsp" %>
    </head>
      <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >
        <h1>Air Crafts List</h1>
        <h2>Air Craft-{9N-AEX}</h2>
        <ul>
                <c:forEach var="craft" items="${aircrafts}">
                <li>
                    <a href="<c:url value="viewCraft?${craft.acId}"/>">${craft.acName}&nbsp;(${craft.acSerialnum})</a>
                </li>
                </c:forEach>
        </ul>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
