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
		System.out.println(SplitArray);
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
	public int compare_dates(dates date_insert){
		int value = 0;
		if(this.year == date_insert.year){
			if(this.month == date_insert.month){
				if(this.day > date_insert.day){
					value = 1;
				}else if(this.day == date_insert.day){
					value = 0; 
				}else{
                    value = -1;  
                }//end if
			}else if(this.month < date_insert.month){
				value = -1;
            }else{
            	value = 1;
            }//end if
		}else if(this.year > date_insert.year){
			value = 1; 
        }else{
        	value = -1;
		}//end if
		return value;
	}//end compare_dates
//	public int compare_dates() {
//		int day_purchase;
//		int day_delivery;
//		Calendar C1 = Calendar.getInstance();
//		Calendar C2 = this.string_to_calendar(date_purchase);
//		day_purchase = C1.get(Calendar.DAY_OF_MONTH);
//		day_delivery = C2.get(Calendar.DAY_OF_MONTH);
//		return (day_purchase - day_delivery);
//	}
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