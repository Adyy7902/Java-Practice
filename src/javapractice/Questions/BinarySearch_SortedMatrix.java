package Questions;

import java.util.Arrays;
/**
 *
 * @author V KUMAR
 */
public class BinarySearch_SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}        
        };
        System.out.println(Arrays.toString(search(arr,6)));
    }
    
    //search in the row provided b/w the columns provided
    static int[] bsearch(int[][] matrix, int r, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[r][mid] == target){
                return new int[]{r,mid};
            }
            if(matrix[r][mid] < target){
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    
    static int[] search(int[][] matrix, int target){
        int r = matrix.length;
        int c = matrix[0].length; //be cautious, columns may be empty
        
        if(r == 1){
            return bsearch(matrix, 0, 0, c-1, target);
        }
        
        int rStart = 0;
        int rEnd = r-1;
        int cMid = c/2;
        // run the loop till 2 rows are remaining
        while(rStart <= rEnd){  // while this  is true, we will have more than 2 rows
            int rMid = rStart - (rEnd - rStart)/2;
            if(matrix[rMid][cMid] == target){
                return new int[]{rMid,cMid};
            }
            if(matrix[rMid][cMid] < target){
                rStart = rMid;
            } else {
                rEnd = rMid;
            }
                   
            //now we have 2 rows
            //check whether the  target is in the col of 2 rows
            if(matrix[rStart][cMid] == target){
                return new int[]{rStart,cMid};
            }
            if(matrix[rStart+1][cMid] == target){
                return new int[]{rStart+1,cMid};
            }
            
            //search in first half
            if(target <= matrix[rStart][cMid - 1]){
                return bsearch(matrix, rStart, 0, cMid - 1, target);
            }
            //search in second half
            if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][c - 1]){
                return bsearch(matrix, rStart, cMid+1, c-1, target);
            }
            //search in third half
            if(target <= matrix[rStart+1][cMid-1]){
                return bsearch(matrix, rStart+1, 0, cMid-1, target);
            }
            //search in fourth half
            else{
                return bsearch(matrix, rStart+1, cMid+1, c-1, target);            
            }
        }
        return new int[]{-1,-1};
    }
}
