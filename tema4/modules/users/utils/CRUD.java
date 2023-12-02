package tema4.modules.users.utils;
import javax.swing.JOptionPane;

import tema4.classes.dates;
import tema4.modules.users.classes.admin;
import tema4.modules.users.classes.client;
import tema4.modules.users.classes.employee;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.classes.user;

public class CRUD {
	public static client create_client() {
		String register_date = dates_functions.date_system();
		String password= insert_data.insert_password("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "
				+ "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");
		String email= insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
		singleton_users.C = new client(singleton_users.C.getUsername(),email,password,false,"Cliente",singleton_users.C.isPremium(),register_date);
		JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton_users.C;
	}// end create_laptop
	public static admin create_admin_panel() {
		String password= insert_data.insert_password("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "
				+ "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");
		String email= insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
		singleton_users.A = new admin(singleton_users.A.getUsername(),email,password,false,"Admin");
		JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
		singleton_users.useradmin.add(singleton_users.A);
		return singleton_users.A;
	}// end create_laptop
	public static employee create_employee_panel() {
		String str = "";
		String password= insert_data.insert_password("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "
				+ "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");
		String email= insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
		dates birth_date= insert_data.insert_date_born("Ingresa la fecha de nacimiento.","Ingresar Email");
		String hire_date = dates_functions.date_system();
		if(singleton_users.D.isAdult(birth_date)) {
			singleton_users.E = new employee(singleton_users.E.getUsername(),email,password,false,"Empleado",birth_date,hire_date,2);
			str= "Usuario registrado correctamente.";
		}else {
			str="La edad de tu empleado debe de tener más de 18 años";
		}//end if
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton_users.E;
	}// end create_laptop
	public static admin create_admin() {
		String username = "admin";
		String password = "admin";
		String email = "cain@cain.com";
		singleton_users.A = new admin(username,email,password,false,"Admin");
		singleton_users.useradmin.add(singleton_users.A);
		return singleton_users.A;
	}// end create_laptop
	public static employee create_employee() {
		String username = "pepe";
		String password= "pepe";
		String email= "pepe@pepe.com";
		String hire_date = "28/11/2010";
		dates born_date = new dates("04/01/1992");
		singleton_users.E = new employee(username,email,password,false,"Empleado",born_date,hire_date,1400);
		singleton_users.useremployee.add(singleton_users.E);
		return singleton_users.E;
	}// end create_laptop
	public static client new_client(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		return new client(singleton_users.username);
	}
	public static admin new_admin(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		return new admin(singleton_users.username);
	}
	public static employee new_employee(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		return new employee(singleton_users.username);
	}
	public static user new_client_pass(String message, String title,String message2, String title2) {
		singleton_users.username=insert_data.insert_username(message,title);
		singleton_users.password=insert_data.insert_password(message2, title2);
		return new user(singleton_users.username,singleton_users.password);
	}
}
