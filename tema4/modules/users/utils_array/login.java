package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.menu.menu_admin;
import tema4.modules.users.menu.menu_client;
import tema4.modules.users.menu.menu_employee;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;

public class login {
	public static void login_user (){
		if(singleton_users.userclient.isEmpty() && singleton_users.useradmin.isEmpty() && singleton_users.useremployee.isEmpty()){
			JOptionPane.showMessageDialog(null,"No se encuentran cuentas, regístrese previamente.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			singleton_users.U = CRUD.new_client_pass("Ingresa el nombre de usuario para tu cuenta.","Ingresar Nombre de usuario","Ingresa la contraseña de tu cuente","Ingresa Contraseña");
			String type = find.find_login_user(singleton_users.U);
			switch(type) {
				case "Admin":
					menu_admin.admin();
					break;
				case "Cliente":
					menu_client.client();
					break;
				case "Empleado":
					menu_employee.employee();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto.", "Error", JOptionPane.ERROR_MESSAGE);
					break;
			}
		}
	}
}
