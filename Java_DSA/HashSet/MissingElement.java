package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElement {
    public static ArrayList<Integer> missingElements(int[] nums, int low, int high){
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int ele : nums){
            set.add(ele);
        }
        for(int i = low; i <= high; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,6,9};
        int low = 2;
        int high = 10;
        System.out.println(missingElements(nums, low, high));
    }
}
