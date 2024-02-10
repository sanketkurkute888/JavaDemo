public class Person {
    private static int age;

    public static void incrementAge(){
        for(int i=1; i<=5; i++) {
            try {
                System.out.println("Age = " + age);
                age++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
