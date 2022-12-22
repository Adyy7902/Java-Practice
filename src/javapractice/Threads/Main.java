package Threads;

import java.lang.Thread;

class Qwerty implements Runnable {
    int i;
    Thread top;

    Qwerty() {
        top = new Thread(this, "TOP");
        top.start();
    }

        public void run() {
            try {
                for (i = 5; i < 10; i++) {
                    Thread.sleep(1000);
                    Thread top = Thread.currentThread();
                    String name = top.getName();
                    System.out.println("The Thread named:- " + name + " gives the value:- " + i);
                }
            } catch (IllegalThreadStateException e) {
                System.out.println("Interrupeted" + e);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public class Main {
        public static void main(String[] args) {
            int n1=0,n2=1,n3,i,count=10;
            new Qwerty();
            try {
                for(i=2;i<count;++i)
                {
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    Thread top = Thread.currentThread();
                    String name = top.getName();
                    Thread.sleep(90);
                    System.out.println("The Thread named:- " + name + " gives the fibonacci value:- " +n3);
                }
            } catch (IllegalThreadStateException | InterruptedException e) {
                System.out.println("Main interrupted" + e);
            }
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());
        }
    }