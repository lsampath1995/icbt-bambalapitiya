
<%@page import="org.icbt.web.project.WebHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        
        <%
            if (WebHelper.authenticate(request.getCookies(), session) == null) {
                WebHelper.redirectToLogin(response);
            }
        %>
        
        <h1>Welcome to profile page!</h1>
    </body>
</html>
