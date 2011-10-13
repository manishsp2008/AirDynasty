
<%@ include file="include.jsp" %>
<%
    /*
      NOTE:  In a web application using 'rememberMe'
      services via Cookies, always make sure you
      call subject.login() and subject.logout()
      _before_ any output is rendered to the
      corresponding request/response.

      Detailed description:

      When a user logs out, any 'rememberMe' identity
      should always be cleared.  In a web application,
      Shiro uses a cipher-encrypted Cookie to
      remember a user's identity by default, and it will
      automatically delete the Cookie upon a logout.

      But deleting a Cookie is actually performed by
      overwriting it with a new one with the same name
      and a 'maxAge' of 0.  And because Cookies are
      sent out in the HTTP Header, the Cookie must be
      deleted (overwritten) _before_ any HTML output
      is rendered.

      This means the following logout() call must
      execute before the page is rendered, so we make
      that call here at the very beginning of the file.

      In proper MVC applications, the following logout()
      call _should_ be in a Controller, never a JSP page.
      But since this is a Quickstart app with minimal
      libraries (no MVC frameworks), we do it here in
      the page itself - but we would never do this if
      writing a 'real' application.
    */

    SecurityUtils.getSubject().logout();
%>
<html>
<head>
    <%@include file="includeS.jsp" %>
</head>

<body>
<div id="wrap">
    
<%@include file="header.jsp" %>

<div id="dt_example" >

<h1>Log out</h1>

<p>You have successfully logged out. <a href="<c:url value="/home.jsp"/>">Return to the home page.</a></p>
</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
