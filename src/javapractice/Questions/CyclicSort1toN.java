package Questions;

import java.util.Arrays;

/**
 *
 * @author V KUMAR
 */
//Cyclic Sort is applicable only if the number is from 1-n and is continuous , i.e., no element is missing in between
public class CyclicSort1toN {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
