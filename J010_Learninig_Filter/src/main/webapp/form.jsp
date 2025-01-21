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
    
</head>
<body>
   
    <div class="container">
        <div class="row">
            <div class="col-5 mx-auto card p-3 mt-3">
                <h1 align="center">Registration form</h1>
                <hr>
               
               <span class="text-danger">${err}</span>
               <span class="text-success">${msg}</span>
          <form action="reg" method="post">
                <div class="form-group">
                <label for="uname" class="tl">Username</label>
                <input type="text" id="uname" name="uname" class="form-control" value="<%if(request.getParameter("uname")!=null){%><%=request.getParameter("uname") %><%} %>" >
                    <span id="unameErr" class="text-danger">${unameErr}</span>
            </div>

                <div class="form-group">
                <label for="email">Email</label>
                <input type="text" id="email" name="email" class="form-control" value="<%if(request.getParameter("email")!=null){%><%=request.getParameter("email") %><%} %>">
                <span id="emailErr" class="text-danger">${emailErr}</span>
            </div>

                <div class="form-group">
                <label for="pass">Password</label>
                <input type="password" id="pass" name="pass" class="form-control"  value="<%if(request.getParameter("pass")!=null){%><%=request.getParameter("pass") %><%} %>">
                <span id="passErr" class="text-danger">${passErr}</span>       
            </div>

                    <div class="form-group">
                        <label for="cpass">Confirm Password</label>
                        <input type="password" id="cpass" name="cpass" class="form-control"  value="<%if(request.getParameter("cpass")!=null){%><%=request.getParameter("cpass") %><%} %>">
                        <span id="cpassErr" class="text-danger">${cpassErr}</span>        
                    </div>

                   
                

               <br>
                <input type="submit" class="btn btn-success" id="smbtn">
                <input type="reset" class=" btn btn-primary">
               
            </form>
      
        </div>
    </div>
        </div>
</body>
</html>