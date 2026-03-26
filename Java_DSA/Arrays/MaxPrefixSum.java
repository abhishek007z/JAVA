package Arrays;

import java.util.Arrays;

public class MaxPrefixSum {
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,9,3,14,5,6};
        System.out.println(Arrays.toString(prefixSum(arr)));
    }
}

