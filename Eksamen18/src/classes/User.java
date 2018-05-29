package classes;

public class User {
	private static final String UserDao = "";

	private long user_id;

	private String user_username;

	private String user_name;

	private String user_mail;

	private String user_phone;

	private String user_password;

	// Uden ID
	public User(String user_name, String user_username, String user_mail, String user_phone, String user_password) {
		this.user_name = user_name;
		this.user_username = user_username;
		this.user_mail = user_mail;
		this.user_phone = user_phone;
		this.user_password = user_password;
	}

	public User(long user_id, String user_name, String user_username, String user_mail, String user_phone,
			String user_password) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_username = user_username;
		this.user_mail = user_mail;
		this.user_phone = user_phone;
		this.user_password = user_password;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getUser_username() {
		return user_username;
	}

	public void setUser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public boolean userIdExists(Long id) {
		return UserDao != null;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_username=" + user_username + ", user_name=" + user_name
				+ ", user_mail=" + user_mail + ", user_phone=" + user_phone + ", user_password=" + user_password + "]";
	}

}
