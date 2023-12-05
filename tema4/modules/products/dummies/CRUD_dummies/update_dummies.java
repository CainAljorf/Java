package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.dummies.find_dummies;
import tema4.modules.products.utils.CRUD;

public class update_dummies {
	public static void laptop () {
		int location1 = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			singleton.L = CRUD.new_laptop("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.L);
			String type = find_dummies.find_product_type(singleton.L);
			if (location1 != -1 && type.equals("Laptop")) {
				singleton.L = singleton.productlaptop.get(location1);
				dummies_CRUD.update_laptop();
				singleton.productlaptop.set(location1, singleton.L);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un laptop.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void smartphone () {
		int location1 = -1;
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);	
		}else{
			location1 = -1;
			singleton.S = CRUD.new_smartphone("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.S);
			String type = find_dummies.find_product_type(singleton.S);
			if (location1 != -1 && type.equals("Smartphone")) {
				singleton.S = singleton.productsmartphone.get(location1);
				dummies_CRUD.update_smartphone();
				singleton.productsmartphone.set(location1, singleton.S);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un smartphone.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void accessory () {
		int location1 = -1;
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		
		}else{
			location1 = -1;
			singleton.A = CRUD.new_accessory("Ingresa el ID de tu accesorio para ver si existe."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find_dummies.find_product_dummies(singleton.A);
			String type = find_dummies.find_product_type(singleton.A);
			if (location1 != -1 && type.equals("Accessory")) {
				singleton.A = singleton.productaccessory.get(location1);
				dummies_CRUD.update_accessory();
				singleton.productaccessory.set(location1, singleton.A);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un accesorio.","Error",JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
}
