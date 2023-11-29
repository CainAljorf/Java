package tema4.modules.users.classes;

public class client extends user {
	private boolean premium;
	private String register_date;
	public client(String username,  String password,String email, boolean active, String type, boolean premium,	String register_date) {
		super(username, email, password, active, type);
		this.premium = premium;
		this.register_date = register_date;
	}
	public client(String username, String password) {
		super(username, password);
	}
	public client(String username) {
		super(username);
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium() {
		if(this.getRegister_date().equals("31/11/2023")) {
			this.premium = true;
		}else {
			this.premium = false;
		}
	}
	public String getRegister_date() {
		return register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	@Override
	public String toString() {
		return null;
	}
	
}
