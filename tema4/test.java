package tema4;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.utils.regex;
import tema4.utils.validators;

public class test {
	
	public static void main(String[] args){
		
		//funcion para crear fecha compra
		boolean res = false;
		String date_purchase = "";
		dates D = null;
		int num=0;
		do {
			date_purchase = validators.validator_string("Ingresa la de fecha compra.","Ingresa fecha");
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
		System.out.println(D.getDate_purchase());
		//return D; //Lo llamamamos desde el crud para crear o actualizar.

		//funcion para crear fecha entrega,debe recoger la fecha de compra
		String date_delivery = "";
		String str;
		do {
			date_delivery = validators.validator_string("Ingresa fecha de entrega, debe ser un día mayor a la fecha de compra."
					+ "\nFecha de compra: "+D.getDate_purchase(),"Ingresa fecha");
			res = regex.validateDate(date_delivery);
			if (res == false) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new dates(date_delivery);
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
		System.out.println(D.getDate_delivery());
		num=D.compare_dates(D);
		if(num==1) {
			str="La fecha de entrega es correcta, "+ D.getDate_delivery() + " ya que es de "+num+" día respecto a la "
					+ "fecha de compra.\n"+ D.getDate_purchase();
		}else {
			str="La fecha de entrega no es correcta,"+ D.getDate_delivery() + " ya que es de "+num+" días respecto a la "
					+ "fecha de compra.\n"+ D.getDate_purchase();
		}
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(num);
	}//end main
}
