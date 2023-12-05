package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class create {
	public static void laptop() {
		int location = -1;
		singleton.L = CRUD.new_laptop("Ingresa el ID que quieras crear para tu laptop.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_product(singleton.L);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.L = CRUD.create_laptop();
			singleton.productlaptop.add(singleton.L);
		}
	}
	public static void pcgaming() {
		int location = -1;
		singleton.PC = CRUD.new_pcgaming("Ingresa el ID que quieras crear para tu pcgaming.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_product(singleton.PC);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.PC = CRUD.create_pcgaming();
			singleton.productpcgaming.add(singleton.PC);
		}
	}
	public static void smartphone() {
		int location = -1;
		singleton.S = CRUD.new_smartphone("Ingresa el ID que quieras crear para tu smartphone.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_product(singleton.S);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.S = CRUD.create_smartphone();
			singleton.productsmartphone.add(singleton.S);
		}
	}
	public static void accessory() {
		int location = -1;
		singleton.A = CRUD.new_accessory("Ingresa el ID que quieras crear para tu accesorio.\nSi ya existe ese ID deberás crear uno nuevo."
				+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
		location = find.find_product(singleton.A);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.A = CRUD.create_accessory();
			singleton.productaccessory.add(singleton.A);
		}
	}
}
