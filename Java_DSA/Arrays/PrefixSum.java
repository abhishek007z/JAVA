package Arrays;

public class PrefixSum {
    public static int []prefixArray(int[] arr){
        int n = arr.length;
        int []prefixSum = new int [n];
        prefixSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
         return prefixSum;
    }
    public static void main(String[] args) {
         int[] nums = {2, 4, 6, 8};
        int[] prefixSum = prefixArray(nums);

        for (int val : prefixSum) {
            System.out.print(val + " ");
        }
    }
}
