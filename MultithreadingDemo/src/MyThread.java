public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                //System.out.println(getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+ "Hello "+i);
            //System.out.println(getState());
        }
    }
}
