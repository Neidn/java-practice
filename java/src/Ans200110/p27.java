package Ans200110;

//d연산자 %, *, / 이용
public class p27 {
	public static final int PHYSICAL = 23; // 상수, 문제 26에서 정의

	public static void main(String[] args) {
		int index = PHYSICAL;
		int days = 1200;
		double vals = (days % index) * 2 * Math.PI / index;
		System.out.println(Math.toDegrees(vals) + "도");
		//math.pi는 26번에서 봤다시피 원주율값 상수이고 math.todegrees는 라디안값을 디그리로 변환시켜준다
	}

}
