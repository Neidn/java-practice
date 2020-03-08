package Ans200222;


//친화수 구하기
// 세 수 a,b,c가 있다
// a의 약수의 합(자기자신은 제외)을 b라 하고
// b의 약수의 합(자기 자신 제외)을 c라 할때
// a==c이면 a와b는 친화수라고 한다
// 두 수가 연관있어야 하는것은 아니다
public class p135 {
    public static void main(String[] args) {
        printAmicable(2, 20000); // 두 수 사이의 친화수
    }

    public static void printAmicable(int t1, int t2) {
        for (int i = t1; i < t2; i++) {  //두수 사이의 모든 친화수를 구한드
            int a = i;
            int b = divide(a); // 약수의 합
            int c = divide(b);
            if (a < b && a == c) { // 중복방지 ex)(220,284), (284,220)의 경우중 앞에꺼만 고려
                System.out.printf("%d,%d는 친화수: ", a, b);
                printDivide(a);
                printDivide(b);
                System.out.println();
            }
        }
    }

    private static void printDivide(int n) {
        if (n == 1) {
            System.out.println("[1]");
        } else {
            System.out.printf("[1,");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.printf("%d,", i);
                }
            }
            System.out.printf("%d]", n);
        }
    }

    private static int divide(int n) {
        int tot = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                tot += i;
            }
        }
        return tot;
    }

}
