package tema4;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.utils.regex_date;
import tema4.utils.validators;

public class test {
	
	public static void main(String[] args){
		dates P = new dates("30/03/1993");
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
	}//end main
}
