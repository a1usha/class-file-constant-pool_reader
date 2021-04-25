public class Main extends Thread {

    private final MyLatch latch;
    private final Object obj1;
    private final Object obj2;

    Main(Object obj1, Object obj2, MyLatch latch) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");

        synchronized (obj1) {
            latch.countDown();
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName() + " finished");
            }
        }
    }

    public static void main(String[] args) {
        final Object obj1 = new Object();
        final Object obj2 = new Object();
        final MyLatch latch = new MyLatch(2);

        new Main(obj1, obj2, latch).start();
        new Main(obj2, obj1, latch).start();
    }

    private static class MyLatch {
        private final Object syncObj = new Object();
        private int count;

        public MyLatch(int count) {
            this.count = count;
        }

        public void await() throws InterruptedException {
            synchronized (syncObj) {
                if (count > 0) {
                    syncObj.wait();
                }
            }
        }

        public void countDown() {
            synchronized (syncObj) {
                count--;
                if (count == 0)
                    syncObj.notifyAll();
            }
        }
    }
}