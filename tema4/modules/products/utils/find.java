package tema4.modules.products.utils;

import tema4.modules.products.classes.singleton;

public class find {
	public static int find_laptop() { 
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(singleton.L))
				return i;
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(singleton.S) )
				return j;
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(singleton.A) )
				return k;
		}
		
		return -1;
	}
	public static int find_smartphone() { 
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(singleton.S) )
				return j;
		}
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(singleton.L) )
				return i;
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(singleton.A) )
				return k;
		}
		return -1;
	}
	public static int find_accessory() { 
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(singleton.A) )
				return k;
		}
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(singleton.L) )
				return i;
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(singleton.S) )
				return j;
		}
		return -1;
	}
}