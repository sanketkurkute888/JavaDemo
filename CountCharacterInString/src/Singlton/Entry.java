package Singlton;

public class Entry {
    public static void main(String[] args) {
        Student s1=Student.getInstance();
        Student s2=Student.getInstance();
    }
}
