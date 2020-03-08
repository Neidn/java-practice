package Ans200125;

import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

//system으로연산시간 구하기
//junit이 아니다
public class p71 {
	public static void main(String[] args) {
		// 시간을 밀리초로 구한다
		// 시작은 1970.1.1이 0
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for (int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		// 두개의 차를 이용해 연산시간을 구하게된다
		long ltime2 = System.currentTimeMillis();
		System.out.println(ltime2 - ltime);
		System.out.println(ltime2 / 1000 / 60 / 60 / 24 / 365 + "년");
		// hashtable의 하위클래스인 properties이다
		// key와value로 구성된다
		Properties pro = System.getProperties();
		// 두개의 키에 대응하는 value값을 가져온다
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		// 오늘을 기준으로 날짜를 가져온다
		System.out.println(new Date(System.currentTimeMillis()));

		// vecter와 hashtable에서 주로쓰이는 일괄 반복처리 인터페이스
		// iterator가 좀더 상위이나 list나 set의 경우 데이트 삭제와 삽입이 가능
		Enumeration<Object> en = pro.keys();
		int i = 0;
		while (en.hasMoreElements()) {
			String keys = (String) en.nextElement();
			System.out.println((++i + " ") + keys + ":" + pro.getProperty(keys));
		}

	}
}
