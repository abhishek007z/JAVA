import java.util.ArrayList;

public class PrintSubset {
    public static ArrayList<ArrayList<Integer>> subsets(int[] nums){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> findSubset = new ArrayList<>();
        checkSubstring(nums, 0, findSubset, result);
        System.out.println(result);
        return result;
    }

    public static ArrayList<ArrayList<Integer>> checkSubstring(int[] nums, int index, ArrayList<Integer> findSubset, ArrayList<ArrayList<Integer>> result){
        if(index == nums.length){
            result.add(new ArrayList<>(findSubset));
            return result;
        }
        //recursive part for adding the elements in findSubset
        findSubset.add(nums[index]);
        checkSubstring(nums, index+1, findSubset, result);

        //backtracking part to remove the added added element and add in a new ArrayList
        findSubset.remove(findSubset.size() - 1);
        checkSubstring(nums, index+1, findSubset, result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums);
    }
}
