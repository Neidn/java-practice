package Ans200122;

public class p66 {
	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";
		System.out.println(city1);
		System.out.println(city1.length());
		// 레퍼런스 비교
		System.out.println(city1 == city2);
		// 해시코드값 비교
		System.out.println(city1.equals(city2));
		System.out.println(city1 == city3);
		System.out.println(city1 == city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city7));

		String city4 = String.format("%s-%s", city1, city2);
		System.out.println(city4);
		// concat도 문자열 붙이기
		String city5 = city1.concat(city2);
		System.out.println(city5);
		
		
	}

}
