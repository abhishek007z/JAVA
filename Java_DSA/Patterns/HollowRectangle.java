//Hollow Rectangle

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int a = in.nextInt();
        System.out.print("Enter the number of columns :");
        int b = in.nextInt();

        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}




