package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.User;
import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;

public class UserDao {

	// GET USER BY ID

	public static User getUserById(long user_id) {
		User result = null;
		Connection con = null;

		try {
			con = JDBCConnectionFactory.getNewConnection();

			String sql = "SELECT * FROM user WHERE user_id = ?";

			PreparedStatement prep = con.prepareStatement(sql);
			prep.setLong(1, user_id);

			// prep.executeUpdate();
			// eller
			ResultSet res = prep.executeQuery();

			while (res.next()) {
				// result = createUserFromResultSet(res);
				Long id = res.getLong("user.user_id");
				String name = res.getString("user.user_name");
				String username = res.getString("user.user_username");
				String mail = res.getString("user.user_mail");
				String phone = res.getString("user.user_phone");
				String password = res.getString("user.user_password");
				result = new User(id, name, username, mail, phone, password);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}

		return result;

	}

	// GET USER FROM CREDENTIALS

	public static User getUserCredentials(String user_name, String user_password) {

		User result = null;

		Connection con = null;

		try {
			con = JDBCConnectionFactory.getNewConnection();

			String sql = "SELECT * FROM user WHERE user_username = ? AND user_password = ?";

			PreparedStatement prep = (PreparedStatement) con.prepareStatement(sql);
			prep.setString(1, user_name);
			prep.setString(2, user_password);

			ResultSet res = prep.executeQuery();

			while (res.next()) {
				result = createUserFromResultSet(res);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}

		return result;

	}

	// CREATE USER FROM RESULT SET
	static User createUserFromResultSet(ResultSet res) throws SQLException {

		User user = null;
		Long id = res.getLong("User.user_id");
		String name = res.getString("User.user_name");
		String username = res.getString("User.user_username");
		String mail = res.getString("User.user_mail");
		String phone = res.getString("User.user_phone");
		String password = res.getString("User.user_password");
		user = new User(id, name, username, mail, phone, password);

		return user;

	}

	// CREATE NEW USER
	public static void createUser(User user) {

		Connection con = null;
		try {

			con = JDBCConnectionFactory.getNewConnection();

			String sql = "INSERT INTO user (user_name, user_username, user_mail, user_phone, user_password) VALUES(?,?, ?, ?, ?)";

			PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(1, user.getUser_name());
			prep.setString(2, user.getUser_username());
			prep.setString(3, user.getUser_mail());
			prep.setString(4, user.getUser_phone());
			prep.setString(5, user.getUser_password());

			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}

	}
	
								//ALTER USER
	public static void alterUser(User user) {

		Connection con = null;
		try {

			con = JDBCConnectionFactory.getNewConnection();

			String sql = "UPDATE user (user_name, user_username, user_mail, user_phone, user_password) VALUES(?,?, ?, ?, ?)" + "WHERE id = ?";
			
			
			PreparedStatement prep = con.prepareStatement(sql);
			prep.setString(1, user.getUser_name());
			prep.setString(2, user.getUser_username());
			prep.setString(3, user.getUser_mail());
			prep.setString(4, user.getUser_phone());
			prep.setString(5, user.getUser_password());

			if (isInDatabase()) {
				
			}
			
			prep.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JDBCConnectionFactory.closeConnection(con);
		}

	}
	
		
	}

