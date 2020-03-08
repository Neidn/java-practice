package Ans200113;

//자릿수의 합을 구하기
public class p48 {
	public static int sumEach(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 1234567;
		int value = sumEach(number);
		System.out.printf("%d에 대한 각 자리의 숫자의 합:%d", number, value);
	}

}
