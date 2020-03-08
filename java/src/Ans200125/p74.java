package Ans200125;

import java.util.Calendar;
import java.util.Date;

//Calendar 클래스 사용
public class p74 {
	public static void main(String[] args) {
		// 1970.1.1부터 현재까지 일자로 표기
		long millies = System.currentTimeMillis();
		System.out.println(millies / 1000 / 60 / 60 / 24);

		// 오늘 출력
		Date d = new Date();
		System.out.println(d);
		// 하루 후 출력
		// 내부는 밀리초 단위로 돌아가므로 d의 시간에 하루만큼의 밀리초를 더해준다
		Date dd = new Date(d.getTime() + 24 * 60 * 60 * 1000);
		System.out.println(dd);

		Calendar cal1970 = Calendar.getInstance();
		cal1970.set(1970, 1 - 1, 1);

		Calendar today = Calendar.getInstance();
		printCalendar(today);

		long minus = today.getTimeInMillis() - cal1970.getTimeInMillis();
		System.out.println(minus);
		System.out.println(minus / 1000 / 60 / 60 / 24);
	}

	private static void printCalendar(Calendar c) {
		// 캘린더 클래스의 메소드 이용
		System.out.println("----------------");
		System.out.println(c.get(Calendar.YEAR));
		// 시작이 0이라 1을 더해준다
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// pm은 1, am은 0이다
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
}
