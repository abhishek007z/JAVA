//Right pyramid Triangle
import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and coloums : ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            //Printing Space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Printing star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
