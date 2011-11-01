<%-- 
    Document   : index
    Created on : Sep 13, 2011, 11:21:29 PM
    Author     : Dell
--%>

<%@page import="airdynasty.bean.ComponentUtils"%>
<%@page import="java.util.List" %>

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
        
        <% ComponentUtils cuObj = new ComponentUtils();
            Set<Components> comps = cuObj.getAPData((List<Components>)getServletContext().getAttribute("components"));
        %>
        <h2> Alert Panel </h2>
        <table cellpadding="5" cellspacing="2" class="display" id="alertTable">
            <thead><tr><td>Component Name</td><td>Component Number</td><td>Due At</td><td>Remaining Life</td><td>Remarks</td></tr></thead>
            <c:forEach var="comp" items="<%=comps%>">
                
                <c:set var="idoList" value="${comp.compDueoffAfhrsInstArray}"/>
                <c:set var="rlList" value="${comp.compRemLifeArray}"/>
                <c:set var="remList" value="${comp.cmpRemarksArray}"/>
                <c:forEach varStatus="loop" items="${idoList}" >
                    
                <tbody>
                    <tr class="gradeU" onclick="window.location='/AirDynasty/viewComponent?${comp.compId}'" >
                    <td>${comp.compPartname}</td><td>${comp.compPartnum}</td>
                    <td class="left">
                    <c:out  value="${idoList[loop.index]}" />
                    </td>
                    <td class="left">
                    <c:out value="${rlList[loop.index ]}" />
                    </td>
                    <td class="left">
                    <c:out  value="${remList[loop.index]}"/><br/>
                    </td>
                    </tr>
                </tbody>
                
                </c:forEach>
            </c:forEach>
        </table>
        
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
