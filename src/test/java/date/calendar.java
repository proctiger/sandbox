package date;

import java.util.Calendar;

public class calendar {

	public static void main(String[] args) {
		
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		System.out.println(Calendar.getInstance().get(Calendar.MONTH));
		System.out.println(Calendar.getInstance().get(Calendar.YEAR));
		
		System.out.println(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		System.out.println(Calendar.getInstance().get(Calendar.MINUTE));
		System.out.println(Calendar.getInstance().get(Calendar.SECOND));
	}

}
