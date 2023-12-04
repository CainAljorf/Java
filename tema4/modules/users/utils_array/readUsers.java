package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;
import tema4.modules.users.classes.singleton_users;

public class readUsers {
    public static void read_admin (){
		int opt = 0;
		int location = -1;
		String type = "";
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton_users.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton_users.useradmin.size();i++){
							str = singleton_users.useradmin.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						type = "null";
						singleton_users.A = CRUD.new_admin("Ingresa el usuario.","Ingresar usuario");
						location = find.find_username(singleton_users.A);
						type = find.find_type(singleton_users.A);
						if (location != -1 && type.equals("Admin")) {
							singleton_users.A = singleton_users.useradmin.get(location);
							Read_one.read_one_admin();;
						}else {
							JOptionPane.showMessageDialog(null, "El usuario que quieres leer debe ser administrador.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
    public static void read_employee (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton_users.useremployee.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton_users.useremployee.size();i++){
							str = singleton_users.useremployee.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton_users.E = CRUD.new_employee("Ingresa el usuario.","Ingresar usuario");
						location = find.find_username(singleton_users.E);
						String type = find.find_type(singleton_users.E);
						if (location != -1 && type.equals("Empleado")) {
							singleton_users.E = singleton_users.useremployee.get(location);
							Read_one.read_one_employee();
						}else {
							JOptionPane.showMessageDialog(null, "El usuario que quieres leer debe ser empleado.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
    public static void read_client (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton_users.userclient.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton_users.userclient.size();i++){
							str = singleton_users.userclient.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton_users.C = CRUD.new_client("Ingresa el usuario.","Ingresar usuario");
						location = find.find_username(singleton_users.C);
						String type = find.find_type(singleton_users.C);
						if (location != -1 && type.equals("Cliente")) {	
							singleton_users.C = singleton_users.userclient.get(location);
							Read_one.read_one_client();
						}else {
							JOptionPane.showMessageDialog(null, "El usuario que quieres leer debe ser cliente.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
}
