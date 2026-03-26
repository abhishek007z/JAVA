package Arrays;

public class subArray {
    public static void subarray(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(nums[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int nums[] = {7,4,9,3,2,6};
        subarray(nums);
    }
}
