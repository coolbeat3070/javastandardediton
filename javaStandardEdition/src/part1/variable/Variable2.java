package part1.variable;
/*
 변수의 작성 규칙
 1. 알파멧 대소문자, 숫자, _(언더스코어) , $ 만 사용이 가능하다.
 2. 단, 첫문자가 숫자이면 안된다.
 3. 키워드(예약어)와 같으면 안됨.
 * */
public class Variable2 {
	public static void main(String[] args) {
		// 국어점수는 kor , 영어점수 변수명은 eng, 합계는 sum 일 때
		// 국어 : 85, 영어 : 70 의 합계: ... 를 콘솔에 출력하시오
		int kor = 85;
		int eng = 70;
		int sum = kor + eng;
		// 출력 결과를 가독성 있게 바꿔보면..
		System.out.print("성적처리\n"); // \n 을 리터럴 내부에 두면.라인개행(줄바뀜)
		System.out.println("국어\t영어\t합계"); // \t 를 리터럴 내부에 두면.(탭키 효과)
		System.out.println(kor+"\t"+eng+"\t"+sum); // 변수와 \t 를 함께 쓰면.(반드시 리터럴 내부에 )
	//	System.out.println("합계 : "+sum);
		// 리터럴 이란 : 알파벳 한글자만 나타내는 char 형을 사용할 때
		// 작업 효율이 너무 떨어지므로 문자형은 ""안에 여러 글자를 표기하여 나타낼 수 있게 함.
		/*
		\n , \t 처럼 특수 기능을 하는 문자열을 escape문자라고 한다.
		 * */
	}
}
