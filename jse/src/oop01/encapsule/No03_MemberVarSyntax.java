package oop01.encapsule;
/*
 Date :
 Author :
 Desc : 멤버변수에 관한 문법
 * */
/*
멤버변수에 관한 자바 튜토리얼의 내용
- There are several kinds of variables
- Member variables in a class-these are called fields.
- Variables in method declarations-these are called parameters.
 * */
/*
변수의 종류
- 클래스 변수(클래스 영역, 클래스가 메모리에 올라갈 때, 가장 먼저 생성)
- 인스턴스 변수 (클래스 영역, 인스턴스 생성시 생성)
- 로컬 변수(지역변수, 메서드 영역, 변수 선언문 수행시 생성)
 * */
/*
인스턴스 변수(instance variable)
- 1. 각 인스턴스의 개별적인 저장공간
- 2. 인스턴스 생성후, "참조변수.인스턴스 변수명" 으로 접근
- 3. 인스턴스를 생성할 때 생성되고, 참조변수가 없을 때 
		가비지 컬렉터에 의해 자동 제거됨
 * */
/*
클래스 변수(class variable)
- 같은 클래스의 모든 인스턴스들이 같은 값으로써 공유하는 변수
- 인스턴스 생성없이 "클래스명.클래스변수명" 으로 접근
- 클래스가 로딩될 때 생성되고, 프로그램이 종료될 때 소멸
 * */
/*
지역 변수(local variable)
- 메소드 내에 선언되며, 메소드의 종료와 함께 소멸
- 조건문, 반복문의 블록{} 내에 선언된 지역변수는 블록을 벗어나면 소멸
- 반드시 초기화를 해줘야 함
 * */
/*
 인변, 클변, 지변 의 차이점
 - 인변 : 할당된 값이 가변적
 - 클변 : 항상 고정된 값
 - 지변 : 매개값 또는 초기값 할당 후 사용 가능
 * */
public class No03_MemberVarSyntax {
	
}
