package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dk.au.hum.imv.persistence.db.JDBCConnectionFactory;

public class Feedback {

	private int feedback_user_id;
	private int feedback_id;
	private int feedback_product_id;
	private String feedback_text;
	private int feedback_date;
	

	public Feedback(int feedback_user_id, int feedback_id, int feedback_product_id, 
					String feedback_text, int feedback_date) {
		this.feedback_user_id = feedback_user_id;
		this.feedback_id = feedback_id;
		this.feedback_product_id = feedback_product_id;
		this.feedback_text = feedback_text;
		this.feedback_date = feedback_date;
		
	   }
	


	public int getFeedback_user_id() {
		return feedback_user_id;
	}


	public int getFeedback_id() {
		return feedback_id;
	}


	public int getFeedback_product_id() {
		return feedback_product_id;
	}


	public String getFeedback_text() {
		return feedback_text;
	}


	public int getFeedback_date() {
		return feedback_date;
	}

	
		 
		 
		 
	}
	
	
	

