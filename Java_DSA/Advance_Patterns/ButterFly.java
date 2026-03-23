package Advance_Patterns;

public class ButterFly {
    public static void ButterflyPatttern(int n){
        //1st half
        //outter loop
        for(int i = 1; i <= n; i++){
            //stars printing
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space printing
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            //stars printing
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        //outter loop
        for(int i = n; i >= 1; i--){
            //stars printing
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space printing
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            //stars printing
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ButterflyPatttern(4);
    }
}
