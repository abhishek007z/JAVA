import java.util.HashMap;

public class LC_03_242_Valid_Anagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        // Method 1: HashMap
        boolean result1 = usingHashMap(s, t);
        System.out.println("HashMap Method: " + result1);

        // Method 2: Array (Best)
        boolean result2 = usingArray(s, t);
        System.out.println("Array Method: " + result2);

        // Method 3: Sorting
        boolean result3 = usingSorting(s, t);
        System.out.println("Sorting Method: " + result3);
    }

    // ============================================================
    // 🔥 METHOD 1: USING HASHMAP
    // ============================================================
    public static boolean usingHashMap(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // count s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // reduce using t
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) return false;

            int freq = map.get(ch);
            if (freq == 1) map.remove(ch);
            else map.put(ch, freq - 1);
        }

        return map.isEmpty();
    }

    // ============================================================
    // 🔥 METHOD 2: USING ARRAY (BEST APPROACH)
    // ============================================================
    public static boolean usingArray(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    // ============================================================
    // 🔥 METHOD 3: USING SORTING
    // ============================================================
    public static boolean usingSorting(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        return java.util.Arrays.equals(a, b);
    }
}

/*
==================== 🧠 PROBLEM STATEMENT ====================

Given two strings s and t, return true if t is an anagram of s, otherwise return false.

👉 Anagram = same characters with same frequency

==============================================================


==================== 📥 INPUT ====================

s = "anagram"
t = "nagaram"

================================================


==================== 📤 OUTPUT ====================

true

=================================================


==================== 🚀 APPROACH (ARRAY - BEST) ====================

Step 1: Check length
→ if lengths not equal → return false

Step 2: Create count array of size 26
→ to store frequency of characters

Step 3: Traverse both strings in one loop
→ s → increment (+1)
→ t → decrement (-1)

Step 4: Traverse count array
→ if any value != 0 → return false

Step 5: If all values are 0 → return true

=================================================


==================== 🔍 DRY RUN ====================

s = "ab"
t = "ba"

count = [0...0]

i=0:
'a' → +1 → count[0] = 1
'b' → -1 → count[1] = -1

i=1:
'b' → +1 → count[1] = 0
'a' → -1 → count[0] = 0

Final:
count = [0,0,0,...]

✔️ All zero → anagram ✅

=================================================


==================== ⏱ COMPLEXITY ====================

Step 1: Length check → O(1)

Step 2: Loop through string → O(n)

Step 3: Check count array (size 26) → O(1)

👉 Total Time Complexity = O(n)

👉 Space Complexity = O(1)
(only 26 size array → constant space)

=================================================


==================== ⚡ KEY IDEA ====================

s → +1  
t → -1  

👉 Perfect cancel → anagram

=================================================
*/