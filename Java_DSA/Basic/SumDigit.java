//Prints the sum of tyhe digits of the number enter by the user
import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the digit of the number : ");
        int number = in.nextInt();
        int sum = 0;
        
        while(number!=0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println("The sum is : " +sum);
        in.close();
    }
}
