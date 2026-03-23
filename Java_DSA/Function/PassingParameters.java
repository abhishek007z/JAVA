import java.util.Scanner;

public class PassingParameters {
    public static void CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two digits : ");
        int a = in.nextInt();
        int b = in.nextInt();
        CalculateSum(a,b);
        in.close();
    }
}
