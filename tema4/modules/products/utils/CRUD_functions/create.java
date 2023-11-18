package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;
import tema4.modules.products.utils.insert_data;

public class create {
	public static void laptop(laptop laptop) {
		int location = -1;
		laptop = CRUD.new_laptop();
		location = find.find_laptop(laptop);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de laptop porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			laptop = CRUD.create_laptop();
			singleton.productlaptop.add(laptop);
		}
	}
	public static void smartphone(smartphone smartphone) {
		int location = -1;
		smartphone = CRUD.new_smartphone();
		location = find.find_smartphone(smartphone);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de smartphone porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			smartphone = CRUD.create_smartphone();
			singleton.productsmartphone.add(smartphone);
		}
	}
	public static void accessory(accessory accessory) {
		int location = -1;
		accessory = CRUD.new_accessory();
		location = find.find_accessory(accessory);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido añadir en el array de accesorio porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			accessory = CRUD.create_accessory();
			singleton.productaccessory.add(accessory);
		}
	}
}
