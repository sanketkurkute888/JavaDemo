public class WriterClass implements Runnable {

    private Message message;

    public WriterClass(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messagesArray = {
                "This is line 1.",
                "This is line 2.",
                "This is line 3.",
                "This is line 4.",
                "This is line 5.",
                "Finished"
        };

        for(int i=0;i<messagesArray.length; i++){
            message.write(messagesArray[i]);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }

    }
}
