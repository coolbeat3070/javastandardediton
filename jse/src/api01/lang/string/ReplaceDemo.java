package api01.lang.string;
/*
java.lang.String 의 메소드인
replace("OLD","NEW") 는  OLD 글자를
NEW 글자로 바꾸는 역할을 한다.
 * */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Java".replace("Java", "JSP"));
		/*
		 * Java 버전 5 이전에는 replace() 는 알파벳 한 글자만 바꾸는
		 * 기능만 있었으나, 불편한 관계로 replaceAll() 이 등장한다.
		 * replaceAll() 은 여러 글자수를 바꾸는데 사용되었으나,
		 * 이후 replace() 도 여러 글자수를 바꾸는 기능으로 확대되어
		 * 현재는 별차이가 없다.
		 * 다만, replaceAll() 은 정규표현식까지도 바꾸는 기능이 
		 * 있어서 되도록이면 replace() 보다는 replaceAll() 을 쓰는 것을 권장한다.
		 * 
		 * */
		System.out.println("Hello JSP".replaceAll("JSP", "SPRING"));
		/*
		 * 메소드 체인 : 메소드를 여러개 연결하여 앞부분의 기능이 종료되자마자
		 * 다음 기능을 수행하도록 하는 것.
		 * */
		System.out.println("Hello Java !!".replace("Java", "JSP").replace("!", ""));
		System.out.println("Hello Java !!".replace("Java", "JSP").replaceAll(".!", ""));
	}
}
