package javapractice.CodeWithHarry;

class Circle{

    public int radius;

    public Circle() {
        System.out.println("I am circle non parametrized constructor");
    }
    
    public Circle(int radius) {
        System.out.println("I am a Circle parametrized constructor");
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
class Cylinder extends Circle{
    public int height;

    public Cylinder(int height, int radius) {
        super(radius);
        System.out.println("I am cylinder parametrized constructor");
        this.height = height;
    }
    
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

public class CWH_52_PS10 {
    public static void main(String[] args) {
        //Question 1
        Circle c = new Circle(12);
        System.out.println(c.area());
        Cylinder obj = new Cylinder(12,5);
        System.out.println(obj.volume());
    }
}
