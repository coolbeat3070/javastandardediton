package api01.lang.thread;

public class AtmUserThreadDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		AtmUser hong = new AtmUser(atm, "홍길동");
		AtmUser kim = new AtmUser(atm, "김길동");
		AtmUser moon = new AtmUser(atm, "문길동");
		
		hong.start();
		kim.start();
		moon.start();
	//	hong.start();
	//  main() 내부에서는 한 객체는 한 스레드만 호출해야한다.	
	// 만약 한 객체가 두번이상의 스레드를 호출하면
	// java.lang.IllegalThreadStateException 이 발생한다.
		
	}
}
class AtmUser extends Thread{
	Atm atm;
	String name;
	
	public AtmUser(Atm atm, String name) {
		super();
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		atm.inchul(name);
	}
}
class Atm{
	/*
	 * synchronized 는 언어의 뜻으로 보자면 동기화이나
	 * 사실 기능 자체는 스레드에 락을 걸어서
	 * 공유값인 필드에 값이 공유상태에서 원래 취지의 값이 아닌
	 * 잘못된 값으로 나타나는 것을 방지하는 키워드
	 * */
	public synchronized void inchul(String name){
		System.out.println(name+"님께서 인출요청함");
		for(int i=0;i<= 100000000;i++){
			if(i==10000){
				System.out.println(name + "님 인출중..");
			}
		}
		System.out.println(name+" 님 인출해서 나감");
	}
}
