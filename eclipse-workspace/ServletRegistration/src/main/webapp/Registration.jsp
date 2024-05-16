<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.model.UserRegistration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    h1 {
        text-align: center;
        color: blue; 

    }
     table{
        margin: 0 auto; 
        border-collapse: collapse;
        width: 80%; 
    }
    
    
    th {
        background-color: lightblue; 
        color: white; 
    }
</style>
</head>
<body>
<h1>Registration Successful</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Password</th>
        <th>ConfirmPassword</th>
        <th>Email</th>
        <th>DateOfBirth</th>
        <th>Age</th>
        <th>Phone number</th>
    </tr>
    <% 
    ArrayList<UserRegistration> list = (ArrayList<UserRegistration>) request.getAttribute("list");
    if(list != null) {
        for(UserRegistration user : list) {
    %>
    <tr>
        <td><%= user.getUserName() %></td>
        <td><%= user.getPassword() %></td>
        <td><%= user.getConfirmPassword() %></td>
        <td><%= user.getEmail() %></td>
        <td><%= user.getDateOfBirth() %></td>
        <td><%= user.getAge() %></td>
        <td><%= user.getPhonenumber() %></td>
    </tr>
    <% 
        }
    } 
    %>
</table>
</body>
</html>
