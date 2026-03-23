package Arrays;

public class Reverse {
    //Two pointer technique.
    public static void Reversing(int number[]){
        int first = 0;
        int last = number.length-1;

        while (first < last){
            //swaping the numbers using the temp variable
            // int temp = number[last];
            // number[last] = number[first];
            // number[first] = temp;

            //swaping the numbers using the temp variable
            number[first] = number[first] + number[last];
            number[last]  = number[first] - number[last];
            number[first] = number[first] - number[last];

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int number[] = {2,1,8,4,9,3};
        Reversing(number);

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+ " ");
        }
    }
}
