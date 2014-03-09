package date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateFormat {
		public static void main(String[] args) throws ParseException {
//			20Dec13:45
//			ls -la -S --time-style long-iso|  awk '{print $6 $7}'

			Format formatter = new SimpleDateFormat("ddMMMHH:mm");
			Date date = (Date) formatter.parseObject("20Dec13:45");
			System.out.println(date);
 		}

}
