package calender;

import java.util.Date;
import java.util.Scanner;

public class Prompt {
	public void printMenu() {
		System.out.println("+----------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------+");
	}
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Plan p = new Plan();
		String cmd;
		
	outer: while(true) {
		printMenu();
		System.out.println("명령 (1, 2, 3, h, q)");
		System.out.print("> ");
		cmd = sc.next();
			switch(cmd) {
			case "1": cmdRegister(sc, p); break;
			case "2": cmdSearch(sc, p); break;
			case "3": cmdPrintCal(sc); break;
			case "h": printMenu(); break;
			case "q": break outer;
			}
		}
	System.out.println("Thank you, good bye~");
	}
	
	// 일정 등록 
	private void cmdRegister(Scanner sc, Plan p) {
		System.out.println("[일정 등록]");
		System.out.println("날짜를 입력하세요. (yyyy-MM-dd)");
		System.out.print("> ");
		String strDate = sc.next();
		Date date = StrDateToInt.strDateToInt(strDate);
		sc.nextLine();
		System.out.println("일정을 입력하세요.");
		String plan = sc.nextLine();
		
		p.registerPlan(date, plan);		
	}

	// 일정 검색
	private void cmdSearch(Scanner sc, Plan p) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력하세요. (yyyy-MM-dd)");
		System.out.print("> ");
		String strDate = sc.next();
		Date date = StrDateToInt.strDateToInt(strDate);
		
		String plan = p.searchPlan(date);
		System.out.println(plan);
	}
	
	// 달력 보기
	private void cmdPrintCal(Scanner sc) {
		PrintCalender cal = new PrintCalender();
		
		int year; int month; int weekday;
		
		while(true) {
			System.out.println("연도를 입력하세요.");
			System.out.print("> ");
			year = sc.nextInt();
			if(year > 0)
				break;
			System.out.println("잘못된 입력입니다.");
		}
		
		while (true){
		System.out.println("달을 입력하세요.");
		System.out.print("> ");
		month = sc.nextInt();
		if(month >= 1 && month <= 12) 
			break;
		System.out.println("잘못된 입력입니다.");
		}
		
		weekday = cal.getWeekday(year, month);
				
		cal.printCal(year, month, weekday);
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
