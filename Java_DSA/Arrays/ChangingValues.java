package Arrays;

//Changing the values of the array by function:-
import java.util.Scanner;
import java.util.Arrays;

public class ChangingValues{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = in.nextInt();

        //Creating the array
        int []arr = new int[size];
        System.out.println("Enter " + size + " Elements");
        for (int i=0 ; i < size ; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the position of element you want to change : ");
        int position = in.nextInt();

        System.out.print("Enter the new value : ");
        int newValue = in.nextInt();

        change(arr, position, newValue);
        System.out.println(" Updated Array : " + Arrays.toString(arr));
        in.close();
    }

    static void change(int []nums, int position, int newValue){
        if(position >= 0 && position < nums.length) {
            nums[position] = newValue;
        } else {
            System.out.println("Invalid position!");
        }
    }
}