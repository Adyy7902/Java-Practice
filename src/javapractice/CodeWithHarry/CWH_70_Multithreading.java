package javapractice.CodeWithHarry;

class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Thread1 is running...");
            System.out.println("Happy!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Thread2 is running...");
            System.out.println("Sad!");
            i++;
        }
    }
}
public class CWH_70_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
