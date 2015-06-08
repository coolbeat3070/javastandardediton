package api01.lang.string;
/*
 * toString()
 * String 인스턴스에 저장되어 있는 문자열을 리턴
 * */
public class ToStringDemo {
	public static void main(String[] args) {
		double d = 858.8d; // 끝에 있는 d는 더블형을 의미
		String s = Double.toString(d);
		
		System.out.println("s 의 값은 :" + s);
		
		int dot = s.indexOf('.');
		System.out.println("소숫점 앞자리 자릿수 :" + dot);
		System.out.println("소숫점 뒷자리 자릿수 :" +(s.length() - dot - 1));
				
		
	}
}
