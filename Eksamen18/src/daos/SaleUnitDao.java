package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import java.util.List;
import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;

public class SaleUnitDao {

	public static SaleUnitDao getSaleUnitDaoById(int id) {

		Connection con = null;

		try {
			con = JDBCConnectionFactory.getNewConnection();

			String sql = "";

			PreparedStatement prep = con.prepareStatement(sql);

			prep.executeUpdate();
			// eller
			// ResultSet result = prep.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}
		return null;

	}
	/*
	 * ASTRIDS -> ligesom public static ArrayList<SaleUnit> getPurchasesForUser(User
	 * user) { return getSaleUnitsForUserHelper(user, "AND saleunit."); //XXX }
	 */

	/*
	 * PETERs public static ArrayList<Loan>
	 * getPreviousLoansForReader(RegisteredReader reader) { return
	 * getLoansForReaderHelper(reader, "AND loans.returned_date IS NOT NULL"); }
	 */

	/*
	 * ASTRIDS - vi skal have lave en kobling med produkt og saleunit private static
	 * ArrayList<SaleUnit> getSaleUnitsForUserHelper(User user, String
	 * extraCondition) { //jeg er ikke helt sikker på den der extraCondition
	 * ArrayList<SaleUnit> result = new ArrayList<>();
	 * 
	 * Connection con = null; try { con = JDBCConnectionFactory.getNewConnection();
	 * String sql = "SELECT * FROM saleunit, product WHERE " + // SKAL DET
	 * 'product'? XXX "saleunit.saleunit_product_id = product_product_id" +
	 * "AND saleunit.user_id = ?" + // JEG TROR VI SKAL LAVE ET 'saleunit.user_id' I
	 * DATABASEN XXX extraCondition;
	 * 
	 * PreparedStatement prep = con.prepareStatement(sql); prep.setLong(1,
	 * user.getUser_id());
	 * 
	 * ResultSet res = prep.executeQuery();
	 * 
	 * while(res.next()) { Product product =
	 * ProductDao.createProductFromResultSet(res); int id =
	 * res.getInt("saleunit.saleunit_id"); SaleUnit saleunit = new SaleUnit(user,
	 * product, id); result.add(saleunit);
	 * 
	 * } } catch (SQLException e) { e.printStackTrace(); } finally {
	 * JDBCConnectionFactory.closeConnection(con); } return result; }
	 */

}
