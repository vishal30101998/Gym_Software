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
<div class="container">
<div class="centered-div">
<h1>Thanku for joining Gym Freak.</h1>
<h2>Now you are the member of Gym Freak.</h2>
<p>Payment process will be  disscuss on your mail.So kindly check your mail.</p>
<p>You have joined <b> <%=request.getParameter("membership")%> </b> plan. So your fees will be <b> <%=request.getParameter("ruppee")%> </b>.</p>
<p>Now you can check your Registered Form.</p>
<p>Click On Registered Form Button below.</p>
<form action="getServlet" method="post">


            <button type="submit">Registered Form</button>
</form>
</div>
</div>

</body>
</html>