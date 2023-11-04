package tema4.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
public class date {
	private String date;
	private int day;
	private int month;
	private int year;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	public date(String date, int day, int month, int year, SimpleDateFormat format) {
		super();
		this.date = date;
		this.day = day;
		this.month = month;
		this.year = year;
		this.format = format;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public SimpleDateFormat getFormat() {
		return format;
	}
	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}
	
}
