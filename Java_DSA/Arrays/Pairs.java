package Arrays;

public class Pairs {
    public static void printingPairs(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int current = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.print("("+ current + ","+ numbers[j] +")");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,4,8,6};
        printingPairs(numbers);
    }
}
