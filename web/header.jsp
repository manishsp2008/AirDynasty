<div id="header">
     <div id="headerTopBar" >
        <div id="headerLinks">
            Link1 | Link2 | Link3
        </div>
         <div id="headerLoginBar">
            Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!
            &nbsp;( <shiro:user><a href="<c:url value="/logout.jsp"/>">Log out</a></shiro:user>
            <shiro:guest><a href="<c:url value="/login.jsp"/>">Log in</a></shiro:guest> )
        </div>
        
    </div>
    <div id="headerMainBar" >
        
        <div id="headerImage">
            <div id="headerImageBox"></div>
        </div>
        <div id="headerClock">
            Put Something Good Here.
        </div>
        <div id="headerTitle">
            Aircraft Management System
        </div>
        
    </div>
</div>