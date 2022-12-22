package javapractice.ProducerConsumer;

class Q1{
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while(!valueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception Found");
            }
        System.out.println("Got:" + n);
        valueSet= false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(valueSet)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted Exception Found");
            }
        this.n=n;
        valueSet= true;
        System.out.println("Put:" + n);
        notify();
    }
}


class Producer1 implements Runnable{
    Q1 r;
    Producer1(Q1 r){
        this.r=r;
        new Thread(this, "Producer").start();
    }
    public void run(){
        int i=0;
        while(true){
            r.put(i++);
        }

    }
}

class Consumer1 implements Runnable{
    Q1 r;
    Consumer1(Q1 r){
        this.r=r;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while (true){
            r.get();
        }
    }
}

public class ProducerConsumerCorrected {
    public static void main(String[] args) {
        Q1 r= new Q1();
        new Producer1(r);
        new Consumer1(r);
        System.out.println("Press CTRL+F2 To Stop!!");

    }
}    

