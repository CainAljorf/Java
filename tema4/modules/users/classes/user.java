package tema4.modules.users.classes;

public abstract class user {
	private String username;
	private String email;
	private String password;
	private boolean active;
	private String type;
	public user(String username, String email, String password, boolean active, String type) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.active = active;
		this.type = type;
	}
	public user(String username) {
		this.username = username;
	}
	public user(String username,String email) {
		this.username = username;
		this.email = email;
	}
	public boolean equals(Object param){
		return getUsername().equals(((user)param).getUsername());
	}
	public boolean equals2(Object param){
		boolean res = false;
		if (getUsername().equals(((user)param).getUsername())&& getPassword().equals(((user)param).getPassword())) {
			res = true;
		}
		return res;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public abstract String toString();
	
}
