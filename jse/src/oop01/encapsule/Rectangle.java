package oop01.encapsule;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	// 생성자 오버로딩
	public Rectangle() {
		origin = new Point(0,0);
	}
	public Rectangle(Point p){
		origin = p;
	}
	public Rectangle(int w, int h){
		origin = new Point(0,0);
		width = w;
		height = h;
	}
	public Rectangle(Point p, int w, int h){
		origin = p;
		width = w;
		height = h;
	}
	/*
	 * 도형을 이동시키는 로직
	 * */
	public void move(int x, int y){
		origin.x = x;
		origin.y = y;
	}
	/*
	 *  면적 구하는 로직
	 * */
	public int getArea(){
		return width*height;
	}
}











