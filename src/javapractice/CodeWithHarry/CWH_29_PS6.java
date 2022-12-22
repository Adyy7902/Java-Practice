package CodeWithHarry;

public class CWH_29_PS6 {
    public static void main(String[] args) {
        /*
        //Question 1
        float sum = 0f;
        float [] marks = {47.5f , 67.8f , 91.4f , 32.75f , 43.45f };
        for(float elem : marks){
            sum += elem; 
        }
        System.out.println("The value of sum is: " + sum);
        
        //Question 2
        float [] marks = {47.5f , 67.8f , 91.4f , 32.75f , 43.45f };
        float num = 47.5f;
        boolean isInArray = false;
        for(float elem : marks){
            if(num == elem) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Number is in the array");
        }
        else{
            System.out.println("Number is not in the array");
        }
        
        //Question 3
        float sum = 0f;
        float [] marks = {47.5f , 67.8f , 91.4f , 32.75f , 43.45f };
        for(float elem : marks){
            sum += elem; 
        }
        System.out.println("Average Marks: " + sum/marks.length);
        //Question 4
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,4,6},
                         {8,10,12}};
        int [][] result = {{0,0,0},
                         {0,0,0}};
        for (int i=0; i<2; i++) { // i = (1,2,3)  and (4,5,6) //row  number of times
            for (int j=0; j<3; j++) { // j[0] = 1,2,3  //column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        //Question 5 
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            //Swap arr[i] with arr[l-i-1]
            // a  b  temp
            //|1| |6| ||
            temp = arr[i];
            // a  b  temp
            //|1| |6| |1|
            arr[i] = arr[l-i-1];
            // a  b  temp
            //|6| |6| |1|
            arr[l-i-1] = temp;
            // a  b  temp
            //|6| |1| |1|
        }        
        for(int a : arr){
            System.out.println(a);
        }
        
        //Question 6 - Prog to find max element in an array
        int [] a = {1,21,3,455,5,34,67};
        int max =0;// We used 0 because we know that none of the values in the array is negative 
        //but if we have a negative value, we can use int max = Integer.MIN_VALUE;

        for(int e : a){
            if(e>max){
		max = e;
            }
        }
        System.out.println("The value of the maximum element is: " + max);
        //System.out.print("The value of Integer varies from : " + Integer.MIN_VALUE + " to ");
        //System.out.println(Integer.MAX_VALUE);
        
        //Question 7 - prog to find min element in an array
        int [] a = {1,21,-3,455,5,34,67};
        int min =Integer.MAX_VALUE;
        for(int e : a){
            if(e<min){
		min = e;
            }
        }
        System.out.println("The value of the minimum element is: " + min);
        */
        //Question 8 - prog to find whether an array is sorted or not
        int [] a = {1,21,-3,455,5,34,67};
        boolean isSorted = true;
        for (int i = 0; i < a.length -1; i++) {
            if  (a[i]>a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
