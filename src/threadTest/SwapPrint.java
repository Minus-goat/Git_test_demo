package threadTest;


public class SwapPrint {

    public static void main(String[] args) {
        final MyTask myTask = new MyTask();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1 ; i <= 10 ; i+=2) {
                    myTask.printNumber(i);
                }
            }
        });

        t1.setName("Thread 1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 2 ; i <= 10 ; i+=2) {
                    myTask.printNumber(i);
                }
            }
        });

        t2.setName("Thread 1");
        t2.start();
    }
}
