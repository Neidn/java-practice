package Ans200131;

import java.util.Scanner;

// 마방진 만들기
public class p114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수 정수를 입력하세요");
		int n = sc.nextInt();
		OddMageSquare odd = new OddMageSquare(n);
		odd.play();
		odd.print();
	}
}
