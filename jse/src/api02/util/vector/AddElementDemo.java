package api02.util.vector;

import java.util.Vector;

/*
java.util.Vector 의
메소드인 addElement() 는
add() 와 거의 유사합니다.
혼용하셔도 무방합니다만..
removeElement() 같이 사용할 경우
에는 이 메소드를 같이 써 줍니다.
 * */
public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk"};
		Vector<String>avengers = new Vector<String>();
		/*
		 * 벡터에 배열의 요소를 저장 addElement(배열);
		 * */
		for(int i=0;i<heros.length;i++){
			avengers.addElement(heros[i]);
		}
		/*
		 * 토르가 존재하는 지 체크 contains() 메소드를 사용 
		 * */
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("토르는 "+idx+1+" 번째에 있습니다.");
		}else{
			System.out.println("토르는 없습니다.");
		}
		
		/*첫번째 요소를 삭제  removeElementAt()*/
		avengers.removeElementAt(0);
		
		System.out.println("삭제 후 요소들 인덱스 변화");
		
		for(int j=0;j<avengers.size();j++){
			System.out.println("어벤저스의" +(j+1)+
					" 번재 멤버는" + avengers.elementAt(j) + "입니다.");
		}
		/* 결과를 보면 요소에 할당된 인덱스가 변한 것을 알 수 있는데,
		 * 이것은 벡터가 요소에 할당하는 인덱스가 동적으로 이뤄지고
		 * 있음을 나타냅니다.
		 * */
		
	}
}
