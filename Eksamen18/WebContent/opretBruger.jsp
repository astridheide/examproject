<jsp:include page="header.jsp"></jsp:include>


<%@page import="dk.au.hum.imv.persistence.db.*,
java.util.*, classes.*, daos.*"%>


<form action="opretBruger.jsp" method="post">
<input type="text" value="" name="name" placeholder="Fulde navn"></input>
<input type="text" value="" name="username" placeholder="Brugernavn"></input>
<input type="text" value="" name="mail"  placeholder="E-mail adresse"></input>
<input type="text" value="" name="phone"  placeholder="Telefonnummer"></input>
<input type="text" value="" name="password"  placeholder="Password"></input>

<input type="submit" value="create" name="create"></input>
</form>

<% 





JDBCConnectionFactory.initManualConnectionHandling("jdbc:mysql://student.hum.au.dk:3306/u201709137",
		"u201709137", "4W5Vn55y", "com.mysql.jdbc.Driver");


String createButton = request.getParameter("create");

if (createButton != null) {
	String user_name = request.getParameter("name");
	String user_username = request.getParameter("username");
	String user_mail = request.getParameter("mail");
	String user_phone = request.getParameter("phone");
	String user_password = request.getParameter("password");
	
	User user = new User(user_name, user_username, user_mail, user_phone, user_password);
	
	UserDao.createUser(user);
}
%>