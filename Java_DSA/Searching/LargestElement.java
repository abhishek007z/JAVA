package Searching;

public class LargestElement {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; //+infinity

        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {18,7,6,1,5,8};
        System.out.print("The largest element is :"+ getLargest(number));
    }
}
