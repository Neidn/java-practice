package Ans200115;

//50번은 흔히 아는 2로 나누는 방식으로 2진수 변환
//51번은 2로 나누지 않고 비트 연산자 &를 사용하여 변환
public class p51 {
	public static int BITMASK = 1;

	public static String shifts(int a) {
		String s = "";
		for (int i = 0; i < 32; i++) {
			s = (a & BITMASK) + s;
			a >>= 1;
		}
		return s;
	}

	public static void main(String[] args) {
		int intNums1 = 123;
		int intNums2 = -123;
		System.out.printf("%4d : %s\n", intNums1, shifts(intNums1));
		System.out.printf("%4d : %s\n", intNums2, shifts(intNums2));
	}

}
