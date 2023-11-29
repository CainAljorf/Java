package tema4.modules.users.utils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates_functions {
	public static String date_system() {
        LocalDate currently_date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return currently_date.format(formatter);
    }
	
}