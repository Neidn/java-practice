package Ans200305;

// 쓰레드 사용하기
public class p154 {
    public static void main(String[] args) {
        // 인터페이스 상속받아 만든후 쓰레드에 넣는다
        MyRun myRun = new MyRun();
        Thread mythread = new Thread(myRun);
        // 쓰레드 상속받아 쓴경우는 바로쓴다
        MyThread myThread = new MyThread();

        //마지막 방법은 그자리에서 만들어쓰기(람다식 이용과 그냥 사용으로 나뉜다)
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    System.out.print("R");
                }
            }
        });

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.print("U");
            }
        }).start();
        mythread.start();
        myThread.start();
        thread.start();
    }

    // 쓰레드 방법1 인터페이스 사용
    static class MyRun implements Runnable {
        @Override
        public void run() {
            show();
        }

        private void show() {
            for (int i = 0; i < 500; i++) {
                System.out.print("S");
            }
        }
    }

    // 쓰레드 방법2 상속사용
    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.print("T");
            }
        }
    }
}
