package api01.lang.math;

import java.util.Scanner;

/*
 * java.lang.Math 에 있는
 * random() 메소드는 난수(임의의 수)를 발생시킨다.
 * */
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) (Math.random()*5)+1; // 앞의 3은 limit , 뒤의 1 은 begin
		int myVal = 0;
		Scanner scanner = new Scanner(System.in);
		int i=0;
		while(true){
			System.out.println("1부터 5까지 임의의 숫자를 입력하세요.");
			i++;
			System.out.println(i+"번째 입력:");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("컴난수 :" + com);
				System.out.println("빙고 정답입니다.");
				break; //while(true) 로 주면 무한루프를 돈다.
				// 무한루프에서 break; 를 걸어야 한다.
			}
			if(i==3){
				System.out.println("실패");
				 break; // 횟수를 3회로 제한하여 게임을 스톱시킨다.
			}
		}
	}
}
