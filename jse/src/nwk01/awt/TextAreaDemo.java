package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		TextArea area = new TextArea("안녕하세요",10,50); // 가로 10글자 세로 5 줄
		area.selectAll(); // 입력한 글자 전체를 선택해서 ...
		
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		frame.setLayout(new FlowLayout()); 
		frame.add(area);
		
		
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
		
	}
}
