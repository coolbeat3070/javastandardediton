package api02.util.arrayList;
/*
java.util.ArrayList 는 Object 배열을 이용해서
데이터를 순차적으로 저장하는 공간이다.
첫번째로 저장한 공간은 인덱스 0번값을 가진다.
배열에 더 이상 저장공간이 없으면 보다 큰 새로운 배열을 생성해서
기존의 배열에 저장된 내용을 새로운 배열에 복사한 다음 저장한다.
 * */
/*
java.util.Vector 와 차이점
- Vector 는 멀티스페드에 대한 동기화가 되어 있으나
- java.util.ArrayList 는 동기화가 되어있지 않다.
 * */
/*
ArrayList 클래스
1. ArrayList 와 Vector 클래스는 List 크기 변경이 가능하기 때문에
가능한 배열로 구현한 것으로 차이점은 Vector 클래스의 객체는 원래
기본적으로 동기화 되지만 ArrayList 는 그렇지 않다.
2. 비 동기화된 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하여
스레드들이 컬렉션을 공유하지 않는 프로그램에서는
ArrayList 는 동기화를 고려하지 않는 Vector 처럼 동작함으로써
스레드 동기화에 따르는 부담을 가지지 않기 때문에 Vector 보다
빠르게 움직이며 실행한다.
 * */

public class ArrayListSyntax {

}
