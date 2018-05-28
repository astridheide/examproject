package classes;

import java.io.Serializable;

public class SessionModel implements Serializable {

private long user_id = -1;
	
	
	public SessionModel() {
		
	}
	
	
	public void logIn(long user_id) {
		this.user_id = user_id;
	}
	
	
	public void logOut() {
		this.user_id = -1;
	}
	
	
	public boolean isLoggedIn() {
		return(user_id != -1);
	}
	
	
	public long getUser_id() {
		return user_id;
	}
	
}
