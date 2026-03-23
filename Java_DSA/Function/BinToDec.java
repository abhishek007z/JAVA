import java.util.Scanner;

public class BinToDec {
    public static void DecimalToBinary(int binNum){
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int num = in.nextInt();
        DecimalToBinary(num);
        in.close();
    }
}
