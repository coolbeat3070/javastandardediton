package oop07.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;

	public static class Inner{
		static int d = 1000;
		public void printData(){
			System.out.println("스태틱 멤버변수 값 c :" + c);
			System.out.println("스태틱 로컬변수 값 d :" + d);
			/*
			System.out.println("디폴트 변수 값 a :" + a);
			System.out.println("프라이빗 변수 값 b :" + b);
				static 내부 클래스는 사실 더 이상 내부 클래스가 아니다.
				또한 외부 클래스를 거치지 않고도 접근할 수 있다.
				따라서 top level class 라고 하여 최상위 
				클래스라고 한다.
				어쩔수 없이 내부 클래스를 static 으로 선언해야 할
				경우가 있다. 그건 바로 내부클래스 멤버들 중 하나라도
				static 멤버가 있을 경우다.
				
			*/
			
		}
	}
}
