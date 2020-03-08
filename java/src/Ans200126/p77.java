package Ans200126;

import java.util.Arrays;

//1차원 배열 사용
public class p77 {

	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		int[] b = new int[] { 2, 5, 3, 9, 8 };
		int[] c = { 2, 5, 3, 9, 8 };
		int[] e = new int[5];
		// 배열을 특정값으로 모두 채운다
		Arrays.fill(e, -1);
		System.arraycopy(c, 0, e, 0, c.length);
		Arrays.sort(e);
		print(e);
		// 배열을 다시 초기화가 가능하다
		e = new int[] { 1, 2, 3, 4, 5, 6 };
		print(e);
		//배열에서 특정 값을 찾는 방법이다
		int index = Arrays.binarySearch(e, 5);
		System.out.println(index);

	}

	private static void print(int[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		}
		System.out.println();
	}
}
