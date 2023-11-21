package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class delete {
	public static void delete_laptop () {
		int location = -1;
		
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			location = -1;
			singleton.L = CRUD.new_laptop("Ingresa el ID del laptop que quieras eliminar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location = find.find_laptop();
			if (location != -1) {
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
			location = find.find_smartphone();
			if (location != -1) {
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
			location = find.find_accessory();
			if (location != -1) {
				singleton.productaccessory.remove(location);
				JOptionPane.showMessageDialog(null, "Accesorio borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "El accesorio que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
