package tema4.modules.users.menu;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD_functions.read;
import tema4.modules.users.classes.singleton_users;

public class menu_client {
	public static void client() {
		singleton_users.C.setActive(true);
		JOptionPane.showMessageDialog(null, "Eres cliente.","Acceso Correcto",JOptionPane.INFORMATION_MESSAGE);
		String[]buttons_main={
			"Laptop",
			"Smartphone",
			"Accesorio",
			"Logout"};
		int menu_crud=0;
		String[]buttons_main_premium={
			"Laptop",
			"Smartphone",
			"Accesorio",
			"PcGaming",
			"Logout"};
		int menu_crud_premium=0;
		boolean validator=true;
		if(singleton_users.C.isPremium()){
			do {
			menu_crud_premium=JOptionPane.showOptionDialog(
				null,
				"Elige una opción",
				"Productos",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons_main_premium,
				buttons_main_premium[0]);
			switch (menu_crud_premium) {
				case 0:
					if(singleton.L!=null) {
						read.read_laptop();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;							
					break;
				case 1:
					if(singleton.S!=null) {
						read.read_smartphone();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;
					break;
				case 2:
					if(singleton.A!=null) {
						read.read_accessory();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;
					break;
				case 3:
					if(singleton.PC!=null) {
						read.read_pcgaming();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Cerrando sesión.","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					validator=false;
					break;
				default:
					validator=false;
					System.exit(0);
					break;
			}
		}while(validator==true);
		}else{
			do {
			menu_crud=JOptionPane.showOptionDialog(
				null,
				"Elige una opción",
				"Productos",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons_main,
				buttons_main[0]);
			switch (menu_crud) {
				case 0:
					if(singleton.L!=null) {
						read.read_laptop();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;							
					break;
				case 1:
					if(singleton.S!=null) {
						read.read_smartphone();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;
					break;
				case 2:
					if(singleton.A!=null) {
						read.read_accessory();
					}else {
						JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
					}//end if
					validator=true;
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Cerrando sesión.","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					validator=false;
					break;
				default:
					validator=false;
					System.exit(0);
					break;
			}
		}while(validator==true);
		}
		
		
	}
}
