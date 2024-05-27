<%-- 
    Document   : adminlogin
    Created on : May 27, 2024, 1:21:50 AM
    Author     : Ahmed Mohamed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
                <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
   
                <style>
                    #adminlogin{
                        position: absolute;
                        width: 350px;
                        height: 500px;
                        padding: 20px;
                        top : 50%;
                        left : 50%;
                        transform : translate(-50%,-50%); 
                    }
                    
                    .form{
                        padding: 20px;
                    }
                    
                </style>
    </head>
    <body>
        <section id = "adminlogin">
            <div >
                    <span style=" color: blue; font-size: 40px">Admin Login</span>
                    <form calss = "form" action="AdminLoginServlet" method="post">
                    <div class="input-field">
                        <input type="email" class = "validate" name="email" required>
                        <label>Email</label>
                    </div>
                    <div class="input-field">
                        <input type="password" class = "validate" name="password" required >
                         <label>Password</label>
                    </div>
                    <div class="center">
                        <button type="submit" class="btn-large light-blue darken-3">Sign In</button>
                    </div>
                    <div>
                        <a href="#">Forget Password</a>
                    </div>
                </form>
            </div>
        </section>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js">
                     
        </script>

    </body>
</html>


