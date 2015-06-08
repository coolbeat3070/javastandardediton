package cmm02.op;

public class No01_DanHangDemo2 {
	
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		j = i++;
		System.out.println("i 의 값 : " + i);
		System.out.println("j = i++ 의 값 : "+j);
		
		int x = 5;
		int y = 0;
		y = ++x;
		System.out.println("x 의 값 : " + x);
		System.out.println("y = ++x 의 값 : " + y);
		
		
	}
}
