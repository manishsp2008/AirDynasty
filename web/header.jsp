<div id="header" class="ui-corner-bottom">
     <div id="headerTopBar" class="ui-corner-bottom"  >
        <div id="headerLinks">
            Link1 | Link2 | Link3
        </div>
         <div id="headerLoginBar">
            Hi, <shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>!
            &nbsp;( <shiro:user><a href="<c:url value="/logout.jsp"/>">Log out</a></shiro:user>
            <shiro:guest><a href="<c:url value="/login.jsp"/>">Log in</a></shiro:guest> )
        </div>
        
    </div>
    <div id="headerMainBar" class="ui-corner-bottom" >
        
        <div id="headerImage">
            <div id="headerImageBox"></div>
        </div>
        <div id="headerClock">
            <div id="fancyClock">
            </div>
        </div>
        <div id="headerTitle">
            <div id="headerTitleBox">
            Aircraft Management System
            </div>
        </div>
        
    </div>
</div>