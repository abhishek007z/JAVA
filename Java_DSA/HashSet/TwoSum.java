package HashSet;

import java.util.HashSet;

public class TwoSum {
    public static boolean twoSum(int[] nums, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            int rem = target - ele;
            if(set.contains(rem)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,2,1,-1,3};
        int target = 5;
        System.out.println(twoSum(nums, target));
    }
}
