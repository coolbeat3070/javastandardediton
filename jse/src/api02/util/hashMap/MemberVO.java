package api02.util.hashMap;

public class MemberVO {
	/*
	 * ��ü�� ��ɰ� �Ӽ����� ������
	 * ��üŸ���� �Ӽ������� ������Ʈ Ŭ����(������ Ŭ����)
	 * �� ��������� �������̽�(��� Ŭ����)�� �����ϴ�.
	 * �� �κ��� DB �� ����Ǵ� �߿�����(Core Data)��
	 * ��Ƶ� Value Object ��� �Ҹ��� Ŭ���� �Դϴ�.
	 *  * */
	private String name; // ȸ�� �̸�
	private String addr; // ȸ�� �ּ�
	private int age; // ȸ�� ����
	private String id; // ȸ�� ID
	private String password; // ȸ�� ���
	
	/*
	 * ��ü������ 4�� Ư¡�� ����ȭ, ���, �߻�ȭ, �پ缺 ��
	 * ����ȭ�� ���� getter, setter �� �ۼ��ϼ���..
	 * */
	// getter setter ����Ű
	// ALT + SHIFT + S
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/*
	 * ��ü������ 4�� Ư¡�� ����ȭ, ���, �߻�ȭ, �پ缺 ��
	 * ��Ӱ� �پ缺�� �ش��ϴ� toString() �������̵���
	 * �ڵ��� �ּ���.
	 * */
	// ALT + SHIFT + S
	@Override
	public String toString() {
		return "ȸ�� ������ [�̸�=" + name + ", �ּ�=" + addr + ", ����=" + age
				+ ", ID =" + id + "] �Դϴ�.";
	}
	
	
}