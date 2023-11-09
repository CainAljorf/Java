package tema4.modules.products.utils;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.utils.regex_date;
import tema4.utils.validators;

public class date_product {
	public static dates insert_date_purchase(String message, String title){
		//funcion para crear fecha compra
		boolean res = false;
		String date_purchase = "";
		dates D = null;
		do {
			date_purchase = validators.validator_string(message,title);
			res = regex_date.validateDate(date_purchase);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new dates(date_purchase);
				res = D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return D;
	}//end insert_date_purchase
	public static dates insert_date_delivery(String message,String title,dates P) {
		dates D = null;
		String date_delivery = "";
		String str;
		boolean res = false;
		int num;
		do {
			date_delivery = validators.validator_string("Ingresa fecha de entrega, debe ser un día mayor a la fecha de compra."
					+ "\nFecha de compra: "+P.getDate_purchase(),"Ingresa fecha");
			res = regex_date.validateDate(date_delivery);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new dates(date_delivery);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					num=P.compare_dates(D);
					switch (num) {
						case 1:
							str="La fecha de entrega no es correcta,"+ D.getDate_delivery() + " ya que es de anterior respecto a la "
									+ "fecha de compra.\n"+ P.getDate_purchase();
							break;
						case 2:
							str="La fecha de entrega es correcta, "+ D.getDate_delivery() + " ya que es 1 día posterior respecto a la "
									+ "fecha de compra.\n"+ P.getDate_purchase();
							break;
						default:
							str="La fecha debe ser de 1 día posterior a la fecha de compra.\n"+ P.getDate_purchase();
							break;
					} // end switch
					JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
					res = D.check_date();
				}//end if
			}//end if
		} while ((!res));
		return D;
	}//end insert_date_delivery
}