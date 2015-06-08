package oop02.inhebitance;
/*
Method Overriding
- 상속관계엥서 Super 에 선언된 메소드를 Sub 에서 다시 선언한 경우
- 이런 경우 Super 의 메소드는 무시된다.
- 같은 메소드가 Super 와 Sub 에게 모두 선언되었으나,
- 내용은 다를 수 있다.
 * */
/*
오버라이딩의 목적
- 클래스의 다형성을 구현할 수 있다.
- 단, Super 와 Sub 사이의 메소드명, 파라미터갯수, 파라미터 데이터타입이 같아야 함.
- Super 가 가진 메소드를 상속해 주나 같은 이름의 메소드가 Sub 에 존재한다면
	Sub 에 있는 메소드를 우선 사용해야 함.
- Super 의 메소드 기능을 유지하면서, 상황에 따라 Sub 의 변형된 기능을 
	사용하고 싶을 때 사용하며 다형성의 핵심원리이다.
- Super 의 메소드를 캡슐화 한다고 볼 수 있다.
 * */
class Parents{
	void show(){
		System.out.println("Parents 의 show() 를 수행..");
	}
}
class Child extends Parents{
	void show(){
		System.out.println("Child 의 show() 를 수행..");
	}
}
public class No02_OverridingDemo {
	public static void main(String[] args) {
		Parents p = new Parents();
		p.show();
		
		Child c = new Child();
		c.show();
	}
}
