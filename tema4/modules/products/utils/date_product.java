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
	public static dates insert_date_delivery(dates P) {
		dates D = null;
		String date_delivery = "";
		String str;
		String day="";
		boolean res = false;
		int compare;
		int sub;
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
					compare=P.compare_dates(D);
					switch (compare) {
						case 1:
							str = "La fecha de entrega no es correcta, "+ date_delivery + "\nEs anterior respecto a la "
									+ "fecha de compra.\n"+ P.getDate_purchase();
							res = false;
							break;
						case 2:
							sub=P.subtract_days(D);
							if(sub==1) {
								day="día";
							}else {
								day="días";
							}
							switch(sub) {
								case 1:
									res = D.check_date();
									str = "Fecha de entrega correcta: "+ date_delivery + ".\nDebe ser "+sub+" "+day+" más respecto a la "
											+ "fecha de compra.\n"+ P.getDate_purchase();
									break;
								case 2:
									str = "Fecha de entrega incorrecta: "+ date_delivery + ".\nEs "+sub+" "+day+" más respecto a la "
											+ "fecha de compra.\n"+ P.getDate_purchase()+"\nIngresa una fecha 1 día posterior a la fecha de compra.";
									res=false;
									break;
								default:
									str = "Fecha de entrega incorrecta: "+ date_delivery + ".\nEs "+sub+" "+day+" más respecto a la "
											+ "fecha de compra.\n"+ P.getDate_purchase()+"\nIngresa una fecha 1 día posterior a la fecha de compra.";
									res=false;
									break;
							}
							break;
						default:
							str = "La fecha debe ser de 1 día posterior a la fecha de compra.\n"+ P.getDate_purchase();
							res = false;
							break;
					} // end switch
					JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
				}//end if
			}//end if
		} while ((!res));
		return D;
	}//end insert_date_delivery
	public static dates insert_date_return(dates P) {
		dates D = null;
		String date_return= "";
		String str;
		boolean res = false;
		int compare;
		int sub;
		do {
			date_return = validators.validator_string("Ingresa fecha de de devolución.\nTienes 15 días para devolverlo a partir del:"
					+ "\n "+P.getDate_delivery(),"Ingresa fecha");
			res = regex_date.validateDate(date_return);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				D = new dates(date_return);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					compare=P.compare_dates(D);
					switch (compare) {
						case 1:
							str = "La fecha de entrega no es correcta, "+ date_return + "\nEs anterior respecto a la "
									+ "fecha de entrega.\n"+ P.getDate_delivery();
							res = false;
							break;
						case 2:
							sub=P.subtract_days(D);
							System.out.println(sub);
							if(sub >= 0 && sub <=15) {
								res = D.check_date();
								str = "Fecha de entrega correcta: "+ date_return + ".\nEstá entre 1 y 15 días respecto a la "
										+ "fecha de entrega.\n"+ P.getDate_delivery();
							}else {
								str = "Fecha de entrega incorrecta: "+ date_return + ".\nDebe estar entre 1 y 15 días respecto a la "
										+ "fecha de entrega.\n"+ P.getDate_delivery()+"\n";
								res=false;
							}
							break;
						default:
							str = "La fecha debe estar entre 1 y 15 días respecto a la fecha de entrega.\n"+ P.getDate_delivery();
							res = false;
							break;
					} // end switch
					JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
				}//end if
			}//end if
		} while ((!res));
		return D;
	}
}