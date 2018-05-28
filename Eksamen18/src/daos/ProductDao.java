package daos;

import java.sql.ResultSet;
import classes.*;
import daos.*;

import java.sql.SQLException;
import java.util.ArrayList;


import java.sql.Connection;
import java.sql.PreparedStatement;

import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;

public class ProductDao {

	//GET PRODUCT BY ID
		public static Product getProductById(long i) {
			Product result = null;
			Connection con = null;

			try {
				con = JDBCConnectionFactory.getNewConnection();

				String sql = "SELECT * FROM product WHERE product_id = ?";
				
				PreparedStatement prep = (PreparedStatement) con.prepareStatement(sql);
				prep.setLong(1, i);

			//eller
				ResultSet res = prep.executeQuery();
				
				while (res.next()) {
					 Long product_id = res.getLong("product.product_id");
					 String brand = res.getString("product.brand");
					 String model = res.getString("product.model");
					 String product_type = res.getString("product.product_type");
					 Long product_year = res.getLong("product.product_year");
					 Long capacity = res.getLong("product.capacity");
					 String drive = res.getString("product.drive");
					 Long price = res.getLong("product.price");
					 String description = res.getString("product.description");
					 result = new Product(product_id, brand, model, product_type, product_year, capacity, drive, price, description);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JDBCConnectionFactory.closeConnection(con);
			}
			return result;

		}
		
		
		//HENTER ALLE PRODUKTER
		public static ArrayList<Product> getAllProducts() {
			ArrayList<Product> result = new ArrayList <Product>();
			
			Connection con = null;
			
			try {
				con = JDBCConnectionFactory.getNewConnection();
				
				String sql = "SELECT * FROM product";
				
				PreparedStatement prep = con.prepareStatement(sql);
				
				ResultSet res = prep.executeQuery();
				
				while(res.next()) {
					 Long product_id = res.getLong("product.product_id");
					 String brand = res.getString("product.brand");
					 String model = res.getString("product.model");
					 String product_type = res.getString("product.product_type");
					 Long product_year = res.getLong("product.product_year");
					 Long capacity = res.getLong("product.capacity");
					 String drive = res.getString("product.drive");
					 Long price = res.getLong("product.price");
					 String description = res.getString("product.description");
					
					 Product product = new Product(product_id, brand, model, product_type, product_year, capacity, drive, price, description);
					 
					 result.add(product);
				}
			}
				catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				JDBCConnectionFactory.closeConnection(con);
			}
			
			return result;
		}
		
		//søge sager
		
		
		public static ArrayList<Product> findProducts(String searchString ) {
			ArrayList<Product> result = new ArrayList <Product>();
			
			Connection con = null;
			
			try {
				con = JDBCConnectionFactory.getNewConnection();
				
				String sql = "SELECT * FROM product WHERE model LIKE ? OR brand LIKE ?";
				
				PreparedStatement prep = con.prepareStatement(sql);
				
				prep.setString(1, searchString + "%");
				prep.setString(2, searchString + "%");
				ResultSet res = prep.executeQuery();
				
				while(res.next()) {
					 Long product_id = res.getLong("product.product_id");
					 String brand = res.getString("product.brand");
					 String model = res.getString("product.model");
					 String product_type = res.getString("product.product_type");
					 Long product_year = res.getLong("product.product_year");
					 Long capacity = res.getLong("product.capacity");
					 String drive = res.getString("product.drive");
					 Long price = res.getLong("product.price");
					 String description = res.getString("product.description"); 
					 
					 Product product = new Product(product_id, brand, model, product_type, product_year, capacity, drive, price, description);
					 
					 result.add(product);
				}
			}
				catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				JDBCConnectionFactory.closeConnection(con);
			}
			
			return result;
		}
		
		
		
		
		
		
		
		//SAVE NEW PRODUCT TO DATABASE
		public static void createProduct(Product product) /* throws SQLException */ {
			
			
	Connection con = null;
	 try {
			
		con = JDBCConnectionFactory.getNewConnection();
		 
		String sql = "INSERT INTO product (brand, model, product_type, product_year, capacity, drive, price, description) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement prep = con.prepareStatement(sql);
		
			prep.setString(1, product.getBrand());
			prep.setString(2, product.getModel());
			prep.setString(3, product.getProduct_type());
			prep.setLong(4, product.getProduct_year());
			prep.setLong(5, product.getCapacity());
			prep.setString(6, product.getDrive());
			prep.setLong(7, product.getPrice());
			prep.setString(8, product.getDescription()); 
			prep.executeUpdate();
			 
			
	 	} catch (SQLException e) {
			e.printStackTrace();
	 
		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}
		
	} 
		
		static Product createProductFromResultSet(ResultSet res) throws SQLException {
			Product result = null; 

			/*
			 * Notice that we are using the name of the database-table as a prefix to the attribute
			 * name. This makes it possible make a distinction between attributes with the same name
			 * coming from different tables when we are doing join-selects.
			 */
			
			
			 String brand = res.getString("product.brand");
			 String model = res.getString("product.model");
			 String product_type = res.getString("product.product_type");
			 Long product_year = res.getLong("product.product_year");
			 Long capacity = res.getLong("product.capacity");
			 String drive = res.getString("product.drive");
			 Long price = res.getLong("product.price");
			 String description = res.getString("description");
			 
			 result = new Product(brand, model, product_type, product_year, capacity, drive, price, description);
			 return result;
			 
	
	
} 
		//SAVE ACCESS (PRODUCT) TO DATABASE NO ID
		
		public static void createAccess(Product product) {
			
			
			Connection con = null;
			 try {
					
				con = JDBCConnectionFactory.getNewConnection();
				 
				String sql = "INSERT INTO product (brand, price, description) VALUES(?, ?, ?)";
				
				PreparedStatement prep = con.prepareStatement(sql);
				
					prep.setString(1, product.getBrand());
					prep.setLong(2, product.getPrice());
					prep.setString(3, product.getDescription()); 
					prep.executeUpdate();
					 
					
			 	} catch (SQLException e) {
					e.printStackTrace();
			 
				} finally {
					JDBCConnectionFactory.closeConnection(con);
				}
				
			} 
		
		//SAVE ACCESS (PRODUCT) TO DATABASE WITH ID
		
		
		
	
		}	
			
		
