import java.util.Scanner;

public class generateParentheses {
    public static void parentheses(int open, int close, int n, String s){
        if (s.length() == 2*n) {
            System.out.println(s);
            return;
        }
        if(open < n) parentheses(open + 1, close, n, s+"(");
        if(close < open) parentheses(open , close + 1, n, s+")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        parentheses(0,0,n,"");
        sc.close();
    }
}
