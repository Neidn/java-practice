package Ans200110;

//29번과 달리non static 상황
public class p30 {
	public static final int PHYSICAL = 23;

	public double getBioRhythm(long days, int index, int max) {
		return max * Math.sin((days % index) * 2 * Math.PI / index);
	}

	public static void main(String[] args) {
		int days = 1200;
		p30 bio = new p30();
		//non static 상황이기에 클래스인 p30을 이용해 인스턴스를 생성했다
		//그후 아래에서 인스턴스 명이 bio 이기에 bio를 통해 메소드를 접근 하였다
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("나의 신체 지수 %1$.2f입니다.\n", phyval);
	}

}
