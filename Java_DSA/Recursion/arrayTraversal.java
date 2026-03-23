public class arrayTraversal {
    public static void print( int i, int[] nums){
        if(i == nums.length) return;
        System.out.print(nums[i]+ " ");
        print(i + 1, nums);
    }
    public static void main(String[] args) {
        int[] nums = {4,3,6,7,8,9,2,};
        print(0,nums);
    }
}
