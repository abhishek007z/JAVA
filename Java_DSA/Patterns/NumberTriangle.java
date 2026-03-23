//Number Triangle
import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and coloums : ");
        int number = in.nextInt();

        for(int i=1; i<=number; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
