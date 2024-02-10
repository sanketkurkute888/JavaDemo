public class Entry {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setMessage("Hello World");
        myClass.printMessage();

        System.out.println(MyClass.totalObjects());

        MyClass myClass1 = new MyClass();
        myClass1.setMessage("Bye World");
        myClass1.printMessage();

        System.out.println(MyClass.totalObjects());


        //Homework

//        myClass1 myClass1=new myClass1();
//        myClass1.setMessage("Hello world");
//        System.out.println(myClass1.getMessage());
//        myClass1.




















//        /********** Time Class Code ******************/
//        Time time1 = new Time();
//        time1.setHour(10);
//        time1.setMin(20);
//        time1.setSec(30);
//
//        Time time2 = new Time();
//        time2.setHour(1);
//        time2.setMin(2);
//        time2.setSec(3);
//
//        Time time3;
//        time3 = time1.addTime(time2);
//        time3.printTime();
//

        /********** Time1 Class Code ******************/
        Time1 time4=new Time1();
        time4.setHour(10);
        time4.setMin(20);
        time4.setSec(45);

        Time1 time5=new Time1();
        time5.setHour(10);
        time5.setMin(20);
        time5.setSec(45);

        Time1 time6;
        time6=time4.addTime(time5);
        time6.printTime();


    }
}
