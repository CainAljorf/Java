package tema4.modules.users.classes;

public class admin extends user {

	public admin(String username, String email, String password, boolean active, String type) {
		super(username, email, password, active, type);
	}
	public admin(String username, String email) {
		super(username, email);
	}
	public admin(String username) {
		super(username);
	}
	@Override
	public String toString() {
		return null;
	}
}
