package Ans200127;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

//이번엔 자바에서 바로 입출력을 다룬다
//82~85가 단순히 래퍼런스 타입에 대해 객체사용하고 배열을 썻다면 
//이번엔 입출력을 이용해 파일로 만든다
public class p86 {
	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, "https://www.billboard.com/images/pref_images/q61808osztw.jpg",
				"luis fonsi");
		Billboard b2 = new Billboard(2, "That's What I Like", 2,
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm The One", 3,
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg", "dj khaled");
		ArrayList<Billboard> bblist = new ArrayList<Billboard>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		// 폴더명 지정
		File f = new File("Billboard");
		if (!f.exists()) {
			f.mkdirs();
		}
		// 경로 및 파일 명 지정
		try (PrintWriter pw = new PrintWriter(new FileWriter("Billboard\\bill.txt", false), true)) {
			for (Billboard bb : bblist) {
				pw.println(bb);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
