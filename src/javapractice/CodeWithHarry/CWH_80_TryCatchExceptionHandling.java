package CodeWithHarry;

public class CWH_80_TryCatchExceptionHandling {
    public static void main(String[] args) {
        int a = 600 , b = 0;
        try{
            int c =  a/b ;
        }catch(ArithmeticException ae){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of the program!");
    }
}
