public class Entry {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread();
//        thread.setName("My Thread");
//        thread.setPriority(8);
//        thread.start();
//        System.out.println(thread.getState());
//        System.out.println(thread.getId());
//        System.out.println(thread);
        //System.out.println(Thread.currentThread());


//        MyThread myThread = new MyThread();
//        //myThread.setPriority(10);
//        myThread.start();
//       // myThread.start();
//        System.out.println("Main Ended");

       /* MyThread myThread1 = new MyThread();
        myThread1.setName("myThread-1");

        MyThread myThread2 = new MyThread();
        myThread2.setName("myThread-2");

        myThread1.start();
        myThread2.start();*/

        //myThread2.interrupt();

        //Thread.sleep(2000);
        //System.out.println(myThread2.getState());

/****/
//        System.out.println(Thread.currentThread().getState());
//        myThread1.join();
//        System.out.println(Thread.currentThread().getState());
//        myThread2.join();
//        System.out.println(Thread.currentThread().getState());
//        //System.out.println(myThread2.getState());
//        System.out.println("Main Ended");
/****/

//            MyRunnable myRunnable = new MyRunnable();
//            Thread obj = new Thread(myRunnable);
//            obj.start();
//
//            obj.join();

//        Runnable runnable = new Runnable(){
//            public void run(){
//                for(int i=1;i<=10;i++){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("i = "+i);
//                }
//            }
//        };

        Thread obj = new Thread(new Runnable(){
            public void run(){
                for(int i=1;i<=10;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("i = "+i);
                }
            }
        });

        obj.start();
        System.out.println("Main Ended");
    }
}
