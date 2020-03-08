package Ans200225;

// 이번엔 시계반대방향으로 돌리기
public class p140 {
    private int m;
    private int n;
    private int[][] loc;

    public static void main(String[] args) {
        p140 tsnail = new p140(7, 7);
        tsnail.make();
        tsnail.print();
    }

    public p140(int m, int n) {
        this.m = m;
        this.n = n;
        this.loc = new int[m][n];
    }

    public void make() {
        int x = 0;
        int y = 0;
        int d = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                loc[x][y] = i * n + j + 1;
                if (d == 0) {
                    if (y + 1 < n && loc[x][y + 1] == 0) {
                        y++;
                    } else {
                        d = 3;
                        x--;
                    }
                } else if (d == 1) { //아래로 이동
                    if (x + 1 < n && loc[x + 1][y] == 0) {
                        x++; //아래이동
                    } else { //벽이나 숫자
                        d = 0; //오른쪽으로 이동
                        y++; //오른쪽으로이동
                    }
                } else if (d == 2) {
                    if (y - 1 >= 0 && loc[x][y - 1] == 0) {
                        y--;
                    } else {
                        d = 1;
                        x++;
                    }
                } else if (d == 3) {
                    if (x - 1 >= 0 && loc[x - 1][y] == 0) {
                        x--;
                    } else {
                        d = 2;
                        y--;
                    }
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("(%2d)", loc[i][j]);
            }
            System.out.println();
        }
    }
}
