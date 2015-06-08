package oop01.encapsule;

public class CardMain {
	public static void main(String[] args) {
		System.out.println("카드의 높이 : " + CardVO.height  );
		System.out.println("카드의 너비 : " + CardVO.width);
		
		CardVO myCard = new CardVO("heart",3);
		CardVO yourCard = new CardVO("heart",7);
		
		
		/*yourCard 인스턴스를 생성하시고
		 * 무늬는 heart 이고 숫자는 7이 나왔다고
		 * 가정할 때..
		 * 게임룰은 높은 숫자 카드가 승리하는 게임입니다.
		 * 
		 * */
		
		System.out.println("당신 카드의" +"숫자"+"는" +yourCard.getNumber()+"이고"
				+ "내 카드" + "숫자"+ "는"+ myCard.getNumber()+" 이므로 "
				+ "당신이 이겼습니다.");
		
	}
}






