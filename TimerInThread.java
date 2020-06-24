public class TimerInThread extends Thread {
    int n = 10;

    public static void main(String[] args) {
        TimerInThread t = new TimerInThread();
        t.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            try {

                System.out.print(i+"\r");
                Thread.sleep(2000);

            } catch (InterruptedException ae) {
                System.out.println("Interrupt");
            }

        }
    }
}
