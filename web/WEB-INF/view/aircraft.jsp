<%-- 
    Document   : aircraft.jsp
    Created on : Sep 14, 2011, 12:14:58 AM
    Author     : Dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
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
        
        <c:forEach var="craft" items="${aircrafts}">
            <c:choose>
                <c:when test="${craft.acId % 2 == 0}">
                    <a href="<c:url value="viewCraft?${craft.acId}"/>" class="ui-button ui-widget ui-state-default  ui-button-text-only" role="button" ><span class="ui-button-text">AF Engine ${craft.acName}&nbsp;(${craft.acSerialnum})</span></a><br/>
                </c:when> 
                <c:otherwise>
                    <div id="CraftTitle">${craft.acName} </div>  
                    <a href="<c:url value="viewCraft?${craft.acId}" />" class="ui-button ui-widget ui-state-default ui-button-text-only" role="button"><span class="ui-button-text">Aircraft  ${craft.acName}</span></a><br/>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        
</div>

</div>
<%@include file="footer.jsp" %>
</body>
</html>
