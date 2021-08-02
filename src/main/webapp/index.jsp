<%@page import="com.beans.Flights"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.FlightDao"%>
<html>
<head>


<style>
table, th, td {
	border: 1px solid black;
	border-collaspe: collaspe;
}

th, td {
	padding: 5px;
}

form {
	border: 2px solid powderblue;
	padding: 30px;
	background-color: lightcyan;
	text-align: center;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
	border: 1px solid #bbb;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 15px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}
</style>
</head>
<body>
	<h1 style="background-color: powderblue;">Buddha Airlines</h1>

	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<ul>
		<li style="float: right"><a href="UserLogin.jsp">User Login</a></li>
		<li style="float: right;"><a href="Register.jsp">Register</a></li>
		<li><a href="about.jsp">About</a></li>
		<li><a href="contact.jsp">Contact</a></li>

	</ul>
	<h2 align="center">Flights</h2>
	<form action="flights">
		<%--@declare id="date"--%>
		<label for="from"> From </label> <select name="from" required id="from">
			<option value="">Choose</option>
			<option value="Dallas">DFW</option>
			<option value="New York">JFK</option>
			<option value="Denver">DEN</option>
			<option value="Atlanta">ATL</option>



		</select> <label for="to">To</label> <select name="to" required id="to">
			<option value=" ">Choose</option>
			<option value="San Diego">SAN</option>
			<option value="Oakland">OAK</option>
			<option value="Boston">BOS</option>
			<option value="Los Angeles">LAX</option>

		</select> <br> <br> <label for="date">Choose Flight Date</label> <input
			type="date" id="fdate" name="fDate" required><br> <label
			for="date">Choose Return Date</label> <input type="date" id="rdate"
			name="rDate" required> <br>
		<br> <input type="submit" value="Search "> <input
			type="reset">

	</form>

	<img src="1.gif" height=200 width=340 alt="plane image">
	
	<table>
		<caption>Available Flights</caption>
		
		<tr>
			<th>FROM</th>
			<th>TO</th>
			<th>Flight Date</th>
			<th>Return Date</th>
			<th>Price</th>
		</tr>
	<%
	FlightDao dao = new FlightDao();
	//Get all the flights from databases in a list of type flight
	List<Flights> flights = dao.getAllFlights();
	for (Flights flt : flights) {
		//out.print(flt.getFlightId() + flt.getStartDate() + flt.getLeaveFrom());
	%>

		<tr>
			<td>
				<%
				out.print(flt.getLeaveFrom());
				%>
			</td>
			<td>
				<%
				out.print(flt.getWhereTo());
				%>
			</td>
			<td>
				<%
				out.print(flt.getStartDate());
				%>
			</td>
			<td>
				<%
				out.print(flt.getReturnDate());
				%>
			</td>
			<td>
				<%
				out.print(flt.getPrice());
				%>
			</td>
		</tr>
		<%
		}
		%>


	</table>

</body>
</html>
