// 2D Arrayusing toString method 
package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values of the string: ");
        int [][] arr = new int[3][3];

        //input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
        //output
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        in.close();
    }
}
