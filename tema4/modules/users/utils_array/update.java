package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.insert_data;
import tema4.utils.validators;

public class update {
    public static void updates_admin() {
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Username", "Password", "Email" },
					"Username");
			if (opt == null) {
				JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} else{
				switch (opt.toString()) {
					case "Username":
                        str = update_users.set_name_admin();
                        break;
					case "Password":
                        singleton_users.A.setPassword(insert_data.insert_password("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "
                    + "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña"));
                        str = "Contraseña actualizada a: " + singleton_users.A.getPassword();
						break;
					case "Email":
						singleton_users.A.setEmail(insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email"));
                        str = "Correo electrónico actualizado a: " + singleton_users.A.getEmail();
						break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		}// end if
	}// end read_one_admin
	public static void updates_employee() {
		String str = "";
			Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Username", "Password", "Email", "Fecha Nacimiento", "Fecha contratación","Sueldo"},
					"Username");
			if (opt == null) {
				JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} else{
				switch (opt.toString()) {
					case "Username":
						str = update_users.set_name_employee();
						break; 
					case "Password":
						singleton_users.E.setPassword(validators.validator_string("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "
                    + "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña"));
                        str = "Contraseña actualizada a: " + singleton_users.E.getPassword();
						break;
					case "Email":
						singleton_users.E.setEmail(insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email"));
                        str = "Correo electrónico actualizado a: " + singleton_users.E.getEmail();
						break;
					case "Fecha Nacimiento":
						singleton_users.E.setBorn_date(insert_data.insert_date_born("Ingresa la fecha de nacimiento.","Ingresar Fecha de nacimiento"));
                        str = "Fecha de nacimiento actualizada a: " + singleton_users.E.getBorn_date();
						break; 
					case "Fecha contratación":
                        singleton_users.E.setHire_date(insert_data.insert_date_hire("Ingresa la fecha de contratación.","Ingresar Fecha de contratación"));
                        str = "Fecha de contratación actualizada a: " + singleton_users.E.getHire_date();
						break;
					case "Sueldo":
                        singleton_users.E.setSalary(validators.validator_float("Ingresa el sueldo del empleado.","Ingresar Sueldo"));
                        str = "Sueldo actualizado a: " + singleton_users.E.getSalary();
						break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		}// end if
	}// end read_one_employee
	public static void updates_client() {
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Username", "Password", "Email", "Fecha de Alta"},
				"Username");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else{
			switch (opt.toString()) {
				case "Username":
					update_users.set_name_client();
                    str = "Nombre de usuario actualizado a: " + singleton_users.C.getUsername();
					break;
				case "Password":
                    insert_data.insert_password("Ingresa la contraseña de usuario.\nDebe contener como mínimo 8 carácteres "            
                    + "y contener alguno de estos símbolos especiales: @$!%*?&.","Ingresar contraseña");  
                    str = "Contraseña actualizada a: " + singleton_users.C.getPassword();      
					break;
				case "Email":
                    insert_data.insert_email("Ingresa el correo electrónico.","Ingresar Email");
                    str = "Correo electrónico actualizado a: " + singleton_users.C.getEmail();
					break;
				case "Fecha de Alta":
                    insert_data.insert_date_register();
                    str = "Fecha de registro actualizada a: " + singleton_users.C.getRegister_date();
					break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_one_client
}
