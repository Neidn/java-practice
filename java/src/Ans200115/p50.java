package Ans200115;

//2진수로 전환
public class p50 {
	public static String shifts(int a) {
		String s = "";
		for (int i = 0; i <= 32; i++) {
			int aa = a % 2;
			s = (aa >= 0) ? aa + s : (-aa) + s;
			a >>= 1; // 비트 한칸 우측으로 밀고 대입한다
		}
		return s;
	}

	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%4d : %s%n", intNums1, shifts(intNums1));
		System.out.printf("%4d : %s%n", intNums2, shifts(intNums2));
	}

}
