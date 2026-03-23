// 0-1 Triangle
import java.util.Scanner;

public class On_Off_Triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and coloums : ");
        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                } else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
