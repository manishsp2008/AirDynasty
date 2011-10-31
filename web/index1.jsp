<%-- 
    Document   : index
    Created on : Sep 13, 2011, 11:21:29 PM
    Author     : Dell
--%>

<%@page import="airdynasty.utils.AirFrameLogic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty</title>
        <%@include file="includeS.jsp" %>
    </head>
      <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >

        <h1>Air Craft Management System</h1>
            
        <a href="/AirDynasty/viewCraftList" class="ui-button ui-widget ui-state-default ui-button-text-only" role="button" alt="View Aircrafts registered in system." ><span class="ui-button-text">View Aircrafts</span></a>
        <% AirFrameLogic afcObj = new AirFrameLogic(); %>
        <h2> Alert Panel </h2>
        <table border="1" >
            <thead><tr><td>Component Name</td><td>Component Number</td><td>Component Due at Inst</td><td>Component Remaining Life</td></tr></thead>
            <c:forEach var="comp" items="<%=afcObj.getAlertPanelData()%>">
                
                <tbody><tr><td>${comp.compPartname}</td><td>${comp.compPartnum}</td><td></td><td></td></tr></tbody>
                
                
            </c:forEach>
        </table>
        
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
