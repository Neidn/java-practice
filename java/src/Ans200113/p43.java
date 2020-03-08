package Ans200113;

//while을 이용해 홀수면 3을 곱하고 1을 더하고 짝수면 2로 나눈다
public class p43 {
	public static void showOddnEvenw(int n) {
		int temp = n;
		while (temp != 1) {
			if (temp % 2 == 1) {
				temp = temp * 3 + 1; // 홀수 일때
			} else {
				temp /= 2;
			}
			System.out.print("[" + temp + "]");
		}
		System.out.println("\n------------------");
	}

	public static void main(String[] args) {
		showOddnEvenw(122);
	}

}
