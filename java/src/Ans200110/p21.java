package Ans200110;

//정수 배열 초기화
public class p21 {

	public static void main(String[] args) {
		int[] grade = { 90, 80, 89 };
		int sum = grade[0] + grade[1] + grade[2];
		int avg = sum / 3;
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", grade[0], grade[1], grade[2]);
		System.out.printf("총점 : %d, 평균 : %d", sum, avg);
	}

}
