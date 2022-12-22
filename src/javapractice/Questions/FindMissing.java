package javapractice.Questions;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/

/**
 *
 * @author V KUMAR
 */
public class FindMissing {
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i]< nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        
        return nums.length;
    }
    static void swap(int[] arr, int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,0};
        missingNumber(arr);
        System.out.println("The sorted array is: " + Arrays.toString(arr));
        System.out.println("The missing number is: " + missingNumber(arr));
    }
}
