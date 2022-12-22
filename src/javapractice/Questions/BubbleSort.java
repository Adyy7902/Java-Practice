package Questions;

import java.util.Arrays;

/**
 *
 * @author V KUMAR
 */

//In bubble sort, the element is compared with the next element and if the element is bigger than the next element then the element will get swapped.//

public class BubbleSort {
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,1,6,9,3,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr)); 
    }
}
