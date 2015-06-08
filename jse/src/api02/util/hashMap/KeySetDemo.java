package api02.util.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		/*
		 * 맵에서 데이터를 추가하는 방법
		 * */ 
		// new Integer(98) 는 숫자타입이 아닌 객체 98 임
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(60));
		map.put("소트니", new Integer(30));
		
		/*
		 * 맵에서 데이터를 읽어들이는 방법
		 * */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			// it.next() 를 코딩하면 에러가
			// 발생하는데 Entry 로 캐스팅 하면 된다.
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자 :" + e.getKey()
					+ ", 점수 :" + e.getValue());
			
		}
		
	}
}
