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
				JOptionPane.showMessageDialog(null, "ID actualizado correctamente. ", "Update exitoso", JOptionPane.INFORMATION_MESSAGE);
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
				JOptionPane.showMessageDialog(null, "Fecha actualizada correctamente. ", "Update exitoso", JOptionPane.INFORMATION_MESSAGE);
			}//end if
		} while (res == false);
		return date;
	}//end insert_date
	public static String insert_color() {
		String str="";
		int type=0;
		String[]buttons={
				"Rojo",
				"Negro",
				"Amarillo",
				"Blanco",
				"Verde",
				"Gris",
				"Morado",
				"Rosa",
				"Naranja",
				"Azul"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige un color para el producto.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Rojo";
				break;
			case 1: 
				str="Negro";
				break;
			case 2: 
				str="Amarillo";
				break;
			case 3: 
				str="Blanco";
				break;
			case 4: 
				str="Verde";
				break;
			case 5: 
				str="Gris";
				break;
			case 6: 
				str="Morado";
				break;
			case 7: 
				str="Rosa";
				break;
			case 8: 
				str="Naranja";
				break;
			case 9: 
				str="Azul";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_color
	public static String insert_type_accessory() {
		String str="";
		int type=0;
		String[]buttons={
				"Power Bank",
				"Funda",
				"Auriculares",
				"Cargador",
				"Soporte"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Power Bank";
				break;
			case 1: 
				str="Funda";
				break;
			case 2: 
				str="Auriculares";
				break;
			case 3: 
				str="Cargador";
				break;
			case 4: 
				str="Soporte";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_type_accessory
	public static String insert_protection() {
		String str="";
		int type=0;
		String[]buttons={
				"Polvo",
				"Agua",
				"Golpes",
				"Caídas"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de protección del accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Polvo";
				break;
			case 1: 
				str="Agua";
				break;
			case 2: 
				str="Golpes";
				break;
			case 3: 
				str="Caídas";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_protection
	public static String insert_connectivity() {
		String str="";
		int type=0;
		String[]buttons={
				"Cableado",
				"Inalámbrico"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de protección del accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Cableado";
				break;
			case 1: 
				str="Inalámbrico";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_connectivity
	public static String insert_screen(){
		String str="";
		int type=0;
		String[]buttons={
				"LCD",
				"IPS",
				"QLED",
				"OLED"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de pantalla del producto.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="LCD";
				break;
			case 1: 
				str="IPS";
				break;
			case 2: 
				str="QLED";
				break;
			case 3: 
				str="OLED";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_screen
	public static String insert_screen_inches(){
		String str="";
		int type=0;
		String[]buttons={
				"15.6",
				"13.3",
				"17.3",
				"12.1"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige las pulgadas de la pantalla.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="15.6";
				break;
			case 1: 
				str="13.3";
				break;
			case 2: 
				str="17.3";
				break;
			case 3: 
				str="12.1";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_screen_inches
}//end insert_data
