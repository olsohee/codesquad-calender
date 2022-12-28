package calender;

public class PrintCalender {

	final static int MAX_DAY[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	final static int LEAP_MAX_DAY[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public void printCal(int year, int month, int weekday) {
		int[] thisYearMaxDay = getMaxDay(year);
		
		System.out.printf("     <%d년 %d월>", year, month);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		for(int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		for(int i = 1; i <= thisYearMaxDay[month - 1]; i++) {
			System.out.printf("%3d", i);
			if((i + weekday) % 7 == 0 )
				System.out.println();	
		}
		System.out.println();
	}

	public int getWeekday(int year, int month) {
		int thisYearDays = 0;
		
		thisYearDays = (year - 1) * 365 + ((year - 1) / 4) - ((year - 1) / 100) + ((year - 1) / 400);
		
		int[] thisYearMaxDay = getMaxDay(year);
		for(int i = 1; i < month; i++) {
			thisYearDays += thisYearMaxDay[i];
		}
		
		return (thisYearDays + 1) % 7;
	}

	private int[] getMaxDay(int year) {
		if(isLeapYear(year)) 
			return LEAP_MAX_DAY;
		else
			return MAX_DAY;
	}
	
	private boolean isLeapYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0) ) 
			return true;
		else
			return false;
	}
}
