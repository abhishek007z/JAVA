import java.util.HashSet;

public class LC_02_2744_MaximumNumberOfStringPairs {

    public static void main(String[] args) {

        String[] words = {"cd","ac","dc","ca","zz"};

        // Method 1: HashSet
        int result1 = usingHashSet(words.clone());
        System.out.println("HashSet Method: " + result1);

        // Method 2: 2-Pointer (No extra space)
        int result2 = usingTwoPointer(words.clone());
        System.out.println("2-Pointer Method: " + result2);
    }

    // ============================================================
    // 🔥 METHOD 1: USING HASHSET (BEST APPROACH)
    // ============================================================
    public static int usingHashSet(String[] words) {

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String rev = reverse(word);

            // if reverse already present → pair found
            if (set.contains(rev)) {
                count++;
                set.remove(rev); // avoid reuse
            } else {
                set.add(word);
            }
        }

        return count;
    }

    // ============================================================
    // 🔥 METHOD 2: 2-POINTER (NO EXTRA SPACE)
    // ============================================================
    public static int usingTwoPointer(String[] words) {

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            // skip used elements
            if (words[i].equals("")) continue;

            for (int j = i + 1; j < words.length; j++) {

                if (words[j].equals("")) continue;

                if (isReverse(words[i], words[j])) {
                    count++;

                    // mark as used
                    words[i] = "";
                    words[j] = "";

                    break;
                }
            }
        }

        return count;
    }

    // ============================================================
    // 🔁 REVERSE FUNCTION (USED IN HASHSET METHOD)
    // ============================================================
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // ============================================================
    // 🔁 2-POINTER CHECK (NO EXTRA STRING)
    // ============================================================
    public static boolean isReverse(String a, String b) {

        if (a.length() != b.length()) return false;

        int left = 0;
        int right = b.length() - 1;

        while (left < a.length()) {

            if (a.charAt(left) != b.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

/*
==================== 🧠 PROBLEM STATEMENT ====================

You are given an array of strings words.

A pair (i, j) is valid if:
words[i] == reverse(words[j]) and i < j

Return the maximum number of such pairs.

==============================================================


==================== 📥 INPUT ====================

words = ["cd","ac","dc","ca","zz"]

================================================


==================== 📤 OUTPUT ====================

HashSet Method: 2
2-Pointer Method: 2

=================================================


==================== 🔍 DRY RUN (HASHSET) ====================

set = {}

"cd" → add → {cd}
"ac" → add → {cd, ac}
"dc" → reverse = "cd" → found → count=1 → remove cd
"ca" → reverse = "ac" → found → count=2 → remove ac
"zz" → add → {zz}

Final count = 2

=================================================


==================== 🔍 DRY RUN (2-POINTER) ====================

["cd","ac","dc","ca","zz"]

i=0 → "cd"
j=2 → "dc" → match → count=1 → mark ""

["","ac","","ca","zz"]

i=1 → "ac"
j=3 → "ca" → match → count=2 → mark ""

["","","","","zz"]

Final count = 2

=================================================


==================== ⚡ KEY POINTS ====================

1. HashSet → O(n) time, O(n) space (BEST)
2. 2-pointer → O(n²) time, O(1) space
3. Removing ensures no reuse of pairs
4. 2-pointer avoids creating new strings

=================================================
*/