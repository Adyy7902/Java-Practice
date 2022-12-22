package javapractice.CodeWithHarry;


//Question 1 and 2
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

//Question 4
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;

    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

//Question 5
class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4 * Math.PI * radius * radius ;
    }
    public double volume(){
        return (4/3d) * Math.PI * radius * radius * radius;
    }
    
}


public class CWH_44_PS9 {
    public static void main(String[] args) {
        /*
        //Question 1
        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        int r = myCylinder.getRadius();
        System.out.println(r);
        
        //Question 2
        System.out.println(myCylinder.surfaceArea());        
        System.out.println(myCylinder.volume());
        
        //Question 3
        Cylinder myCylinder = new Cylinder(9,12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        int r = myCylinder.getRadius();
        System.out.println(r);
        System.out.println(myCylinder.surfaceArea());        
        System.out.println(myCylinder.volume());
        
        //Question 4
        Rectangle rect = new Rectangle(12,56);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
        */
        //Question 5
        Sphere s = new Sphere(12);
        System.out.println(s.getRadius());
        System.out.println(s.surfaceArea());
        System.out.println(s.volume());
    }
}
