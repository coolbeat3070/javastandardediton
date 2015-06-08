package api02.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt(); // 숫자 입력은 nextInt() 주의 !!
		System.out.println("ID를 입력하세요");
		String id = scanner.next();
		System.out.println("비번을 입력하세요");
		String password = scanner.next();
		System.out.println("주소을 입력하세요");
		String addr = scanner.next();
		/*
		 * 기능으로 특화된 MemberServiceImpl 의 
		 * 객체를 생성한다. 왜냐면 입력받은 값들을
		 * DB 에 저장하고, 맵에 담아서 사용하기 위해서이다.
		 * */
		MemberService service = new MemberServiceImpl();
		// 객체를 생성하는 이유는 그 객체가 가진 기능(메소드)를
		// 호출하기 위해서이다.
		service.join(id, password, name, age, addr);
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인을 해주세요.");
		System.out.println("ID 를 입력해주세요");
		id = scanner.next();
		System.out.println("비번을 입력해주세요");
		password = scanner.next();
		service.login(id, password);
	}
}










