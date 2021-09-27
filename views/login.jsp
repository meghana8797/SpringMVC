<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
 
<html>
<head>
<title>Login Page</title>
</head>

		<body>
			<form:form id="regForm" modelAttribute="user" action="loginProcess" method="post">
				<h2 align="center">Welcome ${fullName}</h2>
                <table align="center">
					<tr>
                        <td>
                            <form:label path="userName">UserName</form:label>
                        </td>
                        <td>
                            <form:input path="userName" name="userName" id="userName" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">Password</form:label>
                        </td>
                        <td>
                            <form:password path="password" name="password" id="password" />
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="login" name="login">Log In</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                 </table>
            </form:form>

</body>
</html>