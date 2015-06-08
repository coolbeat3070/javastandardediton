package oop07.nestedClass;
/*
내부클래스 첫번째 형태
- 인스턴스 내부클래스
- 멤버메소드 내부에 클래스로 정의한 모양 
 * */
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	public class Inner{
		public void printData(){
			System.out.println("a값 :" + a);
			System.out.println("b값 :" + b);
			System.out.println("c값 :" + c);
		}
	}
}
