package api02.util.hashMap;

public interface MemberService {
	/*
	 * 회원가입을 담당하는 로직
	 * 회원가입시 ID, 비번, 이름, 나이, 주소를 받음
	 * */
	public void join(String id, String password, String name,
			int age,  String addr);
	/*
	 * 로그인을 담당하는 로직
	 * 로그인시 ID 와 비번을 입력받아 실행함
	 * */
	public void login(String id, String password);
}
