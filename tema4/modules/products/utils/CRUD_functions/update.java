package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;
import tema4.utils.menu;

public class update {
	public static void update_laptop () {
		int location1 = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			menu.L =  CRUD.new_laptop("Ingresa el ID del laptop que quieras actualizar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_laptop(menu.L);
			if (location1 != -1) {
				menu.L = singleton.productlaptop.get(location1);
				CRUD.update(menu.L);
				singleton.productlaptop.set(location1, menu.L);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el laptop.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
	public static void update_smartphone () {
		int location1 = -1;
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			location1 = -1;
			menu.S = CRUD.new_smartphone("Ingresa el ID del smartphone que quieras actualizar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_smartphone(menu.S);
			if (location1 != -1) {
				menu.S = singleton.productsmartphone.get(location1);
				CRUD.update(menu.S);
				singleton.productsmartphone.set(location1, menu.S);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el smartphone.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
	public static void update_accessory () {
		int location1 = -1;
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			//location1 = -1;
			menu.A = CRUD.new_accessory("Ingresa el ID del accesorio que quieras actualizar."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_accessory(menu.A);
			if (location1 != -1) {
				menu.A = singleton.productaccessory.get(location1);
				CRUD.update(menu.A);
				singleton.productaccessory.set(location1, menu.A);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el accesorio.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
}
