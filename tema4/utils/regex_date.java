package tema4.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex_date {
	private static final String DatePattern = "[0-3]{1}[0-9]{1}[/][0-1]{1}[0-9]{1}[/][0-9]{4}";
    public static boolean validateDate(String date) {
    	Pattern pattern = Pattern.compile(DatePattern);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }//end validateDate
}//end regex