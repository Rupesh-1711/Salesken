<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add-student" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Roll Number</label>
    <input type="Number" class="form-control" id="exampleInputRoll" aria-describedby="emailHelp" placeholder="Enter Roll Number">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Name</label>
    <input type="Text" class="form-control" id="exampleInputName" placeholder="Enter Name">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">email</label>
    <input type="email" class="form-control" id="exampleInputPassword1" placeholder="Enter Email">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>