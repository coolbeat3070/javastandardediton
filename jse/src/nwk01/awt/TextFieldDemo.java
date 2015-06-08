package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class TextFieldDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label(" ID :");
		labId.setBounds(50, 50, 30, 10); // (50,50 위치 좌표..30, 10 너비 높이)
		Label labPwd = new Label(" Password :");
		labPwd.setBounds(50, 65, 100, 10);
		
		TextField txtId = new TextField(10); // 10글자까지 입력가능한 창을 만듬
		TextField txtPwd = new TextField(10);
		txtPwd.setEchoChar('*'); // 비밀번호는 * 로 보여지게 한다.
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		frame.setLayout(new FlowLayout());
		// FlowLayout 은 가로로 (좌에서 우로) 정렬시킨다.
		// frame.setLayout(null); // null 이면 x, y 좌표로 정렬된다
		frame.add(labId);
		frame.add(txtId);
		frame.add(labPwd);
		frame.add(txtPwd);
		
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
		
	}
}
