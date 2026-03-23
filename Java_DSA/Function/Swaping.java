import java.util.Scanner;

public class Swaping {
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        Swap(num1, num2);
        in.close();
    }
}
