package Sorting;

public class quickSort {
    public static int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low-1;
        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                i++;
                //swaping
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        //swaping
        int temp = nums[i];
        nums[i] = pivot;
        nums[high] = temp;
        return i; //pivot index
    }

    public static void sorting(int[] nums, int low, int high){
        if(low < high){
            int pivot = partition(nums, low, high);
            sorting(nums, low, pivot-1);
            sorting(nums, pivot+1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 6, 3, 8, 9, 5, 2, 1, 7};
        int n = nums.length;

        sorting(nums, 0, n-1);

        //printing the sorted array
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
