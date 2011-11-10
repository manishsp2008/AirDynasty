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
     
        <h1>Aircraft Details</h1>
        
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
        <tr ><th>Sr. No.</th><th>Component Name</th><th>Part No.</th>
        <th>Due Off Hrs(Inst.)</th><th>Current A/F Hrs</th><th>Rem. Life Hrs</th>
        <th>Remarks</th></tr>
        </thead>
        <tbody>
        <c:forEach var="comp" items="${craftComps}" >
        
        <c:set var="idoList" value="${comp.compDueoffAfhrsInstArray}"/>
        <c:set var="cahList" value="${comp.cmpCurAfhrsArray}"/>
        <c:set var="rlList" value="${comp.compRemLifeArray}"/>
        <c:set var="remList" value="${comp.cmpRemarksArray}"/>
        
        <c:forEach varStatus="loop" items="${idoList}" >
            
            <tr class="gradeA" onclick="window.location='/AirDynasty/viewComponent?${comp.compId}'"><td class="center"><%=i++%></td><td class="center">${comp.compPartname}</td><td class="center">${comp.compPartnum}</td>
            
            <td class="left">
                    <c:out  value="${idoList[loop.index]}" />
            </td>
            <td class="left">
                <c:choose>
                    <c:when test="${fn:length(cahList[loop.index]) > 1}">
                        <c:out value="${cahList[loop.index]}"/>
                    </c:when>
                    <c:otherwise>
                        <c:out value="${cahList[0]}" />
                    </c:otherwise>
                </c:choose>
            </td>
            <td class="left">
                    <c:out value="${rlList[loop.index ]}" />
            </td>
            <td class="left">
                    <c:out  value="${remList[loop.index]}"/><br/>
            </td>

        </tr>
        
        </c:forEach>
        </c:forEach>
        </tbody>
        </table>
        <br/>
        <h3>Related Operations</h3>
        <c:choose><c:when test="${acID % 2 == 0}">
                <i style="margin-left: 25px;">No Related Operations Found.</i>        
        </c:when><c:otherwise>
        <table >
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
       </c:otherwise></c:choose>
        <h3>Manipulate Component Records</h3>

       <table >
            <tr>
                <td style="text-align: center;width :25%">            
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
                <td style="width: 25%;text-align: center">&nbsp;</td>
            </tr>
        </table>
        </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
