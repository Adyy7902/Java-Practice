package javapractice.Questions;

/**
 *
 * @author V KUMAR
 */
public class BinarySearch_RotatedSortArray {
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<= end){
            int mid = start + (end - start)/2 ;
            //4 cases
            if(mid < end && arr[mid]>arr[mid + 1]){ // [4,5,6,1,2,3]
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
                //if pivot not found - no rotations in array, normal binary search
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        //if pivot is found, you have found two asc sorted array
        if(arr[pivot] == target){
            return pivot;
        }
        else if(arr[0] < target && arr[pivot] > target){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
        
    }
    
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int  mid = start + (end - start)/2;
            
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] == target){
                return mid;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println("Pivot found at index: " + findPivot(arr));
    }
}
