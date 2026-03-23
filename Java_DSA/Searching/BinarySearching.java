package Searching;

public class BinarySearching {
    public static int Binary(int number[], int key){
        int  start = 0;
        int end = number.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //comparisions
            if(number[mid] == key){ //found
                return mid;
            }

            if(number[mid] < key){ // right shift
                start = mid + 1;
            }
            else{ // left shift
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 3, 5, 6, 7, 9};
        int key = 7;
        System.out.print(Binary(number, key));
    }
}
