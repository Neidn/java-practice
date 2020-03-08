package Ans200306;

//쓰레드의 동기화
// synchronized를 넣게되면 현재 작업을 마칠때까지 다른 쓰레드는 멈추게된다
// MyRuns2 처럼 i를 공유할 경우 i가 500미만일때까지 사용하기에
// 첫번째 쓰레드는 정상적으로 실행되나
// 두번째 쓰레드는 이미 i가 500을 도달했기때문에 작동하지 않는다
public class p156 {
    public static void main(String[] args) {
        MyRuns mr1 = new MyRuns();
        MyRuns2 mr2 = new MyRuns2();
//        Thread t1 = new Thread(mr1, "a");
//        Thread t2 = new Thread(mr1, "b");
//        Thread t3 = new Thread(mr1, "c");
        Thread t1 = new Thread(mr2, "a");
        Thread t2 = new Thread(mr2, "b");
        Thread t3 = new Thread(mr2, "c");
        t1.start();
        t2.start();
        t3.start();
    }

    static class MyRuns implements Runnable {

        @Override
        public void run() {
            show();
        }

        private synchronized void show() {
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

    static class MyRuns2 implements Runnable {
        private int i = 0;

        @Override
        public void run() {
            show();
        }

        private synchronized void show() {
            for (; i < 500; i++) {
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
