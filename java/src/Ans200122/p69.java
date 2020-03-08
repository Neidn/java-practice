package Ans200122;

//stringbuffer 사용해보기
public class p69 {
	public static void main(String[] args) {

		// buffer 생성
		StringBuffer sb1 = new StringBuffer();
		// string 버퍼에는 append가 있다
		// 약간 리스트의 add 느낌
		// 문자열은 +로 더해줄텐데 스트링버퍼는 아니다
		sb1.append("안녕하세요.").append("또 만나요").append("모두를 사랑해요.기다려봐.");
		System.out.println(sb1.toString() + sb1.hashCode());
		// repalce는 문자열과 동일
		sb1.replace(0, 2, "나 보기가 역겨워");
		System.out.println(sb1.toString() + sb1.hashCode());
		// reverse 사용
		// 다 뒤집는다
		sb1.reverse();
		System.out.println(sb1.toString());
		// 특정 문자열만 삭제 가능하다
		sb1.delete(10, 15);
		System.out.println(sb1.toString());
		//메소드에서도 인자로써 활용 가능하다
		replaces(sb1);
		System.out.println(sb1.toString());
	}

	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
	}
}
