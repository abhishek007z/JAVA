//Printing Fabonacci sercies using for loop:-
import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number for terms: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fabonacci Series:");
        for(int i = 1; i <= n; i++){
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
        in.close();
    }
}
