<%-- 
    Document   : main_page
    Created on : 25 mai 2016, 15:16:12
    Author     : kuungfu-sheep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" />
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <a id="MainTitle" href="accueil">Nougatine</a>
            <sub id="PunchLine">Sweet bet for your wallet</sub>
            <div id="ButtonsHeader">
                <jsp:include page="buttons_header.jsp">
                    <jsp:param name="state" value="logoff"/>
                </jsp:include>
            </div>
        </header>
        
        <div id="Content">
            <jsp:include page="${page}.jsp"/>
        </div>
    </body>
</html>
