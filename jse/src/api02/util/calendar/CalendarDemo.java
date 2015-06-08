package api02.util.calendar;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar 의 getInstance() 는 스태틱이라
		// 클래스를 통해 바로 불러와서 인스터스를 생성한다.
		// 그래서 new Calendar() 와 같은
		// 생성자 문법을 사용하지 않고 아래처럼 생성했다.
		Calendar date = Calendar.getInstance();
		System.out.print("오늘날짜 :"); // println 은 줄 개행까지 포함이고, ln 을 지우면 개행이 없다.
		System.out.print(date.get(Calendar.YEAR)+"년");
		System.out.print((date.get(Calendar.MONTH)+1)+"월");
		System.out.print(date.get(Calendar.DATE)+"일");
		/*
		 * 위 결과를 그대로 출력하면 오늘날짜 :2015년4월29일 라고 나온다.
		 * 자바 API 튜토리얼을 보면.."calendars is JANUARY which is 0" 이라고 나와있다.
		 * 따라서 월은 0부터 시작하므로 위 식에서 1을 더해서 출력해야한다.
		 * (date.get(Calendar.MONTH)+1) 괄호위치에 주의!!
		 * */
		System.out.println();
		System.out.print("현재시간 :");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초");
		
		/*
		 * 프로그램 트라이얼 보면 30일 사용제한 같은 것이 걸린 것을 본 케이스라면..
		 * 30일 후의 시간을 자동으로 반환하는 로직도 필요합니다.
		 * 아래와 같이 처리하면 됩니다.
		 * */
		System.out.println("현재 기준 임의의 시간을 설정할 때 ");
		System.out.println("30일 후의 날짜를 얻고자 할때.");
		date.add(Calendar.DATE, 30);
		System.out.println(toString(date));
		System.out.println("7시간전의 시간를 얻고자 할때");
		date.add(Calendar.HOUR, -7); // 파라미터 에 마이너스 값을 주어서 처리하시면 됨.
		System.out.println(toString(date)); // 스태틱이라 객체 생성 없이 바로 가져다 씀.
		/*
		 * 스케줄 프로그램을 작성할때 특정일자를 픽스해야 하는 경우에는 다음과 같이 처리.
		 * 만약 22시 30분 45 초에 알람을 울리게 하는 기능을 주고자 할때..
		 * */
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		System.out.print("수정된 시간은 :");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초");
		
		
		/*
		 * 바로 출력을 하면 시스템에서 제공하는 시간들이 나옵니다.
		 * 따라서 toString() 을 오버라이딩 해야 합니다.
		 * 여기서는 static 으로 별도로 작성합니다.
		 * */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"년"
				+date.get(Calendar.MONTH)+"월"
				+date.get(Calendar.DATE)+"일";
	}
}








