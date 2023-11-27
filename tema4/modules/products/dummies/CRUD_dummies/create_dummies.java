package tema4.modules.products.dummies.CRUD_dummies;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.dummies.find_dummies;

public class create_dummies {
	public static void laptop() {
		int location = -1;
		location = find_dummies.find_product_dummies(singleton.DL);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DL = dummies_CRUD.create_dummies_laptop();
			singleton.dummieslaptop.add(singleton.DL);
			JOptionPane.showMessageDialog(null, "Laptop creado correctamente con el ID: "+singleton.DL.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//Deshabilitada
	public static void array_laptop() {//Función para mostrar el menú de botones de los array de ID.
		int size = singleton.dummieslaptop.size();
        ArrayList<String> temporal_array = new ArrayList<>();
		for (int i=0;i < size;i++) {
			String ID = singleton.dummieslaptop.get(i).getID_product();
			if(!temporal_array.contains(ID)) {
				temporal_array.add(ID);
			}
		}
		singleton.array_ID.clear();
		singleton.array_ID.addAll(temporal_array);
		Object[] options = singleton.array_ID.toArray();
        int opt = JOptionPane.showOptionDialog(
                null,
                "Selecciona el ID del producto que quieras trabajar:",
                "Menú de IDs",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        		dummies_CRUD.create_dummies_laptop();
		System.out.println(opt);
	}
	public static void laptop_null() {
		int location = -1;
		singleton.DL = dummies_CRUD.new_id_laptop();
		location = find_dummies.find_product_dummies(singleton.DL);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.dummieslaptop.add(singleton.DL);
			
		}
	}
	public static void smartphone() {
		int location = -1;
		singleton.DS = dummies_CRUD.new_id_smartphone();
		location = find_dummies.find_product_dummies(singleton.DS);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DS = dummies_CRUD.create_dummies_smartphone();
			singleton.dummiessmartphone.add(singleton.DS);
			JOptionPane.showMessageDialog(null, "Smartphone creado correctamente con el ID: "+singleton.DS.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void smartphone_null() {
		int location = -1;
		singleton.DS = dummies_CRUD.new_id_smartphone();
		location = find_dummies.find_product_dummies(singleton.DS);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.dummiessmartphone.add(singleton.DS);
		}
	}
	public static void accessory() {
		int location = -1;
		singleton.DA = dummies_CRUD.new_id_accessory();
		location = find_dummies.find_product_dummies(singleton.DA);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.DA = dummies_CRUD.create_dummies_accessory();
			singleton.dummiesaccessory.add(singleton.DA);
			JOptionPane.showMessageDialog(null, "Accesorio creado correctamente con el ID: "+singleton.DA.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void accessory_null() {
		int location = -1;
		singleton.DA = dummies_CRUD.new_id_accessory();
		location = find_dummies.find_product_dummies(singleton.DA);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "No se ha podido crear porque ya existe.","Error",JOptionPane.ERROR_MESSAGE);
		} else {
			singleton.dummiesaccessory.add(singleton.DA);
		}
	}
}
