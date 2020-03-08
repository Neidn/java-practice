package Ans200110;

//정수 연산
public class p20 {

	public static void main(String[] args) {
		int kor = 90;
		int eng = 80;
		int math = 89;
		int tot = kor + eng + math; // 합은 259
		int avg = tot / 3; // 정수형이므로 86.333이 아닌 86
		System.out.println(kor + " " + eng + " " + math + " " + tot + " " + avg);
	}

}
