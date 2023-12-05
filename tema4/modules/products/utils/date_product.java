package tema4.modules.products.utils;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.classes.singleton;
import tema4.utils.regex_date;
import tema4.utils.validators;

public class date_product {
	
	public static boolean is_promo(int ini, int end) {
		boolean res = false;
		if(ini != 2 && end == 2) {
			res = true;
		}
		return res;
	}
	public static boolean is_promo_nadal(int ini, int end) {
		boolean res = false;
		if(ini != 2 && end == 2) {
			res = true;
		}
		return res;
	}
	public static dates insert_date_purchase(String message, String title){
		boolean res = false;
		String date_purchase = "";
		do {
			date_purchase = validators.validator_string(message,title);
	    	res = regex_date.validateDate(date_purchase);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton.D = new dates(date_purchase);
				res = singleton.D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return singleton.D;
	}//end insert_date_purchase
	public static dates insert_f_ini_sales_nadal(){
		boolean res = false;
		String date_sales_init = "";
		do {
			date_sales_init = validators.validator_string("Escribe la fecha de inicio de rebajas de navidad.\nFormato: Día/Mes/Año XX/XX/XXXX.","Escribe fecha");
	    	res = regex_date.validateDate(date_sales_init);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton.D = new dates(date_sales_init);
				res = singleton.D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return singleton.D;
	}//end insert_f_ini_sales_nadal
	public static dates insert_date_sales_init(){
		boolean res = false;
		String date_sales_init = "";
		do {
			date_sales_init = validators.validator_string("Escribe la fecha de inicio de rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX.","Escribe fecha");
	    	res = regex_date.validateDate(date_sales_init);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton.D = new dates(date_sales_init);
				res = singleton.D.check_date();
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					res = true;
				} // end if
			} // end if
		} while ((res == false));
		return singleton.D;
	}//end insert_date_sales_init
	public static dates insert_f_fin_sales_nadal(dates P){
		String str;
		String date_sales_end = "";
		boolean res = false;
		int compare;
		do {
			date_sales_end = validators.validator_string("Ingresa fecha del fin de las rebajas de navidad, debe ser mayor a la fecha de inicio de rebajas de navidad."
					+ "\nFecha final de rebajas: ","Ingresa fecha");
			res = regex_date.validateDate(date_sales_end);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton.D = new dates(date_sales_end);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					compare=P.compare_dates(singleton.D);
					switch (compare) {
						case 1:
							str = "La fecha de fin de rebajas de navidad no es correcta, "+ date_sales_end + "\nEs anterior respecto a la "
									+ "fecha de inicio de rebajas.\n"+ P.getDate_sales_init();
							res = false;
							break;
						case 2:
							str = "Fecha de fin de rebajas de navidad correcta: "+ date_sales_end + ".\nEs posterior respecto a la "
									+ "fecha de inicio de rebajas.\n"+ P.getDate_sales_init();
							res=true;
							break;
						default:
							str = "La fecha no es correcta, inténtelo de nuevo.\n"+ P.getDate_purchase();
							res = false;
							break;
					} // end switch
					JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
				}//end if
			}//end if
		} while ((!res));
		return singleton.D;
	}//end insert_f_fin_sales_nadal	}
	public static dates insert_date_sales_end(dates P){
		String str;
		String date_sales_end = "";
		boolean res = false;
		int compare;
		do {
			date_sales_end = validators.validator_string("Ingresa fecha del fin de las rebajas, debe ser mayor a la fecha de inicio de rebajas."
					+ "\nFecha final de rebajas: "+P.getDate_sales_init(),"Ingresa fecha");
			res = regex_date.validateDate(date_sales_end);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				singleton.D = new dates(date_sales_end);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					compare=P.compare_dates(singleton.D);
					switch (compare) {
						case 1:
							str = "La fecha de fin de rebajas no es correcta, "+ date_sales_end + "\nEs anterior respecto a la "
									+ "fecha de inicio de rebajas.\n"+ P.getDate_sales_init();
							res = false;
							break;
						case 2:
							str = "Fecha de fin de rebajas correcta: "+ date_sales_end + ".\nEs posterior respecto a la "
									+ "fecha de inicio de rebajas.\n"+ P.getDate_sales_init();
							res=true;
							break;
						default:
							str = "La fecha no es correcta, inténtelo de nuevo.\n"+ P.getDate_purchase();
							res = false;
							break;
					} // end switch
					JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
				}//end if
			}//end if
		} while ((!res));
		return singleton.D;
	}//end insert_date_sales_end
//	public static boolean is_return(dates date_return) {
//		if(date_return.getDate_return()!="00/00/0000") {
//			return true;
//		}else {
//			return false;
//		}
//	}
	public static dates insert_date_delivery(dates P) {
		String date_delivery = "";
		String str;
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
				singleton.D = new dates(date_delivery);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					compare=P.compare_dates(singleton.D);
					switch (compare) {
						case 1:
							str = "La fecha de entrega no es correcta, "+ date_delivery + "\nEs anterior respecto a la "
									+ "fecha de compra.\n"+ P.getDate_purchase();
							res = false;
							break;
						case 2:
							sub=P.subtract_days(singleton.D);
							if(sub == 1) {
								res = singleton.D.check_date();
								str = "Fecha de entrega correcta: "+ date_delivery + ".\nEs "+sub+" día más respecto a la "
										+ "fecha de compra.\n"+ P.getDate_purchase();
							}else {
								str = "Fecha de entrega incorrecta: "+ date_delivery + ".\nEs "+sub+" días más respecto a la "
										+ "fecha de compra.\n"+ P.getDate_purchase()+"\nIngresa una fecha 1 día posterior a la fecha de compra.";
								res=false;
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
		return singleton.D;
	}//end insert_date_delivery
	
	public static dates insert_date_return(dates P) {
		String date_return= "";
		String str;
		String cancel = "00/00/0000";
		boolean res = false;
		int compare;
		int sub;
		do {
			date_return = validators.validator_string("Ingresa fecha de devolución.\nTienes 15 días para devolverlo a partir del:"
					+ "\n "+P.getDate_delivery()+"\nSi no quieres devolver el producto introduce esta fecha: '00/00/0000'.","Ingresa fecha");
			res = regex_date.validateDate(date_return);
			if (!res) {
				res = false;
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
			} else {
				if(date_return.equals(cancel)){
					JOptionPane.showMessageDialog(null, "La devolución ha sido cancelada. ", "Devolución", JOptionPane.INFORMATION_MESSAGE);
					res = true;
					singleton.D = new dates(cancel);
				}else {
					singleton.D = new dates(date_return);
					if (!res) {
						res = false;
						JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						compare=P.compare_dates(singleton.D);
						switch (compare) {
							case 1:
								str = "La fecha de devolución no es correcta, "+ date_return + "\nEs anterior respecto a la "
										+ "fecha de entrega.\n"+ P.getDate_delivery();
								res = false;
								break;
							case 2:
								sub=P.subtract_days(singleton.D);
								if(sub >= 0 && sub <=15) {
									res = singleton.D.check_date();
									str = "Fecha de devolución correcta: "+ date_return + ".\nEstá entre 1 y 15 días posteriores respecto a la "
											+ "fecha de entrega.\n"+ P.getDate_delivery();
								}else {
									str = "Fecha de devolución incorrecta: "+ date_return + ".\nDebe estar entre 1 y 15 días posteriores respecto a la "
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
					}
				}//end if
			}//end if
		} while ((!res));
		return singleton.D;
	}
	public static dates insert_collection_date(dates P) {
		String collection_date= "";
		String str;
		boolean res = false;
		int compare;
		int sub;
		String cancel = "00/00/0000";
		if( P.getDate_return().equals(cancel)) {
			JOptionPane.showMessageDialog(null, "Fecha de recogida no disponible, no se ha iniciado ninguna devolución.", "Información", JOptionPane.INFORMATION_MESSAGE);
		}else {
			do {
				collection_date = validators.validator_string("Ingresa fecha de recogida.\nTiene que ser 2 días posterior a la fecha de devolución:"
						+ "\n "+P.getDate_return(),"Ingresa fecha");
				res = regex_date.validateDate(collection_date);
				if (!res) {
					res = false;
					JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Formato", JOptionPane.WARNING_MESSAGE);
				} else {
					singleton.D = new dates(collection_date);
					if (!res) {
						res = false;
						JOptionPane.showMessageDialog(null, "Fecha no válida.", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						compare=P.compare_dates(singleton.D);
						switch (compare) {
							case 1:
								str = "La fecha de recogida no es correcta, "+ collection_date + "\nEs anterior respecto a la "
										+ "fecha de devolución.\n"+ P.getDate_return();
								res = false;
								break;
							case 2:
								sub=P.subtract_days(singleton.D);
								if(sub == 2) {
									res = singleton.D.check_date();
									str = "Fecha de recogida correcta: "+ collection_date + ".\nEs 2 días posterior respecto a la "
											+ "fecha de devolución.\n"+ P.getDate_return();
								}else {
									str = "Fecha de recogida incorrecta: "+ collection_date + ".\nDebe ser 2 días posterior respecto a la "
											+ "fecha de devolución.\n"+ P.getDate_return()+"\n";
									res=false;
								}
								break;
							default:
								str = "La fecha debe ser 2 días posterior respecto a la fecha de devolución.\n"+ P.getDate_return();
								res = false;
								break;
						} // end switch
						JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
					}//end if
				}//end if
			} while ((!res));
		}
		return singleton.D;
	}
}