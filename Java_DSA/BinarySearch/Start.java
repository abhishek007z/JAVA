package BinarySearch;

public class Start {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,17,19,23,24,28,37,47};
        int n = nums.length;
        int target = 17;
        int low = 0;
        int high = n-1;
        boolean flag = false; //false means not present
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                flag = true; break;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            } 
            else if(nums[mid] < target){
                low = mid + 1;
            }
        }
        if(flag == true){
            System.out.println("Target present");
        } else{
            System.out.println("Target not present");
        }
    }
}
