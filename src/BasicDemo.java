public class BasicDemo {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };

        Runnable runnable1 = () -> System.out.println("Hello");
        Thread thread = new Thread(runnable1);


        Thread thread1 = new Thread(() -> System.out.println("Hello"));
        thread1.start();


    }
}
