package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); // (너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label(" Good Bye,Java..Hello JSP ");
		labId.setBounds(50, 50, 30, 10); // (50,50 위치 좌표..30, 10 너비 높이)
		
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		// frame.setLayout(new FlowLayout());
		// FlowLayout 은 가로로 (좌에서 우로) 정렬시킨다.
		frame.setLayout(null); // null 이면 x, y 좌표로 정렬된다
		frame.add(labId);
		
		Font plain = new Font("Serif", Font.PLAIN, 20); // 20 은 폰트 사이즈
		Font italic = new Font("Serif", Font.ITALIC, 20);
		Font bold = new Font("Serif", Font.BOLD, 20);
		Font boldItalic = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		
		labId.setFont(boldItalic);
		frame.setLayout(new FlowLayout());
		/*
		 * [3] 컴포넌트를 화면에 띄우기
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
		
	}
}
