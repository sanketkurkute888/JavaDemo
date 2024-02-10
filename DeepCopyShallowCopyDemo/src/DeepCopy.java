public class DeepCopy {
    public static void main(String[] args) {
        DeepCopy1 deepCopy1=new DeepCopy1();
        DeepCopy1 deepCopy2=new DeepCopy1();


        deepCopy2.x=45;
        System.out.println(deepCopy1.x);
        System.out.println(deepCopy2.x);
    }
}

