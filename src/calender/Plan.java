package calender;

import java.util.Date;
import java.util.HashMap;

public class Plan {
	HashMap<Date, String> map = new HashMap<>();;
	
	public void registerPlan(Date date, String plan) {
		map.put(date, plan);
	}

	public String searchPlan(Date date) {
		return map.get(date);
	}
	

}
