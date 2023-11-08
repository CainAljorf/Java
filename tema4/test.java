package tema4;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.utils.regex;
import tema4.utils.validators;

public class test {
	
	public static void main(String[] args){
		boolean res = false;
		String date_purchase = "";
		dates D = null;
		do {
			date_purchase = validators.validator_string("Ingresa fecha compra","Ingresa fecha");
			res = regex.validateDate(date_purchase);
			if (res == false) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new dates(date_purchase);
				if (D.check_date()) {
					res = true;
				}else {
					res = false;
				}
				if (res == false) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		System.out.println(date_purchase);
		System.out.println(D.getDate_purchase());
	}//end main
	
//	num = D.compare_dates(D);
}
