import java.util.Arrays;
import java.util.HashMap;

public class LC_04_1_TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Result: " + Arrays.toString(result));
    }

    // ================== HASHMAP METHOD ==================
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }


    /*
    ==================== 🧠 PROBLEM STATEMENT ====================

    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.

    👉 Each input has exactly one solution
    👉 You cannot use the same element twice

    ==============================================================
    

    ==================== 📥 INPUT ====================

    nums = [2,7,11,15]
    target = 9

    =================================================


    ==================== 📤 OUTPUT ====================

    Result: [0, 1]

    =================================================


    ==================== 🚀 APPROACH (HASHMAP - BEST) ====================

    Step 1: Create HashMap
    → store (value → index)

    Step 2: Traverse array

    For each element:
    → complement = target - nums[i]

    Step 3: Check if complement exists
    → YES → return indices
    → NO → store element in map

    =================================================


    ==================== 🔍 DRY RUN ====================

    nums = [2,7,11,15], target = 9

    map = {}

    i=0:
    nums[i]=2
    complement=7
    → not found → store {2:0}

    i=1:
    nums[i]=7
    complement=2
    → found → return [0,1] ✅

    =================================================


    ==================== ⏱ COMPLEXITY ====================

    Step 1: Loop → O(n)

    Step 2: HashMap operations → O(1)

    👉 Total Time = O(n)
    👉 Space = O(n)

    =================================================


    ==================== ⚡ KEY IDEA ====================

    target - nums[i] → find in map

    👉 "store previous, check future"

    =================================================


    ==================== 🏆 FINAL VERDICT ====================

    👉 HashMap = BEST (O(n)) 🔥

    =================================================
    */
}