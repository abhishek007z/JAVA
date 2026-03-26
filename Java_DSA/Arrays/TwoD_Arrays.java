package Arrays;

import java.util.Scanner;

public class TwoD_Arrays {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of Arrays: ");
        int [][] arr = new int [3][3];

        //input for array
        for(int row = 0; row < arr.length; row++){
            //for each  column in every row
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for(int row = 0; row < arr.length; row++){
            //for each  column in every row
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
