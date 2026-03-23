//Program for sum of two numbers using function:-
import java.util.Scanner;

public class SumFunction{
    public static void main(String[] args){
        Sum();
    }

    static void Sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number2 : ");
        int num2 = in.nextInt();
        int Sum = num1 + num2;
        System.out.println("The sum : "+Sum);
        in.close();
    }
}