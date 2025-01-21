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
                <h1 align="center">Login form</h1>
                <hr>
               
               <span class="text-success">${msg}</span>
               <span class="text-danger">${err}</span>
          <form action="login" method="post">
               

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

                    
                   
                

               <br>
                <input type="submit" class="btn btn-success" id="smbtn">
                <input type="reset" class=" btn btn-primary">
                <a href="form.jsp">New user? register here</a>
            </form>
      
        </div>
    </div>
        </div>
</body>
</html>