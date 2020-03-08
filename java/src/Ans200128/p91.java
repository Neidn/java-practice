package Ans200128;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

// 오늘 기준 날짜로 하기	
public class p91 {
	public static void main(String[] args) {
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		String s = "";
		URL url = null;
		try {
			url = new URL(newUrls);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = "";
			while ((line = br.readLine()) != null) {
				if (!line.trim().equals("")) {
					/**
					 * <time datetime="2018-08-13">August 13,2018</time>
					 */
					if (line.trim().contains("<time datetime=")) {
						s = line.trim();
						s = s.substring(0, s.indexOf(">") - 1);
						s = s.substring(s.indexOf("\"") + 1).trim();
						break;
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Billboard Parsing error !!!");
		}
	}

}
