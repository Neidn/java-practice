package Ans200122;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class p65 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Class classes = obj1.getClass();
		// getName은 클래스 이름 추출
		System.out.println(classes.getName());
		System.out.println("------constructor-----");

		Constructor[] constructor = classes.getDeclaredConstructors();
		for (Constructor con : constructor) {
			System.out.println(con.getName());
		}
		System.out.println("------method------");
		Method[] method = classes.getMethods();
		for (Method me : method) {
			System.out.println(me.getName());
		}
	}
}
