package Advance_Patterns;

public class InvertedHalfPyramid {
    public static void Inverted_Half_Pyramid(int n){
        //outter loop
        for(int i = 1; i <= n; i++){
            //space printing
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            //star printing
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_Half_Pyramid(4);
    }
}
