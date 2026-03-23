import java.util.Scanner;

public class PrimeRange {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeNumberRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ //if condition is true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = in.nextInt();
        System.out.print("The numbers are : ");
        PrimeNumberRange(n);
        in.close();
    }
}
