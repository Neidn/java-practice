package Ans200305;

import java.util.Arrays;
import java.util.Scanner;

// 야구게임 만들기
// 투수(3개의 숫자를 고른다), 타자(3개의 숫자를 맞춘다), 심판(스트라이크, 볼 판정)이 있어야한다
public class p151 {
    public static void main(String[] args) {
        Pitcher pit = new Pitcher();
        Hitter hit = new Hitter();
        Umpire ump = new Umpire();
        int iterCount = 0;
        pit.make();
        ump.setPitchball(pit.getGong());
        System.out.println("------시작----------");
        while (true) {
            iterCount++;
            hit.make();
            System.out.printf("%d번째 입력한 공 : %d,%d,%d\n", iterCount, hit.getGong()[0], hit.getGong()[1], hit.getGong()[2]);
            ump.setHitterball(hit.getGong());
            int strike = ump.strike();
            int ball = ump.ball();
            System.out.printf("%d번째 %dstrike %dball\n", iterCount, strike, ball);
            if (iterCount < 10 && strike == 3) {
                System.out.println("승리");
                break;
            } else if (iterCount >= 10 && strike < 3) {
                System.out.println("패배");
                System.out.printf("투수 : %d, %d, %d\n", pit.getGong()[0], pit.getGong()[1], pit.getGong()[2]);
                break;
            }
        }
    }

    // 이너클래스 하나 만든다
    // 투수 부분
    static class Pitcher {
        private int[] gong;
        private int n;
        private int num = 10; // 기회

        public Pitcher(int n, int num) {
            this.n = n;
            this.num = num;
            gong = new int[n];
            Arrays.fill(gong, -1);
        }

        public Pitcher() {
            this(3, 10);
        }

        public int makeOne() {
            return (int) (Math.random() * 10);
        }

        public int[] getGong() {
            return gong;
        }

        public boolean contains(int gn) {
            boolean check = false;
            for (int i = 0; i < n; i++) {
                if (gong[i] == gn) {
                    check = true;
                    break;
                }
            }
            return check;
        }

        // 야구게임을 할 숫자배열을 자동으로 만든다
        public void make() {
            int cnt = 0;
            while (cnt != n) {
                int temp = makeOne();
                if (!contains(temp)) {
                    gong[cnt++] = temp;
                }
            }
        }

        public void print() {
            System.out.println("Pitcher");
            for (int i : gong) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }

    }

    // 타자 부분
    // 입력은 스페이스바 없이 연속된 숫자 3개를 입력받는다
    static class Hitter {
        private int[] gong;
        private int n;
        private int num = 10;

        public Hitter(int n, int num) {
            this.n = n;
            this.num = num;
            gong = new int[n];
            Arrays.fill(gong, -1);
        }

        public Hitter() {
            this(3, 10);
        }

        public int[] getGong() {
            return gong;
        }

        public void make() {
            System.out.println("0~9사이의 서로다른 정수를 붙여서 입력해주세요.");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            for (int i = 0; i < n; i++) {
                gong[i] = s.charAt(i) - '0'; //문자열을 숫자로 변환하지 않고 쪼개서 아스키코드값으로 비교한다
            }
        }

        public void print() {
            System.out.println("Hitter");
            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t", gong[i]);
            }
            System.out.println();
        }
    }

    //심판부분
    // 스트라이크와 볼을 판단해준다
    static class Umpire {
        private int[] pitchball; // 투수의 세볼 저장
        private int[] hitterball; //타자의 세 볼 저장
        private int n;

        public Umpire(int n) {
            this.n = n;
            pitchball = new int[n];
            hitterball = new int[n];
            Arrays.fill(pitchball, -1);
            Arrays.fill(hitterball, -1);
        }

        public Umpire() {
            this(3);
        }

        public void setPitchball(int[] pitchball) {
            System.arraycopy(pitchball, 0, this.pitchball, 0, pitchball.length);
        }

        public void setHitterball(int[] hitterball) {
            System.arraycopy(hitterball, 0, this.hitterball, 0, hitterball.length);
        }

        public int strike() {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (pitchball[i] == hitterball[i]) {
                    cnt++;
                }
            }
            return cnt;
        }

        public int ball() {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && pitchball[i] == hitterball[j]) {
                        cnt++;
                    }
                }
            }
            return cnt;
        }
    }
}
