
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="login.css">
        <title>Login Page</title>
    </head>
    <body background="back.png">
        <div align="center">
           <form action="home.jsp" method="post">
            <br><br><br><img src="cardiff.png">
            <br><br><br><br><img src="user.png" class="img2">
            <br><br><label for="username">Username :</label>
            <input type="text" id="lusername" name="username" class="login" value="" placeholder="Enter your username" required><br><br>
            <br><label for="password">Password :</label>
            <input type="password" id="lpassword" name="password" class="login" value="" placeholder="Enter your password" required><br><br>
            <br><input type="submit" value="Login" class="login"><br>
           </form>
        </div>
    </body>
</html>
