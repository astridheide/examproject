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
						
						Årgang: <br/>
						<div class="form-group">
							<input type="text" name="year" class="inputField"></input>
						</div> <br/> 
						Pris: <br/>
						<div class="form-group">
							<input type="text" name="price" class="inputField"></input>
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
				String product_type = "t";
				long product_year = Long.parseLong(request.getParameter("year"));
				long capacity = Long.parseLong("1");
				String drive = "n";
				long price = Long.parseLong(request.getParameter("price"));
                String description = request.getParameter("description");
				
				

				Product product = new Product(brand, model, product_type, product_year, capacity, drive, price, description);
				ProductDao.createProduct(product);

			}
			 %>
			
						<!-- CREATE PRODUCT END -->	
						
						
						
						<jsp:include page="footer.jsp"></jsp:include>
		
		