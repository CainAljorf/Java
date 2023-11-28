package tema4.modules.users.utils;
import javax.swing.JOptionPane;

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
		singleton_users.C.setActive(false);
		((client) singleton_users.C).setType("Cliente");
		singleton_users.C = new client(singleton_users.C.getUsername(),password,email,singleton_users.C.isActive(),((client) singleton_users.C).getType(),((client) singleton_users.C).isPremium(),register_date);
		str = "Usuario registrado correctamente.";
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return (client) singleton_users.C;
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
	public static client new_client_pass(String message, String title) {
		singleton_users.username=insert_data.insert_username(message,title);
		singleton_users.password=insert_data.insert_password(message, title);
		return new client(singleton_users.username,singleton_users.password);
	}
}
