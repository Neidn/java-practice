package Ans200223;


//하노이 타워 만들기
public class p137 {

    int tray = 3; // 하노이 원판 개수
    int bar = 3; // 하노이 바 개수
    int[][] rings;

    public static void main(String[] args) {
        p137 hanoi = new p137();
        int tmp = 4;
        hanoi.Hanoi(tmp);
        hanoi.moveHanoi(tmp, 'a', 'b', 'c');
    }

    public void Hanoi(int tray) {
        this.tray = tray;
        rings = new int[tray][bar];
        for (int i = 0; i < rings.length; i++) {
            int x = 2 * i + 1;
            rings[i][0] = x;
        }
    }

    public int[][] getRings() {
        return rings;
    }

    public void moveHanoi(int num, char ringA, char ringB, char ringC) {
        if (num == 1) {
            System.out.println(ringA + " bar쪽에 있던 링이 " + ringB + " bar쪽으로 이동");
        } else {
            moveHanoi(num - 1, ringA, ringC, ringB);
            System.out.println(ringA + " bar쪽에 있던 링이 " + ringB + " bar쪽으로 이동");
            moveHanoi(num - 1, ringC, ringB, ringA);
        }
    }

}
