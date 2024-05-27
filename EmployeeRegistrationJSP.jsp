<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="com.model.EmployeeRegistrationForm"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: black;
}

h1 {
	text-align: center;
	color: blue;
}

a {
	text-decoration: none;
	color: black;
}

table {
	margin: 0 auto;
	border-collapse: collapse;
	width: 80%;
}

th {
	background-color: blue; /* Changed to blue */
	color: white;
}

td {
	background-color: violet;
	color: white;
}

.footer {
	text-align: center;
}

.footer button {
	margin: 10px;
}

.search-bar {
	text-align: center;
	margin-bottom: 20px;
}

.search-bar input[type="text"] {
	padding: 8px;
	width: 30%;
	border-radius: 5px;
	border: 1px solid #ccc;
}
</style>
</head>
<body>
	<div class="search-bar">
		<form action="SearchServlett" method="post">
			<input type="text" name="Search" placeholder="Search..."> <input
				type="submit" value="Search">
		</form>
	</div>
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
		if (list != null) {
			for (EmployeeRegistrationForm employee : list) {
		%>
		<tr>
			<td><%=employee.getName()%></td>
			<td><%=employee.getPassword()%></td>
			<td><%=employee.getMail_Id()%></td>
			<td><%=employee.getPhoneNumber()%></td>
			<td><input type="hidden" name="emailId"
				value="<%=employee.getName()%>"> <a
				href="update.html?editId=<%=employee.getPhoneNumber()%>">
					<button type="button">Update</button>
			</a></td>
			<td>
				<form action="DeleteServlet" method="get">
					<input type="hidden" name="action" value="Delete"> <input
						type="hidden" name="delete" value="<%=employee.getName()%>">
					<button type="submit" title="delete">Delete</button>
				</form>
			</td>
			<td>
				<form action="SearchServlett" method="post">
					<input type="hidden" name="action" value="Search"> <input
						type="hidden" name="Search" value="<%=employee.getName()%>">
				</form>
			</td>
		</tr>
		<%
		}
		}
		%>
	</table>
	<div class="footer">
		<form action="SessionServlet" method="get">
			<input type="hidden" name="action" value="logout"> <input
				type="hidden" name="logout">
			<button type="submit" title="logout">Logout</button>
		</form>
	</div>
</body>
</html>
