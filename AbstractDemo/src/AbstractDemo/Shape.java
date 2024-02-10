package AbstractDemo;

public abstract class Shape {
   abstract void draw();
}

class Rectangle extends Shape
{

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends  Shape
{

    @Override
    void draw() {
        System.out.println("drawing Circle");
    }
}
class AbstractionDemo
{
    public static void main(String[] args) {
        Shape object=new Circle();
        object.draw();

    }
}