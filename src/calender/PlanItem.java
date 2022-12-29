package calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PlanItem {
	public Date planDate;
	public String detail;
	
	public static Date getDatefromString(String strDate) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public PlanItem(String strDate, String plan) {
		planDate = getDatefromString(strDate);
		detail = plan;
	}
	
	public Date getDate() {
		return planDate;
	}
	
	public String getPlan() {
		return detail;
	}
}
