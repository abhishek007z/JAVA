import java.util.Scanner;

public class DecToBin {
    public static void DecimalToBinary(int n){
        int myNum = n;
        int binNum = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10,pow));


            pow++;
            n = n/2;
        }
        System.out.println("Binary Form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int num = in.nextInt();
        DecimalToBinary(num);
        in.close();
    }
}
