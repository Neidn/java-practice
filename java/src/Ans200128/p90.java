package Ans200128;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class p90 {

	public static void main(String[] args) {
		ArrayList<String> htmls = new ArrayList<String>();
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = null;
			while ((line = br.readLine()) != null) {
				if (!line.equals("")) {
					htmls.add(line);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		for (String s : htmls) {
			System.out.println(s);
		}
	}
}
