package nwk01.awt;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/*
AWT (Abstract Windows Toolkit)
: GUI (Graphic User Interface) 환경의 프로그램 및 안드로이드 위젯과 비슷
컴포넌트 : 사용자 인터페이스를 구성하는 기본요소.
	버튼, 체크박스, 레이블, 텍스트필드, 리스트, 팝업메뉴 와 같은
	부속품의 총칭. 자바에서는 Component 클래스가 있는데 모든 콤퍼넌트는
	이 Component 의 자손이다.
컨테이너 : Component 의 후손중에서 Container 라는 클래스가 있는데
	그 클래스와 자손을 지칭한다. 컨테이너는 컴포넌트를 부착하는 예를 들면
	윈도우 같은 것을 말하며 윈도우, 프레임, 패널, 다이얼로그 박스등이 있다.
	(다른 컴포넌트들을 담을 수 있는 컴포넌트)
레이아웃 : 컨테이너에 컴포넌트를 붙일 때 어떤 식으로 배치하는 가가 중요한데
	이것을 레이아웃이라고 한다.
이벤트 : 사용자로부터 입력이 일어나고 그에 따라 반응하도록 설계하는 모든 기능을 말한다.
 * */
public class FrameDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		// Toolkit 은 객체를 생성할 때
		// Toolkit toolkit = new Toolkit(); 이라고 하면서 만드는 것이 아니라
		// 스태틱 메소드를 통해 참조변수(객체)를 리턴한다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 공구상자에서 화면크기를 조절하는 기능을 가진 객체를 dim 에게 주었다.
		Dimension dim = toolkit.getScreenSize();
		
		/*
		 * [2] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		// 프레임의 좌표값에 따라 화면에서 보여지는데
		// 위 방식처럼 하면 고정된 위치가 아닌, 화면크기에 따라
		// 동적으로 변화된다. 즉 , 14인치 화면이든 6인치 스마트폰이든
		// 가운데 쯤에 프레임이 보여지게 된다.
		frame.setVisible(true);
	}
	
}
