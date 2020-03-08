package Ans200127;
//그냥 클래스 만들기
public class p83 {

	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
				"luis fonsi");
		showAbout(b1);
		Billboard b = b1;
		showAbout(b);
	}

	private static void showAbout(Billboard b) {
		String sf = String.format("%d, %s, %d, %s, %s", b.getRank(), b.getSong(), b.getLastweek(), b.getImagesrc(),
				b.getArtist());
		System.out.println(sf);
	}
}