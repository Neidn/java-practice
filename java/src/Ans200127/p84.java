package Ans200127;

public class p84 {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
				"luis fonsi");
		Billboard b2 = new Billboard(2, "That's What I Like", 2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm The One", 3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg", "dj khaled");
		Billboard[] b = new Billboard[3];
		b[0] = new Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
				"luis fonsi");
		b[1] = b2;
		b[2] = b3;
//		showAbout(b[0], b[1]);
		showAbout(b);
	}

	private static void showAbout(Billboard b) {
		System.out.println("1------------");
		String sf = String.format("%d, %s, %d, %s, %s", b.getRank(), b.getSong(), b.getLastweek(), b.getImagesrc(),
				b.getArtist());
		System.out.println(sf);
	}

	// 동일한 타입의 인자 여러개를 받을때 표기한다
	// 배열처럼 이용하고 foreach문으로 받는다
	// 배열도 가능하다
	private static void showAbout(Billboard... b) {
		System.out.println("2============================>");
		for (Billboard bill : b) {
			showAbout(bill);
		}
		System.out.println("<============================2");
	}
}
