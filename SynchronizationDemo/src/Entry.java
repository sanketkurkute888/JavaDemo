public class Entry {
    public static void main(String[] args) throws InterruptedException {
        Person person = new Person();

        MyThread thread1 = new MyThread(person);
        MyThread thread2 = new MyThread(person);

        thread1.start();
      //  Thread.sleep(1000);
        thread2.start();

        System.out.println("Main Ended");
    }
}
