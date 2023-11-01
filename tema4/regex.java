package tema4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex {
	    private static final String ProductIDPattern = "^[A-Z]{3}[-][0-9]{3}+$";//^ Debe empezar con este dato. $ Debe acabar con este dato.
	    private static final String DatePattern = "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
	    public static boolean validateProductID(String ID) {
			Pattern pattern = Pattern.compile(ProductIDPattern);
	        Matcher matcher = pattern.matcher(ID);
	        return matcher.matches();
		}
	    public static boolean validateDate(String date) {
	    	Pattern pattern = Pattern.compile(DatePattern);
	        Matcher matcher = pattern.matcher(date);
	        return matcher.matches();
	    }
}
