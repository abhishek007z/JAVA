import java.util.Scanner;

public class Multiplication {
    public static int Multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int prod = Multiply(a, b);
        System.out.println("a * b = "+prod);
        in.close();
    }
}
