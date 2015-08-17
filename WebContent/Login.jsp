<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>The Login-Animated Website Template | Home :: w3layouts</title>
		<meta charset="utf-8">
		<link href="css/style.css" rel='stylesheet' type='text/css' />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--webfonts-->
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,300,600,700' rel='stylesheet' type='text/css'>
		<!--//webfonts--></head>
<body>
	<div class="login-form">
						<h1>Sign In</h1>
						<h2><a href="CreateAccount.jsp">Create Account</a></h2>
				<form method="post" action="Base">
				<input type="hidden" name="action" value="login">
				<%String message=request.getParameter("msg"); %>
				<h4 style="color:white">
				<%if(message!=null){
				out.println(message);
				}%></h4>
				<li>
						<input type="text" class="text" value="User Name" name="UserName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Name';}" ><a href="#" class=" icon user"></a>
				</li>
				<li>
						<input type="password" value="Password" name="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}"><a href="#" class=" icon lock"></a>
				</li>
				<div class ="forgot">
				<h3><a href="AccountRecovery.jsp">Forgot Password?</a></h3>
				<input type="submit" value="Sign In" > 
				<a href="AccountRecovery.jsp" class=" icon arrow"></a>                                                                                                                                                                                                                                 </h4>
				</div>
	</form>
	</div>
	
	<div class="ad728x90" style="text-align:center">
				<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
				<!-- w3layouts_demo_728x90 -->
				<ins class="adsbygoogle"
				     style="display:inline-block;width:728px;height:90px"
				     data-ad-client="ca-pub-9153409599391170"
				     data-ad-slot="8639520288"></ins>
				<script>
				(adsbygoogle = window.adsbygoogle || []).push({});
				</script>
		   </div>


		  <!-----start-copyright---->
						<p><table align="left">
		<tr>
			<td><a href="AboutUs.jsp" >AboutUs</a></td>
			
			<td><a href="Help.jsp">Help!</a></td>
		</tr>
		</table>
				<!-----//end-copyright---->
		
</body>
</html>