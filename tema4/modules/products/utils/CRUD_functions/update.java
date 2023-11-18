package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class update {
	public static void update_laptop (laptop laptop) {
		int location1 = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			laptop =  CRUD.new_laptop();
			location1 = find.find_laptop(laptop);
			if (location1 != -1) {
				laptop = singleton.productlaptop.get(location1);
				CRUD.update(laptop);
				singleton.productlaptop.set(location1, laptop);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el laptop.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
	public static void update_smartphone (smartphone smartphone) {
		int location1 = -1;
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			location1 = -1;
			smartphone = CRUD.new_smartphone();
			location1 = find.find_smartphone(smartphone);
			if (location1 != -1) {
				smartphone = singleton.productsmartphone.get(location1);
				CRUD.update(smartphone);
				singleton.productsmartphone.set(location1, smartphone);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el smartphone.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
	public static void update_accessory (accessory accessory) {
		int location1 = -1;
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			//location1 = -1;
			accessory = CRUD.new_accessory();
			location1 = find.find_accessory(accessory);
			if (location1 != -1) {
				accessory = singleton.productaccessory.get(location1);
				CRUD.update(accessory);
				singleton.productaccessory.set(location1, accessory);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el accesorio.","Error",JOptionPane.ERROR_MESSAGE);			}
		}
	}
}
