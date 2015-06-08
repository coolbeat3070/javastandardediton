package api01.lang.string;
/*
 * java.lang.String 에 있는 split() 메소드는
 * 파라미터에 규정된 구분자를 기준으로 앞 뒤 단어를 잘라내어
 * 배열등(ArrayList) 에 담는 기능을 한다.
 * */
public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0;i<fruits.length;i++){
			System.out.print("\t"+fruits[i]);
		}
		
	}
}
