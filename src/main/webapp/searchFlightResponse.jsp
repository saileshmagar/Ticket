<%@page import="com.beans.Flights"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
button {

 color: #04AA6D;
        border: 8px;
}


</style>
<meta charset="ISO-8859-1">
<title>Available Flights</title>
</head>
<body>
<h3 style="background-color: powderblue;"> Flight Found</h3>
<%


out.print("From: " + request.getAttribute("from")+"<br/>");

out.print("To: " + request.getAttribute("whereTo")+ "<br/>");

out.print("Flight Date: " +request.getAttribute("sDate")+ "<br/>");


out.print("Return Date: "+ request.getAttribute("rDate"));


%>
<br>
<br>
<form action="index.jsp" >
    <button type="submit" >  Go back to Homepage </button>
    </form>
    <br>
    
 <form action="UserLogin.jsp">
    <button type="submit" >  Login </button>
    </form>
    <br>
   <form action="Register.jsp">
    <button type="submit" >  Register </button>
    </form>
</body>
</html>