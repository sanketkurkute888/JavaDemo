package Singlton;

public class Main {
    public static void main(String[] args) {
        SigltonDemo sigltonDemo1=SigltonDemo.getInstance();
        SigltonDemo sigltonDemo2=SigltonDemo.getInstance();
//        if(sigltonDemo1==sigltonDemo2)
//        {
//            System.out.println("Both object are same");
//        }
    }
}

