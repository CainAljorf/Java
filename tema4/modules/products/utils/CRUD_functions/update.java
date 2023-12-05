package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class update {
	public static void update_pcgaming(){
		int location1 = -1;
		if(singleton.productpcgaming.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de pcgaming porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			singleton.PC =  CRUD.new_pcgaming("Ingresa el ID del pcgaming que quieras actualizar. Esto solo buscará tu artículo no lo modificará."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_product(singleton.PC);
			String type = find.find_product_type(singleton.PC);
			if (location1 != -1 && type.equals("PcGaming")) {
				singleton.PC = singleton.productpcgaming.get(location1);
				CRUD.update_pcgaming();
				singleton.productpcgaming.set(location1, singleton.PC);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un pcgaming.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void update_laptop () {
		int location1 = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			singleton.L =  CRUD.new_laptop("Ingresa el ID del laptop que quieras actualizar. Esto solo buscará tu artículo no lo modificará."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_product(singleton.L);
			String type = find.find_product_type(singleton.L);
			if (location1 != -1 && type.equals("Laptop")) {
				singleton.L = singleton.productlaptop.get(location1);
				CRUD.update_laptop();
				singleton.productlaptop.set(location1, singleton.L);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un laptop.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void update_smartphone () {
		int location1 = -1;
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			location1 = -1;
			singleton.S = CRUD.new_smartphone("Ingresa el ID del smartphone que quieras actualizar. Esto solo buscará tu artículo no lo modificará."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_product(singleton.S);
			String type = find.find_product_type(singleton.S);
			if (location1 != -1 && type.equals("Smartphone")) {
				singleton.S = singleton.productsmartphone.get(location1);
				CRUD.update_smartphone();
				singleton.productsmartphone.set(location1, singleton.S);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un smartphone.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void update_accessory () {
		int location1 = -1;
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			//location1 = -1;
			singleton.A = CRUD.new_accessory("Ingresa el ID del accesorio que quieras actualizar. Esto solo buscará tu artículo no lo modificará."
					+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
			location1 = find.find_product(singleton.A);
			String type = find.find_product_type(singleton.A);
			if (location1 != -1 && type.equals("Accessory")) {
				singleton.A = singleton.productaccessory.get(location1);
				CRUD.update_accessory();
				singleton.productaccessory.set(location1, singleton.A);
			}else {
				JOptionPane.showMessageDialog(null, "El ID ingresado debe ser de un accesorio.","Error",JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
}
