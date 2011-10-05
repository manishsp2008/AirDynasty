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
</head>
<body>
<div id="wrap">
    
<div id="header">
     <div id="headerTopBar" class="ui-corner-top">
        <div id="headerLinks">
            Header links
        </div>
        <div id="headerLoginBar">
            Header User Info    
        </div>
    </div>
    <div id="headerMainBar" class="ui-corner-bottom">
        <img src="images/logo.jpg" id="headerImage" />
        <div id="headerTitle">
            Aircraft Management System
        </div>
    </div>
</div>
<div id="dt_example" class="ui-corner-all">
<h1>Air Craft Management System</h1>

<p>Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!
    ( <shiro:user><a href="<c:url value="/logout.jsp"/>">Log out</a></shiro:user>
    <shiro:guest><a href="<c:url value="/login.jsp"/>">Log in</a></shiro:guest> )
</p>

<p>Welcome to the air Dynasty ACMS. This page represents the home page of web application.</p>

<shiro:user><p>Visit Application <a href="<c:url value="/index1.jsp"/>">Main Page</a>.</p></shiro:user>

<h2> Craft Panel Demo </h2>
<!--
<div id="craftPanel">
    <div id="firstRow">
        <div id="cell1">
            Form Name : Will be Here.
        </div>
        <div id="cell2">
            AirCraft Name : Will be Here.
        </div>
        <div id="cell3">
            Date : Will be Here.
        </div>
    </div>
    <br/><br/>
     <div id="firstRow">
        <div id="cell1">
            A/F Hours : Will be Here.
        </div>
        <div id="cell3">
            Engine Hours : Will be Here.
        </div>
    </div>
    <br/><br/>
     <div id="firstRow">
        <div id="cell1">
            Landing Count : Will be Here.
        </div>
        <div id="cell3">
            Start Count : Will be Here.
        </div>
    </div>
</div>

</div>
-->

<div id="container">
  <div id="left">
      Form Number
  </div>
  <div id="middle">
      Title
  </div>
  <div id="right">
      Date
  </div>
</div>

</div>

<div id="footer" class="ui-corner-top">
    Footer Bar
</div>

</body>
</html>
