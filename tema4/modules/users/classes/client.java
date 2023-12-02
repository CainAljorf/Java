package tema4.modules.users.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
		return this.premium;
	}
	public void setPremium() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate registerDate = LocalDate.parse(this.getRegister_date(), formatter);
		LocalDate now = LocalDate.now();
		long years = ChronoUnit.YEARS.between(registerDate, now);
		
		if(years > 1) {
			this.premium = true;
		} else {
			this.premium = false;
		}
	}
	public String getRegister_date() {
		return this.register_date;
	}
	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}
	@Override
	public String toString() {
		return null;
	}
}
