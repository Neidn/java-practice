package Ans200125;

//Math 메소드 사용
public class p73 {
	public static void main(String[] args) {
		// 상수값 2개
		// 자연수 e
		System.out.println("Math.E" + Math.E);
		// 원주율
		System.out.println("Math.PI" + Math.PI);
		// 메소드 사용
		System.out.println("Math.abs(-5)절대값:" + Math.abs(-5));

		System.out.println("Math.ceil(4.34)올림 값:" + Math.ceil(4.34));
		System.out.println("Math.round(4.34)반올림 값:" + Math.round(4.34));
		System.out.println("Math.floor(4.34)버림 값:" + Math.floor(4.34));

		System.out.println("Math.max(45, 78):" + Math.max(45, 78));
		System.out.println("Math.min(45, 78):" + Math.min(45, 78));
		// 제곱수를 구해주나 double형으로 리턴한다
		System.out.println("Math.pow(2, 4):" + Math.pow(2, 4));
		System.out.println("Math.log(30):" + Math.log(30));
		System.out.println("Math.exp(3):" + Math.exp(3));
		System.out.println("Math.sqrt(10):" + Math.sqrt(10));
		// toRadians는 degree를 radian으로 변환해준다
		System.out.println("Math.sin(Math.toRadians(90)):" + Math.sin(Math.toRadians(90)));
		System.out.println("Math.random()=>" + Math.random());
		System.out.println("(int)(Math.random()*100)=>" + (int) (Math.random() * 100));
	}
}
