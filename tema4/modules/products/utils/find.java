package tema4.modules.products.utils;

import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;

public class find {
	public static int find_admin(laptop laptop) { 
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(laptop) )
				return i;
		}
		return -1;
	}
	
	public static int find_client(smartphone smartphone) { 
		for (int i = 0; i<=(singleton.productsmartphone.size()-1); i++){
			if((singleton.productsmartphone.get(i)).equals(smartphone) )
				return i;
		}
		return -1;
	}
	
	public static int find_user(accessory accessory) { 
		for (int i = 0; i<=(singleton.productaccessory.size()-1); i++){
			if((singleton.productaccessory.get(i)).equals(accessory) )
				return i;
		}
		return -1;
	}
}
