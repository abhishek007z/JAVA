package Arrays;

public class sortZerosOnces {
    public static void main(String [] args){
        int[] arr = {0,0,0,1,0,1,1,0,1,1,0};
        int NoOfZeros = 0;
        
        //methord 1st
        /*for(int i = 0; i < n; i++){
            if(arr[i] == 0) NoOfZeros++;
        }

        for(int i = 0; i < n; i++){
            if(i < NoOfZeros){
                arr[i] = 0;
            }    
            else{
                arr[i] = 1;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        */


        //Method 2nd
        int i = 0, j = 1;

        while(i < j){
            if(arr[i] == 0 && arr[j] == 1){
                i++;
                j++;
            }
            if(i > j && arr[i] == 0 && arr[j] == 1){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j++;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}