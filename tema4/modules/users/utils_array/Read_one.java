package tema4.modules.users.utils_array;

import javax.swing.JOptionPane;

import tema4.modules.users.classes.singleton_users;

public class Read_one {
    public static void read_one_admin() {
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
						str = "Nombre de usuario: " + singleton_users.A.getUsername();
						break;
					case "Password":
						str = "Contraseña: " + singleton_users.A.getPassword();
						break;
					case "Email":
						str = "Correo electrónico: " + singleton_users.A.getEmail();
						break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		}// end if
	}// end read_one_admin
	public static void read_one_employee() {
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
						str = "Nombre de usuario: " + singleton_users.E.getUsername();
						break; 
					case "Password":
						str = "Contraseña: " + singleton_users.E.getPassword();
						break;
					case "Email":
						str = "Correo electrónico: " + singleton_users.E.getEmail();
						break;
					case "Fecha Nacimiento":
						str = "Nombre de usuario: " + singleton_users.E.getBorn_date();
						break; 
					case "Fecha contratación":
						str = "Contraseña: " + singleton_users.E.getHire_date();
						break;
					case "Sueldo":
						str = "Correo electrónico: " + singleton_users.E.getSalary();
						break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		}// end if
	}// end read_one_employee
	public static void read_one_client() {
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
					str = "Nombre de usuario: " + singleton_users.C.getUsername();
					break;
				case "Password":
					str = "Contraseña: " + singleton_users.C.getPassword();
					break;
				case "Email":
					str = "Correo electrónico: " + singleton_users.C.getEmail();
					break;
				case "Fecha de Alta":
					str = "Fecha de registro: " + singleton_users.C.getRegister_date();
					break;
				}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_one_client
}
