
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Database Table</title>
    
<link rel="stylesheet" type="text/css" href="register.css">
</head>
<body>
<div class="container">
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>AGE</th>
            <th>ADDRESS</th>
        </tr>
        <% 
            // Retrieve the data from the request attribute
            Object obj = request.getAttribute("data");
            
            // Check if the object is an ArrayList
            if (obj instanceof ArrayList) {
                // Typecast the object to ArrayList safely
                ArrayList<String[]> data = (ArrayList<String[]>) obj;
                
                // Iterate over the data and generate table rows
                for (String[] row : data) {
        %>
        <tr>
            <td><%= row[0] %></td>
            <td><%= row[1] %></td>
            <td><%= row[2] %></td>
            <td><%= row[3] %></td>
            <td><%= row[4] %></td>
        </tr>
        <% 
                }
            } else {
                // Handle the case where the data is not an ArrayList
                // This could be an error condition or empty data
                // You may display an appropriate message or handle it as needed
            }
        %>
    </table>
    </div>
</body>
</html>
