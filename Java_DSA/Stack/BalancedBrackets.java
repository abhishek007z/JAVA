package Stack;
/* 
import java.util.*;

public class BalancedBrakets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') return false;
                st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
    */



import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            // closing bracket
            else {
                if (st.isEmpty()) return false;

                char top = st.peek();

                if (
                    (ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')
                ) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("Balanced Brackets");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
