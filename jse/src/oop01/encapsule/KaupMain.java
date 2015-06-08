package oop01.encapsule;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력해 주세요.");
		double height=scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요");
		double weight=scanner.nextDouble();
		KaupVO vo = new KaupVO(height, weight);
		vo.setIdx(height,weight);
		System.out.println(vo.toString());
		System.out.println("완료");
	}
}
/*vo.setHeight(height);
vo.setWeight(weight);*/

/*int idx=0;
vo.setIdx(idx);
vo.getMsg();*/