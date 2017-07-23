<%-- 
    Document   : register
    Created on : 12 Jul, 2017, 10:16:46 PM
    Author     : Puneet
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="styles.css">
       
        <script type="text/javascript" src="script.js"></script>
        <title>Successfully Registered</title>
        
    </head>
    <body>
       <div class="container">
           <div class="login">
               <h1>You have successfully registered..!</h1>
              <div class="user"> 
               <h5>Your username : ${username}</h5>
               <h5>Your password: ${password}</h5>
              </div>
               <input type="button" class="button" value="Login" id="submit" onclick="login();"><br>
           
           </div>    
       </div>
       <script type="text/javascript">
           function login()
           {
            window.location("index.html");
           }
       </script> 
    </body>
</html>
