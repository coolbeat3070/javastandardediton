package api02.util.hashMap;

public class MemberVO {
	/*
	 * 객체는 기능과 속성으로 나뉘며
	 * 객체타입은 속성위주의 컴포넌트 클래스(데이터 클래스)
	 * 와 기능위주의 인터페이스(기능 클래스)로 나뉩니다.
	 * 이 부분은 DB 에 저장되는 중요정보(Core Data)를
	 * 모아둔 Value Object 라고 불리는 클래스 입니다.
	 *  * */
	private String name; // 회원 이름
	private String addr; // 회원 주소
	private int age; // 회원 나이
	private String id; // 회원 ID
	private String password; // 회원 비번
	
	/*
	 * 객체지향의 4대 특징인 은닉화, 상속, 추상화, 다양성 중
	 * 은닉화를 위한 getter, setter 를 작성하세요..
	 * */
	// getter setter 단축키
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
	 * 객체지향의 4대 특징인 은닉화, 상속, 추상화, 다양성 중
	 * 상속과 다양성에 해당하는 toString() 오버라이딩을
	 * 코딩해 주세요.
	 * */
	// ALT + SHIFT + S
	@Override
	public String toString() {
		return "회원 정보는 [이름=" + name + ", 주소=" + addr + ", 나이=" + age
				+ ", ID =" + id + "] 입니다.";
	}
	
	
}
