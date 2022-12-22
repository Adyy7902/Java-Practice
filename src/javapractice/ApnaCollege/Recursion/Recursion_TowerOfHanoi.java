package javapractice.ApnaCollege.Recursion;

/**
 *
 * @author V KUMAR
 */

/**
 * Dekh, Tower of hanoi waale me pehle hum 3 pillars lege A,B,C.
 * Hume diya hoga Source(S), Helper(H) and Destination(D) .
 * Source se Destination move karvavana h rings ko, aur un rings ki khaas baat ye h ki sabse neeche vaala ring sabse bada hoga, 
 * uske upar vaala usse chotha aur sabse upar vaala sabse chota
 * aur chota vaala ring bade vaale ring ke neeche nahi aa sakta
 * Source se Destination pe hume saari rings move karvaani h, using Helper.
 * maan lete h ki no of disks 3 h.
 * First, the ring at the top will move to destination, 2nd ring will move to helper and 1st ring will move back to helper (Source -> Source, Helper -> Destination, Destination -> Helper)
 * Then, 3rd ring will move from Source to Destination (Source -> Source, Helper -> Helper, Destination -> Destination)
 * 1st ring will move to Source then 2nd ring will move to Destination and finally 1st ring will move to Destination.(Source -> Helper, Helper -> Source, Destination -> Destination) 
*/
//Time complexity -> O(2^n -1) or O(2^n)
public class Recursion_TowerOfHanoi {
    public static void towerOfHanoi(int n, String s , String h , String d){
        if(n==1){
            System.out.printf("Transfer disk %d from %s to %s\n",n,s,d);
            return;
        }
        
        towerOfHanoi(n-1, s, d, h);
        System.out.printf("Transfer disk %d from %s to %s\n",n,s,d);
        towerOfHanoi(n-1, h, s, d);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
