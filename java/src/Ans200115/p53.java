package Ans200115;

//1~100사이의 합과 홀수의 합
public class p53 {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i < 101; i++) {
			s += i;
		}
		System.out.println("1부터 100의 합 : " + s);
		s = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 1) {
				s += i;
			}
		}
		System.out.println("1부터 100사이의 홀수의 합 : " + s);
	}
}
