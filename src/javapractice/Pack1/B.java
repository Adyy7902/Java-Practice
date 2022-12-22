package javapractice.Pack1;

class B extends A {
    void var(){
        System.out.println("Accessible variable in b are: "+ super.i + " , " + super.j + " , " + super.k + " , " + super.l );
    }
}
