package Ans200113;

//간단한 반복문 사용
public class p42 {

	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			double fahrenheit = 9.0 / 5 * i + 32; // 더블타입 사용
			System.out.printf("섭씨 %d도=화씨 %.2f도\n", i, fahrenheit);
		}
	}

}
