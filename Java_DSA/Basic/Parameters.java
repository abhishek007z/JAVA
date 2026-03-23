//Passing the parameters in a Function:-
import java.util.Scanner;

public class Parameters{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = in.nextInt();
        int ans = sum3(num1,num2);
        System.out.println("The Sum is : "+ans);
        in.close();
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}