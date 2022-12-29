package calender;

import java.util.Date;
import java.util.HashMap;

public class Plan {
	HashMap<Date, PlanItem> map = new HashMap<>();;
	
	public void registerPlan(String strDate, String plan) {
		PlanItem p = new PlanItem(strDate, plan);
		map.put(p.getDate(), p);
	}

	public PlanItem searchPlan(String strDate) {
		Date date = PlanItem.getDatefromString(strDate);
		return map.get(date);
	}
	

}
