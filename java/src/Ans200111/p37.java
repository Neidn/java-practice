package Ans200111;

//앞 문제와 비슷하게 메소드 선언하나
//클래스 상수를 새로 지정해 주고 사용해보는 문제이다
public class p37 {
	public static final int PHYSICAL = 23;
	public static final int EMOTIONAL = 28;
	public static final int INTELLECTUAL = 33;

	public static String textInfor(int index, double value) {
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
	}// 이부분은 쓰기 귀찮아서 36번에서 끌고왔다

	public static void main(String[] args) {
		int index = PHYSICAL;
		double value = 0.86;
		String st = textInfor(index, value);
		System.out.println(st);//클래스 상수를 호출하여 앞문제와 동일한 효과를 낸 것이다
	}

}
