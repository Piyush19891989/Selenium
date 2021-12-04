package Programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Java Program to find the largest and smallest word in a string.
public class Calender {

	public static void main(String[] args) throws ParseException {
		

	    final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	  

	        //Date currentDate = new Date();
	    Date currentDate = dateFormat.parse("05/01/2022");
	        System.out.println(dateFormat.format(currentDate));

	        // convert date to calendar
	        Calendar c = Calendar.getInstance();
	        c.setTime(currentDate);

	        // manipulate date
	      //  c.add(Calendar.YEAR, 1);
	        c.add(Calendar.MONTH, 4);
	       // c.add(Calendar.DATE, 1); //same with c.add(Calendar.DAY_OF_MONTH, 1);
	       // c.add(Calendar.HOUR, 1);
	       // c.add(Calendar.MINUTE, 1);
	       // c.add(Calendar.SECOND, 1);

	        // convert calendar to date
	        Date currentDatePlusOne = c.getTime();

	        System.out.println(dateFormat.format(currentDatePlusOne));

	

	}

}
