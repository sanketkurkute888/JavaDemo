public abstract class Animal {
    protected int age;

    public Animal(){
        age = 0;
    }

    public Animal(int age){
        this.age = age;
    }

    public abstract void makeNoise();
//      private abstract void makeNoise();


//    abstract final public void move();
    abstract public void move();

    public final int getAge(){
        return age;
    }
}
