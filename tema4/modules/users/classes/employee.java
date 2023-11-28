package tema4.modules.users.classes;

import tema4.classes.dates;

public class employee extends user{
	private dates born_date;
	private dates hire_date;
	public employee(String username, String email, String password, boolean active, String type, dates born_date,
			dates hire_date) {
		super(username, email, password, active, type);
		this.born_date = born_date;
		this.hire_date = hire_date;
	}
	public employee(String username, String email) {
		super(username, email);
	}
	public employee(String username) {
		super(username);
	}
	public dates getBorn_date() {
		return born_date;
	}
	public void setBorn_date(dates born_date) {
		this.born_date = born_date;
	}
	public dates getHire_date() {
		return hire_date;
	}
	public void setHire_date(dates hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return null;
	}
}
