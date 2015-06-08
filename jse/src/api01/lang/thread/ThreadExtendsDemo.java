package api01.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		// 객체인 thr 참조변수 생성한 것.
		ThreadExtends thr = new ThreadExtends();
		// 지금까지 배운 바로는
		// 클래스 객체를 생성하면 그 참조변수.메소드 명으로
		// 호출했는데..스레드는 thr.run() 하는 게 아니라
		// thr.start() 라고 해야 한다.
		
		thr.start();
	}
}
class ThreadExtends extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			/*
			 * 클래스 생성자에서 this() , this.**
			 * 이 자기 클래스 내부의 생성자및 인스턴스 변수를
			 * 뜻하는 것처럼
			 * super(), super.** 은
			 * 상속받은 부모클래스의 생성자 및 인스턴스 변수를 뜻한다.
			 * */
			System.out.println(super.getName());
		}
	}
}
