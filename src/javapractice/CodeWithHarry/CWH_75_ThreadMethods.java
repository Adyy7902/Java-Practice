package javapractice.CodeWithHarry;

class MyNewThr1 extends Thread{

    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("Thank You!!");
            i++;
        }
    }
}
    
class MyNewThr2 extends Thread{

    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("Humbly and Politely!!");
            i++;
        }
    }
}

public class CWH_75_ThreadMethods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
