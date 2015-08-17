<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String UserName=(String)application.getAttribute("UserName"); %>
	<h1>Welcome to Apple Website <%=UserName %></h1> <a href="Base?action=logout">Logout</a>
	<img src="images/Welcome.jpg" height="500" width="1100" >
	<br><br><br>
	
	<a href="Base?action=fatchInformation">Please Click here to Update Personal Information.</a>
</body>
</html>