package oop01.encapsule;

class CoffeeA{
	public CoffeeA() {
		System.out.println("돈을 넣다.");
	}
	public CoffeeA(int money) {
		System.out.println(money + "원");
	}
	public CoffeeA(int money, boolean exist) {
		System.out.println("구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
	
}


public class CoffeeAMain {
	public static void main(String[] args) {
		CoffeeA coffeeA = new CoffeeA();
		CoffeeA coffeeAA = new CoffeeA(500);
		CoffeeA coffeeAAA = new CoffeeA(500, true);
	}
}











