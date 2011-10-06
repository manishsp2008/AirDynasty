<div id="header">
     <div id="headerTopBar" class="ui-corner-top">
        <div id="headerLinks">
            Link1 | Link2 | Link3
        </div>
        <div id="headerLoginBar">
            Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!
            &nbsp;( <shiro:user><a href="<c:url value="/logout.jsp"/>">Log out</a></shiro:user>
            <shiro:guest><a href="<c:url value="/login.jsp"/>">Log in</a></shiro:guest> )
        </div>
    </div>
    <div id="headerMainBar" class="ui-corner-bottom">
        <img src="images/logo.jpg" id="headerImage" />
        <div id="headerTitle">
            Aircraft Management System
        </div>
        <div id="headerClock">
            Put Something Good Here.
        </div>
    </div>
</div>