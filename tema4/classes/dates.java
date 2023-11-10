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

		System.out.print("constructor "+insert_date+"\n");
		}//end constructor
	public Calendar string_to_calendar(String insert_date) {
		Date D = new Date();
		Calendar C = new GregorianCalendar();
		System.out.print("string to calendar "+insert_date+"\n");
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
		Calendar C1 = this.string_to_calendar(this.date_purchase);
		Calendar C2 = this.string_to_calendar(date_insert.toString());
		System.out.print("Compare dates "+date_insert+"\n");
		if (C1.after(C2)) {
			return 1;
		}else if (C1.before(C2)) {
			return 2;
    	}else {
			return 3;
    	}//end if
	}
    public int subtract_days(dates insert_date) {
		int day_purchase;
		int day_delivery;
		int year_purchase;
		int year_delivery;
		int month_purchase;
		int month_delivery;
		int res=0;
		System.out.print("restar dates "+insert_date+"\n");
		Calendar C1 = this.string_to_calendar(date_purchase);
		Calendar C2 = insert_date.string_to_calendar(insert_date.toString());
		day_purchase = C1.get(Calendar.DAY_OF_YEAR);
		day_delivery = C2.get(Calendar.DAY_OF_YEAR);
		year_purchase = C1.get(Calendar.YEAR);
		year_delivery = C2.get(Calendar.YEAR);
		month_purchase = C1.get(Calendar.MONTH);
		month_delivery = C2.get(Calendar.MONTH);
		if (year_purchase > year_delivery || (year_purchase == year_delivery && month_purchase > month_delivery) || (year_purchase == year_delivery && month_purchase == month_delivery && day_purchase > day_delivery)) {
	        res = 2; 
	    } else { 
	    	res = day_delivery - day_purchase;
	    	if(month_purchase == 12 && month_delivery == 1) {
	            System.out.print("Mes de compra 12");
	    	}
        }
		return res;
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
	@Override
	public String toString() {
		String str = "";
		str = this.day + "/" + this.month + "/" + this.year;
		return str;
	}
	public void setDate_purchase(String date_purchase) {
		this.date_purchase = date_purchase;
	}
}//end class date