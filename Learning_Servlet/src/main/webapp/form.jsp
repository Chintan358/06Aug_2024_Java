<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script>

        function validation()
        {
            var uname = document.getElementById("uname").value
            var email = document.getElementById("email").value
            var pass = document.getElementById("pass").value
            var cpass = document.getElementById("cpass").value

            var unameErr = document.getElementById("unameErr")
            var emailErr = document.getElementById("emailErr")
            var passErr = document.getElementById("passErr")
            var cpassErr = document.getElementById("cpassErr")

            var btn = document.getElementById("smbtn")

            unameExp = /^[a-zA-Z]{3,10}$/
            emailExp = /^[a-zA-Z0-9_.]+@[a-z]+\.[a-z]{2,4}$/

           


            if(uname==""||uname==null)
            {
                unameErr.innerHTML="Username required**"
                btn.disabled=true
            }
            else if(!unameExp.test(uname))
            {
                unameErr.innerHTML="Invalid Username formate"
            }
            else{
                unameErr.innerHTML=""
                btn.disabled=false
            }

            if(email==""||email==null)
            {
                emailErr.innerHTML="Email required**"
                btn.disabled=true
            }
            else if(!emailExp.test(email))
            {
                emailErr.innerHTML="Invalid Email format"
            }
            else{
                emailErr.innerHTML=""
                btn.disabled=false
            }

            if(pass==""||pass==null)
            {
                passErr.innerHTML="Password required**"
                btn.disabled=true
            }
            else{
                passErr.innerHTML=""
                btn.disabled=false
            }

            if(cpass=="" || cpass==null)
            {
                cpassErr.innerHTML="Cpass can not be null"
                btn.disabled=true
            }
            else if(cpass!=pass)
            {
                cpassErr.innerHTML="cpass must be same as a spass"
                btn.disabled=true
            }
            else{
                cpassErr.innerHTML=""
                btn.disabled=false
            }

            

        }



    </script>
</head>
<body>
   
    <div class="container">
        <div class="row">
            <div class="col-5 mx-auto card p-3 mt-3">
                <h1 align="center">Registration form</h1>
                <hr>
                <%-- <%
                 String msg = (String)request.getAttribute("msg");
                if(msg==null)
                { %>
                	
                <%}
                else
                { %>
            		<span> <%=msg%></span>
            	<%}
                %> --%>
               
               <span class="text-success">${msg}</span>
          <form action="reg" method="post">
                <div class="form-group">
                <label for="uname" class="tl">Username</label>
                <input type="text" id="uname" name="uname" class="form-control" onkeyup="validation()">
                    <span id="unameErr" class="text-danger"></span>
            </div>

                <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" class="form-control"  onkeyup="validation()">
                <span id="emailErr" class="text-danger"></span>
            </div>

                <div class="form-group">
                <label for="pass">Password</label>
                <input type="password" id="pass" name="pass" class="form-control"  onkeyup="validation()">
                <span id="passErr" class="text-danger"></span>       
            </div>

                    <div class="form-group">
                        <label for="cpass">Confirm Password</label>
                        <input type="password" id="cpass" name="cpass" class="form-control" onkeyup="validation()">
                        <span id="cpassErr" class="text-danger"></span>        
                    </div>

                   
                

               <br>
                <input type="submit" class="btn btn-success" id="smbtn">
                <input type="reset" class=" btn btn-primary">
                <a href="login.jsp">Alredey registed? Login here</a>
            </form>
      
        </div>
    </div>
        </div>
</body>
</html>