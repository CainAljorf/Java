package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.find_dummies;
import tema4.modules.products.utils.CRUD;

public class delete_dummies {
	public static void delete_dummies_laptop () {
			int location = -1;
			
			if(singleton.dummieslaptop.isEmpty()){
				JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
			}else{
				location = -1;
				singleton.DL = CRUD.new_laptop("Ingresa el ID del laptop que quieras eliminar."
						+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
				location = find_dummies.find_product_dummies(singleton.DL);
				if (location != -1) {
					singleton.dummieslaptop.remove(location);
					JOptionPane.showMessageDialog(null, "Laptop borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "El laptop que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		public static void delete_dummies_smartphone () {
			int location = -1;
			
			if(singleton.dummiessmartphone.isEmpty()){
				JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
			}else{
				location = -1;
				singleton.DS = CRUD.new_smartphone("Ingresa el ID del smartphone que quieras eliminar."
						+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
				location = find_dummies.find_product_dummies(singleton.DS);
				if (location != -1) {
					singleton.dummiessmartphone.remove(location);
					JOptionPane.showMessageDialog(null, "Smartphone borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "El smartphone que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		public static void delete_dummies_accessory () {
			int location = -1;
			
			if(singleton.dummiesaccessory.isEmpty()){
				JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
			}else{
				location = -1;
				singleton.DA = CRUD.new_accessory("Ingresa el ID del accesorio que quieras eliminar."
						+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
				location = find_dummies.find_product_dummies(singleton.DA);
				if (location != -1) {
					singleton.dummiesaccessory.remove(location);
					JOptionPane.showMessageDialog(null, "Accesorio borrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "El accesorio que quieres borrar no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
}
