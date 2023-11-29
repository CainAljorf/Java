package tema4.modules.users.utils;
import javax.swing.JOptionPane;

import tema4.modules.users.classes.admin;
import tema4.modules.users.classes.client;
import tema4.modules.users.classes.employee;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.classes.user;

public class CRUD {
	public static client create_client() {
		String str = "";
		String register_date = dates_functions.date_system();
		String password= insert_data.insert_password("Ingresa la contraseña para tu usuario.\nDebe contener como mínimo 8 carácteres "
				+ "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");
		String email= insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
		singleton_users.C = new client(singleton_users.C.getUsername(),email,password,false,"Cliente",singleton_users.C.isPremium(),register_date);
		str = "Usuario registrado correctamente.";
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton_users.C;
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
		String born_date = "04/01/1992";
		singleton_users.E = new employee(username,email,password,false,"Empleado",hire_date,born_date,1400);
		singleton_users.useremployee.add(singleton_users.E);
		return singleton_users.E;
	}// end create_laptop
	public static client new_client(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		return new client(singleton_users.username);
	}
	public static user new_client_pass(String message, String title,String message2, String title2) {
		singleton_users.username=insert_data.insert_username(message,title);
		singleton_users.password=insert_data.insert_password(message2, title2);
		return new user(singleton_users.username,singleton_users.password);
	}
}
