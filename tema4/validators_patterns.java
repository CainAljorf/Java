package tema4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validators_patterns {
	
	    private static final String ProductIDPattern = "^[a-zA-Z0-9]+$";
	    private static final String PricePattern = "^[0-9]+(\\.[0-9]{1,2})?$";
	    private static final String WeightPattern = "^[0-9]+(\\.[0-9]+)?$";
	    private static final String StockPattern = "^[1-9][0-9]*$";
	    private static final String ColorPattern = "^[a-zA-Z0-9]+$";
	    private static final String DimensionPattern = "^[0-9]+(\\.[0-9]+)?$";
	    private static final String DatePattern = "^\\d{2}/\\d{2}/\\d{4}$";
	    private static final String DaysPattern = "^[1-9][0-9]*$";
	    private static final String AlphanumericPattern = "^[a-zA-Z0-9]+$";
	    private static final String BooleanPattern = "^(true|false)$";
		
	    public static boolean validateProductID(String ID) {
			Pattern pattern = Pattern.compile(ProductIDPattern);
	        Matcher matcher = pattern.matcher(ID);
	        return matcher.matches();
		}
	    public static boolean validatePrice(float price) {
	        return Float.toString(price).matches(PricePattern);
	    }
	    public static boolean validateWeight(float weight) {
	        return Float.toString(weight).matches(WeightPattern);
	    }
	    public static boolean validateStock(int stock) {
	        return Integer.toString(stock).matches(StockPattern);
	    }
	    public static boolean validateColor(String color) {
	        return color.matches(ColorPattern);
	    }
	    public static boolean validateDimensions(float dimensions) {
	        return Float.toString(dimensions).matches(DimensionPattern);
	    }
	    public static boolean validateDate(String date) {
	        return date.matches(DatePattern);
	    }
	    public static boolean validateDays(int days) {
	        return Integer.toString(days).matches(DaysPattern);
	    }
	    public static boolean validateAlphanumeric(String value) {
	        return value.matches(AlphanumericPattern);
	    }
	    public static boolean validateBoolean(String value) {
	        return value.matches(BooleanPattern);
	    }
	
	
}
