package TwoD_Array;

public class MaximunSumRow {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4}, {9,8,7,6}, {4,5,6,4}};
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = 0; j < nums[i].length; j++){
                sum += nums[i][j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
