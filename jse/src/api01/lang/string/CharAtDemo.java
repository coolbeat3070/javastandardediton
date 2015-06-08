package api01.lang.string;
/*
 java.lang.String
 charAt() : 지정된 위치에 있는 문자를 리턴함. index 는 0 부터 시작
 indexOf() : 주어진 문자가 존재하는지 확인하여 위치를 알려줌. 없으면 -1 반환 
 * */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-6555555";
		/*
		 * ssn.indexOf("-")+1
		 * 주민등록번호상의 "-" 의 위치를(index) 리턴하는데
		 * "-" 다음 숫자를 리턴하도록 하기위해 +1을 준다.
		 * */
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		/*
		 * char isMan = ssn.charAt(7); 
		 * 위와같이 표현해도 무방하다.
		 * 인덱스 위치값이 0 부터 시작한다는 점과
		 * 파라미터 숫자값이 인덱스값을 의미한다는 점만
		 * 기억하면 됨.
		 * */
		
		switch (isMan) {
		/*
		 * switch(조건식) 이 들어가며
		 * case 다음 값은 조건식이 가지고 있는 value(값) 을 의미한다.
		 * 예제로 보면 isMan 이 1 이라면...하면서 진행된다.
		 * */
		case '1': case '3':System.out.println("남성");break ;
		case '2': case '4':System.out.println("여성");break ;
		default:System.out.println("잘못된 값입니다.");break ;
		}
	}
}
