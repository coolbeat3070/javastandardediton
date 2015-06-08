package api01.lang.wrapper;
/*
JDK 1.5 (= 자바 5 버전) 부터
도입된 오토박싱(autoboxing) 기능이다.
반환값이 기본형일 때와 wrapper class 일 때
차이가 없다. 그래서 parseInt() 와 valueOf()기능이
동일하다.
 * */
public class ParseIntDemo {
	public static void main(String[] args) {
		// 리터럴값을 기본형으로 캐스팅시 반환 방법
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2;
		System.out.println(result);
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer num3 = result;
		System.out.println("기본형을 참조형으로 형변환 한 결과 : " + num3);
		int num4 = 2 + num3;
		System.out.println("참조형과 기본형간의 연산결과 : "+num4);
	}
}
