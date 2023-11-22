package tema4.modules.products.dummies;

import tema4.modules.products.classes.singleton;

public class find_dummies {
	public static int find__dummies_laptop() {
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(singleton.L))
				return i;
		}
		return -1;
	}
	public static int find_dummies_smartphone() {
		for (int i = 0; i<=(singleton.productsmartphone.size()-1); i++){
			if((singleton.productsmartphone.get(i)).equals(singleton.S))
				return i;
		}
		return -1;
	}
	public static int find_dummies_accessory() {
		for (int i = 0; i<=(singleton.productaccessory.size()-1); i++){
			if((singleton.productaccessory.get(i)).equals(singleton.A))
				return i;
		}
		return -1;
	}
}
