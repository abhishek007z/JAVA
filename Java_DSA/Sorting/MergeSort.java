package Sorting;

public class MergeSort {
    public static void divide(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        divide(nums, start, mid);
        divide(nums, mid + 1, end);
        conquer(nums, start, mid, end);
    }

    public static void conquer(int[] nums, int start, int mid, int end){
        int[] merged = new int[end - start + 1];
        int index1 = start;
        int index2 = mid + 1;
        int x = 0;

        while(index1 <= mid && index2 <= end){
            if(nums[index1] <= nums[index2]){
                merged[x++] = nums[index1++];
            } else{
                merged[x++] = nums[index2++];
            }
        }
        while(index1 <= mid){
            merged[x++] = nums[index1++];
        }
        while(index2 <= end){
            merged[x++] = nums[index2++];
        }
        for(int i = 0, j = start; i < merged.length; i++, j++){
            nums[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {6,3,5,2,8,1,9};
        int n = nums.length;

        divide(nums, 0, n - 1);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
}
