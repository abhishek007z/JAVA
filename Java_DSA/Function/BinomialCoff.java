//Binomial Cefficient : ncr = n!/r!(n-r)!
import java.util.Scanner;

public class BinomialCoff {
    public static int FactorialNum (int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f=f*i;
        }
        return f;
    }

    public static int BinomialCoefficient(int n, int r){
        int fact_n = FactorialNum(n);
        int fact_r = FactorialNum(r);
        int fact_nmr = FactorialNum(n-r);

        int BinomialCoefficient = fact_n / (fact_r * fact_nmr);
        return BinomialCoefficient;
    }

    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the number as the value of n : ");
        int n1 = num1.nextInt();
        System.out.print("Enter the number as the value of r : ");
        int n2 = num1.nextInt();
        System.out.println("The Binomial coefficient is : "+BinomialCoefficient(n1, n2));
        num1.close();
    }
}
