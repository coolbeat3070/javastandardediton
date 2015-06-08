package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		
		Button btnOk = new Button("확 인");
		btnOk.setSize(100,50); 
		btnOk.setBackground(Color.YELLOW);
		btnOk.setLocation(100, 75); // (x좌표, y좌표)
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		frame.setLayout(null);
		frame.add(btnOk);
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
		
		/*
		 한글깨짐 솔루션(해결책)
		 프로젝트명 우클릭
		 > 맨 밑 properties 클릭
		 > run/debug setting 클릭
		 > 현재 클래스명 더블클릭
		 > arguments 탭 클릭
		 > VM arguments 빈공간에
		 > -Dfile.encoding=MS949 입력
		 > 저장후 재실행 
		 * */
	}
}
