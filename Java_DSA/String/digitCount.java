package String;

import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());
        sc.close();
    }
}
