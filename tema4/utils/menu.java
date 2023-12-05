package tema4.utils;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.users.classes.admin;
import tema4.modules.users.classes.client;
import tema4.modules.users.classes.employee;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils_array.login;
import tema4.modules.users.utils_array.register;

public class menu {
	public static void menu_main() {
		singleton.productlaptop = new ArrayList <laptop> ();
		singleton.productsmartphone = new ArrayList <smartphone> ();
		singleton.productaccessory = new ArrayList <accessory> ();
		singleton_users.useradmin = new ArrayList <admin> ();
		singleton_users.userclient = new ArrayList <client> ();
		singleton_users.useremployee = new ArrayList <employee> ();
		singleton.array_ID = new ArrayList <String> ();
		
		CRUD.create_admin();
		CRUD.create_employee();
		boolean validator=true;
		int menu_user=0;
		String[]buttons_user={
				"Register",
				"Login",
				"Salir"};
		do {
			menu_user=JOptionPane.showOptionDialog(
					null,
					"Que quieres hacer?",
					"Menú Principal",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_user,
					buttons_user[0]);
			switch(menu_user){
				case 0:
					register.client();
					validator=true;
					break;
				case 1:
					if(singleton_users.U == null && singleton_users.E == null && singleton_users.A == null && singleton_users.D == null ) {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el usuario.","Error",JOptionPane.ERROR_MESSAGE);
					}else {
						login.login_user();
					}
					validator=true;
					break;
				default:
					validator=false;
					JOptionPane.showMessageDialog(null,"Cerrando el programa.","Información",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					break;
			}
		}while(validator==true);
	}//end menu_main
}//end class menu