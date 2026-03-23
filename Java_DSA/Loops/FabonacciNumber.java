//Printing Fabonacci nth-Number using while loop:-
import java.util.Scanner;

public class FabonacciNumber {
    public static void main(String[] args){
        Scanner  in = new Scanner(System.in);
        System.out.print("Enter the position of the series :");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println("The number is :"+b);
        in.close();
    }
}
