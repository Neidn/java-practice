package Ans200110;

//문자열과 문자의 관계
public class p23 {
	public static void main(String[] args) {

		char a = '닳';
		String letter = "동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		int letterNumber = letter.length(); // string.length()는 문자열 길이 리턴
		int loc = letter.indexOf(a); // 문자열에서 문자의 위치 리턴
		System.out.printf("\"%s\"=>%d자이며, '%c'은 %d번째 있다,\n", letter, letterNumber, a, loc);
		char b = letter.charAt(loc);
		System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter, loc, b);
		// \[특수문자]는 ""안에서 특수문자 그대로 형태를 유지한다
		// string.indexOf는 문자의 위치 번호를
		// letter.charAt은 위치의 문자를 리턴한다

	}
}
