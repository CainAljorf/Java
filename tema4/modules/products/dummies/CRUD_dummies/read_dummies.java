package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.dummies.find_dummies;
import tema4.modules.products.utils.CRUD;

public class read_dummies {
	public static void laptop (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.productlaptop.size();i++){
							str = singleton.productlaptop.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.L = CRUD.new_laptop("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.L);
						String type = find_dummies.find_product_type(singleton.L);
						if (location != -1 && type.equals("Laptop")) {
							singleton.L = singleton.productlaptop.get(location);
							dummies_CRUD.read_laptop();
						}else {
							JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
			}while(validator==true);
		}//end if
	}//end laptop
	public static void smartphone (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.productsmartphone.size();i++){
							str = singleton.productsmartphone.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.S = CRUD.new_smartphone("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.S);
						String type = find_dummies.find_product_type(singleton.S);
						if (location != -1 && type.equals("Smartphone")) {
							singleton.S = singleton.productsmartphone.get(location);
							dummies_CRUD.read_smartphone();
						}else {
							JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
	public static void accessory (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.productaccessory.size();i++){
							str = singleton.productaccessory.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.A = CRUD.new_accessory("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.A);
						String type = find_dummies.find_product_type(singleton.A);
						if (location != -1 && type.equals("Accessory")) {
							singleton.A = singleton.productaccessory.get(location);
							dummies_CRUD.read_accessory();					
						}else {
							JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
}
