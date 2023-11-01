package tema4;

import javax.swing.JOptionPane;
public class insert_data {
	public static String insert_ID() {
		boolean res = false;
		String ID = "";
		do {
			ID = validators.validator_string("Ingresa un ID alfanúmerico como el siguiente ejemplo.\nABC-123", "Ingresar ID");
			res = regex.validateProductID(ID);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "ID ingresado incorrecto. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return ID;
	}//end insert_ID
	public static String insert_date(String message, String title) {
		boolean res = false;
		String date = "";
		do {
			date = validators.validator_string(message,title);
			res = regex.validateDate(date);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return date;
	}//end insert_date
}//end insert_data
