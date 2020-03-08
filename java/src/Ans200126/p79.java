package Ans200126;

//2차원배열 사용
public class p79 {

	public static void main(String[] args) {
		int[][] a = new int[4][3];
		a[0][0] = 1;
		a[0][1] = 2;
		println(a);
		int[][] b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[3];
		println(b);

		int[][] c = new int[][] { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 6 }, { 6, 7, 8, 9, 0 } };
		println(c);

		int[][] d = new int[c.length][c[0].length];
		for (int i = 0; i < c.length; i++) {
			System.arraycopy(c[i], 0, d[i], 0, c[i].length);
		}
		println(d);
	}

	private static void println(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("[" + a[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();
	}
}
