package api01.lang.thread;

public class RunnableDemo {
	public static void main(String[] args) {
		// 인터페이스타입 참조변수 = new 인터페이스를구현한클래스명();
		Runnable r = new RunnableImpl();
		/*
		 * 생성자 Thread(Runnable target)
		 * */
		Thread thr = new Thread(r);
		thr.start();
	}
}
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(
					Thread.currentThread().getName());
			/*
			 * 상속이 아니기 때문에 super 를 사용할 수 없다.
			 * */
		}
		
	}
}
