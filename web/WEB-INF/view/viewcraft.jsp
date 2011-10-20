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
    
    <body>
        <div id="wrap">
        <%@include file="header.jsp" %>
        <div id="dt_example" >
     
        <h1>Aircraft Details Page</h1>
        
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
        
        <h2>Components</h2>
        <%int i=1;%>
        <table cellpadding="0" cellspacing="0" border="0" class="display" id="example">
        <thead>
        <tr class="gradeA"><th>Sr. No.</th><th>Component Name</th><th>Part No.</th><th>Serial No.</th><th>Finite Life(TBO)</th>
        <th>Life Remaining (Installation)</th><th>Installation Air Frame Hours</th><th>Installation Date</th>
        <th>Installation Due Off Hours</th><th>Current Air Frame Hours</th><th>Remaining Life Hours</th>
        <th>Remarks</th></tr>
        </thead>
        <tbody>
        <c:forEach var="comp" items="${craftComps}" >
            
        <tr class="gradeA"><td class="center"><%=i++%></td><td class="center">${comp.compPartname}</td><td class="center">${comp.compPartnum}</td>
            <td class="center">
                <select>
                <c:forEach var="srnum" items="${comp.cmpSerialNumberSet}">
                    <option><c:out  value="${srnum.serialnumValue}"/></option>
                </c:forEach>
                </select>
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
        <h3>Related Operations</h3>
        
        <table style="margin : 0 auto;">
            <tr>
                <td style="width: 25%;text-align: center">
                    <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/viewEngInspec' ">
                        <span class="ui-button-text">A/F & Engine IR</span>
                    </button>
                </td>   
                <td style="width: 25%; text-align: center">
                    <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/viewOAFCIntvl' ">
                        <span class="ui-button-text">Oil & Fuel CR</span>
                    </button>
                </td>
                <td style="width: 25%; text-align: center">
                    <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/viewOPMRec' ">
                        <span class="ui-button-text">Out of Phase MR</span>
                    </button>
                </td>
            </tr>
        </table>
       
        <h3>Manipulate Component Records</h3>

       <table style="margin : 0 auto;">
            <tr>
                <td style="width: 25%; text-align: left">            
                <c:choose>
                    <c:when test="${acID % 2 == 0}">
                        <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/addEngHrs.jsp' ">
                            <span class="ui-button-text">Add Engine Hours</span>
                        </button>
                    </c:when> 
                    <c:otherwise>
                        <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/addHours.jsp' ">
                            <span class="ui-button-text">Add Aircraft Hours</span>
                        </button>
                    </c:otherwise>
                </c:choose>
                </td>
                <td style="width: 25%;text-align: center">
                    <button id="viewEIR" class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" onclick="window.location='/AirDynasty/addCmpRec.jsp' ">
                            <span class="ui-button-text">Add Component Record</span>
                    </button>
                </td>
            </tr>
        </table>
        </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
