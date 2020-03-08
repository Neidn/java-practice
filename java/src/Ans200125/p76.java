package Ans200125;

//character 사용법
public class p76 {
	public static void main(String[] args) {
		Character chr1 = new Character('W');
		Character chr2 = new Character('9');
		// charValue는 객체에 대입되었던 문자를 반환
		if (Character.isLetter(chr1.charValue())) {
			System.out.print("1: " + chr1.charValue());
		}
		System.out.print(" ");
		// u는 유니코드를 의미한다
		System.out.print('\u0057');
		System.out.print("\t");
		System.out.println((int) chr1);
		// 해당 문자가 숫자여부를 판독한다
		// 아스키코드로 9는 57이다
		if (Character.isDigit(chr2.charValue())) {
			System.out.println("2: " + (int) chr2.charValue());
		}

		// getType은 소문자 2, 대문자 1, 숫자 9, 공백은 15, 특수문자는 24이다
		System.out.println("3: " + Character.getType('a'));
		System.out.println("4: " + Character.getType('A'));
		System.out.println("5: " + Character.getType('3'));
		System.out.println("6: " + Character.getType('\n'));
		System.out.println("7: " + Character.getType('&'));
		// 공백문자는 9~13, 28~31의 값을 가지고있다
		System.out.println("8: " + (int) '\b');

		System.out.println("" + Character.getNumericValue('9'));
		// 공백문자인지 확인하는 메소드
		System.out.println("" + Character.isWhitespace(' '));
		System.out.println("" + Character.isWhitespace('\b'));
		System.out.println("" + Character.isLetterOrDigit('9'));
		System.out.println("" + Character.isLowerCase('A'));
		System.out.println("" + Character.isUpperCase('A'));
		//뒤의 인자보다 작은 숫자 문자가입력되면 정수로 리턴한다
		System.out.println(""+Character.digit('8', 9));
		
		
		

	}
}
