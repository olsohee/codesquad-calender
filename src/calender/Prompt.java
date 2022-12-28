package calender;

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
		String cmd;
		
		printMenu();
		System.out.println("명령 (1, 2, 3, h, q)");
		System.out.print("> ");
		cmd = sc.next();
		
	outer: while(true) {
			switch(cmd) {
			case "1": cmdRegister(); break;
			case "2": cmdSearch(); break;
			case "3": cmdPrintCal(sc); break;
			case "h": printMenu();
			case "q": break outer;
			}
		}
	System.out.println("Thank you, good bye~");
	}
	
	

	private void cmdSearch() {
		// TODO Auto-generated method stub
		
	}

	private void cmdRegister() {
		// TODO Auto-generated method stub
		
	}
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
