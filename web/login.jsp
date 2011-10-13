<%@ include file="include.jsp" %>

<html>
<head>
    
<%@include file="includeS.jsp" %>
</head>
<body>

<div id="wrap">
<%@include file="header.jsp" %>

<div id="dt_example" >

<h1>Log in</h1>

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
            <td colspan="2" align="right"><input type="submit" name="submit" value="Login"></td>
        </tr>
    </table>
</form>


</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
