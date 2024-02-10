public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i = "+i);
        }
    }
}
