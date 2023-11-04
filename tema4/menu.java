 package tema4;
import javax.swing.JOptionPane;

import tema4.classes.accessory;
import tema4.classes.laptop;
import tema4.classes.smartphone;
import tema4.functions.CRUD;
public class menu {
	public static void menu_main() {
		int menu_main;
		laptop L = null;
		smartphone S = null;
		accessory A = null;
		int menu_sec=0;
		boolean validator=true;
		boolean validator2=true;
		String[]buttons_main={
				"Laptop",
				"Smartphone",
				"Accesorios",
				"Salir"};
		String[]buttons_sec={
				"Create",
				"Read All",
				"Read One",
				"Update",
				"Delete",
				"Atrás"};
		do {
			menu_main=JOptionPane.showOptionDialog(
					null,
					"¿Con cuál producto quieres trabajar?",
					"CRUD",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_main,
					buttons_main[0]);
			switch(menu_main){
				case 0:
					do {
						menu_sec=JOptionPane.showOptionDialog(
								null,
								"Elige la opción que quieras usar.",
								"CRUD",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_sec,
								buttons_sec[0]);
						switch(menu_sec) {
							case 0:
								L=(laptop)CRUD.create(menu_main);
								validator2=true;
								break;
							case 1:
								if(L!=null) {
									CRUD.read_all(L);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 2:
								if(L!=null) {
									CRUD.read(L);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 3:
								if(L!=null){
									L=(laptop)CRUD.update(L);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 4:
								if(L!=null){
									L=(laptop)CRUD.delete(L);
									JOptionPane.showMessageDialog(null,"Laptop eliminado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 5:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
								break;
							default:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
								System.exit(0);
								break;
						}//end switch
					}while(validator2==true);
					break;
				case 1:
					do {
						menu_sec=JOptionPane.showOptionDialog(
								null,
								"Elige la opción que quieras usar.",
								"CRUD",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_sec,
								buttons_sec[0]);
						switch(menu_sec) {
							case 0:
								S=(smartphone)CRUD.create(menu_main);
								validator2=true;
								break;
							case 1:
								if(S!=null) {
									CRUD.read_all(S);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 2:
								if(S!=null) {
									CRUD.read(S);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 3:
								if(S!=null){
									S=(smartphone)CRUD.update(S);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 4:
								if(S!=null){
									S=(smartphone)CRUD.delete(S);
									JOptionPane.showMessageDialog(null,"Smartphone eliminado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 5:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
								break;
							default:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
								System.exit(0);
								break;
						}//end switch
					}while(validator2==true);
					break;
				case 2:
					do {
						menu_sec=JOptionPane.showOptionDialog(
								null,
								"Elige la opción que quieras usar.",
								"CRUD",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_sec,
								buttons_sec[0]);
						switch(menu_sec) {
							case 0:
								A=(accessory)CRUD.create(menu_main);
								validator2=true;
								break;
							case 1:
								if(A!=null) {
									CRUD.read_all(A);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 2:
								if(A!=null) {
									CRUD.read(A);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 3:
								if(A!=null){
									A=(accessory)CRUD.update(A);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 4:
								if(A!=null){
									A=(accessory)CRUD.delete(A);
									JOptionPane.showMessageDialog(null,"Accesorio eliminado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
								}else {
									JOptionPane.showMessageDialog(null,"No se ha podido encontrar el Accesorio que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
								}//end if
								validator2=true;
								break;
							case 5:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
								break;
							default:
								validator2=false;
								JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
								System.exit(0);
								break;
						}//end switch
					}while(validator2==true);
					break;
				case 3:
					validator=false;
					validator2=false;
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					break;
				default:	
					validator=false;
					validator2=false;
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					break;
			}//end switch
		}while(validator==true);
	}//end menu_main
}//end class menu