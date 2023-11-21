package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;
import tema4.utils.menu;

public class create {
	public static void laptop() {
		int location = -1;
		menu.L = CRUD.new_laptop("Ingresa el ID que quieras crear para tu laptop.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_laptop(menu.L);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de laptop porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			menu.L = CRUD.create_laptop();
			singleton.productlaptop.add(menu.L);
		}
	}
	public static void smartphone() {
		int location = -1;
		menu.S = CRUD.new_smartphone("Ingresa el ID que quieras crear para tu smartphone.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_smartphone(menu.S);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de smartphone porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			menu.S = CRUD.create_smartphone();
			singleton.productsmartphone.add(menu.S);
		}
	}
	public static void accessory() {
		int location = -1;
		menu.A = CRUD.new_accessory("Ingresa el ID que quieras crear para tu accesorio.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_accessory(menu.A);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de accesorio porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			menu.A = CRUD.create_accessory();
			singleton.productaccessory.add(menu.A);
		}
	}
}
