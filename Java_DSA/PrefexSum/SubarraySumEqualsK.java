public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }  
}






// Optimal (Best Approach — Running Sum + HashMap)
// import java.util.HashMap;

// public class SubarraySumOptimal {

//     public static int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Base case: sum = 0 appears once
//         map.put(0, 1);

//         int sum = 0;
//         int count = 0;

//         for (int num : nums) {
//             sum += num;

//             // Check if (sum - k) exists
//             if (map.containsKey(sum - k)) {
//                 count += map.get(sum - k);
//             }

//             // Store current sum in map
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 1, 1};
//         int k = 2;

//         System.out.println(subarraySum(nums, k)); // Output: 2
//     }
// }


// Prefix Array + HashMap Approach

// import java.util.HashMap;

// public class SubarraySumPrefix {

//     public static int subarraySum(int[] arr, int k) {
//         int n = arr.length;
//         int count = 0;

//         // Step 1: Convert array into prefix sum array
//         for (int i = 1; i < n; i++) {
//             arr[i] += arr[i - 1];
//         }

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Step 2: Count subarrays
//         for (int i = 0; i < n; i++) {
//             int prefixSum = arr[i];

//             // Case 1: Subarray from index 0
//             if (prefixSum == k) {
//                 count++;
//             }

//             // Case 2: Check if (prefixSum - k) exists
//             int remaining = prefixSum - k;
//             if (map.containsKey(remaining)) {
//                 count += map.get(remaining);
//             }

//             // Store prefix sum
//             map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 1, 1};
//         int k = 2;

//         System.out.println(subarraySum(nums, k)); // Output: 2
//     }
// }