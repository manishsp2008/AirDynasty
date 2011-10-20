<%-- 
    Document   : viewOPMRec
    Created on : Sep 20, 2011, 5:00:54 PM
    Author     : A187252
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="include.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Out of Phase Maintenance Records</title>
        <%@include file="includeS.jsp" %>
    </head>
    <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >
        <h1>Out of Phase Maintenance Records</h1>
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
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Hours</th>
             <th>Calender Due Date</th><th>Interval(H/M/Y)</th><th>Time Remain (H/M/Y)</th><th>Remarks</th>   
         </tr>
            </thead>
            <tbody>
        <c:forEach var="opmSet"  items="${OPMRecSet}">
            
            <c:set var="opinvList" value="${opmSet.opmIntervalArray}" />
            <c:set var="optrList" value="${opmSet.opmTimeRemArray}" />
            <c:set var="opremList" value="${opmSet.opmRemarksArray}" />
         <c:forEach varStatus="loop" items="opinvList">
        
         <tr class="gradeA">
            <td class="center"><%=i++%></td><td class="center">${opmSet.opmNomenclature}</td><td class="center">${opmSet.opmDueHrs}&nbsp;&nbsp;${opmSet.opmDueHrsType} [&nbsp;${opmSet.opmDueAt}&nbsp;]</td>
            
            <td class="center">${opmSet.opmCalDueDate}</td>
            
            <td class="center">
                <c:out value="${opinvList[loop.index]}" />
            </td>
            <td class="center">
                <c:out value="${optrList[loop.index]}" />
            </td>
            <td class="center">    
                <c:out value="${opremList[loop.index]}" />
            </td>
        </tr>
        
        </c:forEach>
        </c:forEach>
            </tbody>
    </table>
    <ul>
        <li><a href="/AirDynasty/viewCraftList">Back to AirCraft List</a></li>
        <li><a href="/AirDynasty/addOPMRec.jsp">Add New Record</a></li>
    </ul>
        
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
