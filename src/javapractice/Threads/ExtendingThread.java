package Threads;

public class ExtendingThread extends Thread{

    @Override
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class Thread1 {
    public static void main(String[] args)
    {
        
        ExtendingThread obj1= new ExtendingThread();
        obj1.start();
        ExtendingThread obj2= new ExtendingThread();
        obj2.start();
        ExtendingThread obj3= new ExtendingThread();
        obj3.start();
    
    }
}

