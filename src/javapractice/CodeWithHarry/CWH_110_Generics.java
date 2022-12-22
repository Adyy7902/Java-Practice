package javapractice.CodeWithHarry;

import java.util.ArrayList;

//Creating a custom Generic Class
class MyGenerics<T1 , T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
    
    public MyGenerics(int val, T1 t1 , T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;        
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    
    
}

public class CWH_110_Generics {
    public static void main(String[] args) {
        //Generics are given as
        ArrayList <Integer> al = new ArrayList();
//        al.add("str1");
        al.add(54);
        al.add(643);
        int a = (int)al.get(1); //to avoid  this type-casting, we use generics. Generics contains data of same data type        
        System.out.println(a);
        
        //Creating object of custom Generic Class of string type
        MyGenerics<String, String> g1 = new MyGenerics(43, "This is a string named MyString " , "Heya");
        //As T1 accepts a string int the above line, it will be referred as a string object
        //If we try to use getT1 (which returns the string) using a integer variable, it will produce a runtime error
        String a1 = g1.getT1();
        System.out.println(a1);
        
        MyGenerics<String, Integer> g2 = new MyGenerics(43, "This is a string named WooHoo ", 124);
        String a2 = g2.getT1();
        Integer i1 = g2.getT2();
        System.out.println(a2 + " " + i1);
        
    }   
}
