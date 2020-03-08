package Ans200122;

//Object 이해하기
//객체라 하니 뭔가 애매하다
//Object는 최상위 클래스
public class p64 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		// 객체가 가진 고유한 주소
		System.out.println(obj1.hashCode());

		// 객체가 가진 타입을 반환한다
		System.out.println(obj1.getClass());

		// 참조 주소값을 비교한다
		// new로 인해 둘은 항상 false가 된다
		System.out.println(obj1 == obj2);

		// .equals는 해시코드값을 비교한다
		// 참조 주소값과는 다르니 주의
		System.out.println(obj1.equals(obj2));

		// 참조타입은 자동으로 toString 메소드를 가지고있다
		// 타입@16진수 해시코드 형식으로 나타낸다
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

		// 다형성에 의해 최상위에 있는object로 스트링을 출력할 수 있다
		// ex)List<> n = new ArrayList<>(); 도 가능
		Object str = new String("Good");
		System.out.println(str);
		System.out.println(str instanceof Object);
		System.out.println(str instanceof String);
		System.out.println(str.getClass());

	}

}
