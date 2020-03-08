package Ans200110;

//상수(final) 선언
public class p26 {
	public static final int PHYSICAL = 23; // 상수(자체 정의)

	public static void main(String[] args) {
		System.out.println(PHYSICAL);
		int index = PHYSICAL;
		double vals = 2 * Math.PI / index; // math.pi는 이미 정의된 상수이다
		System.out.println(vals + "라디안"); //라디안 변환
	}

}
