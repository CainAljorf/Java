package tema4.modules.users.utils;

import javax.swing.JOptionPane;

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
}
