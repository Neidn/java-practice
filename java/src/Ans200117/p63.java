package Ans200117;

//수학 연산에서의 에러 처리
//ArithmeticException 이라 한다
public class p63 {

	public static void main(String[] args) {
		try {
			int x = 5;
			int y = 20 / (5 - x);
			System.out.println(y);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누었다");
			e.printStackTrace();
			// 에러 메세지의 발생 근원지를 찾아 단계별로 에러 출력

		}
	}

}
