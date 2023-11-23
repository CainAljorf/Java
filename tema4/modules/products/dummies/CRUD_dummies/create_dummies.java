package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies;
import tema4.modules.products.utils.find;

public class create_dummies {
	public static void laptop() {
		int location = -1;
		singleton.DL = dummies.new_id_laptop();
		location = find.find_product(singleton.DL);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DL = dummies.create_dummies_laptop();
			singleton.dummieslaptop.add(singleton.DL);
			JOptionPane.showMessageDialog(null, "Laptop creado correctamente con el ID: "+singleton.DL.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);

		}
	}
	public static void smartphone() {
		int location = -1;
		location = find.find_product(singleton.DS);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DS = dummies.create_dummies_smartphone();
			singleton.dummiessmartphone.add(singleton.DS);
			JOptionPane.showMessageDialog(null, "Smartphone creado correctamente con el ID: "+singleton.DL.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void accessory() {
		int location = -1;
		location = find.find_product(singleton.DA);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DA = dummies.create_dummies_accessory();
			singleton.dummiesaccessory.add(singleton.DA);
			JOptionPane.showMessageDialog(null, "Accesorio creado correctamente con el ID: "+singleton.DL.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
