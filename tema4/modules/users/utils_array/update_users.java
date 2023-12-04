package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;

public class update_users {

    public static void update_admin (){
     	int location = -1;
        singleton_users.A = CRUD.new_admin("Ingresa el usuario.","Ingresar usuario");
        location = find.find_username(singleton_users.A);
        String type = find.find_type(singleton_users.A);
        if (location != -1 && type.equals("Admin")) {
            singleton_users.A = singleton_users.useradmin.get(location);
            update.updates_admin();
            singleton_users.useradmin.set(location, singleton_users.A);
        }else {
            JOptionPane.showMessageDialog(null, "El usuario que quieres actualizar debe ser administrador.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void update_employee (){
        singleton_users.E = CRUD.new_employee("Ingresa el usuario.","Ingresar usuario");
        int location = find.find_username(singleton_users.E);
        String type = find.find_type(singleton_users.E);
        if (location != -1 && type.equals("Employee")) {
            singleton_users.E = singleton_users.useremployee.get(location);
            update.updates_employee();
        }else {
            JOptionPane.showMessageDialog(null, "El usuario que quieres actualizar debe ser empleado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void update_client (){
        singleton_users.C = CRUD.new_client("Ingresa el usuario.","Ingresar usuario");
        int location = find.find_username(singleton_users.C);
        String type = find.find_type(singleton_users.C);
        if (location != -1 && type.equals("Client")) {
            singleton_users.C = singleton_users.userclient.get(location);
            update.updates_client();
        }else {
            JOptionPane.showMessageDialog(null, "El usuario que quieres actualizar debe ser cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static String set_name_admin() {
		int location = -1;
		String str;
		singleton_users.A_name = CRUD.new_admin("Escribe el usuario al que quieras actualizar.", "Actualizar usuario");
		location = find.find_username(singleton_users.A_name);
        String type = find.find_type(singleton_users.A_name);
		if (location == -1 && type.equals("Admin")) {
            singleton_users.A.setUsername(singleton_users.username);
            str = "Usuario de administrador actualizado a: " + singleton_users.A.getUsername();
		} else {
			str = "Ya hay un administrador con ese nombre.";
		}
		return str;
	}
    public static String set_name_employee() {
        int location = -1;
        String str;
        singleton_users.E_name = CRUD.new_employee("Escribe el usuario al que quieras actualizar.", "Actualizar usuario");
        location = find.find_username(singleton_users.E_name);
        String type = find.find_type(singleton_users.E_name);
        if (location == -1 && type.equals("Employee")) {
            singleton_users.E.setUsername(singleton_users.username);
            str = "Usuario de empleado actualizado a: " + singleton_users.E.getUsername();
        } else {
            str = "Ya hay un empleado con ese nombre.";
        }
        return str;
    }    
    public static String set_name_client() {
        int location = -1;
        String str;
        singleton_users.C_name = CRUD.new_client("Escribe el usuario al que quieras actualizar.", "Actualizar usuario");
        location = find.find_username(singleton_users.C_name);
        String type = find.find_type(singleton_users.C_name);
        if (location == -1 && type.equals("Client")) {
            singleton_users.C.setUsername(singleton_users.username);
            str = "Usuario de cliente actualizado a: " + singleton_users.C.getUsername();
        } else {
            str = "Ya hay un cliente con ese nombre.";
        }
        return str;
    }
}
