package Ans200125;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//calendar와 string 사이의 변환하기
public class RestDay {

	// mm은 분을, MM은 월을 의미하니 주의
	public static String toYMD2(Calendar d3) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(d3.getTime());
	}

	// day만큼 움직인 시간을 출력
	public static String goGo(String ss, int day) {
		Calendar cal = todate(ss);
		cal.add(Calendar.DAY_OF_YEAR, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		return sdf.format(cal.getTime());
	}

	// 받은 문자열을 date로 변환
	// 문자열을 먼저 date로 변환한후
	// 이를 setTime으로 calendar로 변환하였다
	public static Calendar todate(String ss) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date dd = new Date();
		try {
			dd = sdf.parse(ss);
		} catch (ParseException e) {
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		return cal;
	}

	// 이번엔 역으로 calendar를 문자열로 반환
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		return sdf.format(dd.getTime());
	}
}