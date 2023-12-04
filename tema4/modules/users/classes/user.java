package tema4.modules.users.classes;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class user {
	private String username;
	private String email;
	private String password;
	private boolean active;
	public user(String username, String password,String email, boolean active) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.active = active;
	}
	public user(String username) {
		this.username = username;
	}
	public user(String username,String password) {
		this.username = username;
		this.password = password;
	}
	public boolean equals(Object param){
		return getUsername().equals(((user)param).getUsername());
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
		return getEncryptedPassword(password);
	}
	public void setPassword(String password) {
    this.password = password;
	}
	//Método para encriptar la contraseña. Esta no se almacena encriptada, 
	//sino que se encripta cuando alguien quiere extraerla de GetPassword.
	private String getEncryptedPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hashedPassword);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return null;
	}
}