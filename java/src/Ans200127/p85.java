package Ans200127;

import java.util.ArrayList;

public class p85 {
	private static void showAbout(Billboard b) {
		System.out.println("1------------");
		String sf = String.format("%d, %s, %d, %s, %s", b.getRank(), b.getSong(), b.getLastweek(), b.getImagesrc(),
				b.getArtist());
		System.out.println(sf);
	}

	public static void main(String[] args) {
		ArrayList<Billboard> bills = new ArrayList<Billboard>();
		// 배열을 레퍼런스 타입으로 만들었기떄문에
		// add할때도 new를 이용한다
		bills.add(new Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
				"luis fonsi"));
		bills.add(new Billboard(2, "That's What I Like", 2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars"));
		bills.add(new Billboard(3, "I'm The One", 3, "https://www.billboard.com/images/pref_images/q64532pl64x.jpg",
				"dj khaled"));
		System.out.println(bills.size());
		showAbout(bills.get(0));
		bills.remove(1);
		System.out.println(bills.size());
		System.out.println("----------------------");
		for (Billboard bill : bills) {
			showAbout(bill);
		}
	}
}
