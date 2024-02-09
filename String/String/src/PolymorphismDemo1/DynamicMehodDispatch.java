package PolymorphismDemo1;


import SmartKitchen.SmartKitchen;

import java.awt.image.SampleModel;

class Phone {
    public void greet()
    {
        System.out.println("Good morning");
    }
    public void on()
    {
        System.out.println("Turning on phone");
    }
}


class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Apka swagat hei");
    }
    public  void on()
    {
        System.out.println("Turning on smartphone");
    }
}


public class DynamicMehodDispatch {
    public static void main(String[] args) {
       Phone phone=new  Phone();
       phone.on();
    }
}
