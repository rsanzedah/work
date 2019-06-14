package gov.gsa.sam.utils;


import java.util.Calendar;

public class BaseClass {
	
	public String getCurrentDay(){
        Calendar cal = Calendar.getInstance();
        return  String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        
    }
	
	public String getCurrentMonth(){
        Calendar cal = Calendar.getInstance();
        return String.valueOf(cal.get(Calendar.MONTH)+1);
    }
	 
	 public String getCurrentYear(){
	        Calendar cal = Calendar.getInstance();
	        return  String.valueOf(cal.get(Calendar.YEAR));
	    }
	 
	        
	 public String getPreviousDay(){
	        Calendar cal = Calendar.getInstance();
	        return String.valueOf(cal.get(Calendar.DAY_OF_MONTH)-1);
	        
	    }
		

	
	
	  
}
