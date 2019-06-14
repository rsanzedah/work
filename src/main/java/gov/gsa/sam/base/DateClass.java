package gov.gsa.sam.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class DateClass {

	public static String dateStr;
	public static String monthStr;
	public static String yearStr;

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

	public static String getMonthName(int monthNum, TextStyle textStyle) {
		Month month = Month.of(monthNum);
		Locale locale = Locale.getDefault();
		String displayName = month.getDisplayName(textStyle, locale);

		System.out.println(displayName);
		return displayName;
	}
	/*
	 * To call the above method: getMonthName(1, TextStyle.SHORT ); TextStyle.SHORT
	 * --> gives month name as Jan, Feb etc TextStyle.FULL --> gives month names as
	 * January.
	 */

	public static String addOrSubDaysFromCurrentDate(int numOfDays, String field) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numOfDays);
		SimpleDateFormat sdf = null;
		if (field.equalsIgnoreCase("day")) {
			sdf = new SimpleDateFormat("dd");
		} else if (field.equalsIgnoreCase("month")) {
			sdf = new SimpleDateFormat("MM");
		} else if (field.equalsIgnoreCase("year")) {
			sdf = new SimpleDateFormat("yyyy");
		} else {
			return null;
		}

		String result = sdf.format(cal.getTime());
		return result;
	}

	public static void dateMonth(String date) {
		DateFormat originalFormat = new SimpleDateFormat("MMM dd, yyyy");
		// String date = "Aug 09, 2018";
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(originalFormat.parse(date));
			int dateInt = cal.get(Calendar.DAY_OF_MONTH);
			dateStr = String.valueOf(dateInt);

			int monthInt = cal.get(Calendar.MONTH) + 1;
			monthStr = String.valueOf(monthInt);

			int yearInt = cal.get(Calendar.YEAR);
			yearStr = String.valueOf(yearInt);

			// System.out.println(dateInt + "...." + monthInt + "...." + yearInt);
			// System.out.println(dateStr + "...." + monthStr + "...." + yearStr);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String getMonth(String date) throws Throwable {
		DateFormat originalFormat = new SimpleDateFormat("MMM dd, yyyy");
		// String date = "Aug 09, 2018";
		Calendar cal = Calendar.getInstance();
		cal.setTime(originalFormat.parse(date));
		int monthInt = cal.get(Calendar.MONTH) + 1;
		return String.valueOf(monthInt);

		// return monthStr;

	}

	public static String getDate(String date) throws Throwable {
		DateFormat originalFormat = new SimpleDateFormat("MMM dd, yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(originalFormat.parse(date));
		int dateInt = cal.get(Calendar.DAY_OF_MONTH);
		// dateStr = String.valueOf(dateInt);

		return String.valueOf(dateInt);
	}
	
	

	public static String getYear(String date) throws Throwable {
		DateFormat originalFormat = new SimpleDateFormat("MMM dd, yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(originalFormat.parse(date));
		int yearInt = cal.get(Calendar.YEAR);
		return  String.valueOf(yearInt);
	}


}
