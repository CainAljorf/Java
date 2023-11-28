package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;
import tema4.modules.users.classes.client;

public class register {
	public static void client() {
		int location = -1;
		singleton_users.C = CRUD.new_client("Ingresa el nombre de usuario para tu cuenta.","Ingresar Nombre de usuario");
		location = find.find_username(singleton_users.C);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ese nombre de usuario ya está en uso. Por favor elige otro.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton_users.C = CRUD.create_client();
			singleton_users.userclient.add((client) singleton_users.C);
		}
	}
}
