package Ans200125;

import java.util.Iterator;
import java.util.Map;

//system으로 환경변수 확인하기
public class p72 {

	public static void main(String[] args) {
		long namotime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		long namotime2 = System.nanoTime();
		// 1970.1.1부터 현재까지 걸린 시간을 나노초로 반환한다
		// 그에 반복문이 돌아가는데 걸린 시간을 구하고 나노초로 확인한다
		System.out.println(namotime2 - namotime);
		// 자바 환경변수의 경로를 구한다
		// cmd상에서 path경로 설정하던 그부분이다
		System.out.println(System.getenv("JAVA_HOME"));
		Map<String, String> map = System.getenv();
		// map에서 키값 얻기
		// map에서 환경변수값을 가져온 뒤 키값을 iterator로 가져왔다
		Iterator<String> iter = map.keySet().iterator();
		int j = 0;
		while (iter.hasNext()) {
			String keys = iter.next();
			System.out.println((++j + " ") + keys + ":" + map.get(keys));
		}
	}

}
