package Ans200122;

//StringBuilder
//stringbuffer랑 사용법이 거의 동일하다  문자열 수정 변경 추가
public class p70 {

	public static void main(String[] args) {
		StringBuilder sbu = new StringBuilder();
		sbu.append("I ").append("go to ").append("school.");
		System.out.println(sbu.toString());
		sbu.replace(7, 11, "");
		System.out.println(sbu.toString());
		sbu.reverse();
		System.out.println(sbu.toString());
		sbu.deleteCharAt(2);
		System.out.println(sbu.toString());
		sbu.delete(1, 3);
		System.out.println(sbu.toString());

		String ss = sbu.substring(0);
		System.out.println(ss);

		String st = sbu.substring(0, 4);
		System.out.println(st);
		System.out.println(sbu);

	}
}
