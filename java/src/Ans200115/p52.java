package Ans200115;
//substring을 이용해 s에서 1이 처음 나오는
//즉, 양수 123을 4바이트 짜리로 비트 변환 시켰을대
//0이 아닌 부분을 출력한다
public class p52 {
	public static int BITMASK = 1;

	public static String shifts(int a) {
		String s = "";
		for (int i = 0; i < 32; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;
		}
		return s.substring(s.indexOf('1'));
	}

	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%4d : %s\n", intNums1, shifts(intNums1));
		System.out.printf("%4d : %s\n", intNums2, shifts(intNums2));
	}

}
