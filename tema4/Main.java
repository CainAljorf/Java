package tema4;
import java.util.ArrayList;

import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.utils.menu;
public class Main{
	public static void main(String[] args){
		singleton.productlaptop = new ArrayList <laptop> ();
		singleton.productsmartphone = new ArrayList <smartphone> ();
		singleton.productaccessory = new ArrayList <accessory> ();
		menu.menu_main();
	}//end main
}//end class main