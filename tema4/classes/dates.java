package tema4.classes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class date {

	private int day;
	private int month;
	private int year;
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	private Calendar dates = Calendar.getInstance();
	
	public date(int day,int month,int year)throws ParseException {
		this.month = month;
		this.year = year;
		this.day = day;
		this.dates.setTime(this.format.parse(this.day+"/"+this.month+"/"+this.year));
	}//end date_format
	public date(String date)throws ParseException {
		this.dates.setTime(this.format.parse(date));	
		this.day=this.dates.get(Calendar.DATE);
		this.month=this.dates.get(Calendar.MONTH)+1;
		this.year=this.dates.get(Calendar.YEAR);
	}//end divide_date
    public Date to_date(){
        GregorianCalendar date1 = new GregorianCalendar(year, month-1, day);
        this.month++;
        Date date = date1.getTime();
        return date; 
    }//end to_date
	public boolean check_day(){
		GregorianCalendar calendar = new GregorianCalendar();
		int days[]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (calendar.isLeapYear(this.year)){
			days[2]	= 29;
		}//end if
		if((this.day >= 1) && (this.day <= days[this.month])){
			return true;
		}else{
			return false;
		}//end if
	}//end check_day
	public boolean check_month(){
		if((this.month >= 1) && (this.month <= 12)){
			return true;
		}else{
			return false;
		}//end if
	}//end check_month
	public boolean check_year(){
		if((this.year >= 1900) && (this.year <= 2100)){
			return true;
		}else{
			return false;
		}//end if
	}//end check_year
    public boolean check_date(){
        boolean correct = true;
        if(!this.check_day()){
        	correct = false;
        }//end if
        if(!this.check_month()){
        	correct = false;
        }//end if
        if(!this.check_year()){
        	correct = false;
        }//end if
        return correct;
    }//end 
	public int compare_dates(date date2){
		int value = 0;
		if(this.year == date2.year){
			if(this.month == date2.month){
				if(this.day > date2.day){
					value = 1;
				}else if(this.day == date2.day){
					value = 0; 
				}else{
                    value = -1;  
                }//end if
			}else if(this.month < date2.month){
				value = -1;
            }else{
            	value = 1;
            }//end if
		}else if(this.year > date2.year){
			value = 1; 
        }else{
        	value = -1;
		}//end if
		return value;
	}//end compare_dates
}//end class date