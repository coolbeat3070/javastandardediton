package api01.lang.string;
/*
 * java.lang.String 에서
 * length() 메소드는 문자열의 길이를 반환(리턴)한다.
 * */
public class LengthDemo {
	public static void main(String[] args) {
		String str = "Hello Java World";
		int len = str.length();
		System.out.println("문자열의 길이 :" + len);
	}
}
