<%--
  ~ Licensed to the Apache Software Foundation (ASF) under one
  ~ or more contributor license agreements.  See the NOTICE file
  ~ distributed with this work for additional information
  ~ regarding copyright ownership.  The ASF licenses this file
  ~ to you under the Apache License, Version 2.0 (the
  ~ "License"); you may not use this file except in compliance
  ~ with the License.  You may obtain a copy of the License at
  ~
  ~     http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing,
  ~ software distributed under the License is distributed on an
  ~ "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
  ~ KIND, either express or implied.  See the License for the
  ~ specific language governing permissions and limitations
  ~ under the License.
  --%>
<%@ include file="include.jsp" %>

<html>
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/style.css"/>"/>
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

<div id="dt_example" class="ui-corner-all">
<h1>Air Craft Management System</h1>
<!--
<p>Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!
    ( <shiro:user><a href="<c:url value="/logout.jsp"/>">Log out</a></shiro:user>
    <shiro:guest><a href="<c:url value="/login.jsp"/>">Log in</a></shiro:guest> )
</p>
-->
<p>Welcome to the Air-Dynasty ACMS. This page represents the home page of web application.</p>

<shiro:user><p>Visit Application <a href="<c:url value="/index1.jsp"/>">Main Page</a>.</p></shiro:user>

<h1>A Colorful Clock With CSS &amp; jQuery</h1>
 
<div id="fancyClock"></div>

    


</div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
