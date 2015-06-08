package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {
	public static void main(String[] args) {
		System.out.println("평균점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int avg = scanner.nextInt();
		String msg = "";
		char grade = 0;
		
		if(avg>=70){
			msg = "합격입니다.";
		}else{
			msg = "불합격입니다.";
		}
		
		switch (avg/10) {
		case 10: grade='A'; break;
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		case 5: grade='E'; break;
		default: grade='F'; break;
		}
		System.out.println("귀하는 "
				+ msg + "이며 학점은 "
				+ grade +" 입니다");
	}
}
