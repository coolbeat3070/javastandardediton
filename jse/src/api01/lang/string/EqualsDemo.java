package api01.lang.string;
/*
java.lang.String
문자열 관련 class
- "==" 은 객체의 reference value(hash code table) 을 비교
- 문자열 비교시에는 반드시 equals() 메소드 이용
- new 를 이용하면 heap 영역에 새로운 메모리를 할당하고 hashcode 를 생성.
 * */
public class EqualsDemo {
	public static void main(String[] args) {
		// 아래와 같이 생성하는 방식을 리터럴 생성 방식이라고 한다.
		String str1 = "abc";
		String str2 = "abc";
		/*
		 * 삼항연산자 폼
		 * (조건식) ? "참" : "거짓" ;
		 * */
		String result1 = (str1 == str2) ? "str1 과 str2 는 같다" : "str1 과 str2 는 다르다"; 
		String result2 = (str1.equals(str2)) ? "str1 과 str2 는 같다" : "str1 과 str2 는 다르다"; 
		System.out.println("(str1 == str2) 인 경우 :" + result1);
		System.out.println("(str1.equals(str2)) 인 경우 :" + result2);
		
		// 아래와 같이 생성하는 방식을 생성자 생성 방식이라고 한다.
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		String result3 = (str3 == str4) ? "str3 과 str4 는 같다" : "str3 과 str4 는 다르다"; 
		String result4 = (str3.equals(str4)) ? "str3 과 str4 는 같다" : "str3 과 str4 는 다르다"; 
		System.out.println("(str3 == str4) 인 경우 :" + result3);
		System.out.println("(str3.equals(str4)) 인 경우 :" + result4);
		
		/*
		 result3 의 결과가 다른 이유.
		 - String 클래스의 생성자를 이용해서 String 인스턴스 생성한 경우에는
		 	new 연산자에 의해 메모리 할당이 이뤄지기 때문에
		 	항상 새로운 String 인스턴스가 생성된다.
		 	
		 * */
		/*
		모든 클래스파일(*.class) 에는 constant pool 이라는 상수풀이 있어서
		클래스 내에 사용되는 모든 리터럴과 상수들이 저장되어 있다.
		등록하고자 하는 문자열이 상수풀에 이미 존재하는 경우에는
		그 문자열의 주소값을 반환한다.
		 * */
	}
}








