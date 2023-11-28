package tema4.modules.users.utils;
import javax.swing.JOptionPane;

import tema4.classes.dates;
import tema4.modules.users.classes.admin;
import tema4.modules.users.classes.client;
import tema4.modules.users.classes.employee;
import tema4.modules.users.classes.singleton_users;

public class CRUD {
	public static client create_client() {
		String str = "";
		String register_date = dates_functions.date_system();
		String password= insert_data.insert_password("Ingresa la contraseña para tu usuario.\nDebe contener como mínimo 8 carácteres "
				+ "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");
		String email= insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
		singleton_users.C = new client(singleton_users.C.getUsername(),password,email,false,"Cliente",((client) singleton_users.C).isPremium(),register_date);
		str = "Usuario registrado correctamente.";
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return (client) singleton_users.C;
	}// end create_laptop
	public static admin create_admin() {
		String password = "camarber1";
		String email = "cain@cain.com";
		singleton_users.A = new admin("admin",password,email,false,"Admin");
		return (admin) singleton_users.A;
	}// end create_laptop
	public static employee create_employee() {
		String password= "camarber1";
		String email= "pepe@pepe.com";
		dates hire_date = new dates("28/11/2010");
		dates born_date = new dates("04/01/1992");
		singleton_users.E = new employee("employee",password,email,false,"Empleado",hire_date,born_date,1400);
		return (employee) singleton_users.E;
	}// end create_laptop
	public static client new_client(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		return new client(singleton_users.username);
	}
	public static admin new_admin(String message, String title) {
//		singleton_users.username=insert_data.insert_ID(message,title);
		return new admin(singleton_users.username);
	}
	public static employee new_employee(String message, String title) {
//		singleton_users.username=insert_data.insert_ID(message,title);
		return new employee(singleton_users.username);
	}
	public static client new_client_pass(String message, String title,String message2, String title2) {
		singleton_users.username=insert_data.insert_username(message,title);
		singleton_users.password=insert_data.insert_password(message2, title2);
		return new client(singleton_users.username,singleton_users.password);
	}
}
