package Ans200111;

//if 조건문 이용
public class p34 {

	public static void main(String[] args) {
		int temp = 99;
		if (temp % 2 == 1) {
			temp = temp * 3 + 1;
		} else {
			temp = temp / 2;
		}
		System.out.println("계산 후=" + temp);
	}

}
