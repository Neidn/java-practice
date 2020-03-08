package Ans200116;

import java.util.ArrayList;
import java.util.List;

public class p58 {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i < 11; i++) {
			ilist.add(i);
		}
		for (int m : ilist) {
			if (m % 2 == 1) {
				s += m * m;
				System.out.printf("%d ", m * m);
			}
		}
		System.out.println();
		System.out.println("1~10 사이의 홀수에 대한 제곱합 : " + s);
	}
}
