package Ans200305;

// 한개의 인터페이스를 상속받아 만든 클래스를 여러 쓰레드로 받는다
// 동시작업처럼 보이나 사실상은 돌아가면서 사용하는것이다
// 현재 사용하는 쓰레드를 받는 명령어는 currentThread 이다
public class p155 {
    public static void main(String[] args) {
        MyRuns myRuns = new MyRuns();
        Thread t1 = new Thread(myRuns, "a");
        Thread t2 = new Thread(myRuns, "b");
        Thread t3 = new Thread(myRuns, "c");
        t1.start();
        t2.start();
        t3.start();
    }

    static class MyRuns implements Runnable {
        @Override
        public void run() {
            show();
        }

        private void show() {
            for (int i = 0; i < 500; i++) {
                if (((Thread.currentThread()).getName()).equals("a")) {
                    System.out.print("A");
                } else if (((Thread.currentThread()).getName()).equals("b")) {
                    System.out.print("B");
                } else if (((Thread.currentThread()).getName()).equals("c")) {
                    System.out.print("C");
                } else {
                    System.out.print("[" + Thread.currentThread().getName() + i + "]");
                }
            }
        }
    }
}
