package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */
//place Tiles of size 1xm in a floor of size nxm
public class Recursion_TilePlacement {
    public static int placeTiles(int n , int m) {
        
        //if n = m, then the tiles can only be placed in two ways, either horizontally or vertically
        if(n == m){
            return 2;
        }
        //if n is smaller than m then the tiles can only be placed horizontally
        if(n<m){
            return 1;
        }
        //otherwise this will happen
        int vertPlac = placeTiles(n-m, m);
        
        int horPlac = placeTiles(n-1, m);
        return vertPlac + horPlac;
    }
    public static void main(String[] args) {
        int n =4, m=2;
        System.out.println(placeTiles(n, m));
    }
}
