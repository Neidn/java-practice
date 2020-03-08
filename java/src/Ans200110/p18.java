package Ans200110;

public class p18 {

	public static void main(String[] args) {
		String slat = "37.52127220511242   ";
		// String slat="hello";
		// 공백 제거 후 double로 타입 변환
		System.out.println(slat);
		double latitude = Double.parseDouble(slat.trim());
		// .parseDouble은 double 클래스의 메소드 : 문자열->더블형
		// string.trim()은 공백 제거하는 메소드
		System.out.println(latitude);
	}

}
