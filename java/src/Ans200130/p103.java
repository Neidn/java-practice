package Ans200130;

//객체화 은닉화 이해하기
// 접근제한자 사용
public class p103 {
	public static void main(String[] args) {
		String csuit1 = "H", cvalu = "6";
		String csuit2 = "H", cvalu2 = "3";

		Card c1 = new Card("H6");
		Card c2 = new Card(csuit1 + cvalu);
		Card c3 = new Card();
		Card c4 = new Card(csuit2 + cvalu2);

		// 해시코드 값이 다르기에 false
		System.out.println(c1.equals(c2));
		// 해시코드값 동일
		System.out.println(c1.getCardVal().equals(c2.getCardVal()));
	}
}
