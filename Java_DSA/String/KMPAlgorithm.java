package String;

import java.util.ArrayList;

public class KMPAlgorithm {
    // Step 1: Build LPS using ArrayList
    public static ArrayList<Integer> computeLPS(String pattern) {
        int m = pattern.length();
        ArrayList<Integer> lps = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            lps.add(0);
        }
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps.set(i, len);   // update value
                i++;
            } else {
                if (len != 0) {
                    len = lps.get(len - 1);
                } else {
                    lps.set(i, 0);
                    i++;
                }
            }
        }
        return lps;
    }

    // Step 2: KMP Search
    public static void KMPSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        ArrayList<Integer> lps = computeLPS(pattern);
        int i = 0;  // string pointer
        int j = 0;  // pattern pointer
        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println("Pattern found at index: " + (i - j));
                j = lps.get(j - 1);   // use get()
            }
            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0)
                    j = lps.get(j - 1);
                else{
                    i++;
                }    
            }
        }
    }

    public static void main(String[] args) {
        String text = "aabaabc";
        String pattern = "abc";
        KMPSearch(text, pattern);
    }
}