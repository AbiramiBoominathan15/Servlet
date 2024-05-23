<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.EmployeeRegistrationForm" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:black;
}
    h1 {
        text-align: center;
        color: blue; 

    }
    a{
    text-decoration:none;
    color:black;
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
    td{
     
    background-color: violet; 
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
        <th>Mail_Id</th>
        <th>PhoneNumber</th>
        <th colspan="2">Actions</th>
    </tr>
    <% 
    List<EmployeeRegistrationForm> list = (ArrayList<EmployeeRegistrationForm>) request.getAttribute("list");
    if(list != null) {
        for(EmployeeRegistrationForm employee : list) {
    %>
    <tr>
        <td><%= employee.getName() %></td>
        <td><%= employee.getPassword() %></td>
        <td><%= employee.getMail_Id() %></td>
        <td><%= employee.getPhoneNumber() %></td>
        <td>
        <input type="hidden" name="action" value="update">
                <input type="hidden" name="Name" value="<%=employee.getName() %>">
                <button type="submit" onClick="location.href= 'update.html?Name=<%=employee.getName() %>'">Update</button>
        </td>
        <td>
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="Name" value="<%=employee.getName() %>">
                <button type="submit" onClick="location.href= 'delete.html?Name=<%=employee.getName() %>'">Delete</button>
        
        
        
        </td>
        
    </tr>
    <% 
        }
    } 
    %>
</table>
</body>
</html>
