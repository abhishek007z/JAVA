//Floyd's Triangle
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print : ");
        int num = in.nextInt();
        int number = 1;

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        in.close();
    }
}
