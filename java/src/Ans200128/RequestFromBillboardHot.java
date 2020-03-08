package Ans200128;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import Ans200127.Billboard;

public class RequestFromBillboardHot {
	ArrayList<String> htmls = new ArrayList<String>();
	ArrayList<Billboard> billboards = new ArrayList<Billboard>();
	boolean isConnection = false;

	public RequestFromBillboardHot() {
		htmls.clear();
		billboards.clear();
	}

	public ArrayList<Billboard> getBillboards() {
		return billboards;
	}

	public void getAllHtml(String Urls) {
		htmls.clear();
		URL url = null;
		try {
			url = new URL(Urls);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = "";
			while ((line = br.readLine()) != null) {
				if (!line.trim().equals("")) {
					htmls.add(line.trim());
				}
			}
			isConnection = true;
		} catch (Exception e) {
			isConnection = false;
			System.out.println("Billboard Parsing error !!!");
		}
	}

	public void printHtml() {
		for (String ss : htmls) {
			System.out.println(ss);
		}
	}

	public void printBillboard() {
		for (Billboard dto : billboards) {
			System.out.println(dto);
		}
	}

	public String getTimeDate(String Urls) {
		String s = "";
		URL url = null;
		try {
			url = new URL(Urls);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = "";
			while ((line = br.readLine()) != null) {
				if (!line.trim().equals("")) {
					if (line.trim().contains("<time datetime=")) {
						s = line.trim();
						s = s.substring(0, s.indexOf(">") - 1);
						s = s.substring(s.indexOf("\"") + 1).trim();
						break;
					}
				}
			}
			isConnection = true;

		} catch (Exception e) {
			isConnection = false;
			System.out.println("Billboard Parsing error !!!");
		}
		return s;
	}

	// 스레드 차원에서 막는다는데 synchronized는 잘 모르겠다
	// 나중에 더 살펴보자
	public synchronized void getBillboardData(String str) {
		billboards.clear();
		for (int i = 0; i < htmls.size(); i++) {
			String ss = htmls.get(i);
			if (ss.contains(str)) {
				String rank = str.substring(str.indexOf("chart-row--" + "chart-row--".length()));
			}
		}
	}

}
