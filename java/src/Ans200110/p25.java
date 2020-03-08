package Ans200110;

import java.util.Scanner;

//입력받아 출력하기
public class p25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 시스템기본 입력은 키보드

		System.out.print("정수를 입력하세요.");
		int choice = s.nextInt(); // 정수 입력
		System.out.println(choice);

		System.out.print("실수를 입력하세요.");
		double rchoice = s.nextDouble(); // 실수입력
		System.out.println(rchoice);

		System.out.print("문자열을 입력하세요.");
		String schoice = s.next();
		// next 와 nextLine 이 있는데 띄어쓰기도 받는것은 line이다
		System.out.println(schoice);
		s.close();
	}

}
