package tema4.modules.users.classes;

public class employee extends user{
	private String born_date;
	private String hire_date;
	private float salary;
	public employee(String username, String password,String email,  boolean active, String type, String born_date,
			String hire_date, float salary) {
		super(username, email, password, active, type);
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
	}
	public String getBorn_date() {
		return born_date;
	}
	public void setBorn_date(String born_date) {
		this.born_date = born_date;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	@Override
	public String toString() {
		return null;
	}
}
