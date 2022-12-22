package javapractice.CodeWithHarry;

class InvalidInputException extends Exception{

    public InvalidInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
    
}
class CannotDivideByZero extends Exception{

    public CannotDivideByZero(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
    
}
class MaxInputException extends Exception{

    public MaxInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
    
}
class MaxMultiplyException extends Exception{

    public MaxMultiplyException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
    
}

class CustomCalculator{
    double add(double a, double b) throws InvalidInputException,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException("Input cannot be greater than 100000");
        }
        if(a==8 && b==9){
            throw new InvalidInputException("Cannot add 8 and 9");
        }
        return a + b;
    }
    double subtract(double a, double b)throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException("Input cannot be greater than 100000");
        }
        return a - b;
    }
    double multiply(double a, double b) throws MaxInputException, MaxMultiplyException{
        if(a>100000 || b>100000){
            throw new MaxInputException("Input cannot be greater than 100000");
        }
        else if(a>7000 || b>7000){
            throw new MaxMultiplyException("Input cannot be greater than 7000");

        }
        return a * b;
    }
    double divide(double a, double b) throws CannotDivideByZero,MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException("Input cannot be greater than 100000");
        }
        if(b==0){
            throw new CannotDivideByZero("Cannot Divide By 0");
        }
        return a / b;
    }
}

/**
 *
 * @author V KUMAR
 */
public class CWH_103_Ex6 {

    /**
     *
     * @param args
     * @throws InvalidInputException
     * @throws CannotDivideByZero
     * @throws MaxInputException
     * @throws MaxMultiplyException
     */
    public static void main(String[] args) throws InvalidInputException,CannotDivideByZero,MaxInputException, MaxMultiplyException{
        CustomCalculator c = new CustomCalculator();
        System.out.println(c.add(8,6));
        System.out.println(c.divide(10, 6));
        System.out.println(c.multiply(7000, 70));
        System.out.println(c.subtract(1000, 100001));
    }
}
