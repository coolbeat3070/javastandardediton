package oop04.polymorphism;


public class BananaImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + " 바나나입니다.");
		
	}

}
