package Ans200111;

//switch문 정적 메소드 하나 선언하고 출력하는 문제이다
public class p36 {
	public static String textInfor(int index, double value) {
		String result = "";
		switch (index) {
		case 23:
			result = "신체지수:";
			break;
		case 28:
			result = "감성지수:";
			break;
		case 33:
			result = "지성 지수:";
			break;
		}
		return result+(value*100); // void가 아니니 리턴해주어야한다
	}

	public static void main(String[] args) {
		int index = 23;
		double value = 0.86;
		String st = textInfor(index, value); // 메소드 호출
		System.out.println(st);
	}

}
