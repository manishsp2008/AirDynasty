<%-- 
    Document   : viewcraft
    Created on : Sep 14, 2011, 2:22:35 PM
    Author     : A187252
--%>

<%@ include file="include.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Air Dynasty - Air Craft Details</title>
        <%@include file="includeS.jsp" %>
    </head>
    
    <body id="dt_example">
        <h1>${craftObj.acName}</h1>
        
        <ol>
            <li>Form Number : ${craftObj.acFormnum}</li>
            <fmt:formatDate pattern="dd-MM-yyyy" value="<%= Calendar.getInstance().getTime() %>" var="sysDate" />
            <li>Date : <c:out  value="${sysDate}"/><br/> </li>
            <li>AirFrame Hours : ${craftObj.acAfhrs}</li>
            <li>Engine Hours : ${craftObj.acEnghrs}</li>
            <li>Landing Count : ${craftObj.acLandingcount}</li>
            <li>Start Count : ${craftObj.acStartcount}</li>
            <li>Engine NG Cycles : ${craftObj.acEngngcycs}</li>
            <li>Engine NP Cycles : ${craftObj.acNpcycs}</li>
        </ol>
        <h3>Components</h3>
        <%int i=1;%>
        <table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
        <thead>
        <tr><th>Sr. No.</th><th>Component Name</th><th>Part No.</th><th>Serial No.</th><th>Finite Life(TBO)</th>
        <th>Life Remaining (Installation)</th><th>Installation Air Frame Hours</th><th>Installation Date</th>
        <th>Installation Due Off Hours</th><th>Current Air Frame Hours</th><th>Remaining Life Hours</th>
        <th>Remarks</th></tr>
        </thead>
        <tbody>
        <c:forEach var="comp" items="${craftComps}">
        
        <tr class="gradeA"><td class="center"><%=i++%></td><td class="center">${comp.compPartname}</td><td class="center">${comp.compPartnum}</td>
            <td class="center">
                <c:forEach var="srnum" items="${comp.cmpSerialNumberSet}">
                    <c:out  value="${srnum.serialnumValue}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="ftlife" items="${comp.cmpFinitelifeSet}">
                    <c:out  value="${ftlife.cmpFinitelifeHrs}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="lreminst" items="${comp.cmpLiferemInstSet}">
                    <c:out  value="${lreminst.cmplifeRemHrs}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="iafhrs" items="${comp.cmpAfhrsInstSet}">
                    <c:out  value="${iafhrs.cmpAfhrsInstHrs}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="insdate" items="${comp.cmpDateInstSet}">
                    <fmt:formatDate pattern="dd-MM-yyyy" value="${insdate.cmpDateInstDate}" var="fmtDate" />
                    <c:out  value="${fmtDate}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="insdhrs" items="${comp.compDueoffAfhrsInstSet}">
                    <c:out  value="${insdhrs.cdaHrs}" /><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="crafhrs" items="${comp.cmpCurAfhrsSet}">
                    <c:out  value="${crafhrs.cmpCurAfhrsHrs}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="rlhrs" items="${comp.compRemLifeSet}">
                    <c:out  value="${rlhrs.crlHrs}"/><br/>
                </c:forEach>
            </td>
            <td class="center">
                <c:forEach var="remark" items="${comp.cmpRemarksSet}">
                    <c:out  value="${remark.cmpRemarksText}"/><br/>
                </c:forEach>
            </td>
        </tr>
        </c:forEach>
        </tbody>
        </table>
        <br/>
        <h4>Related Operations</h4>
        <ul>
            <c:choose>
                <c:when test="${acID % 2 == 0}">
                    <li><a href="/AirDynasty/addEngHrs.jsp">Add Engine Hours</a></li>
                </c:when> 
                <c:otherwise>
                    <li><a href="/AirDynasty/addHours.jsp">Add Air Craft Hours</a></li>
                </c:otherwise>
            </c:choose>
            <li><a href="/AirDynasty/viewEngInspec">View A/f & Engine Inspection Records</a></li>
            <li><a href="/AirDynasty/viewOAFCIntvl">Oil and Fuel Change Records</a></li>
            <li><a href="/AirDynasty/viewOPMRec">Out of Phase Maintenance Records</a></li>
        </ul>
        <h4>Manipulate Component Records</h4>
        <ul>
            <li><a href="/AirDynasty/addCmpRec.jsp">Add Component Record</a></li>
        </ul>
        <h1> Test Area </h1>
        <div class="ui-widget">
            <div class="ui-state-highlight ui-corner-all" style="margin-top: 20px; padding: 0 .7em;"> 
                    <p><span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em;"></span>
                    <strong>Hey!</strong> Sample ui-state-highlight style.</p>
            </div>
        </div>   
    </body>
</html>
