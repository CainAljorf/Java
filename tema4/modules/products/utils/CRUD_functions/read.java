package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class read {
	public static void read_laptop (){
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
						singleton.L = CRUD.new_laptop("Ingresa el ID de tu laptop para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_product(singleton.L);
						String type = find.find_product_type(singleton.L);
						if (location != -1 && type.equals("Laptop")) {
							singleton.L = singleton.productlaptop.get(location);
							CRUD.read_laptop();
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
				}
			}while(validator==true);
		}
	}
	public static void read_pcgaming(){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.productpcgaming.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un pcgaming.", "Error", JOptionPane.ERROR_MESSAGE);
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
						for (int i = 0; i <singleton.productpcgaming.size();i++){
							str = str + (singleton.productpcgaming.get(i).toString());
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.PC = CRUD.new_pcgaming("Ingresa el ID de tu pcgaming para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_product(singleton.PC);
						String type = find.find_product_type(singleton.PC);
						if (location != -1 && type.equals("PcGaming")) {
							singleton.PC = singleton.productpcgaming.get(location);
							dummies_CRUD.read_pcgaming();
						}else {
							JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un pcgaming.", "Error", JOptionPane.ERROR_MESSAGE);
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
	public static void read_smartphone (){
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
							str = str + (singleton.productsmartphone.get(i).toString());
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.S = CRUD.new_smartphone("Ingresa el ID de tu smartphone para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_product(singleton.S);
						String type = find.find_product_type(singleton.S);
						if (location != -1 && type.equals("Smartphone")) {
							singleton.S = singleton.productsmartphone.get(location);
							CRUD.read_smartphone();
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
	
	public static void read_accessory (){
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
							str = str + (singleton.productaccessory.get(i).toString());
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.A = CRUD.new_accessory("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_product(singleton.A);
						String type = find.find_product_type(singleton.A);
						if (location != -1 && type.equals("Accessory")) {
							singleton.A = singleton.productaccessory.get(location);
							CRUD.read_accessory();
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