package tema4.modules.products.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex_product {
	 private static final String ProductIDPattern = "^[A-Z]{3}[-][0-9]{3}+$";//^ Debe empezar con este dato. $ Debe acabar con este dato.
	    public static boolean validateProductID(String ID) {
			Pattern pattern = Pattern.compile(ProductIDPattern);
	        Matcher matcher = pattern.matcher(ID);
	        return matcher.matches();
		}//end validateProductID
}//end regex