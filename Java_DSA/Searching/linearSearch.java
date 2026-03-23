package Searching;

public class linearSearch {
    public static int linear(int number[], int key){
        for(int i = 0; i < number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,3,4,6,10};
        int key = 6;
        int index = linear(number, key);
        if(index == -1){
            System.out.print("Not Found");
        } else {
            System.out.print(index);
        }
    }
}
