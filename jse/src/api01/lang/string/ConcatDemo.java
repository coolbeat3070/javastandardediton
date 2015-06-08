package api01.lang.string;
/*
 * java.lang.String 에 있는 구현된 메소드 중에
 * concat() : 두개의 문자열을 합친다.
 * */
public class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "API 를 학습중..";
		String str3 = str1 + str2;
		System.out.println("+연산자를 사용할 경우 :" + str3);
		
		String str4 = "concat() 를 사용할 경우 : 헬로우";
		System.out.println( str4.concat(" 자바월드 .."));
		
	}
}
