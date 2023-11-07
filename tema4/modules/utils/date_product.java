package tema4.functions;
import javax.swing.JOptionPane;

import tema4.classes.date;
public class date_product {
	public static String insert_date(String message, String title) {
		boolean res = false;
		String date = "";
		String date2 = "";
		date num = null;

		do {
			date = validators.validator_string(message,title);
			res = regex.validateDate(date);
			if (res == false) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				res = true;
				num = new date(date2);
				System.out.println(num.toString());
				res = num.check_date();
				if (res == false) {
					res = false;
					JOptionPane.showMessageDialog(null, "Invalid data", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
					edad = n.restarFechaSistema();
					// end del fecha sistema
					if (edad < 18 || edad > 99) {// Condicio, per a una edad valida
						res = false;
						JOptionPane.showMessageDialog(null, "Invalid age", "Error", JOptionPane.ERROR_MESSAGE);
						JOptionPane.showMessageDialog(null, "Please\nYou must are legal age ", "The age",JOptionPane.INFORMATION_MESSAGE);
					} else {
						res = true;
					} // end third else
				} // end second else
			} // end else
		} while ((res == false));

		System.out.println(num);
	}//end insert_date
	
}
