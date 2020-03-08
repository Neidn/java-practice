package Ans200221;

//약수와 소이눗 분해
public class p123 {
    public static void main(String[] args) {
        printDivide(194560);
        printPrimeDivide(194560);
    }
    public static void printDivide(int n) {
        if (n == 1) {
            System.out.print("[1]");
        } else {
            System.out.print("[1,");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + ",");
                }
            }
            System.out.println(n + "]");
        }
    }

    public static void printPrimeDivide(int n) {
        int a = 2;
        while (n != 1) {
            if (n % a == 0) {
                if (n / a == 1) {
                    System.out.println(a);
                } else {
                    System.out.print(a + "x");
                }
                n /= a;
            } else {
                a++;
            }
        }
    }
}
