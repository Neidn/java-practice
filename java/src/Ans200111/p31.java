package Ans200111;

public class p31 {

	public static void main(String[] args) {
		FRUIT pear = FRUIT.APPLE;
		FRUIT pear2 = FRUIT.MANGO;
		System.out.println(pear);
		System.out.println(pear.name());
		//enum에서 호출된 이름을 string으로 리턴한다
		System.out.println(pear.ordinal());
		System.out.println(pear2.ordinal());
		//ordinal은 리스트의 index와 같은 기능으로 정수형을 리턴해주고
		//해당 값이 위차한 곳을 0 이상의 값으로 리턴해준다
		FRUIT[] fruits = FRUIT.values();
		//values는 enum 클래스 안에 있는 모든 값을 순서대로 반환해준다
		//이 경우fruits 라는 배열 안에 열거형 안의 모든 값을 집어넣었다
		System.out.println(fruits[0]);
	}

}
