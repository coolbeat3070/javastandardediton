package oop01.encapsule;

class Pay{
	/*
	멤버변수, 인스턴스변수+클래스변수, 필드라고 부른다.
	 * */
	
	String name; // 이름
	int salary; // 급여
	int tax; // 세금, 세율은 10%로 0.1
	int income; // 실제 수입액
}

public class PayMain {
	public static void main(String[] args) {
		Pay p1 = new Pay();
		Pay p2 = new Pay();
		Pay p3 = new Pay();
		
		p1.salary = 400;
		p1.name = "아이언";
		p1.tax = (int)(p1.salary*0.1);
		p1.income = p1.salary - p1.tax;
		
		p2.salary = 800;
		p2.name = "헐크";
		p2.tax = (int)(p2.salary*0.2);
		p2.income = p2.salary - p2.tax;
		
		p3.salary = 200;
		p3.name = "호크";
		p3.tax = (int)(p3.salary*0.05);
		p3.income = p3.salary - p3.tax;
		
		System.out.println("==="+p1.name+"의 5월 급여내역===");
		System.out.println("본봉 :" + p1.salary );
		System.out.println("세금 :" + p1.tax);
		System.out.println("실수령액 :" +p1.income);
		System.out.println();
		
		System.out.println("==="+p2.name+"의 5월 급여내역===");
		System.out.println("본봉 :" + p2.salary );
		System.out.println("세금 :" + p2.tax);
		System.out.println("실수령액 :" +p2.income);
		System.out.println();
		
		System.out.println("==="+p3.name+"의 5월 급여내역===");
		System.out.println("본봉 :" + p3.salary );
		System.out.println("세금 :" + p3.tax);
		System.out.println("실수령액 :" +p3.income);
	}
}
