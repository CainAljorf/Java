package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.dummies.find_dummies;
import tema4.modules.products.utils.CRUD;

public class update_dummies {
	public static void laptop () {
		int location1 = -1;
		if(singleton.dummieslaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			singleton.DL = CRUD.new_laptop("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.DL);
			if (location1 != -1) {
				singleton.DL = singleton.dummieslaptop.get(location1);
				dummies_CRUD.update_laptop();
				singleton.dummieslaptop.set(location1, singleton.DL);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el laptop.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void smartphone () {
		int location1 = -1;
		if(singleton.dummiessmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);	
		}else{
			location1 = -1;
			singleton.DS = CRUD.new_smartphone("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.DS);
			if (location1 != -1) {
				singleton.DS = singleton.dummiessmartphone.get(location1);
				dummies_CRUD.update_smartphone();
				singleton.dummiessmartphone.set(location1, singleton.DS);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void accessory () {
		int location1 = -1;
		if(singleton.dummiesaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		
		}else{
			location1 = -1;
			singleton.DA = CRUD.new_accessory("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.DA);
			if (location1 != -1) {
				singleton.DA = singleton.dummiesaccessory.get(location1);
				dummies_CRUD.update_accessory();
				singleton.dummiesaccessory.set(location1, singleton.DA);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el accesorio.","Error",JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
}
