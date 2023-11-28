package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.admin;
import tema4.modules.users.classes.client;
import tema4.modules.users.classes.employee;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.menu.menu_admin;
import tema4.modules.users.menu.menu_client;
import tema4.modules.users.menu.menu_employee;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;

public class login {
	public static void login_user (){
		int location = -1;
		if(singleton_users.userclient.isEmpty() && singleton_users.useradmin.isEmpty() && singleton_users.useremployee.isEmpty()){
			JOptionPane.showMessageDialog(null,"No se encuentran cuentas, regístrese previamente.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton_users.U = CRUD.new_client_pass("Ingresa el nombre de usuario para tu cuenta.","Ingresar Nombre de usuario","Ingresa la contraseña de tu cuente","Ingresa Contraseña");
			String type = find.find_login_user(singleton_users.U);
			System.out.println(location);
			switch(type) {
				case "Admin":
					menu_client.client();
					break;
				case "Cliente":
					menu_client.client();
					break;
				case "Empleado":
					menu_employee.employee();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Fallo otra vez afasfaf", "Error", JOptionPane.ERROR_MESSAGE);
					break;
			}
//			if (location != -1) {
//				singleton_users.U = singleton_users.userclient.get(location);
//				if (singleton_users.U instanceof client) {
//					menu_client.client();
//				}else if(singleton_users.U instanceof employee) {
//					menu_employee.employee();
//				}else if(singleton_users.U instanceof admin) {
//					menu_admin.admin();
//				}
//				JOptionPane.showMessageDialog(null, "Login correcto.", "Error", JOptionPane.INFORMATION_MESSAGE);
//			}else {
//				JOptionPane.showMessageDialog(null, "No se ha encontrado esta cuenta.", "Error", JOptionPane.ERROR_MESSAGE);
//			}
		}
	}
}
