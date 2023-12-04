package tema4.modules.users.utils;

import javax.swing.JOptionPane;

import tema4.classes.dates;
import tema4.modules.users.classes.singleton_users;
import tema4.utils.regex_date;
import tema4.utils.validators;

public class insert_data {
	public static String insert_username(String message, String title) {
		boolean res = false;
		String username = "";
		do {
			username = validators.validator_string(message,title);
			res = regex.validate_username(username);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "El nombre de usuario ingresado no cumple con los requisitos. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return username;
	}
	public static String insert_password(String message, String title) {
		boolean res = false;
		String password = "";
		do {
			password = validators.validator_string(message,title);
			res = regex.validate_password(password);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "La contraseña ingresada no cumple con los requisitos. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return password;
	}
	public static String insert_email(String message, String title) {
		boolean res = false;
		String email = "";
		do {
			email = validators.validator_string(message,title);
			res = regex.validate_email(email);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "El email ingresado no cumple con los requisitos. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return email;
	}
	public static dates insert_date_born(String message, String title){
		boolean res = false;
		String date_born = "";
		do {
			date_born = validators.validator_string(message,title);
	    	res = regex_date.validateDate(date_born);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton_users.D = new dates(date_born);
				res = singleton_users.D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return singleton_users.D;
	}//end insert_date_born
	public static String insert_date_hire(String message, String title){
		boolean res = false;
		String date = "";
		do {
			date = validators.validator_string(message,title);
	    	res = regex_date.validateDate(date);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				res = true;
			} // end if
		} while ((res == false));
		return date;
	}//end insert_date_hire
	public static String insert_date_register(){
		boolean res = false;
		String date_register = "";
		do {
			date_register = validators.validator_string("Ingresa la fecha de registro.","Ingresar Fecha de registro");
	    	res = regex_date.validateDate(date_register);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton_users.D = new dates(date_register);
				res = singleton_users.D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return date_register;
	}//end insert_date_register
}
