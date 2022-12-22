package Pack2;
import Pack1.A;

public class D extends A{
    public void var(){
        System.out.println("Accessible variable in d are: "+ super.k + " , " + super.l );
    }
}