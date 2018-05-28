<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<script src="jquery-3.3.1.min.js"></script>


<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css"></link>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></link>


<link href="styleSheet.css" rel="stylesheet" type="text/css"
	media="screen"></link>


<title>Insert title here</title>
</head>
<body>


	<%@page
		import="dk.au.hum.imv.persistence.db.*,
			    java.util.*, classes.*, daos.*"%>

	<!-- HUSK at importere classes.SessionModel, når den er oprettet -->




	<%
		String uri = request.getRequestURI().substring(request.getContextPath().length() + 1);
	%>

	<%
		String url = "jdbc:mysql://student.hum.au.dk:3306/u201709137";
		String userName = "u201709137";
		String password = "4W5Vn55y";
		String dbDriver = "com.mysql.jdbc.Driver";
		JDBCConnectionFactory.initManualConnectionHandling(url, userName, password, dbDriver);

		SessionModel sModel = (SessionModel) request.getSession().getAttribute("sessionModel");
		if (sModel == null) {
			sModel = new SessionModel();
			request.getSession().setAttribute("sessionModel", sModel);
		}
	%>






	<!-- NAVBAR START -->


	<nav class="navbar navbar-down">
	<div class="container">
		<div class="flex-container">
			<div class="navbar-header flex-item">
				<div class="navbar-brand">
					<p>Bilshoppen</p>
				</div>
			</div>
			<ul class="nav navbar-nav flex-item hidden-xs">
				<li><a href="index.jsp">Hjem</a></li>
				<li><a href="Oversigt.jsp">Biler til salg</a></li>
				<%
					if (sModel.isLoggedIn()) {
				%>
				<li class="<%=uri.equals("userInfo.jsp") ? "active" : ""%>"><a
					href="userInfo.jsp">Bruger Info</a></li>
				<li><a href="login.jsp?logout=true">Log ud</a></li>
				<li><a href="cart.jsp">Indkøbskurv/Betaling</a></li>
				<%
					} else {
				%>
				<li class="<%=uri.equals("login.jsp") ? "active" : ""%>"><a
					href="login.jsp">Login</a></li>
				<%
					}
				%>
				<li><a href="kontakt.jsp">Kontakt os</a></li>
			</ul>
			<ul class="nav navbar-nav flex-item hidden-xs pull-right">


			</ul>




			<form class="navbar-form navbar-left" action="Oversigt.jsp"
				method="get">
				<div class="form-group">
					<input type="text" class="form-control" name="search"
						placeholder="søg efter en bil"> <input type="submit"
						name="Søg" />
				</div>
			</form>
		</div>
	</div>
	</nav>





</body>
</html>