package Ans200117;

//try catch finally 문 사용해보기
public class p62 {

	public static void main(String[] args) {
		String sNum = "123";
		String nNum = "h";
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		} catch (NumberFormatException ee) {
			// catch문은 여러개 사용 가능 단, 에러 이름이 달라야한다
			System.out.println("int인지 확인");
			System.err.println(ee.getMessage());
			//예외에 대한 내용을 출력한다
		} catch (Exception ee) {
			System.out.println("야 잘 좀 넣어");
		} finally {
			System.out.println("난 수행되어야만 해!!!");
			//finally 구문은 항상 출력된다
		}
	}

}
