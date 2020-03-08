package Ans200110;

//static 메서드 이용
//static이 없는경우 클래스를 통해 인스턴스로 만들고 호출해야 하나
//static이 있는경우 바로 호출이 가능하다
public class p29 {
	public static final int PHYSICAL = 23;

	public static double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}

	public static void main(String[] args) {
		int days = 1200;
		double phyval = getBioRhythm(days, PHYSICAL, 100);
		//PHYSICAL에서 static을 빼거나 getBioRhythm에서 static을 뺴면 오류가난다
		//객체 생성하지 않고도 쓸수 있는static을 선언해 주었기 때문이다
		System.out.printf("나의 신체 지수%1$.2f입니다.\n", phyval);
		
	}

}
