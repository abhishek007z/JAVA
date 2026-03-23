package String;

import java.util.Arrays;

public class stringSorting {
    public static void main(String[] args) {
        String s = "radhika";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char k : ch){
            System.out.print(k);
        }
    }
}
