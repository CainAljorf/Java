package tema4.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dates {
	private String date_purchase;
	private String date_delivery;
	private int day;
	private int month;
	private int year;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public dates(String insert_date) {
		String[] SplitArray = null;
		SplitArray = insert_date.split("/");
		this.day = Integer.parseInt(SplitArray[0]);
		this.month = Integer.parseInt(SplitArray[1]);
		this.year = Integer.parseInt(SplitArray[2]);
		this.date_purchase = insert_date;
		}//end constructor
	public Calendar string_to_calendar(String insert_date) {
		Date D = new Date();
		Calendar C = new GregorianCalendar();
		try {
			D = format.parse(insert_date);
			C.setTime(D);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return C;
	}//end string_to_calendar
	public String calendar_to_string() {
		Calendar C = Calendar.getInstance();
		return (C.getTime().toString());
	}//end calendar_to_string
    public boolean check_date() {
		boolean correct = false;
		if ((year > 1930) && (year < 2090)) {
			if ((month >= 1) && (month <= 12)) {
				switch (month) {
					case 1: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 2: 
						if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0)))
								&& (day > 0) && (day <= 29))
							correct = true; 
						else if ((day > 0) && (day <= 28))
							correct = true;
						break;
					case 3: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 4:
						if ((day > 0) && (day <= 30))
							correct = true;
						break;
					case 5: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 6: 
						if ((day > 0) && (day <= 30))
							correct = true;
						break;
					case 7: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 8: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 9: 
						if ((day > 0) && (day <= 30))
							correct = true;
						break;
					case 10: 
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					case 11: 
						if ((day > 0) && (day <= 30))
							correct = true;
						break;
					case 12:
						if ((day > 0) && (day <= 31))
							correct = true;
						break;
					default:
						correct = false;
				}//end switch
			} else {
				correct = false;
			}//end if
		} else{
			correct = false;
		}//end if
		return correct;
	}
    public int compare_dates(dates date_insert) {
		Calendar C1 = this.string_to_calendar(date_purchase);
		Calendar C2 = this.string_to_calendar(date_insert.toString());
		if (C1.before(C2))
			return 2;
		else if (C1.after(C2))
			return 1;
		else
			return 3;
	}
    public int subtract_dates(dates insert_date) {
		int day_purchase;
		int day_delivery;
		Calendar fecha1 = this.string_to_calendar(date_purchase);
		Calendar fecha2Calen = insert_date.string_to_calendar(insert_date.toString());
		day_purchase = fecha1.get(Calendar.YEAR);
		day_delivery = fecha2Calen.get(Calendar.YEAR);
		return (day_delivery - day_purchase);
	}
	public String getDate_delivery() {
		return date_delivery;
	}
	public void setDate_delivery(String date_delivery) {
		this.date_delivery = date_delivery;
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
	public String getDate_purchase() {
		return date_purchase;
	}
	public void setDate_purchase(String date_purchase) {
		this.date_purchase = date_purchase;
	}
}//end class date