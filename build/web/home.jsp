<%@ include file="include.jsp" %>

<html>
<head>
    
    <title>Air Dynasty</title>
    <%@include file="includeS.jsp" %>
    <script type="text/javascript" src="design/jquery.tzineClock/jquery.tzineClock.js"></script>
    <script type="text/javascript" src="design/script.js"></script>
    
    <link rel="stylesheet" type="text/css" href="design/styles.css" />
    <link rel="stylesheet" type="text/css" href="design/jquery.tzineClock/jquery.tzineClock.css" />
    
    
</head>
<body>
<div id="wrap">
    
<%@include file="header.jsp" %>

<div id="dt_example" >
<h1>Air Craft Management System</h1>

<p>Welcome to the Air-Dynasty ACMS. This page represents the home page of web application.</p>

<shiro:user><p>Visit Application <a href="<c:url value="/index1.jsp"/>">Main Page</a>.</p></shiro:user>

</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
