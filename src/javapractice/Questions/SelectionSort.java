package Questions;

import java.util.Arrays;

/**
 *
 * @author V KUMAR
 */
public class SelectionSort {
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in the remaining array and swawp with the correct index
            int last = arr.length-i-1;
            int maxidx = getMaxIndex(arr,0,last);
            swap(arr,maxidx,last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start ;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,9,6,4,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int maxidx,int last) {
        int temp = arr[maxidx];
        arr[maxidx] = arr[last];
        arr[last] = temp;
    }
}
