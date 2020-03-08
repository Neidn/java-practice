package Ans200128;

import java.io.BufferedReader;
import java.io.FileReader;

//저장한 파일 읽어오기
public class p87 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("Billboard\\bill.txt"))) {
			String msg = "";
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
