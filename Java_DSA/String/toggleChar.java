package String;

import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder st = new StringBuilder(sc.nextLine());
        int n = st.length();
        for(int i = 0; i < n; i++){
            char ch = st.charAt(i);
            int ascii = (int)ch; 
            if(ascii >= 65 && ascii <= 90){ //capital letter
                ascii += 32;
            }
            else if(ascii >= 97 && ascii <= 122){ //small letter
                ascii -= 32;
            }
            ch = (char)ascii;
            st.setCharAt(i, ch);
        }
        System.out.println(st);
        sc.close();
    }
}
