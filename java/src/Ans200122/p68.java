package Ans200122;
//클래스 정보 추출하기, reflect정보 이용
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class p68 {
	public static String toModi(int n) {
		String s = "";
		switch (n) {
		case 0:
			s = " ";
			break;
		case 1:
			s = "public ";
			break;
		case 2:
			s = "private ";
			break;
		case 4:
			s = "protected ";
			break;
		case 8:
			s = "static ";
			break;
		case 10:
			s = "private static ";
			break;
		case 9:
		case 137:
			s = "public static ";
			break;
		case 17:
			s = "public final ";
			break;
		case 257:
			s = "public native ";
			break;
		case 260:
			s = "protected native ";
			break;
		case 273:
			s = "public final native ";
			break;
		default:
			s = "xxxx";
			break;
		}
		return s;
	}

	public static String toRe(String msg) {
		String s = "";
		if (msg.indexOf("[") != -1) {
			if (msg.contains("[C")) {
				s = msg.substring(msg.indexOf(" ") + 1).trim();
				s = s.replace("[C", "char[]");
			} else if (msg.contains("[L")) {
				s = msg.substring(msg.indexOf(" ") + 1).trim();
				s = s.replace("[L", "").replace(":", "");
				s = s.concat("[]");
			} else if (msg.contains("[B")) {
				s = msg.substring(msg.indexOf(" ") + 1).trim();
				s = s.replace("[B", "byte[]");
			}
		} else if (msg.indexOf(" ") != -1) {
			s = msg.substring(msg.indexOf(" ") + 1).trim();
			s = s.replace("[B", "byte[ ]");
		} else {
			s = msg.trim();
		}
		return s;
	}

	public static void main(String[] args) {
		Object obj1 = new Object();
		try {
			// 클래스 이름을 설정(getClass로 볼수있다)
			Class classes = Class.forName("java.lang.String");
			System.out.println("----------Method 찾기---------");
			// 선언된 메소드를 배열로써 다 넣어준다
			Method[] mes = classes.getDeclaredMethods();
			for (Method me : mes) {
				// 접근제한자 정보를 반환한다 1=public, 2=private, 3=default, 4=protected
				if (me.getModifiers() > 4000)
					continue; // 4000초과면 다음스텝
				System.out.printf("%s\t\t", toModi(me.getModifiers()));
				// 메소드의 반환타입을 반환하고 이를 문자열로 만들어 출력
				System.out.printf("%-30s\t\t", toRe(me.getReturnType().toString()));
				// 클래스 이름을 가져온다
				System.out.printf("%s", me.getName());
				System.out.printf("(", "");
				Class[] aa = me.getParameterTypes();
				for (int j = 0; j < aa.length; j++) {
					System.out.printf("%s", toRe(aa[j].getName()));
					if (j != aa.length - 1) {
						System.out.print(",");
					}
				}
				System.out.printf(")", "");
				System.out.println();
			}
			System.out.println("-------생성자 찾기--------");
			Constructor[] constructor = classes.getDeclaredConstructors();
			for (Constructor con : constructor) {
				System.out.println(con.getName());
				System.out.printf("(", "");
				Class[] aa = con.getParameterTypes();
				for (int j = 0; j < aa.length; j++) {
					System.out.printf("%s", toRe(aa[j].getName()));
					if (j != aa.length - 1) {
						System.out.print(",");
					}
				}
				System.out.printf(")", "");
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
