package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.Read_one;
import tema4.modules.users.utils.find;
import tema4.modules.users.classes.singleton_users;

public class readUsers {
    public static void read_users (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton_users.useradmin.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
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
						singleton_users.A = CRUD.new_admin("Ingresa el usuario.","Ingresar ID");
						location = find.find_username(singleton_users.A);
						if (location != -1) {
							singleton_users.A = singleton_users.useradmin.get(location);
							Read_one.read_one();
						}else {
							JOptionPane.showMessageDialog(null, "El laptop que quieres leer no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
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
