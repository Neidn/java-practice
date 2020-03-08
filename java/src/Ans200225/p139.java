package Ans200225;

public class p139 {
    private int m; //행
    private int n; //열
    private int[][] loc;

    public static void main(String[] args) {
        p139 snail = new p139(7, 7);
        snail.make();
        snail.print();
    }

    public p139(int m, int n) {
        this.m = m;
        this.n = n;
        loc = new int[m][n];
    }

    public void make() {
        int x = 0;
        int y = 0;
        int d = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                loc[x][y] = i * n + j + 1; //값 대입
                if (d == 0) { //오른쪽으로 이동
                    if (y + 1 < n && loc[x][y + 1] == 0) {
                        y++;
                    } else { //오른쪽 벽이나 숫자
                        d = 1; //아래
                        x++;
                    }
                } else if (d == 1) { //아래로이동
                    if (x + 1 < n && loc[x + 1][y] == 0) {
                        x++; //아래로
                    } else { //벽이나 숫자
                        d = 2; //왼쪽으로
                        y--;
                    }
                } else if (d == 2) { //왼쪽으로 이동
                    if (y - 1 >= 0 && loc[x][y - 1] == 0) {
                        y--; //왼쪽으로
                    } else { //왼쪽 벽이나 숫자
                        d = 3; //위로
                        x--;
                    }
                } else if (d == 3) {
                    if (x - 1 >= 0 && loc[x - 1][y] == 0) {
                        x--; //위로 이동
                    } else {  //위쪽 벽이나 숫자
                        d = 0; // 오른쪽
                        y++;
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
