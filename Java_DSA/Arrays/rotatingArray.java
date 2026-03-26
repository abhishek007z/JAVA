package Arrays;

public class rotatingArray {
    //sliding Window
    public void reverse(int[] number, int i, int j){
        while( i < j){
            int temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
    }
    public void Rotation(int[] number, int k){
        int n = number.length;
        k = k%n;
        reverse(number,0,n-k-1);
        reverse(number,n-k,n-1);
        reverse(number,0,n-1);
    }

    public static void main(String[] args) {
        int[] number = { 10,20,30,40,50,60,70};
        int k = 3;
        rotatingArray obj = new rotatingArray();
        obj.Rotation(number, k);

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}