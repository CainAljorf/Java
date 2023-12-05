package tema4.modules.users.menu;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD_functions.read;
import tema4.modules.products.utils.CRUD_functions.update;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils_array.readUsers;

public class menu_employee {
	public static void employee() {
		singleton_users.E.setActive(true);
		JOptionPane.showMessageDialog(null, "Eres empleado.","Acceso Correcto",JOptionPane.INFORMATION_MESSAGE);
		String[]buttons_main_menu={
			"Products",
			"Users",
			"Logout"};
		String[]buttons_sec={
			"Read",
			"Update",
			"Atrás"};
		int menu_main_p=0;
		int menu_products=0;
		int menu_crud=0;
		boolean validator=true;
		boolean validator2=true;
		boolean validator3=true;
		String[]buttons_main={
			"Laptop",
			"Smartphone",
			"Accesorio",
			"Atrás"};
		do {
			menu_main_p=JOptionPane.showOptionDialog(
					null,
					"Elige una opción",
					"Tipo de CRUD",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_main_menu,
					buttons_main_menu[0]);
			switch(menu_main_p) {
				case 0:
					do {
						menu_products=JOptionPane.showOptionDialog(
								null,
								"Elige una opción",
								"Products",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_main,
								buttons_main[0]);
						switch(menu_products) {
							case 0:
								do {
									menu_crud=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"CRUD",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
									switch (menu_crud) {
										case 0:
											if(singleton.L!=null) {
												read.read_laptop();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;							
											break;
										case 1:
											if(singleton.L!=null){
												update.update_laptop();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;
											break;
										case 2:
											validator3=false;
											break;
										default:
											validator3=false;
											System.exit(0);
											break;
									}
								}while(validator3==true);
								break;
							case 1:
								do {
									menu_crud=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"CRUD",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
									switch (menu_crud) {
										case 0:
											if(singleton.S!=null) {
												read.read_smartphone();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;							
											break;
										case 1:
											if(singleton.S!=null){
												update.update_smartphone();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;
											break;
										case 2:
											validator3=false;
											break;
										default:
											validator3=false;
											System.exit(0);
											break;
									}
								}while(validator3==true);
								break;
							case 2:
								do {
									menu_crud=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"CRUD",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
									switch (menu_crud) {
										case 0:
											if(singleton.A!=null) {
												read.read_accessory();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;							
											break;
										case 1:
											if(singleton.A!=null){
												update.update_accessory();
											}else {
												JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
											}//end if
											validator3=true;
											break;
										case 2:
											validator3=false;
											break;
										default:
											validator3=false;
											System.exit(0);
											break;
									}
								}while(validator3==true);
								break;
							case 3:
								validator2=false;
								break;
						}//end switch
					}while(validator2==true);
					break;
				case 1:
					readUsers.read_client();
					validator=true;
					break;
				case 2:
					validator=false;
					JOptionPane.showMessageDialog(null, "Cerrando sesión.","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					validator=false;
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
					break;
			}//end switch
		}while(validator==true);
	}
}
