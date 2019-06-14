package gov.gsa.sam.base;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class DateClass {

	public static String getCurrentMonth() {
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.get(Calendar.MONTH) + 1);
	}

	public static String getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.get(Calendar.YEAR));
	}

	public static String getCurrentDay() {
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
	}

	public static String getPreviousDay() {
		Calendar cal = Calendar.getInstance();
		return String.valueOf(cal.get(Calendar.DAY_OF_MONTH) + 1);

	}
	
	public static String getMonthName(int monthNum, TextStyle textStyle){
        Month month = Month.of(monthNum);
        Locale locale = Locale.getDefault();
        String displayName = month.getDisplayName(textStyle, locale);
        
        System.out.println(displayName);
        return displayName;
}
	/*To call the above method: getMonthName(1, TextStyle.SHORT );
	TextStyle.SHORT --> gives month name as Jan, Feb etc
	TextStyle.FULL --> gives month names as January.*/
	
	public  static String addOrSubDaysFromCurrentDate(int numOfDays, String field){
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numOfDays);
		SimpleDateFormat sdf = null;
		if(field.equalsIgnoreCase("day")){
			sdf = new SimpleDateFormat("dd");
		}else if(field.equalsIgnoreCase("month")){
			sdf = new SimpleDateFormat("MM");
		}else if(field.equalsIgnoreCase("year")){
			sdf = new SimpleDateFormat("yyyy");
		}else{
			return null;
		}
		
		String result = sdf.format(cal.getTime());
		return result;
	}
	
	
}
