package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1,4,5,2,7,-3,9,6,8};
        int n = nums.length;
        for(int i = 0; i <= n-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i; j < n; j++){
                if(nums[j] < min){
                    min = nums[j];
                    minIndex = j;
                }
            }
            //swap nums[i] with minIndex
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        //printing the sorted array
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}


/* 1. Slection sort is unstable sort
   2. It can not be optimised
   3. Number of swaps are less as compair to bubble sort
   4. n-1 swaps are fixed
*/
