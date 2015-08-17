<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bean.CustomerRecovery"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%List<CustomerRecovery> list=(List<CustomerRecovery>)request.getAttribute("CustomerRecovery"); %>
		<%for(CustomerRecovery customer:list)
		{%>
		<h1>Hello <%= application.getAttribute("UserName")%> Your Password is:</h1>
		<form>
		<table>
			<tr>
			<td>Password :</td>
			<td>
				<input type="text" name="Password" value="<%=customer.getPassword()%>">
			</td>
			</tr>
		<%} %>
	</table>
	</form>
	<a href="Login.jsp">Please Click hear to go back to Login Page! </a>
</body>
</html>