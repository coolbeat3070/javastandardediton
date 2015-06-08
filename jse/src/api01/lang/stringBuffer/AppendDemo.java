package api01.lang.stringBuffer;

public class AppendDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		StringBuffer buf2 = buf1.append("D E F");
		String msg = "";
		
		if(buf1 == buf2){
			msg = "buf1 == buf2";
		}else{
			msg = "buf1 != buf2";  // != 는 서로 같지 않음을 나타낸다.
		}
		System.out.println(msg);
		System.out.println(buf1.toString());
		System.out.println(buf2.toString());
		
		/*
		 * buf2 는 새롭게 생성되어 전달된 객체가 아니며,
		 *  buf1 이 내부적으로 수정되어 전달 받음으로써
		 *  동일한 주소값을 참조한다.
		 *  
		 *  StringBuffer 클래스는 String 클래스와 다르게
		 *  무분별하게 객체생성을 하지 않는다.
		 *  그리고, 직접 수정할 수 있는 가변성의 특징이 있다.
		 *  그러므로 빈번한 문자열 수정 작업이 필요한 경우
		 *  String 클래스 보다 StringBuffer 클래스가 유리하다.
		 *  사용례 ) 카톡 메시지, 게시판 글
		 * */
	}
}
