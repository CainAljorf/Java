package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies;
import tema4.modules.products.utils.find;

public class create_dummies {
	public static void laptop() {
		int location = -1;
		location = find.find_product(singleton.L);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.L = dummies.create_dummies_laptop();
			singleton.productlaptop.add(singleton.L);
			JOptionPane.showMessageDialog(null, "Laptop creado correctamente.","Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void smartphone() {
		int location = -1;
		location = find.find_product(singleton.S);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.S = dummies.create_dummies_smartphone();
			singleton.productsmartphone.add(singleton.S);
			JOptionPane.showMessageDialog(null, "Smartphone creado correctamente.","Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void accessory() {
		int location = -1;
		location = find.find_product(singleton.A);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.A = dummies.create_dummies_accessory();
			singleton.productaccessory.add(singleton.A);
			JOptionPane.showMessageDialog(null, "Accesorio creado correctamente.","Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
