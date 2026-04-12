import java.util.HashSet;

public class LC_01_2442_CountDistinctIntegers {

    public static void main(String[] args) {
        int[] nums = {1, 13, 10};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

            int rev = reverse(nums[i]);
            set.add(rev);
        }

        System.out.println("Distinct count: " + set.size());
    }

 
    public static int reverse(int n) {
        int r = 0;

        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }

        return r;
    }
}


























/*

import java.util.HashSet;

public class LC_01_2442_CountDistinctIntegers {

    public static void main(String[] args) {

        // Input array
        int[] nums = {1, 13, 10};

        // HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Loop through each number
        for (int i = 0; i < nums.length; i++) {

            // Add original number
            set.add(nums[i]);

            // Find reverse of number
            int rev = reverse(nums[i]);

            // Add reversed number
            set.add(rev);
        }

        // Output result
        System.out.println("Distinct count: " + set.size());
    }

    // Function to reverse a number
    public static int reverse(int n) {
        int r = 0;

        while (n != 0) {
            int digit = n % 10;   // get last digit
            r = r * 10 + digit;  // build reversed number
            n = n / 10;          // remove last digit
        }

        return r;
    }
}


==================== 🧠 PROBLEM STATEMENT ====================

You are given an integer array nums.

For every number in the array:
1. Add the number itself
2. Add its reverse (example: 13 → 31)

Return the total number of DISTINCT integers after adding all numbers.

==============================================================


==================== 📥 INPUT ====================

nums = [1, 13, 10]

================================================


==================== 📤 OUTPUT ====================

Distinct count = 4

=================================================


==================== 🔍 DRY RUN ====================

Initial Set = {}

Step 1: i = 0
nums[i] = 1
Add → {1}
Reverse(1) = 1
Add → {1} (duplicate, no change)

---------------------------------------

Step 2: i = 1
nums[i] = 13
Add → {1, 13}
Reverse(13) = 31
Add → {1, 13, 31}

---------------------------------------

Step 3: i = 2
nums[i] = 10
Add → {1, 13, 31, 10}
Reverse(10) = 1
Add → {1, 13, 31, 10} (duplicate)

---------------------------------------

Final Set = {1, 13, 31, 10}

Final Answer = 4

=================================================


==================== ⚡ KEY POINTS ====================

1. HashSet automatically removes duplicates
2. Reverse logic uses:
   - n % 10 → last digit
   - n / 10 → remove last digit
3. Time Complexity: O(n × digits)
4. Space Complexity: O(n)

=================================================
*/