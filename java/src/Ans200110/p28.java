package Ans200110;

/*math 클래스의 PI : 원주율,E : 자연지수값 2.718,sin() : 사인 삼각함수
 * toDegrees() : 괄호 안의 값을 라디안->degree로 변환
 * random() : 0~1까지의 실수를 만든다
 */
public class p28 {
	public static final int PHYSICAL = 23;

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double phyval = 100 * Math.sin((days % index) * 2 * Math.PI / index);
		System.out.printf("나의 신체 지수%1$.2f입니다.\n", phyval);
		// sin() : 괄호 안에 주어진 라디안 값을 sin값인 -1~1으로 리턴해준다
	}

}
