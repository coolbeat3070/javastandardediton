package oop04.polymorphism;


public class FruitMain {
	public static void main(String[] args) {
		// 인터페이스는 객체를 만들수 없다.
		FruitInterface apple = new AppleImpl();
		FruitInterface orange; // FruitInterface 타입의 참조변수를 선언
		orange = new OrangeImpl(); 
			// 클래스 OrangeImpl 의 객체를 생성하여 orange 에 할당하였다.
		FruitInterface banana = new BananaImpl();
		apple.display("맛있는 ");
		orange.display("오랜된 ");
		banana.display("비싼 ");
	//	orange.getCount();
	// 	인터페이스에 선언된 메소드만 호출이 가능하다.
		
		
	}
}
