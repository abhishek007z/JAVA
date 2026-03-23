package Sorting;

public class transformingArray {
    public static void main(String[] args) {
        int[] nums = {40,67,34,21,98,56,87};
        int n = nums.length;
        int x = 0;
        for(int i = 0; i < n; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j = 0; j < n; j++){
                if(nums[j] < min && nums[j] > 0){
                    min = nums[j];
                    mindx = j;
                }
            }
            nums[mindx] = x;
            x--;
        }
        for(int i = 0; i < n; i++){
            nums[i] *= (-1);
        }
        for(int arr : nums){
            System.out.print(arr+" ");
        }
    }
}
