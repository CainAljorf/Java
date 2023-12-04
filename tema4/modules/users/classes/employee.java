package tema4.modules.users.classes;

import tema4.classes.dates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class employee extends user{
	private dates born_date;
	private String hire_date;
	private float salary;
	public employee(String username, String password,String email,  boolean active, dates born_date,
			String hire_date, float salary) {
		super(username, email, password, active);
		this.born_date = born_date;
		this.hire_date = hire_date;
		this.salary = salary;
	}
	public employee(String username, String password) {
		super(username, password);
	}
	public employee(String username) {
		super(username);
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
		increaseSalary();
	}
	public dates getBorn_date() {
		return born_date;
	}
	public void setBorn_date(dates born_date) {
		this.born_date = born_date;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	public void increaseSalary() {//Método para aumentar 100€ por cada 5 años trabajados
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hireDate = LocalDate.parse(this.hire_date, formatter);
		long years = ChronoUnit.YEARS.between(hireDate, now);
		long periods = years / 5;
		float increase = periods * 100;
		this.salary += increase;
	}
	@Override
	public String toString() {
		String str = "";
		str = str + "Username: " + getUsername() + "\n";
		str = str + "Email: " + getEmail() + "\n";
		str = str + "Password: " + getPassword() + "\n";
		str = str + "Date of birth: " + getBorn_date() + "\n";
		str = str + "Date of contraction: " + getHire_date() + "\n";
		str = str + "Salary: " + getSalary() + "\n";
		return str;
	}
}
