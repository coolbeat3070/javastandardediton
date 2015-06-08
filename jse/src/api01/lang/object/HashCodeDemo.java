package api01.lang.object;
/*
 해싱(hashing) 기법에 사용되는 해시함수(hash function)을 구현한 것.
 해싱은 다량의 데이터를 저장하고 검색하는데 사용되는 데이터 관리기법.
 예) 트위터의 해시태그 #관심사항 이렇게 태그를 달아놓으면
 	"관심사항" 이라는 키워드로 검색하면 일치하는 해시태그를
 	맵핑한 항목들이 리턴됨.
 * */
public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";
		
		System.out.println("abc 의 해시코드 :" + abc.hashCode());
		System.out.println("abc2 의 해시코드 :" + abc2.hashCode());
	}
}
