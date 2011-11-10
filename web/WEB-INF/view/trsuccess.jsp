<%-- 
    Document   : trsuccess
    Created on : Sep 21, 2011, 2:25:21 PM
    Author     : A187252
--%>

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
        <div style="margin-top: 20px; padding: 0 .7em;" class="ui-state-highlight ui-corner-all"> 
					<p><span style="float: left; margin-right: .3em;" class="ui-icon ui-icon-info"></span>
					Transaction Successful.
				</div>
        
        <a href="/AirDynasty/viewCraftList" style="padding: 7px;" class="ui-button ui-widget ui-state-default ui-button-text-only" >Main Page</a>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
