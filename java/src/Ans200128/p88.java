package Ans200128;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;

public class p88 {

	public static void main(String[] args) {
		File f = new File("Billboard");
		File[] fd = f.listFiles();
		for (File fe : fd) {
			String name = fe.getName();
			String post = name.substring(name.lastIndexOf(".") + 1);
			System.out.println(name + " " + post);
			System.out.println(fe.getAbsolutePath());
			System.out.println(new Date(fe.lastModified()));
			try (BufferedReader br = new BufferedReader(new FileReader(fe.getAbsolutePath()))) {
				String msg = "";
				while ((msg = br.readLine()) != null) {
					System.out.println(msg);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("---------------");
		}

	}

}