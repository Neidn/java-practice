package Ans200113;

public class p38 {

	public static String textInfor(PEI index, double value) {
		String result = "";
		switch (index) {
		case PHYSICAL:
			result = "신체 지수:";
			break;
		case EMOTIONAL:
			result = "감정 지수:";
			break;
		case INTELLECTUAL:
			result = "지성 지수:;";
			break;
		default:
			result = "미결정:";
			break;
		}
		return result + (value * 100);
	}

	public static void main(String[] args) {
		PEI index = PEI.PHYSICAL;
		double value = 0.86;
		System.out.println("신체 지수 주기값:" + index.getPei());// enum을 int로 변환
		String st = textInfor(index, value);
		System.out.println(st);		
		System.out.println(index.ordinal());   //enum의 순서를 출력 0부터 시작한다
		System.out.println(index.name()); 		//이름출력
		System.out.println(index);
		System.out.println(index.getPei());
	}
}
