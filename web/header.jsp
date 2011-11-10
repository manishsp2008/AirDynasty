<div id="header" class="ui-corner-bottom">
     <div id="headerTopBar" class="ui-corner-top">
        <div id="headerLinks">
            <a href="/AirDynasty/" >Home</a> &emsp; <a href="/AirDynasty/viewCraftList">Aircraft List</a> &emsp; <a href="/AirDynasty/index1.jsp">Alert Panel</a> &emsp; <a href="/AirDynasty/Help.jsp">Help</a> &emsp;
            <a href="about.jsp">About</a>
        </div>
         <div id="headerLoginBar">
            Hello,&nbsp;<shiro:guest>Guest</shiro:guest><shiro:user><shiro:principal/></shiro:user>
            &nbsp;|&nbsp;
            ( <shiro:user><a href="/AirDynasty/logout.jsp">Log out</a></shiro:user>
            <shiro:guest><a href="/AirDynasty/login.jsp">Log in</a></shiro:guest> )
        </div>
     </div>
    
     <div id="headerMainBar" class="ui-corner-bottom" >
        
        <div id="headerImage" class="ui-corner-all">
            <div id="headerImageBox" ></div>
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