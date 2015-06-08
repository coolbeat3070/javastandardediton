package api01.lang.thread;

public class BankSyncDemo {
	public static void main(String[] args) {
		// ����� ���� Ÿ���� �迭�� �����ϴ� ����� �Ʒ��� ����.
		Customer[] customers = new Customer[3]; 
		Account hong = new Account("ȫ�浿");
		Account kim = new Account("��浿");
		Account moon = new Account("���浿");
		customers[0] = new Customer(hong, "������", 100, 200);
		customers[0].start();
		customers[1] = new Customer(kim, "������", 20, 100000);
		customers[1].start();
		customers[2] = new Customer(moon, "������", 1000, 20000);
		customers[2].start();
		customers[0] = new Customer(hong, "������", 70000, 30000);
		customers[0].start();
		
	}
}
class Account{
	String name;
	int total;
	/*
	 * �ڵ����� : �����ڸ� ������ų ����
	 * ������ �ʵ带 ���� �� �ٷ� CTRL + Space Enter
	 * */
	/*
	 * ������ �����ε��� �Ϸ��� �Ҷ���
	 * �ڵ����� ��Ų �����ڿ��� this("") �̷�������
	 * String �̸�"", int �� 0, ��ü�� null �� �ָ� �ȴ�.
	 * */
	public Account() {}
	public Account(String name) {
		this.name = name;
	}
	/*
	 * �Ķ���Ͱ� int money : �����
	 * �Ķ���Ͱ� String location : ����
	 * */
	public void deposit(int money, String location, int speed){
		total += money;
		try{
			Thread.sleep(10000);
			System.out.println(name+"���� "+
					"["+location+"] "+money+" �� �Ա��� / "
					+ "�Ѿ� : "+total+" ��");
		}catch(Exception ex){
			ex.printStackTrace();
			
		}
	}
}
class Customer extends Thread{
	Account accout; // ��������� ��ü�� �ʵ��� �ν��Ͻ� ������ ������.
	int money;
	int speed;
	public Customer(Account account, String str, int money, int speed) {
		super(str); // super �� ����Ϸ��� ���� ���� ȣ���ؾ� ��.
		// this.accout = object; �ص� ������ ���� ������ ������..
		this.accout = account; 
		this.money = money;
		this.speed = speed;
	}
	
	@Override
	public void run() {
		// this.getName() �� �����尡 �̹� ������ �޼ҵ带
		// ������ ���ڴٴ� ��.
		accout.deposit(money, this.getName(),speed);
	}
}
