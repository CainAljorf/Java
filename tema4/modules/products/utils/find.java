package tema4.modules.products.utils;

import tema4.modules.products.classes.product;
import tema4.modules.products.classes.singleton;

public class find {
	public static int find_product(product P){
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(P))
				return i;
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(P))
				return j;
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(P))
				return k;
		}
		for (int l = 0; l<=(singleton.productpcgaming.size()-1); l++){
			if((singleton.productpcgaming.get(l)).equals(P))
				return l;
		}
		return -1;
	}
	public static String find_product_type(product P){
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(P))
				return "Laptop";
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(P))
				return "Smartphone";
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(P))
				return "Accessory";
		}
		for (int l = 0; l<=(singleton.productpcgaming.size()-1); l++){
			if((singleton.productpcgaming.get(l)).equals(P))
				return "PcGaming";
		}
		return "null";
	}
	
}