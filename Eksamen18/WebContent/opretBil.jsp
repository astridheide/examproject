<jsp:include page="header.jsp"></jsp:include>

<%@page import="dk.au.hum.imv.persistence.db.*,
java.util.*, classes.*, daos.*"%>


<!-- CREATE PRODUCT START -->
		  	<div class="container">
			<div class="col-md-6">

				<h3 class="headerSign">Opret den bil, du vil sælge!</h3>
				<div class="form-area">

					<form action="index.jsp" method="post"> 
						<br/> 
						Mærke: <br/>
						<div class="form-group">
							<input type="text" value="" name="brand" class="inputField"></input>
						</div> <br/>

						<div class="form-group">
							Model: <br/> 
							<input type="text" name="model" class="inputField"></input>
						</div> <br/> 
						Type: <br/>
						<div class="form-group">
							<select name="type" class="inputField">
								<option value="c">Bil</option>
								<option value="t">Tilbehør</option>
							</select>
						</div> 
						<br/> 
						Årgang: <br/>
						<div class="form-group">
							<input type="text" name="year" class="inputField"></input>
						</div> <br/> 
						Pris: <br/>
						<div class="form-group">
							<input type="text" name="price" class="inputField"></input>
						</div> <br/> 
						Kapacitet (antal personer): <br/>
						<div class="form-group">
							<input type="text" name="capacity" class="inputField"></input>
						</div> <br/> 
						Træk: <br/>
						<div class="form-group">
							<select name="drive" class="inputField">
							<option value="f">Forhjulstræk</option>
							<option value="r">Baghjulstræk</option>
							<option value="a">4-hjulstræk</option>
							</select>
						</div> <br/> 
						Beskriv dit produkt: <br/>
						<div class="form-group"> 
							<input type="text" name="description" class="inputField"></input> 
						</div>
							<input type="submit" value="create" name="create" class="btn btn-primary"></input>
					</form>
				</div>
				</div>
				</div>
					

			<% 
			JDBCConnectionFactory.initManualConnectionHandling("jdbc:mysql://student.hum.au.dk:3306/u201709137",
					"u201709137", "4W5Vn55y", "com.mysql.jdbc.Driver");
			String createButton = request.getParameter("create");

			if (createButton != null) {
				String brand = request.getParameter("brand");
				String model = request.getParameter("model");
				String product_type = request.getParameter("type");
				long product_year = Long.parseLong(request.getParameter("year"));
				long capacity = Long.parseLong(request.getParameter("capacity"));
				String drive = request.getParameter("drive");
				long price = Long.parseLong(request.getParameter("price"));
                String description = request.getParameter("description");
				
				

				Product product = new Product(brand, model, product_type, product_year, capacity, drive, price, description);
				ProductDao.createProduct(product);

			}
			 %>
			
						<!-- CREATE PRODUCT END -->	
						
						
						<jsp:include page="footer.jsp"></jsp:include>
		
		