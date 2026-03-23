package BinarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 10, 15 , 32, 54, 87};
        int n = arr.length;
        int target = 20;
        int lowerbound = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                lowerbound = Math.min(lowerbound, mid);
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(lowerbound);
    }
}
