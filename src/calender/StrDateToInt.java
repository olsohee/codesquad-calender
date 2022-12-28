package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StrDateToInt {
	public static Date strDateToInt(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
