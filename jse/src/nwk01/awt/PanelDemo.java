package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class PanelDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Panel panel = new Panel();
		panel.setBackground(Color.YELLOW);
		panel.setSize(100,100);
		panel.setLocation(50,50);
		
		Button btnOk = new Button("OK");
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		panel.add(btnOk);
		frame.add(panel);
		
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
	}
}
