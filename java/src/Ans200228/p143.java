package Ans200228;


//지하철의 최단거리 구하기
//플로이드 알고리즘을 사용한다
// (각 경로마다 값을 할당하고 지나갈수 없는 경로를 매우 큰 값으로 설정한다)
//그 값들을 더한 후 비교한다
public class p143 {
    private int[][] data; // 경로 가중치를 저장하는 배열
    private int[][] p;      //최단경로의 중간 경유지를 저장한다, 없을경우 -1
    public String[] name; // 지점의 이름

    public p143() {
        init();
    }

    private void init() {
        //p1~p5경로, 막힌부분은 1000(충분히 큰 수)
        data = new int[][]{
                {0, 2, 3, 1000, 7},
                {5, 0, 1000, 1000, 4},
                {2, 1000, 0, 6, 1000},
                {1000, 1000, 3, 0, 4},
                {6, 1, 6, 2, 0}
        };
        p = new int[data.length][data.length];
        name = new String[]{"P1", "P2", "P3", "P4", "P5"};
    }

    //floyd알고리즘을 이용하여 최단 경로를 구한다
    public void distance() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                p[i][j] = -1; // 기본은 -1
            }
        }

        for (int k = 0; k < data.length; k++) {
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    if (data[i][j] > data[i][k] + data[k][j]) {
                        p[i][j] = k;
                        data[i][j] = data[i][k] + data[k][j];
                    }
                }
            }
        }
    }

    //최단 경로 중간 경유지 출력, q출발지, r도착지
    public void Path(int q, int r) {
        if (p[q][r] != -1) {
            Path(q, p[q][r]);
            System.out.printf("%s -> ", name[p[q][r]]);
            Path(p[q][r], r);
        }
    }

    //모든 경로를 출력해주는 함수
    public void printPath() {
        int count = data.length;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.printf("%d\t", data[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        p143 floy = new p143();
        floy.printPath();
        System.out.println("-----------------");
        floy.distance();
        floy.printPath();
        int start = 0;
        int goal = 4;
        System.out.printf("%s -> ", floy.name[start]);
        floy.Path(start, goal);
        System.out.printf("%s", floy.name[goal]);
        System.out.println();
    }
}
