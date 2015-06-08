package api02.util.hashset;

import java.util.HashSet;
import java.util.Set;

/*
 * java.util.HashSet
 * - Set 인터페이스를 구현한 가장 대표적인 컬렉션
 * - 중복된 요소를 저장하지 않음
 * - 해싱기법을 이용해서 구현됨
 * - 자주 사용되는 메소드
 * boolean add(Object o)
 * void clear() // 요소 모두 삭제
 * Object clone() // 복제하여 반환
 * boolean contains(Object o) // 값이 존재하는지 검색
 * int size() // 요소들의 갯수를 반환
 * */
/*
 * java.util.HashSet 의 메소드인
 * add() 는 객체를 추가하는 기능을 가짐.
 * 객체를 추가할 때 HashSet 이 이미 가지고 있는 객체라면
 * 중복으로 간주하고 저장하지 않는다.
 * 그리고 false 를 리턴한다.
 * */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2),"2","2","3","3","3","4"};
		// 이클립스 제안 중에서 java.util.Set 을 선택
		Set set = new HashSet();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		System.out.println("HashSet 저장요소 출력 :" + set);
		/*
		 * [3, 2, 2, 1, 4] 가 출력되는데
		 * 이걸로 보아 new Integer(2) 와 "2" 는
		 * 서로 다른 객체이므로 중복으로 간주하지 않는다는 것을
		 * 알 수 있다.
		 * */
	}
}
