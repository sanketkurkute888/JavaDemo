public class Entry {
    public static void main(String[] args) {
        Animal animal = new Dog();
        someFunction(animal);
//        animal.move();
    }

    public static void someFunction(Animal animal){
        animal.move();
        animal.makeNoise();
        System.out.println("Age:"+animal.getAge());
    }
}
