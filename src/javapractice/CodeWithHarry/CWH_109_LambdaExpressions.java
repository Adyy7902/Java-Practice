package CodeWithHarry;
/**
 * @author V KUMAR
 */
@FunctionalInterface
interface DemoAno{
    
    void meth1();
}
@FunctionalInterface
interface DemoA{
    void meth1(int a);
}

public class CWH_109_LambdaExpressions {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //Anonymous Class
        DemoAno obj1 = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("This is anonymmous class"); 
            }
        };
        obj1.meth1();
        
        //Lambda Expression
        DemoAno obj2 = ()-> {
            System.out.println("This is Lambda Expression of meth 1 in DemoAno class");
        };
        obj2.meth1();
        
        //If there is any method that needs an argument, just pass the argument in the circluar brackets, like this
        DemoA obj = (a)-> {
            System.out.println("This is the Lambda Expression of meth 1 that take an integer as an argument. But we don't need to initialize the integer, java is smart enough to do that itself. Now we can just print the variable - " + a);
        };
        obj.meth1(3);
        
    }
}
