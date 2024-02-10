public class MyThread extends Thread{

    private Person person;

    public MyThread(Person person){
        this.person = person;
    }

    @Override
    public void run() {
        synchronized (Person.class) {
           // person.incrementAge();
            Person.incrementAge();
        }
    }
}


