package oop01.encapsule;

public class CardVO {
	private String kind; // 카드의 무늬
	private int number; // 카드의 숫자
	static int width=150; // 카드의 너비
	static int height=300; // 카드의 높이
	
	public CardVO(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
