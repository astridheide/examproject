

<jsp:include page="header.jsp"></jsp:include>


<%@page import="dk.au.hum.imv.persistence.db.*,
					java.util.*, classes.*, daos.*"%>
	
	
	<%
		ArrayList<String> errors = new ArrayList<String>();
		String usernameValue = "";
		String passwordValue = "";
		
		if (request.getParameter("login") != null) { //der er trykket på knappen
			usernameValue = request.getParameter("username");
			passwordValue = request.getParameter("password");
			
			if (usernameValue.equals("")) {
				errors.add("Brugernavn skal være udfyldt");
			}
			
			if (passwordValue.equals("")) {
				errors.add("Password skal være udfyldt");
			}
			
			if (errors.isEmpty()) {
				User user = UserDao.getUserCredentials(usernameValue, passwordValue);
				
				if (user == null) {
					errors.add("Fejl i brugernavn eller password");
				} else { //bruger kan logges ind
			
			SessionModel sModel = (SessionModel)request.getSession().getAttribute("sessionModel");
					sModel.logIn(user.getUser_id()); 
					response.sendRedirect("userInfo.jsp");//send brugeren over til dennes infoside
					return; //undgå at resten af siden processeres
				}
			}
		} else if (request.getParameter("logout") != null) {
			SessionModel sModel = (SessionModel)request.getSession().getAttribute("sessionModel");
			sModel.logOut();
			response.sendRedirect("index.jsp"); //send brugeren til forsiden
			return; //undgå at resten af siden laves
			}
	%>

	<div class="contents">
		<% if (!errors.isEmpty()) { %>
		<div class="content">
			<% for (String error : errors) { %>
			<p class="error">
				<%=error%>
			</p>
			<% } %>
		</div>
		<% } %>
		<div class="content">
			<h1>Login</h1>
			<form action="login.jsp" method="post">
				<fieldset>
					<table class="form_table">
						<tr>
							<td class="label">Brugernavn:</td>
							<td class="content"><input type="text" name="username"
								value="<%=usernameValue%>" /></td>
						</tr>
						<tr>
							<td class="label">Password:</td>
							<td class="content"><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td></td>
							<td class="content_right"><input type="submit" name="login" value="Login" /></td>
						</tr>
					</table>
				</fieldset>
			</form>
		</div>
	</div>
	
	

<jsp:include page="footer.jsp"></jsp:include>

