package Ans200222;

public class p125 {
    public String ant(String s) {
        String t = "";
        char c = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                cnt++;
            } else {
                t = t + c + cnt;
                c = s.charAt(i);
                cnt = 1;
            }
        }
        t = t + c + cnt;
        return t;
    }

    public void ant(int stage) {
        String s = "11";
        for (int i = 0; i < stage; i++) {
            System.out.println(s);
            s = ant(s);
        }
    }

    public static void main(String[] args) {
        p125 tmp = new p125();
        tmp.ant(12);
    }
}
