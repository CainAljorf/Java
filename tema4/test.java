package tema4;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.utils.regex_product;
import tema4.utils.regex_date;
import tema4.utils.validators;

public class test {
	
	public static void main(String[] args){
		dates P = new dates("30/03/1993");
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
		System.out.println(D);
	
	}//end main
}
