package oop01.encapsule;
/*
Date :
Author :
Desc : Static 문법에 관하여..
 * */
/*
static 변수
- 정적변수
- 클래스가 JVM 상으로 로딩시에 메모리 할당을 한다.
- 해시코드(Hash Code) 의 출력
- 객체의 해시코드는 JVM 의 해시알고리즘에 의해 패키지명과
	클래스명이 조합되어 해시코드가 산출된다.
- String 은 객체변수의 값이 같을 경우 즉 같은 문자열을 가지고 있다면,
	해시코드를 공유한다.
	String str1 = "헐크";
	String str2 = "헐크";
	str1.hashCode() = str2.hashCode(); // true
 * */
/*
static 사용을 고려해야 하는 상황
- 멤버변수 중 모든 인스턴스에 공통적으로 사용해야 하는 것에 붙여사용.
- 인스턴스 변수를 사용하지 않고, 클래스에서 바로 접근하려 할때.
 * */
public class No06_StaticSyntax {
	
}
