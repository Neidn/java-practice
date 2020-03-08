package Ans200115;

import java.util.ArrayList;
import java.util.List;

//드디어 list를 사용한다
//list와 array의 차이는 이미 알고 있으니 패스
public class p56 {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		// 넣기
		for (int i = 1; i <= 10; i++) {
			ilist.add(i);
		}
		// 가져오기
		for (int i = 0; i < ilist.size(); i++) {
			int m = ilist.get(i);
			System.out.printf("%d ", m);
		}
		System.out.println();
	}

}
//list는 넣을땐 add
//가져올땐 get