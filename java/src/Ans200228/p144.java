package Ans200228;

//아파트 단지 개수 구하기
// * 을 아파트로 표현하고 붙어있는 경우를 단지로 센다
public class p144 {
    private char[] pass = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private int d = 0;

    public p144(int d) {
        this.d = d;
    }

    public int findApar(char region[][], int x, int y, char step, int depth) {
        int count = 0;
        int right = region.length;
        int bottom = region[0].length;
        if (x < 0 || x >= bottom || y < 0 || y >= right || region[y][x] != '*') {
            return 0;
        }
        region[y][x] = pass[depth % 10]; //0~9로 반복표시, 아파트를 센다
        count = 1 + findApar(region, x, y - 1, step, depth + 1)
                + findApar(region, x + 1, y, step, depth + 1)
                + findApar(region, x, y + 1, step, depth + 1)
                + findApar(region, x - 1, y, step, depth + 1);
        if (d > 0) {
            count += findApar(region, x + 1, y - 1, step, depth + 1)
                    + findApar(region, x + 1, y + 1, step, depth + 1)
                    + findApar(region, x - 1, y + 1, step, depth + 1)
                    + findApar(region, x - 1, y - 1, step, depth + 1);
        }
        region[y][x] = step;
        print(region);
        return count;
    }

    private static void print(char[][] region) {
        for (int i = 0; i < region.length; i++) {
            for (int j = 0; j < region[i].length; j++) {
                System.out.printf("%c", region[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        int d = 0;
        p144 apt = new p144(d);
//        char[][] region = { {'*', '0', '0'},
//                            {'0', '*', '0'},
//                            {'0', '0', '*'}};

        char[][] region = {
                {'0', '0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '0', '*', '*', '0', '*', '0'},
                {'0', '*', '0', '0', '*', '0', '*', '0'},
                {'0', '*', '0', '0', '*', '0', '*', '*'},
                {'0', '*', '0', '0', '0', '*', '0', '*'},
                {'0', '*', '*', '0', '*', '0', '0', '*'},
                {'0', '0', '*', '0', '*', '0', '0', '*'},
                {'*', '*', '0', '*', '*', '0', '0', '0'}};
        int right = region.length;
        int bottom = region[0].length;
        int count = 0;
        char[] step = new char[26]; //단지 갯수는 26이하
        for (int i = 0; i < step.length; i++) {
            step[i] = (char) ('A' + i);
        }
        int[] sizes = new int[bottom * right]; //최대 아파트 수
        int blocknums = 0; //단지수
        for (int iy = 0; iy < right; ++iy) {
            for (int ix = 0; ix < bottom; ++ix) {
                count = apt.findApar(region, ix, iy, step[blocknums], 0);
                if (count > 0) {
                    sizes[blocknums++] = count;
                }
            }
        }
        System.out.printf("아파트 단지 = %d개\n", blocknums);
        for (int ix = 0; ix < blocknums; ++ix) {
            System.out.printf("%c 단지 = 아파트 %d개\n", step[ix], sizes[ix]);
        }
    }
}
