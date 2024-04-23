<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="indexstyle.css">
</head>
<body>
<div class="container" >
<div class="centered-div">
<h1>One Month Subscription</h1>
<p>Please fill the Registration form for <i>One Month</i> Subscription.</p>
<form action="OnemServlet" method="post">

<label for="username">Name</label>
            <input type="text" id="username" name="username" required><br>
            <label for="email">Email:</label>
            <input type="text" id="username" name="email" required><br>   
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required><br>
            <label for="address">Address:</label>
            <input type="text" id="address" name="address">
            <button type="submit">Register</button>
</form>
</div>
</div>
</body>
</html>