<%-- 
    Document   : viewOAFCIntvl
    Created on : Sep 20, 2011, 4:15:00 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Oil and Fuel Change Interval Record status</title>
        <%@include file="includeS.jsp" %>
    </head>
      <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >
        <h1>Oil and Fuel Change Interval Records</h1>
        <%int i=1;%>
        
     <fmt:formatDate pattern="dd-MM-yyyy" value="<%= Calendar.getInstance().getTime() %>" var="sysDate" />
     <div class="ui-widget" >
         <div style="margin-top: 20px; padding: 0pt 0.7em;" class="ui-state-highlight ui-corner-all"> 
            <div id="myContainer">
                <div id="row">
                    <div id="left1">
                    <p>Form Number : ${craftObj.acFormnum}</p>
                    <p>&nbsp;</p>
                    <p>AirFrame Hours : ${craftObj.acAfhrs}</p>
                    </div>
                    <div id="left2">
                    <p>Landing Count : ${craftObj.acLandingcount}</p>
                    <p>&nbsp;</p>
                    <p>Engine N/G Cycles : ${craftObj.acEngngcycs}</p>
                    </div>
                    <div id="middle">
                    <p>Date : <c:out value="${sysDate}"/></p>
                    <p>&nbsp;</p>
                    <p>Engine Hours : ${craftObj.acEnghrs}</p>
                    </div>
                    <div id="right">
                    <p>Start Count : ${craftObj.acStartcount}</p>
                    <p>&nbsp;</p>
                    <p>Engine N/P Cycles : ${craftObj.acNpcycs}</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
        <h2>Records</h2>                    
        <table cellpadding="0" cellspacing="0" border="0" class="display" id="example"> 
            <thead>
         <tr class="gradeA">
             <th>Sr. No.</th><th>Nomenclature</th><th>Specifications</th><th>Interval(Hrs/Years)</th>
             <th>Due At</th><th>Time Remained(Hrs or Date)</th><th>Remarks</th>   
         </tr>
            </thead>
            <tbody>
        <c:forEach var="oafciSet" items="${OAFCIntvlSet}">
            
        <c:set var="oinvList" value="${oafciSet.oafciIntervalArray}"  />
        <c:set var="odahList" value="${oafciSet.oafciDueAtHrsArray}" />
        <c:set var="odhList" value="${oafciSet.oafciDueHrsArray}" />
        <c:set var="ormList" value="${oafciSet.oafciRemarksArray}" />
            
        <c:forEach varStatus="loop" items="${oinvList}" >
            <tr class="gradeA" onclick="window.location='/AirDynasty/viewOFCR?${oafciSet.oafciId}'">
            <td class="center"><%=i++%></td><td class="center">${oafciSet.oafciNomenclature}</td><td class="center">${oafciSet.oafciSpecs}</td>
            <td class="center">
                <c:out value="${oinvList[loop.index]}" />
            </td>
            <td class="center">
                <c:out value="${odahList[loop.index]}" />
            </td>
            <td class="center">    
                <c:out value="${odhList[loop.index]}" />
            </td>
            <td class="center">    
                <c:out value="${ormList[loop.index]}" />
            </td>
            </tr>
        </c:forEach>
        </c:forEach>
            </tbody>
    </table>
    <ul>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
        <li><a href="/AirDynasty/addOAFCIRec.jsp">Add New Record</a></li>
    </ul>
    
        
   </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
