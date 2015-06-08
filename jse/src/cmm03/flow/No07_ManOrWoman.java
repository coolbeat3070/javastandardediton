package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("주민번호 입력 (ex.123456-12345678) :");
		String ssn = scanner.nextLine();
		
		char ch = ssn.charAt(7);
		if(ch == '1' || ch == '3'){
			System.out.println("Man");
		}else if( ch == '2' || ch == '4'){
			System.out.println("Woman");
		}else{
			System.out.println("입력이 잘못되었습니다.");
		}
		
	}
}
