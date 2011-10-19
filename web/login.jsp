<%@ include file="include.jsp" %>

<html>
<head>
    
<%@include file="includeS.jsp" %>
</head>
<body>

<div id="wrap">
<%@include file="header.jsp" %>

<div id="dt_example" >

<h1>Log In</h1>
<div class="ui-widget" >

    <div style="padding: 20px; margin: 50px auto; width: 400px;" class="ui-state-highlight ui-corner-all"> 
	
<form name="loginform" action="" method="post">
    <table  border="0" cellspacing="0" cellpadding="3" style="margin : 0 auto;">
        <tr style="height: 35px">
            <td>Username &nbsp;&nbsp; </td>
            <td><input type="text" name="username" maxlength="30"/></td>
        </tr>
        <tr style="height: 35px">
            <td>Password &nbsp;&nbsp; </td>
            <td><input type="password" name="password" maxlength="30"/></td>
        </tr>
        <tr style="height: 35px">
            <td colspan="2" align="left"><p><input type="checkbox" name="rememberMe"/><font size="2">&nbsp;&nbsp;Remember Me</font></p></td>
        </tr>
        <tr style="height: 35px">
            <td colspan="2" align="right">
                 <input class="ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only" type="submit" role="button" value="Login"/>
            </td>
        </tr>
    </table>
</form>

    </div>
</div>

</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
