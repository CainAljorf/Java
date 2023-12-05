package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class delete {
	public static void delete_pcgaming () {
		int location = -1;
		
		if(singleton.productpcgaming.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un pcgaming.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton.PC =  CRUD.new_pcgaming("Ingresa el ID del pcgaming que quieras eliminar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location = find.find_product(singleton.PC);
			String type = find.find_product_type(singleton.PC);
			if (location != -1 && type.equals("PcGaming")) {
				singleton.productpcgaming.remove(location);
				JOptionPane.showMessageDialog(null, "PcGaming borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El pcgaming que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void delete_laptop () {
		int location = -1;
		
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton.L = CRUD.new_laptop("Ingresa el ID del laptop que quieras eliminar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location = find.find_product(singleton.L);
			String type = find.find_product_type(singleton.L);
			if (location != -1 && type.equals("Laptop")) {
				singleton.productlaptop.remove(location);
				JOptionPane.showMessageDialog(null, "Laptop borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El laptop que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void delete_smartphone () {
		int location = -1;
		
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton.S = CRUD.new_smartphone("Ingresa el ID del smartphone que quieras eliminar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location = find.find_product(singleton.S);
			String type = find.find_product_type(singleton.S);
			if (location != -1 && type.equals("Smartphone")) {
				singleton.productsmartphone.remove(location);
				JOptionPane.showMessageDialog(null, "Smartphone borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El smartphone que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void delete_accessory () {
		int location = -1;
		
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton.A = CRUD.new_accessory("Ingresa el ID del accesorio que quieras eliminar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location = find.find_product(singleton.A);
			String type = find.find_product_type(singleton.A);
			if (location != -1 && type.equals("Accessory")) {
				singleton.productaccessory.remove(location);
				JOptionPane.showMessageDialog(null, "Accesorio borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El accesorio que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
