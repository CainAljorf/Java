package tema4.modules.products.utils;
import javax.swing.JOptionPane;
import tema4.classes.date;
import tema4.utils.validators;

public class date_product {
	public static date insert_date_purchase(String message, String title){
		boolean res = false;
		String date_purchase = "";
		date D = null;
		int num=0;
		do {
			date_purchase = validators.validator_string(message,title);
			res = regex.validateDate(date_purchase);
			if (res == false) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				res = true;
//				D = new date(date_purchase);
				System.out.println(D.toString());
				res = D.check_date();
				if (res == false) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
//					num = D.compare_dates(D);
				} // end if
			} // end if
		} while ((res == false));
		System.out.println(date_purchase);
		return D;
	}//end insert_date_purchase
}
