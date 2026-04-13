import java.util.HashMap;

public class LC_242_Valid_Anagram {

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

