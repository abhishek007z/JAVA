package Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,0,2,1,2,0};
        int n = arr.length;
        int noOfZeros = 0, noOfOnces = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) noOfZeros++;
            if(arr[i] == 1) noOfOnces++;
        }
        for(int i =0; i < n; i++){
            if(i < noOfZeros) arr[i] = 0;
            else if(i < noOfZeros + noOfOnces) arr[i] = 1;
            else arr[i] = 2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
