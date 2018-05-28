package daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import daos.TotalSaleDao;
import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;

public class TotalSaleDao {

	
public static TotalSaleDao getTotalSaleDaoById(int id) {
		
		Connection con = null;

		try {
			con = JDBCConnectionFactory.getNewConnection();

			String sql = "";
 
			java.sql.PreparedStatement prep = con.prepareStatement(sql);
		//sæt værdier til udtrykket her: prep.setString(1, ”hello”);

			prep.executeUpdate(); 
		//eller
			ResultSet result = prep.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}
		return null;

	}
	
	
}
