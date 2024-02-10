public class MyThread extends Thread {
    @Override
   public void run()
    {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(2000);
                System.out.println(getName()+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
