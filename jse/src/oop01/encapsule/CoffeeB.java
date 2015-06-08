package oop01.encapsule;

public class CoffeeB {
	public CoffeeB() {
		System.out.println("돈을 넣다.");
	}
	public CoffeeB(int money) {
		this();
		System.out.println(money + "원");
	}
	public CoffeeB(int money, boolean exist) {
		this(money);
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
	
}
