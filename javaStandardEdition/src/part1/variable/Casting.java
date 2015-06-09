package part1.variable;
/*
Casting (형변환)
UpCasting(묵시적 자동변환)
- 데이터 타입의 크기가 작은 쪽에서 ==> 큰 쪽으로 데이터 이동시
DownCasting(명시적 수동변환)
- 데이터 타입의 크기가 큰 쪽에서 ==> 작은 쪽으로 데이터 이동시
 * */
public class Casting {
	public static void main(String[] args) {
		int varInt = 100;
		double varDouble = 123.456d;
	//	varDouble = varInt; // 업캐스팅
		System.out.println("더블타입 변수값 출력 :"+ varDouble);
		varInt = (int) varDouble;  // 다운캐스팅
		System.out.println("다운캐스팅 된 결과값 :" + varInt);
		/*
		이클립스가 fix available 하다면서 주는 에러제거 기능을
		"이클립스 제안(eclipse proposal)" 이라고 하며
		이 이클립스 제안을 통해 에러를 수정하도록 한다.
		* */
		/*
		단...다운캐스팅 할때는 데이터 손실(data loss) 이 일어난다.
		 * */
	}
}
