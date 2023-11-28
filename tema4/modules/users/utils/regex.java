package tema4.modules.users.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	private static final String UsernamePattern = "^[A-Za-z0-9]+$";
	private static final String PasswordPattern = "^[A-Za-z0-9]+$";
	private static final String EmailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

    public static boolean validate_username(String username) {
		Pattern pattern = Pattern.compile(UsernamePattern);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
	}
    public static boolean validate_password(String password) {
		Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
	}
    public static boolean validate_email(String email) {
    	Pattern pattern = Pattern.compile(EmailPattern);
    	Matcher matcher = pattern.matcher(email);
    	return matcher.matches();
    }
}
