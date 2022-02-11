<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navbar.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<form action="./seeById" method="post">
<label>Enter id</label>
<input type="number" name="id">
<input type="submit" value="Submit">
</form>


<%if(data!=null){ %>
<h1>User Details</h1>
<table>
<tr>
 <th>Id</th> 
 <th>Name</th> 
 <th>Password</th> 
  <th>Role</th> 

</tr>
	<tr>
	<td><%=data.getUserId()%></td>
	<td><%=data.getUserName()%></td>
	<td><%=data.getUserPassword()%></td>
	<td><%=data.getUserRole()%></td>
	</tr>
</table>
	<%} %>
</body>
</html>