package part1.operator;
/*
 *Demo.java 이름이 보이면
 Demo 는 샘플소스를 뜻하는 접미사이므로 
 샘플소스를 구현한 클래스라고 인식하면 된다. 
 * */
public class TwoHangDemo {
	public static void main(String[] args) {
		int x = 20;
		int y = 7;
		
		// 곱셈기호는 * , 나눗셈의 몫 구하는 기호는 /, 나눗셈의 나머지 구하는 기호는 %
		// 뺄셈 기호는 - , 덧셈 기호는 + 일때
		// 곱셈 변수는 gob, 나눗셈의 몫 변수는 mok, 나머지 변수는 nmg, 뺄셈은 sub
		// 을 출력하시오.
		int add, sub, gob, mok, nmg;  // 타입이 같은 변수를 선언할 때는 그루핑이 가능하다.
		add = x + y;
		sub = x - y;
		gob = x * y;
		mok = x / y;
		nmg = x % y;
		System.out.println("x + y = "+ add);
		System.out.println("x - y = "+ sub);
		System.out.println("x * y = "+ gob);
		System.out.println("x / y = "+ mok);
		System.out.println("x % y = "+ nmg);
	}
}
