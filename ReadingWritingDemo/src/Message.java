public class Message {
    private String message;
    private boolean isEmpty=true;

    public synchronized void write(String message){
        while(!isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        isEmpty = false;
        this.message = message;
        notify();
    }

    public synchronized String read(){

        while (isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        notify();
        isEmpty = true;
        return message;
    }
}
