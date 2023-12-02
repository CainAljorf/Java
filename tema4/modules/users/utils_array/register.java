package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;

public class register {
	public static void client() {
		int location = -1;
		singleton_users.C = CRUD.new_client("Ingresa el nombre de usuario para tu cuenta.","Ingresar Nombre de usuario");
		location = find.find_username(singleton_users.C);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está en uso. Por favor elige otro.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton_users.C = CRUD.create_client();
			singleton_users.userclient.add(singleton_users.C);
		}
	}
	public static void admin(){
		int location = -1;
		singleton_users.A = CRUD.new_admin("Ingresa el nombre de usuario para la cuenta.","Ingresar Nombre de usuario");
		location = find.find_username(singleton_users.A);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está en uso. Por favor elige otro.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton_users.A = CRUD.create_admin_panel();
			singleton_users.useradmin.add(singleton_users.A);
		}
	}
	public static void employee(){
		int location = -1;
		singleton_users.E = CRUD.new_employee("Ingresa el nombre de usuario para la cuenta.","Ingresar Nombre de usuario");
		location = find.find_username(singleton_users.E);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está en uso. Por favor elige otro.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton_users.E = CRUD.create_employee_panel();
			singleton_users.useremployee.add(singleton_users.E);
		}
	}
}
