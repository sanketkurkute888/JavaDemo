public class Entry {
    public static void main(String[] args) {
        Message message = new Message();

        WriterClass writerClass = new WriterClass(message);
        ReaderClass readerClass = new ReaderClass(message);

        Thread writerThread = new Thread(writerClass);
        Thread readerThread = new Thread(readerClass);

        writerThread.start();
        readerThread.start();

        System.out.println("Main Ended");
    }
}
