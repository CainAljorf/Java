package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;

public class login {
	public static void login_user (){
		int location = -1;
		
		if(singleton_users.userclient.isEmpty()&& singleton_users.useradmin.isEmpty()&&singleton_users.useremployee.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay ninguna cuenta con estos datos, regístrese previamente.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton_users.C = CRUD.new_client_pass("Ingresa el nombre de usuario para tu cuenta.","Ingresar Nombre de usuario");
			location = find.find_login_user(singleton_users.C);
			if (location != -1) {
				singleton_users.C = singleton_users.userclient.get(location);
				JOptionPane.showMessageDialog(null, "Login correcto.", "Error", JOptionPane.INFORMATION_MESSAGE);
				}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado esta cuenta..", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
