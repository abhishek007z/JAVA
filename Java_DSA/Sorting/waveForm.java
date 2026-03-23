package Sorting;

public class waveForm {
    public static void main(String[] args) {
        int[] nums = {1,4,2,6,8,3,9};
        int n = nums.length;
        for(int i = 0; i < n - 1; i+=2){
            // if(i % 2 == 0){
            //     if(nums[i] > nums[i+1]){
            //         int temp = nums[i];
            //         nums[i] = nums[i+1];
            //         nums[i+1] = temp;
            //     }
            // }
            // else{
            //     if(nums[i] < nums[i+1]){
            //         int temp = nums[i];
            //         nums[i] = nums[i+1];
            //         nums[i+1] = temp;
            //     }
            // }

            if(nums[i] < nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
