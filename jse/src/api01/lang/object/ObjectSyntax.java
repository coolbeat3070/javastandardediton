package api01.lang.object;
/*
Object 클래스 : 모든 클래스의 조상
- 자바에서 모든 클래스는 java.lang.Object 클래스를 상속한다.
- 모든 클래스 객체는 이 클래스 타입으로 형변환한다.
- 가장 상위에 있는 공통 데이터타입이다.
- 기본 primitive 타입을 받지 않고, 다양한 모든 타입을 
	받으려면 파라미터의 타입을 object 로 지정하면 된다.
	이 예는 Collection 에서 많이 발견된다.
 * */
public class ObjectSyntax {
	public void foo(Object obj){
		System.out.println("foo.." + obj);
	}
}
