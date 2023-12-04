package tema4.modules.users.classes;

public class admin extends user {
	public admin(String username,String password, String email,  boolean active) {
		super(username, email, password, active);
	}
	public admin(String username, String password) {
		super(username, password);
	}
	public admin(String username) {
		super(username);
	}
	@Override
	public String toString() {
		String str = "";
		str = str + "Username: " + getUsername() + "\n";
		str = str + "Email: " + getEmail() + "\n";
		str = str + "Password: " + getPassword() + "\n";
		return str;
	}
}