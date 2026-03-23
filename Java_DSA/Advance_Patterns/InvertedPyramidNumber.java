package Advance_Patterns;

public class InvertedPyramidNumber {
    public static void Inverted_Half_Pyramid_with_Numbers(int n){
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_Half_Pyramid_with_Numbers(5);
    }
}
