public class CheckingSorted {
    public static boolean isSorted(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }
        if(nums[index] > nums[index + 1]){
            return false;
        }
        return isSorted(nums, index + 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(isSorted(nums, 0));
    }
}
