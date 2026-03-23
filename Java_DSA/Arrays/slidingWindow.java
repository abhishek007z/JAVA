package Arrays;

public class slidingWindow {
    public static int maxSubArray(int[] arr, int k){
        int wSum = 0;

        for(int i = 0; i < k; i++){
            wSum += arr[i];
        }
        int mSum = wSum;

        for(int i = k; i < arr.length; i++){
            wSum = wSum - arr[i-k] + arr[i];
            mSum = Math.max(mSum, wSum);
        }
        return mSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,9,31,-4,21,7};
        int k = 3;
        System.out.println(maxSubArray(arr, k));
    }
}
