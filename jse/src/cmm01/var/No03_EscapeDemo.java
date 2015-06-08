package cmm01.var;

public class No03_EscapeDemo {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 85;
		int sum = 0;
		
		sum = kor + eng;
		
		System.out.print("\t성적처리\n");
		System.out.println("===================");
		System.out.println("국어\t영어\t총점");
		System.out.println(kor+"\t"+eng+"\t"+sum);
		
	}
}
