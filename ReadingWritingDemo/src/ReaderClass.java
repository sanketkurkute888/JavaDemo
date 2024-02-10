public class ReaderClass implements Runnable{

    private Message message;

    public ReaderClass(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String s;
        do {
            s = message.read();
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (!s.equals("Finished"));

    }
}
