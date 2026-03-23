import java.util.Scanner;

public class Factorial {
    public static int FactorialNum (int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f=f*i;
        }
        return f;
    }
    
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = num.nextInt();
        System.out.println(FactorialNum(n));
        num.close();
    }
}
