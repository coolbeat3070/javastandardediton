package oop02.inhebitance;
/*
Date :
Author :
Desc : 메소드 상속에 관한 예제 
 * */
/*
Car
△
|
Hcar <- new (instantiate) : 인스턴스 생성 개념도

 * */
class Car2{
	String name = "자동차";
	public String gear(){
		return "수동기어";
	}
}
class Hcar2 extends Car2{
	String brand = "현대";
	public String autoGear(){
		return "오토기어";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autoGear());
		
		Car2 c = new Car2();
		System.out.println(c.gear());
	//	System.out.println(c.autoGear());
	// 상속시 부모는 자식의 메소드를 호출할 수 없다.
	// 오직, 자식만 부모의 메소드를 호출할 수 있다.
	}
}









