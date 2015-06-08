package api02.util.stringTokenize;

import java.util.StringTokenizer;

public class StringTokenizerDemo2 {
	public static void main(String[] args) {
		String date = "2015/05/30";
		int index = 0;
		StringTokenizer tok = new StringTokenizer(date,"/");
		while (tok.hasMoreElements()) {
			String str = (String) tok.nextElement();
			System.out.println("[Date index"+index+"]"+str);
			index++;
			
		}
	}
}
