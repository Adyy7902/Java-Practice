package CodeWithHarry;

class NewClass extends CustomCalculator {

    @Override
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        int c = 10;
        return a + b + c;
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }

}

public class CWH_108_JavaAnnotations {
    @SuppressWarnings("deprication")    
    public static void main(String[] args) throws InvalidInputException, MaxInputException {
        NewClass nc = new NewClass();
        System.out.println(nc.add(3, 4));
        System.out.println(nc.sum(3, 4)); //this will show that sum method is depricated
    }
}
