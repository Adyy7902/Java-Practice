package AC;

/**
 *
 * @author V KUMAR
 */
public class MergeSort {
    /**
     * 
     * @param arr
     * @param sindx
     * @param mid
     * @param eindx 
     */
    public static void conquer(int arr[], int sindx, int mid, int eindx){
        int merged[]= new int[eindx - sindx + 1];
        
        int indx1 = sindx;
        int indx2 = mid + 1;
        int x = 0;
        //sorting
        while(indx1 <= mid && indx2 <= eindx){
            if(arr[indx1] <= arr[indx2]){
                merged[x++] = arr[indx1++];
            }
            else{
                merged[x++] = arr[indx2++];
            }
        }
        
        while(indx1 <= mid){
            merged[x++] = arr[indx1++]; 
        }
        
        while(indx2 <= eindx){
            merged[x++] = arr[indx2++];
        }
        
        //copying merged elements into original array
        for(int i = 0 ,j = sindx ; i < merged.length; i++ , j++) {
            arr[j] = merged[i];
        }
    }
    /**
     * 
     * @param arr
     * @param sindx
     * @param eindx 
     */
    public static void divide(int arr[], int sindx , int eindx){
        if(sindx >=eindx){
            return;
        }
        int mid = sindx + (eindx - sindx)/2 ;
        divide(arr, sindx , mid);
// [ 0 - 2 --> { 0 - 1 --> ( 0 - 0 , 1 - 1 ) , 2 - 2 } , 3 - 5 --> { 3 - 4 --> ( 3 - 3 , 4 -4 ) , 5 - 5 } ]
        divide(arr, mid+1,eindx);
        conquer(arr, sindx , mid, eindx);
    }
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int a[] = {6, 3, 9, 5, 2, 8};
        int n = a.length;
        
        divide(a,0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " " );
        }
        System.out.println();
    }
}
