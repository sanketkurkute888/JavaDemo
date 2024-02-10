public class Cat extends Animal{

    public void makeSound()
    {
        System.out.println("The  cat qurrels");
    }

    public static void main(String[] args) {
        Animal animal=new Animal();
        Cat cat=new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}
