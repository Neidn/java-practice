package Ans200306;

// 쓰레드의 wait과 notifyAll
// wait를 사용하고 notifyAll을 빼먹으면 데드락에 걸리므로 이를 방지하기 위해
// 잊지않도록 주의한다
public class p157 {
    public static void main(String[] args) {
        CakePlate cake = new CakePlate();
        CakeEater eater = new CakeEater(cake);
        CakeMaker baker = new CakeMaker(cake);
        // 우선순위가 높을수록 더 많이 호출한다, 즉 먼저끝날 가능성이 높다
        // baker.setPriority(6);
        baker.start(); // wait가 번갈아 일어나기 때문에 먹는것과 만드는거싱 번갈아 발생한다
        eater.start();
    }

    static class CakePlate {
        private int breadCount = 0;

        public synchronized void makeBread() {
            if (breadCount >= 10) {
                try {
                    System.out.println("빵이 남는다");
                    wait(); // 빠잉 10개 이상일시 대기한다
                } catch (InterruptedException e) {
                }
            }
            breadCount++;
            System.out.println("빵을 1개 더 만듦 총 : " + breadCount + "개");
            this.notifyAll(); //빵이 10개 미만이므로 1개씩 더해주고 wait를 해제한다
        }

        public synchronized void eatBread() {
            if (breadCount < 1) {
                try {
                    System.out.println("빵이 모자라 기다림");
                    wait();
                } catch (InterruptedException e) {
                }
            }
            breadCount--;
            System.out.println("빵을 1개 먹음 총 : " + breadCount + "개");
            this.notifyAll(); // wait을 해제한다
        }
    }

    // 케이크를 50개를 만들려고한다
    //케이크가 10개 넘어가면 접시에 올릴수 없으므로 먹는 클래스도 만들어준다
    static class CakeMaker extends Thread {
        private CakePlate cake;

        public CakeMaker(CakePlate cake) {
            setCake(cake);
        }

        public void setCake(CakePlate cake) {
            this.cake = cake;
        }

        public CakePlate getCake() {
            return cake;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                cake.makeBread();
            }
        }
    }

    // 케이크를 50개를 먹으려고 한다
    // 접시에는 최소 1개 있어야 하므로 만드는것도 섞어주어야한다
    static class CakeEater extends Thread {
        private CakePlate cake;

        public CakeEater(CakePlate cake) {
            setCake(cake);
        }

        public CakePlate getCake() {
            return cake;
        }

        public void setCake(CakePlate cake) {
            this.cake = cake;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                cake.eatBread();
            }
        }
    }

}
