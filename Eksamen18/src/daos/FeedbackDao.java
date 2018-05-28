package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import classes.Feedback;
import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;


public class FeedbackDao {

public static FeedbackDao getFeedbackById(int id) {
		
		Connection con = null;

		try {
			con = JDBCConnectionFactory.getNewConnection();		


			String sql = "SELECT * FROM feedback id = ?";
 
			PreparedStatement prep = con.prepareStatement(sql);
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



	//CREATE FEEDBACK
		public static void createFeedback(Feedback feedback) {
			Connection con = null;
			 try {
					
				con = JDBCConnectionFactory.getNewConnection();
				 
				String sql = "INSERT INTO feedback (feedback_user_id, feedback_id, feedback_product_id, feedback_text, feedback_date) VALUES(?, ?, ?, ?, ?)";
				
				PreparedStatement prep = con.prepareStatement(sql);
				
					prep.setInt(1, feedback.getFeedback_user_id());
					prep.setInt(2, feedback.getFeedback_id());
					prep.setInt(3, feedback.getFeedback_product_id());
					prep.setString(4, feedback.getFeedback_text());
					prep.setInt(5, feedback.getFeedback_date());
					
					 
					prep.executeUpdate();
					 
					
			 	} catch (SQLException e) {
					e.printStackTrace();
			 
				} finally {
					JDBCConnectionFactory.closeConnection(con);
				}
	
} 
							//CREATE FEEDBACK END
		
		
		
						//GET ALL FEEDBACK
		public static ArrayList<Feedback> getAllFeedback() {
			ArrayList<Feedback> result = new ArrayList <Feedback>();
			
			Connection con = null;
			
			try {
				con = JDBCConnectionFactory.getNewConnection();
				
				String sql = "SELECT * FROM feedback";
				
				PreparedStatement prep = con.prepareStatement(sql);
				
				ResultSet res = prep.executeQuery();
				
				
				while(res.next()) {
					 int feedback_user_id = res.getInt("feedback.feedback_user_id");
					 int feedback_id = res.getInt("feedback.feedback_id");
					 int feedback_product_id = res.getInt("feedback.feedback_product_id");
					 String feedback_text = res.getString("feedback.feedback_text");
					 int feedback_date = res.getInt("feedback.feedback_date");
					 
					 
					 Feedback feedback = new Feedback(feedback_user_id, feedback_id, feedback_product_id, feedback_text, feedback_date);
					 
					 result.add(feedback);
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
	
}
