
<%@ page import="dk.au.hum.imv.persistence.db.*,
java.util.*, classes.*, daos.*"%>


<%
	JDBCConnectionFactory.initManualConnectionHandling("jdbc:mysql://student.hum.au.dk:3306/u201709137",
			"u201709137", "4W5Vn55y", "com.mysql.jdbc.Driver");
	// ArrayList<Product> products = ProductDao.getAllProducts();

	ArrayList<Product> products = null;

	String search = request.getParameter("search");
	if (search != null && !search.equals("")) {
		products = ProductDao.findProducts(search);
	} else {
		products = ProductDao.getAllProducts();
		search = "";
	}


%>





<link rel="stylesheet" type="text/css" href="IndexStyle.css">

	<body>

		<div>
			<%@ include file="header.jsp"%>
		</div>



		<table id="products">
			<tr>
				<th>Mærke</th>
				<th>Model</th>
				<th>Årgang</th>
				<th>Pris</th>
			</tr>

			<%
				int counter = 0;
			
				for (Product product : products) {
			counter++;
			%>

			<tr id=<%=counter%>>

			
			<tr>
				<td class="tableData"><%=product.getBrand()%></td>
				<td class="tableData"><%=product.getModel()%></td>
				<td class="tableData"><%=product.getProduct_year()%></td>
				<td class="tableData"><%=product.getPrice()%></td>
				<td id="buy"><button type="button" name="køb" value="<%= product.getProduct_id() %>">Køb!</button></td>
			</tr>

			<%
				}
			%>

		</table>

		

		<script type="text/javascript">
		
		</script>
		
		
		



		<div>
			
		</div>

		<jsp:include page="footer.jsp"></jsp:include>