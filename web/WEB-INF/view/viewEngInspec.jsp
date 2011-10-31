<%-- 
    Document   : viewEngInsp
    Created on : Sep 20, 2011, 3:25:33 PM
    Author     : A187252
--%>

<%@ include file="include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Air Frame and Engine Inspection Records </title>
        <%@include file="includeS.jsp" %>
    </head>
      <body>
<div id="wrap">
  <%@include file="header.jsp" %>
<div id="dt_example" >
     <h1>Air Frame and Engine Inspection Records</h1>
     <%int i=1;%>
     
     <div id="CraftTitle">
        ${craftObj.acName}
     </div>
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
             <th>Sr. No.</th><th>Nomenclature</th><th>Due Air Frame Hrs.</th><th>Due Engine Hrs.</th>
             <th>Calender Due Date</th><th>Time Remained(Hrs or Date)</th>   
        </tr> </thead>
        <tbody>
        <c:forEach var="eiSet" items="${EngInspSet}">
            <tr class="gradeA" onclick="window.location='/AirDynasty/viewEIR?${eiSet.aesId}'">
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
   </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
