package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {12,5,3,7,1,4};
        int n = nums.length;  
        for(int i = 1; i <= n-1; i++){
            for(int j = i; j >= 1; j--){
                if(nums[j] < nums[j-1]){
                    //swapping the elements of nums[j] with nums[j-1]
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else break;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
