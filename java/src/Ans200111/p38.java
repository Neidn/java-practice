package Ans200111;
//enum이 정수로 리턴이 안되므로 되게하는 방법이다

public class p38 {
	public static String textInfor(PEI index, double value) {
		String result = "";
		switch (index) {
		case PHYSICAL: // 문자열처럼 보이나 상수이다
			result = "신체지수:";
			break;
		case EMOTIONAL:
			result = "감성지수:";
			break;
		case INTELLECTUAL:
			result = "지성 지수:";
			break;
		}
		return result + (value * 100); // void가 아니니 리턴해주어야한다
	}

	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값: " + index.getPei()); // enum을 int로 전환
		String st = textInfor(index, value);
		System.out.println(st);
		System.out.println(index.name());
		System.out.println(index);
		System.out.println(index.getPei());
	}

}
