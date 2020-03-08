package Ans200130;
// 오버라이딩 하여 해시코드값이 아닌 실제 값이 비교되도록 변경하였다
public class p105 {
	public static void main(String[] args) {
		Card c1 = new Card("H4");
		Card c2 = new Card("H4");
		// 오버라이딩 했으므로 둘의 값은 동일하다
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.getCardVal());
		System.out.println(c2.getCardVal());
		
		System.out.println(c1.equals(c2));
	}
}
