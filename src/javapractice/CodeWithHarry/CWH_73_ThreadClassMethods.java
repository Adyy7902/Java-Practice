package javapractice.CodeWithHarry;

class MyThr extends Thread{

    public MyThr() {
        System.out.println("This is a non parametrized constructor of Thread class.");
    }

    public MyThr(String name) {
        super(name);
        System.out.println("This  is a parameterized constructor of Thread class which takes Name of the Thread as an argument");
    }
    
    public MyThr(Runnable target) {
        super(target);
    }
    
    public MyThr(Runnable target, String name) {
        super(target, name);
        System.out.println("This  is a parameterized constructor of Thread class which takes Name of the Thread as an argument");
        System.out.println("and also It take Runnable object as first ");

    }

    
    @Override
    public void run() {
        System.out.println("Thread is runninng...");
    }
    
}
public class CWH_73_ThreadClassMethods {
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        Runnable target = new Runnable() {
            @Override
            public void run() {
                System.out.println("taget's run method.");
            }
        };
        MyThr t2 = new MyThr(target);
        MyThr t3 = new MyThr("Consumer");
        MyThr t4 = new MyThr(target, "Producer");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        System.out.println(t1.getId() + " " + t1.getName());
        System.out.println(t2.getId() + " " + t2.getName());
        System.out.println(t3.getId() + " " + t3.getName());
        System.out.println(t4.getId() + " " + t4.getName());
        
    }
}
