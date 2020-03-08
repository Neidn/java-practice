package Ans200113;

//소수 판결하기, 제곱근을 사용한다
public class p49 {
	public static boolean isPrime(int n) {
		boolean isS = true;
		for (int i = 2; i < (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				isS = false;
				break;
			}
		}
		return isS;
	}

	public static void main(String[] args) {
		int number = 11;
		boolean ifPrime = isPrime(number);
		if (ifPrime) {
			System.out.printf("%d는 1과 자신으로만 나눠떨어지는 소수다.", number);
		} else {
			System.out.printf("%d는 소수가 아니다.", number);
		}
	}

}
